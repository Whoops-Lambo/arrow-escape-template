package io.p071bidmachine.rendering.internal;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final WeakReference a;

    public f(View view) {
        this.a = new WeakReference(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        View view = (View) this.a.get();
        if (view == null) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue("width");
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        Object animatedValue2 = valueAnimator.getAnimatedValue("height");
        animatedValue2.getClass();
        int iIntValue2 = ((Integer) animatedValue2).intValue();
        view.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(iIntValue2, 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getLeft() + iIntValue, view.getTop() + iIntValue2);
    }
}
