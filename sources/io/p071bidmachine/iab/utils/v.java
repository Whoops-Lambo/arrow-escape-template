package io.p071bidmachine.iab.utils;

import com.facebook.ads.f;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.iab.mraid.a0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v {
    public final a0 a;
    public final t b;
    public boolean c = false;
    public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public long e = 0;
    public long f = 0;
    public final u g;
    public final f h;

    public final void a() {
        a0 a0Var = this.a;
        boolean zIsShown = a0Var.isShown();
        if (this.c == zIsShown) {
            return;
        }
        this.c = zIsShown;
        f fVar = this.h;
        if (!zIsShown) {
            a0Var.removeCallbacks(fVar);
            return;
        }
        long j = this.e;
        if (j == 0 || this.f >= j || !a0Var.isShown() || this.e == 0) {
            return;
        }
        a0Var.postDelayed(fVar, 16L);
    }

    public v(a0 a0Var, t tVar) {
        u uVar = new u(this);
        this.g = uVar;
        this.h = new f(this, 5);
        this.a = a0Var;
        this.b = tVar;
        a0Var.getViewTreeObserver().addOnGlobalLayoutListener(uVar);
        a();
    }
}
