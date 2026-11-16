package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] F = {"android:clipBounds:clip"};
    public static final Rect G = new Rect();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final Rect a;
        public final Rect b;
        public final View c;

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
        public final void b(Transition transition) {
            View view = this.c;
            view.setClipBounds((Rect) view.getTag(com.ecffri.arrows.R.id.transition_clip));
            view.setTag(com.ecffri.arrows.R.id.transition_clip, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void h(Transition transition) {
            View view = this.c;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.G;
            }
            view.setTag(com.ecffri.arrows.R.id.transition_clip, clipBounds);
            view.setClipBounds(this.b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            View view = this.c;
            if (z) {
                view.setClipBounds(this.a);
            } else {
                view.setClipBounds(this.b);
            }
        }

        public Listener(View view, Rect rect, Rect rect2) {
            this.c = view;
            this.a = rect;
            this.b = rect2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        O(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        O(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final boolean t() {
        return true;
    }

    public static void O(TransitionValues transitionValues, boolean z) {
        View view = transitionValues.b;
        HashMap map = transitionValues.a;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z ? (Rect) view.getTag(com.ecffri.arrows.R.id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != G ? clipBounds : null;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap map = transitionValues.a;
        if (transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.b;
        HashMap map2 = transitionValues2.a;
        if (!map.containsKey("android:clipBounds:clip") || !map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        view.setClipBounds(rect);
        Rect rect5 = new Rect();
        RectEvaluator rectEvaluator = new RectEvaluator();
        rectEvaluator.a = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) ViewUtils.c, rectEvaluator, rect3, rect4);
        Listener listener = new Listener(view, rect, rect2);
        objectAnimatorOfObject.addListener(listener);
        a(listener);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] q() {
        return F;
    }
}
