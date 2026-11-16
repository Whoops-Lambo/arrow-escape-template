package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class AnimationAnimationListenerC3570rN implements Animation.AnimationListener {
    public final /* synthetic */ C3095jY A00;
    public final /* synthetic */ AbstractC2002Fg A01;
    public final /* synthetic */ AbstractC2002Fg A02;

    public AnimationAnimationListenerC3570rN(AbstractC2002Fg abstractC2002Fg, AbstractC2002Fg abstractC2002Fg2, C3095jY c3095jY) {
        this.A01 = abstractC2002Fg;
        this.A02 = abstractC2002Fg2;
        this.A00 = c3095jY;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A06 = false;
        AbstractC3523qc.A0I(this.A02);
        new Handler().postDelayed(new C2005Fj(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
