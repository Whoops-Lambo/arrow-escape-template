package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C4664b4;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ChangeBounds extends Transition {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property G = new AnonymousClass1(PointF.class, "topLeft");
    public static final Property H = new AnonymousClass2(PointF.class, "bottomRight");
    public static final Property I = new AnonymousClass3(PointF.class, "bottomRight");
    public static final Property J = new AnonymousClass4(PointF.class, "topLeft");
    public static final Property K = new AnonymousClass5(PointF.class, C4664b4.i.L);

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            viewBounds2.b = iRound;
            int i = viewBounds2.f + 1;
            viewBounds2.f = i;
            if (i == viewBounds2.g) {
                ViewUtils.a(viewBounds2.e, viewBounds2.a, iRound, viewBounds2.c, viewBounds2.d);
                viewBounds2.f = 0;
                viewBounds2.g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            viewBounds2.d = iRound;
            int i = viewBounds2.g + 1;
            viewBounds2.g = i;
            if (viewBounds2.f == i) {
                ViewUtils.a(viewBounds2.e, viewBounds2.a, viewBounds2.b, viewBounds2.c, iRound);
                viewBounds2.f = 0;
                viewBounds2.g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass3 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass4 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass5 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            ViewUtils.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public boolean a;

        @Override // androidx.transition.Transition.TransitionListener
        public final void b(Transition transition) {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void h(Transition transition) {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void j(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            this.a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            ViewUtils.a(null, 0, 0, Math.max(0, 0), Math.max(0, 0));
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (!this.a) {
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SuppressLayoutListener extends TransitionListenerAdapter {
        public boolean a = false;
        public final ViewGroup b;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void b(Transition transition) {
            ViewGroupUtils.a(this.b, true);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void h(Transition transition) {
            ViewGroupUtils.a(this.b, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void j(Transition transition) {
            if (!this.a) {
                ViewGroupUtils.a(this.b, false);
            }
            transition.A(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            ViewGroupUtils.a(this.b, false);
            this.a = true;
        }

        public SuppressLayoutListener(ViewGroup viewGroup) {
            this.b = viewGroup;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ViewBounds {
        public int a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public ViewBounds(View view) {
            this.e = view;
        }
    }

    public static void O(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap map = transitionValues.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        ChangeBounds changeBounds;
        Animator animatorA;
        if (transitionValues == null) {
            return null;
        }
        HashMap map = transitionValues.a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap map2 = transitionValues2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        ViewUtils.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            changeBounds = this;
            animatorA = (i2 == i3 && i4 == i5) ? ObjectAnimatorUtils.Api21Impl.a(view, I, changeBounds.x.a(i6, i8, i7, i9)) : ObjectAnimatorUtils.Api21Impl.a(view, J, changeBounds.x.a(i2, i4, i3, i5));
        } else if (i10 == i12 && i11 == i13) {
            changeBounds = this;
            animatorA = ObjectAnimatorUtils.Api21Impl.a(view, K, changeBounds.x.a(i2, i4, i3, i5));
        } else {
            changeBounds = this;
            ViewBounds viewBounds = new ViewBounds(view);
            ObjectAnimator objectAnimatorA = ObjectAnimatorUtils.Api21Impl.a(viewBounds, G, changeBounds.x.a(i2, i4, i3, i5));
            ObjectAnimator objectAnimatorA2 = ObjectAnimatorUtils.Api21Impl.a(viewBounds, H, changeBounds.x.a(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
            animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                private final ViewBounds mViewBounds;

                {
                    this.mViewBounds = viewBounds;
                }
            });
            animatorA = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.a(viewGroup4, true);
            changeBounds.o().a(new SuppressLayoutListener(viewGroup4));
        }
        return animatorA;
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
