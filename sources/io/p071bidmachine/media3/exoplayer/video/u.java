package io.p071bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jo0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final d a;
    public final s b;
    public final t c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public static void a(u uVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            uVar.k = refreshRate;
            uVar.l = (refreshRate * 80) / 100;
        } else {
            a.A("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            uVar.k = -9223372036854775807L;
            uVar.l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (x.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            surface.setFrameRate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        } catch (IllegalStateException e) {
            a.o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f;
        float f2;
        if (x.a < 30 || this.e == null) {
            return;
        }
        d dVar = this.a;
        if (!dVar.a.a()) {
            f = this.f;
        } else if (dVar.a.a()) {
            jo0 jo0Var = dVar.a;
            long j = jo0Var.f;
            f = (float) (1.0E9d / (j != 0 ? jo0Var.g / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (dVar.a.a()) {
                if ((dVar.a.a() ? dVar.a.g : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.g) < f2) {
                return;
            }
        } else if (f == -1.0f && dVar.e < 30) {
            return;
        }
        this.g = f;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public final void d(boolean z) {
        Surface surface;
        float f;
        if (x.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.h != f) {
            this.h = f;
            try {
                surface.setFrameRate(f, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
            } catch (IllegalStateException e) {
                a.o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public u(Context context) {
        DisplayManager displayManager;
        s sVar;
        d dVar = new d();
        dVar.a = new jo0(1);
        dVar.b = new jo0(1);
        dVar.d = -9223372036854775807L;
        this.a = dVar;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            sVar = null;
        } else {
            sVar = new s(this, displayManager);
        }
        this.b = sVar;
        this.c = sVar != null ? t.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }
}
