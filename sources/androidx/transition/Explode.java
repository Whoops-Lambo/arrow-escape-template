package androidx.transition;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class Explode extends Visibility {
    @Override // androidx.transition.Visibility
    public final Animator Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        view.getTranslationX();
        view.getTranslationY();
        viewGroup.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Visibility
    public final Animator R(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.a.get("android:explode:screenBounds");
        int i = rect.left;
        view.getTranslationX();
        view.getTranslationY();
        int[] iArr = (int[]) transitionValues.b.getTag(com.ecffri.arrows.R.id.transition_position);
        if (iArr != null) {
            rect.offsetTo(iArr[0], iArr[1]);
        }
        viewGroup.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Transition
    public final boolean t() {
        return true;
    }

    static {
        new DecelerateInterpolator();
        new AccelerateInterpolator();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        Visibility.O(transitionValues);
        transitionValues.b.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        Visibility.O(transitionValues);
        transitionValues.b.getLocationOnScreen(null);
        throw null;
    }
}
