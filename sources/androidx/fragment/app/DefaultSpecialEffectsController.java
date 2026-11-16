package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.p003activity.BackEventCompat;
import com.ecffri.arrows.R;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.ak1;
import defpackage.da0;
import defpackage.dt1;
import defpackage.du;
import defpackage.e32;
import defpackage.eu;
import defpackage.g20;
import defpackage.iu;
import defpackage.jc1;
import defpackage.m32;
import defpackage.s3;
import defpackage.sr0;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnimationInfo extends SpecialEffectsInfo {
        public final boolean b;
        public boolean c;
        public FragmentAnim.AnimationOrAnimator d;

        /* JADX WARN: Code duplicated, block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
        public final FragmentAnim.AnimationOrAnimator b(Context context) {
            int enterAnim;
            FragmentAnim.AnimationOrAnimator animationOrAnimator;
            Animator animatorLoadAnimator;
            int iA;
            if (this.c) {
                return this.d;
            }
            SpecialEffectsController.Operation operation = this.a;
            Fragment fragment = operation.c;
            boolean z = operation.a == SpecialEffectsController.Operation.State.b;
            int nextTransition = fragment.getNextTransition();
            if (this.b) {
                enterAnim = z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            FragmentAnim.AnimationOrAnimator animationOrAnimator2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, enterAnim);
                if (animationOnCreateAnimation != null) {
                    animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iA = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iA = z ? FragmentAnim.a(context, android.R.attr.activityCloseEnterAnimation) : FragmentAnim.a(context, android.R.attr.activityCloseExitAnimation);
                            } else if (nextTransition == 4099) {
                                iA = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iA = -1;
                            } else {
                                iA = z ? FragmentAnim.a(context, android.R.attr.activityOpenEnterAnimation) : FragmentAnim.a(context, android.R.attr.activityOpenExitAnimation);
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animationLoadAnimation);
                                        animationOrAnimator2 = animationOrAnimator;
                                    }
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                        if (animatorLoadAnimator != null) {
                                            animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animatorLoadAnimator);
                                            animationOrAnimator2 = animationOrAnimator;
                                        }
                                    } catch (RuntimeException e2) {
                                        if (zEquals) {
                                            throw e2;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animationLoadAnimation2);
                                        }
                                    }
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animatorLoadAnimator);
                                    animationOrAnimator2 = animationOrAnimator;
                                }
                            }
                        }
                    }
                }
            }
            this.d = animationOrAnimator2;
            this.c = true;
            return animationOrAnimator2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, boolean z) {
            super(operation);
            operation.getClass();
            this.b = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SpecialEffectsInfo {
        public final SpecialEffectsController.Operation a;

        public final boolean a() {
            SpecialEffectsController.Operation operation = this.a;
            View view = operation.c.mView;
            SpecialEffectsController.Operation.State stateA = view != null ? SpecialEffectsController.Operation.State.Companion.a(view) : null;
            SpecialEffectsController.Operation.State state = operation.a;
            if (stateA == state) {
                return true;
            }
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.b;
            return (stateA == state2 || state == state2) ? false : true;
        }

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation) {
            operation.getClass();
            this.a = operation;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransitionEffect extends SpecialEffectsController.Effect {
        public final ArrayList c;
        public final SpecialEffectsController.Operation d;
        public final SpecialEffectsController.Operation e;
        public final FragmentTransitionImpl f;
        public final Object g;
        public final ArrayList h;
        public final ArrayList i;
        public final ArrayMap j;
        public final ArrayList k;
        public final ArrayList l;
        public final ArrayMap m;
        public final ArrayMap n;
        public final boolean o;
        public final CancellationSignal p = new CancellationSignal();
        public Object q;

        /* JADX WARN: Multi-variable type inference failed */
        public final void i(ArrayList arrayList, ViewGroup viewGroup, sr0 sr0Var) {
            FragmentTransition.c(4, arrayList);
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = this.i;
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList3.get(i);
                arrayList2.add(ViewCompat.o(view));
                ViewCompat.L(view, null);
            }
            boolean zL = FragmentManager.L(2);
            final ArrayList arrayList4 = this.h;
            if (zL) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayList4.get(i2);
                    i2++;
                    obj.getClass();
                    View view2 = (View) obj;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.o(view2));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj2 = arrayList3.get(i3);
                    i3++;
                    obj2.getClass();
                    View view3 = (View) obj2;
                    Log.v("FragmentManager", "View: " + view3 + " Name: " + ViewCompat.o(view3));
                }
            }
            sr0Var.invoke();
            final int size4 = arrayList3.size();
            final ArrayList arrayList5 = new ArrayList();
            for (int i4 = 0; i4 < size4; i4++) {
                View view4 = (View) arrayList4.get(i4);
                String strO = ViewCompat.o(view4);
                arrayList5.add(strO);
                if (strO != null) {
                    ViewCompat.L(view4, null);
                    String str = (String) this.j.get(strO);
                    for (int i5 = 0; i5 < size4; i5++) {
                        if (str.equals(arrayList2.get(i5))) {
                            ViewCompat.L((View) arrayList3.get(i5), strO);
                            break;
                        }
                    }
                }
            }
            OneShotPreDrawListener.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.1
                @Override // java.lang.Runnable
                public final void run() {
                    for (int i6 = 0; i6 < size4; i6++) {
                        ViewCompat.L((View) arrayList3.get(i6), (String) arrayList2.get(i6));
                        ViewCompat.L((View) arrayList4.get(i6), (String) arrayList5.get(i6));
                    }
                }
            });
            FragmentTransition.c(0, arrayList);
            this.f.x(this.g, arrayList4, arrayList3);
        }

        public static void f(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final boolean a() {
            Object obj;
            Object obj2;
            FragmentTransitionImpl fragmentTransitionImpl = this.f;
            if (fragmentTransitionImpl.l()) {
                ArrayList arrayList = this.c;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        TransitionInfo transitionInfo = (TransitionInfo) obj3;
                        if (Build.VERSION.SDK_INT < 34 || (obj2 = transitionInfo.b) == null || !fragmentTransitionImpl.m(obj2)) {
                        }
                    }
                    obj = this.g;
                    return obj != null ? true : true;
                }
                obj = this.g;
                if (obj != null || fragmentTransitionImpl.m(obj)) {
                }
            }
            return false;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void c(ViewGroup viewGroup) {
            viewGroup.getClass();
            boolean zIsLaidOut = viewGroup.isLaidOut();
            int i = 0;
            ArrayList arrayList = this.c;
            int i2 = 2;
            if (!zIsLaidOut) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TransitionInfo transitionInfo = (TransitionInfo) obj;
                    SpecialEffectsController.Operation operation = transitionInfo.a;
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation);
                    }
                    transitionInfo.a.c(this);
                }
                return;
            }
            Object obj2 = this.q;
            FragmentTransitionImpl fragmentTransitionImpl = this.f;
            SpecialEffectsController.Operation operation2 = this.e;
            SpecialEffectsController.Operation operation3 = this.d;
            if (obj2 != null) {
                fragmentTransitionImpl.c(obj2);
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + operation3 + " to " + operation2);
                    return;
                }
                return;
            }
            dt1 dt1VarG = g(viewGroup, operation2, operation3);
            ArrayList arrayList2 = (ArrayList) dt1VarG.a;
            Object obj3 = dt1VarG.b;
            ArrayList arrayList3 = new ArrayList(eu.f(arrayList, 10));
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj4 = arrayList.get(i3);
                i3++;
                arrayList3.add(((TransitionInfo) obj4).a);
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj5 = arrayList3.get(i);
                i++;
                SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) obj5;
                fragmentTransitionImpl.u(operation4.c, obj3, this.p, new b(operation4, this, 1));
                i2 = i2;
            }
            i(arrayList2, viewGroup, new DefaultSpecialEffectsController$TransitionEffect$onCommit$4(this, viewGroup, obj3));
            if (FragmentManager.L(i2)) {
                Log.v("FragmentManager", "Completed executing operations from " + operation3 + " to " + operation2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00af  */
        public final dt1 g(ViewGroup viewGroup, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Object obj;
            FragmentTransitionImpl fragmentTransitionImpl;
            Object obj2;
            ArrayList arrayList3;
            viewGroup = viewGroup;
            operation = operation;
            View view = new View(viewGroup.getContext());
            Rect rect = new Rect();
            ArrayList arrayList4 = this.c;
            int size = arrayList4.size();
            View view2 = null;
            boolean z = false;
            int i = 0;
            while (true) {
                arrayList = this.i;
                arrayList2 = this.h;
                obj = this.g;
                fragmentTransitionImpl = this.f;
                if (i >= size) {
                    break;
                }
                Object obj3 = arrayList4.get(i);
                int i2 = i + 1;
                if (((TransitionInfo) obj3).d == null || operation2 == null || operation == null || this.j.isEmpty() || obj == null) {
                    size = size;
                    i = i2;
                    z = z;
                } else {
                    Fragment fragment = operation.c;
                    int i3 = size;
                    Fragment fragment2 = operation2.c;
                    boolean z2 = z;
                    boolean z3 = this.o;
                    ArrayMap arrayMap = this.m;
                    FragmentTransition.a(fragment, fragment2, z3, arrayMap);
                    OneShotPreDrawListener.a(viewGroup, new a(operation, operation2, this, 1));
                    arrayList2.addAll(arrayMap.values());
                    ArrayList arrayList5 = this.l;
                    if (!arrayList5.isEmpty()) {
                        Object obj4 = arrayList5.get(0);
                        obj4.getClass();
                        View view3 = (View) arrayMap.get((String) obj4);
                        fragmentTransitionImpl.s(view3, obj);
                        view2 = view3;
                    }
                    ArrayMap arrayMap2 = this.n;
                    arrayList.addAll(arrayMap2.values());
                    ArrayList arrayList6 = this.k;
                    if (arrayList6.isEmpty()) {
                        z = z2;
                    } else {
                        Object obj5 = arrayList6.get(0);
                        obj5.getClass();
                        View view4 = (View) arrayMap2.get((String) obj5);
                        if (view4 != null) {
                            OneShotPreDrawListener.a(viewGroup, new g20(fragmentTransitionImpl, view4, rect));
                            z = true;
                        } else {
                            z = z2;
                        }
                    }
                    fragmentTransitionImpl.w(obj, view, arrayList2);
                    Object obj6 = this.g;
                    fragmentTransitionImpl.q(obj6, null, null, obj6, arrayList);
                    size = i3;
                    i = i2;
                }
            }
            boolean z4 = z;
            ArrayList arrayList7 = arrayList;
            ArrayList arrayList8 = new ArrayList();
            int size2 = arrayList4.size();
            Object objO = null;
            Object objO2 = null;
            int i4 = 0;
            while (true) {
                arrayList7 = arrayList7;
                if (i4 >= size2) {
                    break;
                }
                arrayList4 = arrayList4;
                TransitionInfo transitionInfo = (TransitionInfo) arrayList4.get(i4);
                size2 = size2;
                SpecialEffectsController.Operation operation3 = transitionInfo.a;
                i4++;
                Object objH = fragmentTransitionImpl.h(transitionInfo.b);
                if (objH != null) {
                    ArrayList arrayList9 = arrayList2;
                    ArrayList arrayList10 = new ArrayList();
                    Object obj7 = obj;
                    Fragment fragment3 = operation3.c;
                    Object obj8 = objO2;
                    View view5 = fragment3.mView;
                    view5.getClass();
                    f(view5, arrayList10);
                    if (obj7 != null && (operation3 == operation2 || operation3 == operation)) {
                        if (operation3 == operation2) {
                            arrayList10.removeAll(du.E0(arrayList9));
                        } else {
                            arrayList10.removeAll(du.E0(arrayList7));
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        fragmentTransitionImpl.a(view, objH);
                        obj2 = objH;
                        arrayList3 = arrayList10;
                    } else {
                        fragmentTransitionImpl.b(objH, arrayList10);
                        fragmentTransitionImpl.q(objH, objH, arrayList10, null, null);
                        obj2 = objH;
                        arrayList3 = arrayList10;
                        if (operation3.a == SpecialEffectsController.Operation.State.c) {
                            operation3.i = false;
                            ArrayList arrayList11 = new ArrayList(arrayList3);
                            arrayList11.remove(fragment3.mView);
                            fragmentTransitionImpl.p(obj2, fragment3.mView, arrayList11);
                            OneShotPreDrawListener.a(viewGroup, new s3(arrayList3, 26));
                        }
                    }
                    if (operation3.a == SpecialEffectsController.Operation.State.b) {
                        arrayList8.addAll(arrayList3);
                        if (z4) {
                            fragmentTransitionImpl.t(obj2, rect);
                        }
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            int size3 = arrayList3.size();
                            int i5 = 0;
                            while (i5 < size3) {
                                Object obj9 = arrayList3.get(i5);
                                i5++;
                                obj9.getClass();
                                Log.v("FragmentManager", "View: " + ((View) obj9));
                            }
                        }
                    } else {
                        fragmentTransitionImpl.s(view2, obj2);
                        if (FragmentManager.L(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            int size4 = arrayList3.size();
                            int i6 = 0;
                            while (i6 < size4) {
                                Object obj10 = arrayList3.get(i6);
                                i6++;
                                obj10.getClass();
                                Log.v("FragmentManager", "View: " + ((View) obj10));
                            }
                        }
                    }
                    if (transitionInfo.c) {
                        objO = fragmentTransitionImpl.o(objO, obj2);
                        arrayList2 = arrayList9;
                        obj = obj7;
                        objO2 = obj8;
                    } else {
                        objO2 = fragmentTransitionImpl.o(obj8, obj2);
                        arrayList2 = arrayList9;
                        obj = obj7;
                    }
                }
            }
            Object objN = fragmentTransitionImpl.n(objO, objO2, obj);
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objN);
            }
            return new dt1(arrayList8, objN);
        }

        public final boolean h() {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                return true;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!((TransitionInfo) obj).a.c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public TransitionEffect(ArrayList arrayList, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, FragmentTransitionImpl fragmentTransitionImpl, Object obj, ArrayList arrayList2, ArrayList arrayList3, ArrayMap arrayMap, ArrayList arrayList4, ArrayList arrayList5, ArrayMap arrayMap2, ArrayMap arrayMap3, boolean z) {
            this.c = arrayList;
            this.d = operation;
            this.e = operation2;
            this.f = fragmentTransitionImpl;
            this.g = obj;
            this.h = arrayList2;
            this.i = arrayList3;
            this.j = arrayMap;
            this.k = arrayList4;
            this.l = arrayList5;
            this.m = arrayMap2;
            this.n = arrayMap3;
            this.o = z;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void b(ViewGroup viewGroup) {
            viewGroup.getClass();
            this.p.a();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void d(BackEventCompat backEventCompat, ViewGroup viewGroup) {
            backEventCompat.getClass();
            viewGroup.getClass();
            Object obj = this.q;
            if (obj != null) {
                this.f.r(obj, backEventCompat.c);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void e(ViewGroup viewGroup) {
            Object obj;
            viewGroup.getClass();
            boolean zIsLaidOut = viewGroup.isLaidOut();
            int i = 0;
            ArrayList arrayList = this.c;
            if (!zIsLaidOut) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    SpecialEffectsController.Operation operation = ((TransitionInfo) obj2).a;
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            boolean zH = h();
            SpecialEffectsController.Operation operation2 = this.e;
            SpecialEffectsController.Operation operation3 = this.d;
            if (zH && (obj = this.g) != null && !a()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + operation3 + " and " + operation2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (a() && h()) {
                m32 m32Var = new m32();
                dt1 dt1VarG = g(viewGroup, operation2, operation3);
                ArrayList arrayList2 = (ArrayList) dt1VarG.a;
                Object obj3 = dt1VarG.b;
                ArrayList arrayList3 = new ArrayList(eu.f(arrayList, 10));
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    arrayList3.add(((TransitionInfo) obj4).a);
                }
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj5 = arrayList3.get(i3);
                    i3++;
                    SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) obj5;
                    da0 da0Var = new da0(m32Var, 0);
                    Fragment fragment = operation4.c;
                    this.f.v(obj3, this.p, da0Var, new b(operation4, this, 0));
                }
                i(arrayList2, viewGroup, new DefaultSpecialEffectsController$TransitionEffect$onStart$4(this, viewGroup, obj3, m32Var));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransitionInfo extends SpecialEffectsInfo {
        public final Object b;
        public final boolean c;
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, boolean z, boolean z2) {
            super(operation);
            Fragment fragment = operation.c;
            SpecialEffectsController.Operation.State state = operation.a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.b;
            this.b = state == state2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.c = operation.a == state2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.d = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final FragmentTransitionImpl b() {
            Object obj = this.b;
            FragmentTransitionImpl fragmentTransitionImplC = c(obj);
            Object obj2 = this.d;
            FragmentTransitionImpl fragmentTransitionImplC2 = c(obj2);
            if (fragmentTransitionImplC == null || fragmentTransitionImplC2 == null || fragmentTransitionImplC == fragmentTransitionImplC2) {
                return fragmentTransitionImplC == null ? fragmentTransitionImplC2 : fragmentTransitionImplC;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final FragmentTransitionImpl c(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.a;
            if (obj instanceof Transition) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.b;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.g(obj)) {
                return fragmentTransitionImpl2;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            Fragment fragment = this.a.c;
            sb.append(" for fragment ");
            sb.append(fragment);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnimationEffect extends SpecialEffectsController.Effect {
        public final AnimationInfo c;

        public AnimationEffect(AnimationInfo animationInfo) {
            this.c = animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void b(ViewGroup viewGroup) {
            viewGroup.getClass();
            SpecialEffectsController.Operation operation = this.c.a;
            View view = operation.c.mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            operation.c(this);
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void c(final ViewGroup viewGroup) {
            viewGroup.getClass();
            AnimationInfo animationInfo = this.c;
            final SpecialEffectsController.Operation operation = animationInfo.a;
            if (animationInfo.a()) {
                operation.c(this);
                return;
            }
            Context context = viewGroup.getContext();
            final View view = operation.c.mView;
            context.getClass();
            FragmentAnim.AnimationOrAnimator animationOrAnimatorB = animationInfo.b(context);
            if (animationOrAnimatorB != null) {
                Animation animation = animationOrAnimatorB.a;
                if (animation != null) {
                    if (operation.a != SpecialEffectsController.Operation.State.a) {
                        view.startAnimation(animation);
                        operation.c(this);
                        return;
                    }
                    viewGroup.startViewTransition(view);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation, viewGroup, view);
                    endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation2) {
                            animation2.getClass();
                            ViewGroup viewGroup2 = viewGroup;
                            viewGroup2.post(new a(viewGroup2, view, this, 0));
                            if (FragmentManager.L(2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation + " has ended.");
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation2) {
                            animation2.getClass();
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation2) {
                            animation2.getClass();
                            if (FragmentManager.L(2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation + " has reached onAnimationStart.");
                            }
                        }
                    });
                    view.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
                        return;
                    }
                    return;
                }
                e32.i("Required value was null.");
                return;
            }
            e32.i("Required value was null.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnimatorEffect extends SpecialEffectsController.Effect {
        public final AnimationInfo c;
        public AnimatorSet d;

        public AnimatorEffect(AnimationInfo animationInfo) {
            this.c = animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void b(ViewGroup viewGroup) {
            String str;
            viewGroup.getClass();
            AnimatorSet animatorSet = this.d;
            SpecialEffectsController.Operation operation = this.c.a;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            if (operation.g) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Api26Impl.a.a(animatorSet);
                }
            } else {
                animatorSet.end();
            }
            if (FragmentManager.L(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(operation);
                sb.append(" has been canceled");
                if (operation.g) {
                    str = " with seeking.";
                } else {
                    str = UserDetailsUtils.UserDetailsLiterals.DOT;
                }
                sb.append(str);
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void c(ViewGroup viewGroup) {
            viewGroup.getClass();
            SpecialEffectsController.Operation operation = this.c.a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void d(BackEventCompat backEventCompat, ViewGroup viewGroup) {
            backEventCompat.getClass();
            viewGroup.getClass();
            SpecialEffectsController.Operation operation = this.c.a;
            AnimatorSet animatorSet = this.d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT >= 34 && operation.c.mTransitioning) {
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
                }
                long jA = Api24Impl.a.a(animatorSet);
                long j = (long) (backEventCompat.c * jA);
                if (j == 0) {
                    j = 1;
                }
                if (j == jA) {
                    j = jA - 1;
                }
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + operation);
                }
                Api26Impl.a.b(animatorSet, j);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void e(final ViewGroup viewGroup) {
            AnimatorSet animatorSet;
            boolean z;
            final AnimatorEffect animatorEffect;
            viewGroup.getClass();
            AnimationInfo animationInfo = this.c;
            if (!animationInfo.a()) {
                Context context = viewGroup.getContext();
                context.getClass();
                FragmentAnim.AnimationOrAnimator animationOrAnimatorB = animationInfo.b(context);
                if (animationOrAnimatorB != null) {
                    animatorSet = animationOrAnimatorB.b;
                } else {
                    animatorSet = null;
                }
                this.d = animatorSet;
                final SpecialEffectsController.Operation operation = animationInfo.a;
                Fragment fragment = operation.c;
                if (operation.a == SpecialEffectsController.Operation.State.c) {
                    z = true;
                } else {
                    z = false;
                }
                final boolean z2 = z;
                final View view = fragment.mView;
                viewGroup.startViewTransition(view);
                AnimatorSet animatorSet2 = this.d;
                if (animatorSet2 != null) {
                    animatorEffect = this;
                    animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            animator.getClass();
                            ViewGroup viewGroup2 = viewGroup;
                            View view2 = view;
                            viewGroup2.endViewTransition(view2);
                            boolean z3 = z2;
                            SpecialEffectsController.Operation operation2 = operation;
                            if (z3) {
                                SpecialEffectsController.Operation.State state = operation2.a;
                                view2.getClass();
                                state.a(view2, viewGroup2);
                            }
                            DefaultSpecialEffectsController.AnimatorEffect animatorEffect2 = animatorEffect;
                            animatorEffect2.c.a.c(animatorEffect2);
                            if (FragmentManager.L(2)) {
                                Log.v("FragmentManager", "Animator from operation " + operation2 + " has ended.");
                            }
                        }
                    });
                } else {
                    animatorEffect = this;
                }
                AnimatorSet animatorSet3 = animatorEffect.d;
                if (animatorSet3 != null) {
                    animatorSet3.setTarget(view);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api24Impl {
        public static final Api24Impl a = new Api24Impl();

        @DoNotInline
        public final long a(@NotNull AnimatorSet animatorSet) {
            animatorSet.getClass();
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "Landroid/animation/AnimatorSet;", "animatorSet", "Laz2;", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api26Impl {
        public static final Api26Impl a = new Api26Impl();

        @DoNotInline
        public final void a(@NotNull AnimatorSet animatorSet) {
            animatorSet.getClass();
            animatorSet.reverse();
        }

        @DoNotInline
        public final void b(@NotNull AnimatorSet animatorSet, long time) {
            animatorSet.getClass();
            animatorSet.setCurrentPlayTime(time);
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x047c A[LOOP:20: B:151:0x047a->B:152:0x047c, LOOP_END] */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void b(ArrayList arrayList, boolean z) {
        SpecialEffectsController.Operation.State state;
        FragmentTransitionImpl fragmentTransitionImpl;
        Object obj;
        Object objPrevious;
        Object obj2;
        TransitionEffect transitionEffect;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        FragmentTransitionImpl fragmentTransitionImpl2;
        ArrayList arrayList4;
        int i2;
        int i3;
        String strB;
        int size2 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            state = SpecialEffectsController.Operation.State.b;
            fragmentTransitionImpl = null;
            if (i5 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList.get(i5);
            i5++;
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj;
            View view = operation.c.mView;
            view.getClass();
            if (SpecialEffectsController.Operation.State.Companion.a(view) == state && operation.a != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) objPrevious;
            View view2 = operation3.c.mView;
            view2.getClass();
            if (SpecialEffectsController.Operation.State.Companion.a(view2) != state && operation3.a == state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) objPrevious;
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation2 + " to " + operation4);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Fragment fragment = ((SpecialEffectsController.Operation) du.h0(arrayList)).c;
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList.get(i6);
            i6++;
            Fragment.AnimationInfo animationInfo = ((SpecialEffectsController.Operation) obj3).c.mAnimationInfo;
            Fragment.AnimationInfo animationInfo2 = fragment.mAnimationInfo;
            animationInfo.b = animationInfo2.b;
            animationInfo.c = animationInfo2.c;
            animationInfo.d = animationInfo2.d;
            animationInfo.e = animationInfo2.e;
        }
        int size4 = arrayList.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj4 = arrayList.get(i7);
            i7++;
            SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) obj4;
            arrayList5.add(new AnimationInfo(operation5, z));
            arrayList6.add(new TransitionInfo(operation5, z, !z ? operation5 != operation4 : operation5 != operation2));
            operation5.d.add(new g20(16, this, operation5));
        }
        ArrayList arrayList7 = new ArrayList();
        int size5 = arrayList6.size();
        int i8 = 0;
        while (i8 < size5) {
            Object obj5 = arrayList6.get(i8);
            i8++;
            if (!((TransitionInfo) obj5).a()) {
                arrayList7.add(obj5);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        int size6 = arrayList7.size();
        int i9 = 0;
        while (i9 < size6) {
            Object obj6 = arrayList7.get(i9);
            i9++;
            if (((TransitionInfo) obj6).b() != null) {
                arrayList8.add(obj6);
            }
        }
        int size7 = arrayList8.size();
        int i10 = 0;
        while (i10 < size7) {
            Object obj7 = arrayList8.get(i10);
            i10++;
            TransitionInfo transitionInfo = (TransitionInfo) obj7;
            FragmentTransitionImpl fragmentTransitionImplB = transitionInfo.b();
            if (fragmentTransitionImpl != null && fragmentTransitionImplB != fragmentTransitionImpl) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(transitionInfo.a.c);
                sb.append(" returned Transition ");
                ak1.n(jc1.p(sb, transitionInfo.b, " which uses a different Transition type than other Fragments."));
                return;
            }
            fragmentTransitionImpl = fragmentTransitionImplB;
        }
        if (fragmentTransitionImpl == null) {
            arrayList2 = arrayList5;
        } else {
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            ArrayMap arrayMap = new ArrayMap(0);
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayMap arrayMap2 = new ArrayMap(0);
            ArrayList<String> arrayList13 = arrayList12;
            ArrayMap arrayMap3 = new ArrayMap(0);
            int size8 = arrayList8.size();
            loop10: while (true) {
                obj2 = null;
                while (true) {
                    if (i4 >= size8) {
                        break loop10;
                    }
                    Object obj8 = arrayList8.get(i4);
                    int i11 = i4 + 1;
                    ArrayList arrayList14 = arrayList9;
                    Object obj9 = ((TransitionInfo) obj8).d;
                    if (obj9 == null || operation2 == null) {
                        arrayList3 = arrayList5;
                    } else {
                        arrayList3 = arrayList5;
                        Fragment fragment2 = operation2.c;
                        if (operation4 != null) {
                            Fragment fragment3 = operation4.c;
                            Object objY = fragmentTransitionImpl.y(fragmentTransitionImpl.h(obj9));
                            fragmentTransitionImpl2 = fragmentTransitionImpl;
                            ArrayList<String> sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                            sharedElementSourceNames.getClass();
                            arrayList4 = arrayList10;
                            ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                            sharedElementSourceNames2.getClass();
                            i2 = size8;
                            ArrayList<String> sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                            sharedElementTargetNames.getClass();
                            int size9 = sharedElementTargetNames.size();
                            i3 = i11;
                            int i12 = 0;
                            while (i12 < size9) {
                                int i13 = size9;
                                int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i12));
                                if (iIndexOf != -1) {
                                    sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                                }
                                i12++;
                                size9 = i13;
                            }
                            ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                            sharedElementTargetNames2.getClass();
                            dt1 dt1Var = !z ? new dt1(fragment2.getExitTransitionCallback(), fragment3.getEnterTransitionCallback()) : new dt1(fragment2.getEnterTransitionCallback(), fragment3.getExitTransitionCallback());
                            SharedElementCallback sharedElementCallback = (SharedElementCallback) dt1Var.a;
                            SharedElementCallback sharedElementCallback2 = (SharedElementCallback) dt1Var.b;
                            int size10 = sharedElementSourceNames.size();
                            int i14 = 0;
                            while (i14 < size10) {
                                String str = sharedElementSourceNames.get(i14);
                                str.getClass();
                                SharedElementCallback sharedElementCallback3 = sharedElementCallback;
                                String str2 = str;
                                String str3 = sharedElementTargetNames2.get(i14);
                                str3.getClass();
                                arrayMap.put(str2, str3);
                                i14++;
                                sharedElementCallback = sharedElementCallback3;
                            }
                            SharedElementCallback sharedElementCallback4 = sharedElementCallback;
                            if (FragmentManager.L(2)) {
                                Log.v("FragmentManager", ">>> entering view names <<<");
                                int i15 = 0;
                                for (int size11 = sharedElementTargetNames2.size(); i15 < size11; size11 = size11) {
                                    String str4 = sharedElementTargetNames2.get(i15);
                                    Log.v("FragmentManager", "Name: " + str4);
                                    i15++;
                                }
                                Log.v("FragmentManager", ">>> exiting view names <<<");
                                int i16 = 0;
                                for (int size12 = sharedElementSourceNames.size(); i16 < size12; size12 = size12) {
                                    String str5 = sharedElementSourceNames.get(i16);
                                    Log.v("FragmentManager", "Name: " + str5);
                                    i16++;
                                }
                            }
                            View view3 = fragment2.mView;
                            view3.getClass();
                            m(arrayMap2, view3);
                            arrayMap2.m(sharedElementSourceNames);
                            if (sharedElementCallback4 != null) {
                                if (FragmentManager.L(2)) {
                                    Log.v("FragmentManager", "Executing exit callback for operation " + operation2);
                                }
                                int size13 = sharedElementSourceNames.size() - 1;
                                if (size13 >= 0) {
                                    while (true) {
                                        int i17 = size13 - 1;
                                        String str6 = sharedElementSourceNames.get(size13);
                                        str6.getClass();
                                        String str7 = str6;
                                        View view4 = (View) arrayMap2.get(str7);
                                        if (view4 == null) {
                                            arrayMap.remove(str7);
                                        } else if (!str7.equals(ViewCompat.o(view4))) {
                                            arrayMap.put(ViewCompat.o(view4), (String) arrayMap.remove(str7));
                                        }
                                        if (i17 < 0) {
                                            break;
                                        } else {
                                            size13 = i17;
                                        }
                                    }
                                }
                            } else {
                                arrayMap.m(arrayMap2.keySet());
                            }
                            View view5 = fragment3.mView;
                            view5.getClass();
                            m(arrayMap3, view5);
                            arrayMap3.m(sharedElementTargetNames2);
                            arrayMap3.m(arrayMap.values());
                            if (sharedElementCallback2 != null) {
                                if (FragmentManager.L(2)) {
                                    Log.v("FragmentManager", "Executing enter callback for operation " + operation4);
                                }
                                int size14 = sharedElementTargetNames2.size() - 1;
                                if (size14 >= 0) {
                                    while (true) {
                                        int i18 = size14 - 1;
                                        String str8 = sharedElementTargetNames2.get(size14);
                                        str8.getClass();
                                        String str9 = str8;
                                        View view6 = (View) arrayMap3.get(str9);
                                        if (view6 == null) {
                                            String strB2 = FragmentTransition.b(arrayMap, str9);
                                            if (strB2 != null) {
                                                arrayMap.remove(strB2);
                                            }
                                        } else if (!str9.equals(ViewCompat.o(view6)) && (strB = FragmentTransition.b(arrayMap, str9)) != null) {
                                            arrayMap.put(strB, ViewCompat.o(view6));
                                        }
                                        if (i18 < 0) {
                                            break;
                                        } else {
                                            size14 = i18;
                                        }
                                    }
                                }
                            } else {
                                FragmentTransitionImpl fragmentTransitionImpl3 = FragmentTransition.a;
                                for (int i19 = arrayMap.c - 1; -1 < i19; i19--) {
                                    if (!arrayMap3.containsKey((String) arrayMap.j(i19))) {
                                        arrayMap.g(i19);
                                    }
                                }
                            }
                            iu.P(arrayMap2.entrySet(), new DefaultSpecialEffectsController$retainMatchingViews$1(arrayMap.keySet()), false);
                            iu.P(arrayMap3.entrySet(), new DefaultSpecialEffectsController$retainMatchingViews$1(arrayMap.values()), false);
                            if (arrayMap.isEmpty()) {
                                Log.i("FragmentManager", "Ignoring shared elements transition " + objY + " between " + operation2 + " and " + operation4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                arrayList14.clear();
                                arrayList4.clear();
                                arrayList13 = sharedElementSourceNames;
                                arrayList11 = sharedElementTargetNames2;
                                arrayList5 = arrayList3;
                                arrayList9 = arrayList14;
                                fragmentTransitionImpl = fragmentTransitionImpl2;
                                arrayList10 = arrayList4;
                                size8 = i2;
                                i4 = i3;
                            } else {
                                obj2 = objY;
                                arrayList13 = sharedElementSourceNames;
                                arrayList11 = sharedElementTargetNames2;
                            }
                        }
                        arrayList5 = arrayList3;
                        arrayList9 = arrayList14;
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                        arrayList10 = arrayList4;
                        size8 = i2;
                        i4 = i3;
                    }
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList4 = arrayList10;
                    i2 = size8;
                    i3 = i11;
                    arrayList5 = arrayList3;
                    arrayList9 = arrayList14;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    arrayList10 = arrayList4;
                    size8 = i2;
                    i4 = i3;
                }
            }
            ArrayList arrayList15 = arrayList9;
            ArrayList arrayList16 = arrayList5;
            FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl;
            ArrayList arrayList17 = arrayList10;
            if (obj2 != null) {
                arrayList2 = arrayList16;
                transitionEffect = new TransitionEffect(arrayList8, operation2, operation4, fragmentTransitionImpl4, obj2, arrayList15, arrayList17, arrayMap, arrayList11, arrayList13, arrayMap2, arrayMap3, z);
                size = arrayList8.size();
                i = 0;
                while (i < size) {
                    Object obj10 = arrayList8.get(i);
                    i++;
                    ((TransitionInfo) obj10).a.j.add(transitionEffect);
                }
            } else {
                if (!arrayList8.isEmpty()) {
                    int size15 = arrayList8.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size15) {
                            Object obj11 = arrayList8.get(i20);
                            i20++;
                            if (((TransitionInfo) obj11).b != null) {
                                arrayList2 = arrayList16;
                                transitionEffect = new TransitionEffect(arrayList8, operation2, operation4, fragmentTransitionImpl4, obj2, arrayList15, arrayList17, arrayMap, arrayList11, arrayList13, arrayMap2, arrayMap3, z);
                                size = arrayList8.size();
                                i = 0;
                                while (i < size) {
                                    Object obj12 = arrayList8.get(i);
                                    i++;
                                    ((TransitionInfo) obj12).a.j.add(transitionEffect);
                                }
                            }
                        }
                    }
                }
                arrayList2 = arrayList16;
            }
        }
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        int size16 = arrayList2.size();
        int i21 = 0;
        while (i21 < size16) {
            Object obj13 = arrayList2.get(i21);
            i21++;
            iu.N(((AnimationInfo) obj13).a.k, arrayList19);
        }
        boolean zIsEmpty = arrayList19.isEmpty();
        int size17 = arrayList2.size();
        boolean z2 = false;
        int i22 = 0;
        while (i22 < size17) {
            Object obj14 = arrayList2.get(i22);
            i22++;
            AnimationInfo animationInfo3 = (AnimationInfo) obj14;
            Context context = this.a.getContext();
            SpecialEffectsController.Operation operation6 = animationInfo3.a;
            context.getClass();
            FragmentAnim.AnimationOrAnimator animationOrAnimatorB = animationInfo3.b(context);
            if (animationOrAnimatorB != null) {
                if (animationOrAnimatorB.b == null) {
                    arrayList18.add(animationInfo3);
                } else {
                    Fragment fragment4 = operation6.c;
                    if (operation6.k.isEmpty()) {
                        if (operation6.a == SpecialEffectsController.Operation.State.c) {
                            operation6.i = false;
                        }
                        operation6.j.add(new AnimatorEffect(animationInfo3));
                        z2 = true;
                    } else if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int i23 = 0;
        int size18 = arrayList18.size();
        while (i23 < size18) {
            Object obj15 = arrayList18.get(i23);
            i23++;
            AnimationInfo animationInfo4 = (AnimationInfo) obj15;
            SpecialEffectsController.Operation operation7 = animationInfo4.a;
            Fragment fragment5 = operation7.c;
            if (zIsEmpty) {
                if (!z2) {
                    operation7.j.add(new AnimationEffect(animationInfo4));
                } else if (FragmentManager.L(2)) {
                    Log.v(r6, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.L(2)) {
                Log.v(r6, "Ignoring Animation set on " + fragment5 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public static void m(ArrayMap arrayMap, View view) {
        String strO = ViewCompat.o(view);
        if (strO != null) {
            arrayMap.put(strO, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m(arrayMap, childAt);
                }
            }
        }
    }
}
