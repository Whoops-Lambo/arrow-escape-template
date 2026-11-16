package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.uB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3744uB implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C3745uC A00;

    public C3744uB(C3745uC c3745uC) {
        this.A00 = c3745uC;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A00 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.A00.invalidate();
    }
}
