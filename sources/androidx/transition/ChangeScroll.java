package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ChangeScroll extends Transition {
    public static final String[] F = {"android:changeScroll:x", "android:changeScroll:y"};

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (transitionValues != null) {
            HashMap map = transitionValues.a;
            if (transitionValues2 != null) {
                HashMap map2 = transitionValues2.a;
                View view = transitionValues2.b;
                int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
                int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
                int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
                int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
                if (iIntValue != iIntValue2) {
                    view.setScrollX(iIntValue);
                    objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
                } else {
                    objectAnimatorOfInt = null;
                }
                if (iIntValue3 != iIntValue4) {
                    view.setScrollY(iIntValue3);
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
                }
                boolean z = TransitionUtils.a;
                if (objectAnimatorOfInt == null) {
                    return objectAnimatorOfInt2;
                }
                if (objectAnimatorOfInt2 == null) {
                    return objectAnimatorOfInt;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
                return animatorSet;
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public final boolean t() {
        return true;
    }

    public static void O(TransitionValues transitionValues) {
        HashMap map = transitionValues.a;
        View view = transitionValues.b;
        map.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public final String[] q() {
        return F;
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        O(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        O(transitionValues);
    }
}
