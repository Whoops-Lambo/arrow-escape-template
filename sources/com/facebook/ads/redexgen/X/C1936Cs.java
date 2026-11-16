package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C1936Cs extends AnimationAnimationListenerC3522qb {
    public final /* synthetic */ C1935Cr A00;

    public C1936Cs(C1935Cr c1935Cr) {
        this.A00 = c1935Cr;
    }

    @Override // com.facebook.ads.redexgen.X.AnimationAnimationListenerC3522qb, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC3523qc.A0I(this.A00.A01);
        this.A00.A00.AFO();
    }
}
