package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class Fade extends Visibility {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View a;
        public boolean b = false;

        @Override // androidx.transition.Transition.TransitionListener
        public final void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void j(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void h(Transition transition) {
            View view = this.a;
            view.setTag(com.ecffri.arrows.R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? ViewUtils.a.a(view) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ViewUtils.a.b(this.a, 1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            boolean z2 = this.b;
            View view = this.a;
            if (z2) {
                view.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            ViewUtilsApi23 viewUtilsApi23 = ViewUtils.a;
            viewUtilsApi23.b(view, 1.0f);
            viewUtilsApi23.getClass();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.b = true;
                view.setLayerType(2, null);
            }
        }

        public FadeAnimatorListener(View view) {
            this.a = view;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void b(Transition transition) {
            this.a.setTag(com.ecffri.arrows.R.id.transition_pause_alpha, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }

    @Override // androidx.transition.Transition
    public final boolean t() {
        return true;
    }

    public static float T(TransitionValues transitionValues, float f) {
        Float f2;
        return (transitionValues == null || (f2 = (Float) transitionValues.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.Visibility
    public final Animator Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.a.getClass();
        return S(view, T(transitionValues, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public final Animator R(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtilsApi23 viewUtilsApi23 = ViewUtils.a;
        viewUtilsApi23.getClass();
        ObjectAnimator objectAnimatorS = S(view, T(transitionValues, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (objectAnimatorS == null) {
            viewUtilsApi23.b(view, T(transitionValues2, 1.0f));
        }
        return objectAnimatorS;
    }

    public final ObjectAnimator S(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ViewUtils.a.b(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewUtils.b, f2);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        objectAnimatorOfFloat.addListener(fadeAnimatorListener);
        o().a(fadeAnimatorListener);
        return objectAnimatorOfFloat;
    }

    public Fade(int i) {
        this.F = i;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        Visibility.O(transitionValues);
        View view = transitionValues.b;
        Float fValueOf = (Float) view.getTag(com.ecffri.arrows.R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (view.getVisibility() == 0) {
                fValueOf = Float.valueOf(ViewUtils.a.a(view));
            } else {
                fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        transitionValues.a.put("android:fade:transitionAlpha", fValueOf);
    }
}
