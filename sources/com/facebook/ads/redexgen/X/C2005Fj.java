package com.facebook.ads.redexgen.X;

import android.R;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2005Fj extends AbstractRunnableC3416oq {
    public final /* synthetic */ AnimationAnimationListenerC3570rN A00;

    public C2005Fj(AnimationAnimationListenerC3570rN animationAnimationListenerC3570rN) {
        this.A00 = animationAnimationListenerC3570rN;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
