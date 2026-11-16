package com.adsurge.adn.p044n0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Region;
import android.view.MotionEvent;
import android.view.View;
import com.adsurge.adn.T0.a;
import com.adsurge.adn.p035k0.m;
import com.adsurge.adn.p041m0.d;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class e implements g, d {
    public final c a;
    public final boolean b;
    public final int c;
    public boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final Path j = new Path();
    public int k;
    public int l;
    public int m;
    public int n;
    public a o;

    @Override // com.adsurge.adn.p044n0.g
    public boolean e() {
        return true;
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean c(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        boolean z = false;
        if (!this.d) {
            this.d = true;
            if (this.b && g()) {
                z = true;
            }
            a(z, view);
        }
        if (z) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // com.adsurge.adn.p044n0.g
    public int d() {
        int i = this.c;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public final boolean g() {
        return (this.o.a() * 100) / this.o.b() >= this.e;
    }

    public e(c cVar) {
        boolean z;
        this.a = cVar;
        JSONObject jSONObject = cVar.c;
        if (jSONObject != null && jSONObject.length() > 0) {
            if (jSONObject.optInt("dm") == 1) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
            this.c = jSONObject.optInt("imnd", 0);
            this.d = true ^ b();
            this.e = jSONObject.optInt("et");
            int iF = m.c(jSONObject.opt("er")).f(new JSONObject[0]);
            this.f = iF;
            this.g = iF * 2;
            this.h = jSONObject.optInt("ers", 0);
            this.i = jSONObject.optInt("erf", 0);
            return;
        }
        this.b = false;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.c = 0;
        this.d = !b();
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.k <= 0) {
            this.m = view.getWidth();
            this.n = view.getHeight();
            this.k = (int) Math.ceil((((double) this.m) * 1.0d) / ((double) this.g));
            int iCeil = (int) Math.ceil((((double) this.n) * 1.0d) / ((double) this.g));
            this.l = iCeil;
            this.o = new a(this.k * iCeil);
        }
        a(x, y);
        this.j.addCircle(x, y, this.f, Path.Direction.CW);
        view.invalidate();
        return null;
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean b(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (x >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && x <= this.m && y >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y <= this.n) {
            a(x, y);
            boolean z = false;
            if (this.b && this.d && g()) {
                z = true;
            }
            if (!z || !a(true, view)) {
                this.j.addCircle(x, y, this.f, Path.Direction.CW);
                view.invalidate();
            }
            if (z) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    @Override // com.adsurge.adn.p044n0.g
    public void f() {
        this.d = !b();
    }

    @Override // com.adsurge.adn.p044n0.g
    public c c() {
        return this.a;
    }

    @Override // com.adsurge.adn.p041m0.d
    public void b(Canvas canvas, int i, int i2) {
    }

    @Override // com.adsurge.adn.p044n0.g
    public boolean b() {
        return this.c > 0;
    }

    @Override // com.adsurge.adn.p044n0.g
    public d a() {
        return this;
    }

    @Override // com.adsurge.adn.p044n0.g
    public Boolean a(View view, MotionEvent motionEvent, PointF pointF, PointF pointF2) {
        boolean z = this.d && g();
        a(z, view);
        if (z) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final boolean a(boolean z, View view) {
        if ((z ? this.h : this.i) != 1) {
            return false;
        }
        this.j.reset();
        view.invalidate();
        this.k = 0;
        return true;
    }

    public final void a(float f, float f2) {
        int i;
        int i2 = 0;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = 0;
        } else if (f >= this.m) {
            i = this.k - 1;
        } else {
            i = ((int) f) / this.g;
        }
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f2 >= this.n) {
                i2 = this.l - 1;
            } else {
                i2 = ((int) f2) / this.g;
            }
        }
        this.o.a((i * this.l) + i2, true);
    }

    @Override // com.adsurge.adn.p041m0.d
    public void a(Canvas canvas, int i, int i2) {
        if (this.j.isEmpty()) {
            return;
        }
        canvas.clipPath(this.j, Region.Op.DIFFERENCE);
    }
}
