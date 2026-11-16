package io.p071bidmachine.rendering.model.animation.effect;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements c {
    public float a;

    @Override // io.p071bidmachine.rendering.model.animation.effect.c
    public final boolean a() {
        return true;
    }

    @Override // io.p071bidmachine.rendering.model.animation.effect.c
    public final boolean c() {
        return false;
    }

    @Override // io.p071bidmachine.rendering.model.animation.effect.c
    public final void b(View view) {
        view.getClass();
        this.a = view.getAlpha();
    }

    @Override // io.p071bidmachine.rendering.model.animation.effect.c
    public final void d(View view) {
        view.getClass();
        view.setAlpha(this.a);
    }

    @Override // io.p071bidmachine.rendering.model.animation.effect.c
    public final Animator e(View view, boolean z) {
        float f;
        view.getClass();
        Property property = View.ALPHA;
        if (z) {
            f = this.a;
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        objectAnimatorOfFloat.getClass();
        return objectAnimatorOfFloat;
    }

    @Override // io.p071bidmachine.rendering.model.animation.effect.c
    public final void f(View view, boolean z) {
        float f;
        view.getClass();
        if (z) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            f = this.a;
        }
        view.setAlpha(f);
    }
}
