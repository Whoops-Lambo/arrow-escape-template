package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                w.a((w) obj, valueAnimator);
                break;
            case 1:
                io.p071bidmachine.media3.ui.e eVar = (io.p071bidmachine.media3.ui.e) obj;
                eVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar.invalidate(eVar.a);
                break;
            default:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                ((Drawable) obj).setAlpha(io.p071bidmachine.util.p.Y(((Float) animatedValue).floatValue()));
                break;
        }
    }
}
