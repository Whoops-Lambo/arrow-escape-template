package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class TranslationAnimationCreator {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View a;
        public final View b;
        public int[] c;
        public float d;
        public float e;
        public final float f;
        public final float g;
        public boolean h;

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            this.h = true;
            float f = this.f;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.h = true;
            float f = this.f;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.g);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void b(Transition transition) {
            float f = this.d;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.e);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
            if (this.h) {
                return;
            }
            this.a.setTag(com.ecffri.arrows.R.id.transition_position, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void h(Transition transition) {
            if (this.c == null) {
                this.c = new int[2];
            }
            int[] iArr = this.c;
            View view = this.b;
            view.getLocationOnScreen(iArr);
            this.a.setTag(com.ecffri.arrows.R.id.transition_position, this.c);
            this.d = view.getTranslationX();
            this.e = view.getTranslationY();
            view.setTranslationX(this.f);
            view.setTranslationY(this.g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            float f = this.f;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.g);
        }

        public TransitionPositionListener(View view, View view2, float f, float f2) {
            this.b = view;
            this.a = view2;
            this.f = f;
            this.g = f2;
            int[] iArr = (int[]) view2.getTag(com.ecffri.arrows.R.id.transition_position);
            this.c = iArr;
            if (iArr != null) {
                view2.setTag(com.ecffri.arrows.R.id.transition_position, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void j(Transition transition) {
            f(transition);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }

    public static ObjectAnimator a(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Slide slide) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.b.getTag(com.ecffri.arrows.R.id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view, transitionValues.b, translationX, translationY);
        slide.a(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
