package io.p071bidmachine.iab.utils;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ h a;
    public final /* synthetic */ i b;

    public f(i iVar, h hVar) {
        this.b = iVar;
        this.a = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        h hVar = this.a;
        i.b(fFloatValue, hVar);
        i iVar = this.b;
        i.a(iVar, fFloatValue, hVar, false);
        iVar.invalidateSelf();
    }
}
