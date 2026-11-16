package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C1935Cr extends AbstractRunnableC3416oq {
    public final /* synthetic */ InterfaceC3597ro A00;
    public final /* synthetic */ C3596rn A01;

    public C1935Cr(C3596rn c3596rn, InterfaceC3597ro interfaceC3597ro) {
        this.A01 = c3596rn;
        this.A00 = interfaceC3597ro;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1936Cs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
