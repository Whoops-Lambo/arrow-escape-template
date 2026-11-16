package androidx.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class Slide extends Visibility {
    public static final DecelerateInterpolator I = new DecelerateInterpolator();
    public static final AccelerateInterpolator J = new AccelerateInterpolator();
    public static final AnonymousClass6 K = new AnonymousClass6();
    public CalculateSlide H;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface CalculateSlide {
        float a(View view, ViewGroup viewGroup);

        float b(View view, ViewGroup viewGroup);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GravityFlag {
    }

    @Override // androidx.transition.Transition
    public final boolean t() {
        return true;
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass3 extends CalculateSlideVertical {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass4 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass5 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass6 extends CalculateSlideVertical {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class CalculateSlideHorizontal implements CalculateSlide {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class CalculateSlideVertical implements CalculateSlide {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    @Override // androidx.transition.Visibility
    public final Animator Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return TranslationAnimationCreator.a(view, transitionValues2, iArr[0], iArr[1], this.H.a(view, viewGroup), this.H.b(view, viewGroup), translationX, translationY, I, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator R(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.a.get("android:slide:screenPosition");
        return TranslationAnimationCreator.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.H.a(view, viewGroup), this.H.b(view, viewGroup), J, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        Visibility.O(transitionValues);
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        transitionValues.a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        Visibility.O(transitionValues);
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        transitionValues.a.put("android:slide:screenPosition", iArr);
    }
}
