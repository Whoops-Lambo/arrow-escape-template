package com.adsurge.adn.p068y0;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public final a a;
    public final d b;
    public final Movie c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public long h;
    public int i = -1;
    public float j = -1.0f;
    public float k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    public b(a aVar, d dVar, Movie movie) {
        this.a = aVar;
        this.b = dVar;
        this.c = movie;
        int iDuration = movie.duration();
        this.d = iDuration == 0 ? 1000 : iDuration;
        dVar.setLayerType(1, null);
        this.e = movie.width();
        this.f = movie.height();
        dVar.invalidate();
    }

    public void a(Canvas canvas) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.h == 0) {
            this.h = jUptimeMillis;
        }
        if (this.g == 0) {
            int iP = this.a.P();
            if (iP <= 0) {
                this.g = -1;
            } else {
                this.g = this.a.S() + (((this.a.Q() + this.d) * iP) - this.a.Q());
            }
        }
        int i = (int) (jUptimeMillis - this.h);
        int i2 = this.g;
        if (i2 > 0 && i >= i2) {
            a(canvas, this.d);
            a aVar = this.a;
            com.adsurge.adn.p014d0.b bVar = aVar.J;
            if (bVar != null) {
                bVar.a(aVar.H);
                return;
            }
            return;
        }
        int iS = this.a.S();
        if (i >= iS) {
            int i3 = i - iS;
            int iQ = i3 % (this.a.Q() + this.d);
            int i4 = this.d;
            if (iQ > i4) {
                iQ = i4;
            }
            a(canvas, iQ);
        }
        this.b.invalidate();
    }

    public final void a(Canvas canvas, int i) {
        if (i == this.i) {
            return;
        }
        this.c.setTime(i);
        if (this.j < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int width = this.b.getWidth();
            int height = this.b.getHeight();
            if (width != 0 && height != 0) {
                float f = height;
                float f2 = width;
                float f3 = f / f2;
                float f4 = this.f;
                float f5 = this.e;
                if (f3 < f4 / f5) {
                    this.j = f2 / f5;
                } else {
                    this.j = f / f4;
                    a aVar = this.a;
                    if (aVar != null && aVar.R() == 3) {
                        float f6 = this.e;
                        float f7 = this.j;
                        this.k = (-(((f6 * f7) - f2) / 2.0f)) / f7;
                    }
                }
            } else {
                this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        float f8 = this.j;
        canvas.scale(f8, f8);
        this.c.draw(canvas, this.k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.i = i;
    }
}
