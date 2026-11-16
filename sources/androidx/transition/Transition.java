package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.LongSparseArrayKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.dr0;
import defpackage.e32;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final PathMotion D = new AnonymousClass1();
    public static final ThreadLocal E = new ThreadLocal();
    public long A;
    public ArrayList k;
    public ArrayList l;
    public TransitionListener[] m;
    public TransitionPropagation v;
    public EpicenterCallback w;
    public long y;
    public SeekController z;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public TransitionValuesMaps g = new TransitionValuesMaps();
    public TransitionValuesMaps h = new TransitionValuesMaps();
    public TransitionSet i = null;
    public final int[] j = C;
    public final ArrayList n = new ArrayList();
    public Animator[] o = B;
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public Transition s = null;
    public ArrayList t = null;
    public ArrayList u = new ArrayList();
    public PathMotion x = D;

    /* JADX INFO: renamed from: androidx.transition.Transition$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends PathMotion {
        @Override // androidx.transition.PathMotion
        public final Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnimationInfo {
        public View a;
        public String b;
        public TransitionValues c;
        public WindowId d;
        public Transition e;
        public Animator f;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ArrayListManager {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class EpicenterCallback {
        public abstract Rect a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl26 {
        @DoNotInline
        public static void b(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }

        @DoNotInline
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MatchOrder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public class SeekController extends TransitionListenerAdapter implements TransitionSeekController, DynamicAnimation.OnAnimationUpdateListener {
        public long a = -1;
        public boolean b;
        public boolean c;
        public SpringAnimation d;
        public final VelocityTracker1D e;
        public androidx.fragment.app.b f;
        public final /* synthetic */ TransitionSet g;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            this.c = true;
        }

        @Override // androidx.transition.TransitionSeekController
        public final long c() {
            return this.g.y;
        }

        @Override // androidx.transition.TransitionSeekController
        public final void d(androidx.fragment.app.b bVar) {
            this.f = bVar;
            m();
            this.d.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // androidx.transition.TransitionSeekController
        public final void i(long j) {
            if (this.d != null) {
                e32.i("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j2 = this.a;
            if (j == j2 || !this.b) {
                return;
            }
            if (!this.c) {
                TransitionSet transitionSet = this.g;
                if (j != 0 || j2 <= 0) {
                    long j3 = transitionSet.y;
                    if (j == j3 && j2 < j3) {
                        j = 1 + j3;
                    }
                } else {
                    j = -1;
                }
                if (j != j2) {
                    transitionSet.E(j, j2);
                    this.a = j;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            VelocityTracker1D velocityTracker1D = this.e;
            int i = (velocityTracker1D.c + 1) % 20;
            velocityTracker1D.c = i;
            velocityTracker1D.a[i] = jCurrentAnimationTimeMillis;
            velocityTracker1D.b[i] = j;
        }

        @Override // androidx.transition.TransitionSeekController
        public final boolean isReady() {
            return this.b;
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public final void l(float f) {
            TransitionSet transitionSet = this.g;
            long jMax = Math.max(-1L, Math.min(transitionSet.y + 1, Math.round(f)));
            transitionSet.E(jMax, this.a);
            this.a = jMax;
        }

        public final void m() {
            if (this.d != null) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.a;
            VelocityTracker1D velocityTracker1D = this.e;
            int i = velocityTracker1D.c;
            float[] fArr = velocityTracker1D.b;
            long[] jArr = velocityTracker1D.a;
            char c = 20;
            int i2 = (i + 1) % 20;
            velocityTracker1D.c = i2;
            jArr[i2] = jCurrentAnimationTimeMillis;
            fArr[i2] = f;
            FloatValueHolder floatValueHolder = new FloatValueHolder();
            float fSqrt = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            floatValueHolder.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            SpringAnimation springAnimation = new SpringAnimation(floatValueHolder);
            springAnimation.l = null;
            springAnimation.m = Float.MAX_VALUE;
            this.d = springAnimation;
            SpringForce springForce = new SpringForce();
            springForce.b = 1.0d;
            int i3 = 0;
            springForce.c = false;
            springForce.a = Math.sqrt(200.0d);
            springForce.c = false;
            SpringAnimation springAnimation2 = this.d;
            springAnimation2.l = springForce;
            springAnimation2.b = this.a;
            springAnimation2.c = true;
            ArrayList arrayList = springAnimation2.k;
            if (springAnimation2.e) {
                d.u("Error: Update listeners must be added beforethe animation.");
                return;
            }
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            SpringAnimation springAnimation3 = this.d;
            int i4 = velocityTracker1D.c;
            long j = Long.MIN_VALUE;
            if (i4 != 0 || jArr[i4] != Long.MIN_VALUE) {
                long j2 = jArr[i4];
                long j3 = j2;
                while (true) {
                    long j4 = jArr[i4];
                    if (j4 == j) {
                        break;
                    }
                    float f2 = j2 - j4;
                    float fAbs = Math.abs(j4 - j3);
                    if (f2 > 100.0f || fAbs > 40.0f) {
                        break;
                    }
                    if (i4 == 0) {
                        i4 = 20;
                    }
                    i4--;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    j3 = j4;
                    j = Long.MIN_VALUE;
                }
                if (i3 >= 2) {
                    int i5 = velocityTracker1D.c;
                    float f3 = 1000.0f;
                    if (i3 == 2) {
                        int i6 = i5 == 0 ? 19 : i5 - 1;
                        float f4 = jArr[i5] - jArr[i6];
                        if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            fSqrt = ((fArr[i5] - fArr[i6]) / f4) * 1000.0f;
                        }
                    } else {
                        int i7 = ((i5 - i3) + 21) % 20;
                        int i8 = (i5 + 21) % 20;
                        long j5 = jArr[i7];
                        float f5 = fArr[i7];
                        int i9 = i7 + 1;
                        int i10 = i9 % 20;
                        float f6 = 0.0f;
                        while (i10 != i8) {
                            long j6 = jArr[i10];
                            float f7 = fSqrt;
                            int i11 = i8;
                            float f8 = j6 - j5;
                            if (f8 != f7) {
                                float f9 = fArr[i10];
                                float f10 = (f9 - f5) / f8;
                                float fAbs2 = (Math.abs(f10) * (f10 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * ((double) Math.signum(f6)))))) + f6;
                                if (i10 == i9) {
                                    fAbs2 *= 0.5f;
                                }
                                f6 = fAbs2;
                                f5 = f9;
                                j5 = j6;
                            }
                            i10 = (i10 + 1) % 20;
                            fSqrt = f7;
                            i8 = i11;
                            c = c;
                            f3 = f3;
                        }
                        fSqrt = ((float) (Math.sqrt(Math.abs(f6) * 2.0f) * ((double) Math.signum(f6)))) * f3;
                    }
                }
            }
            springAnimation3.a = fSqrt;
            SpringAnimation springAnimation4 = this.d;
            springAnimation4.f = this.g.y + 1;
            springAnimation4.g = -1.0f;
            springAnimation4.i = 4.0f;
            DynamicAnimation.OnAnimationEndListener onAnimationEndListener = new DynamicAnimation.OnAnimationEndListener() { // from class: androidx.transition.a
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void a(float f11) {
                    Transition.SeekController seekController = this.a;
                    TransitionSet transitionSet = seekController.g;
                    Transition.TransitionNotification transitionNotification = Transition.TransitionNotification.b;
                    if (f11 >= 1.0f) {
                        transitionSet.x(transitionSet, transitionNotification, false);
                        return;
                    }
                    long j7 = transitionSet.y;
                    Transition transitionP = transitionSet.P(0);
                    Transition transition = transitionP.s;
                    transitionP.s = null;
                    transitionSet.E(-1L, seekController.a);
                    transitionSet.E(j7, -1L);
                    seekController.a = j7;
                    androidx.fragment.app.b bVar = seekController.f;
                    if (bVar != null) {
                        bVar.run();
                    }
                    transitionSet.u.clear();
                    if (transition != null) {
                        transition.x(transition, transitionNotification, true);
                    }
                }
            };
            ArrayList arrayList2 = springAnimation4.j;
            if (arrayList2.contains(onAnimationEndListener)) {
                return;
            }
            arrayList2.add(onAnimationEndListener);
        }

        public SeekController(TransitionSet transitionSet) {
            this.g = transitionSet;
            VelocityTracker1D velocityTracker1D = new VelocityTracker1D();
            long[] jArr = new long[20];
            velocityTracker1D.a = jArr;
            velocityTracker1D.b = new float[20];
            velocityTracker1D.c = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.e = velocityTracker1D;
        }

        @Override // androidx.transition.TransitionSeekController
        public final void e() {
            m();
            this.d.d(this.g.y + 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface TransitionNotification {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;

        void a(TransitionListener transitionListener, Transition transition, boolean z);

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.transition.b] */
        static {
            final int i = 0;
            a = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i) {
                        case 0:
                            transitionListener.a(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.h(transition);
                            break;
                        default:
                            transitionListener.b(transition);
                            break;
                    }
                }
            };
            final int i2 = 1;
            b = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i2) {
                        case 0:
                            transitionListener.a(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.h(transition);
                            break;
                        default:
                            transitionListener.b(transition);
                            break;
                    }
                }
            };
            final int i3 = 2;
            c = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i3) {
                        case 0:
                            transitionListener.a(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.h(transition);
                            break;
                        default:
                            transitionListener.b(transition);
                            break;
                    }
                }
            };
            final int i4 = 3;
            d = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i4) {
                        case 0:
                            transitionListener.a(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.h(transition);
                            break;
                        default:
                            transitionListener.b(transition);
                            break;
                    }
                }
            };
            final int i5 = 4;
            e = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
                    switch (i5) {
                        case 0:
                            transitionListener.a(transition);
                            break;
                        case 1:
                            transitionListener.f(transition);
                            break;
                        case 2:
                            transitionListener.k(transition);
                            break;
                        case 3:
                            transitionListener.h(transition);
                            break;
                        default:
                            transitionListener.b(transition);
                            break;
                    }
                }
            };
        }
    }

    public abstract void d(TransitionValues transitionValues);

    public abstract void g(TransitionValues transitionValues);

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.u = new ArrayList();
            transition.g = new TransitionValuesMaps();
            transition.h = new TransitionValuesMaps();
            transition.k = null;
            transition.l = null;
            transition.z = null;
            transition.s = this;
            transition.t = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            dr0.m(e);
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public String[] q() {
        return null;
    }

    public boolean u(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (w(transitionValues, transitionValues2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = transitionValues.a.keySet().iterator();
                while (it.hasNext()) {
                    if (w(transitionValues, transitionValues2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface TransitionListener {
        void b(Transition transition);

        void g(Transition transition);

        void h(Transition transition);

        void j(Transition transition);

        void k(Transition transition);

        default void a(Transition transition) {
            g(transition);
        }

        default void f(Transition transition) {
            j(transition);
        }
    }

    public static void c(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        ArrayMap arrayMap = transitionValuesMaps.a;
        ArrayMap arrayMap2 = transitionValuesMaps.d;
        SparseArray sparseArray = transitionValuesMaps.b;
        LongSparseArray longSparseArray = transitionValuesMaps.c;
        arrayMap.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strO = ViewCompat.o(view);
        if (strO != null) {
            if (arrayMap2.containsKey(strO)) {
                arrayMap2.put(strO, null);
            } else {
                arrayMap2.put(strO, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (longSparseArray.a) {
                    int i = longSparseArray.d;
                    long[] jArr = longSparseArray.b;
                    Object[] objArr = longSparseArray.c;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != LongSparseArrayKt.a) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    longSparseArray.a = false;
                    longSparseArray.d = i2;
                }
                if (ContainerHelpersKt.b(longSparseArray.b, longSparseArray.d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    longSparseArray.f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) longSparseArray.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    longSparseArray.f(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayMap p() {
        ThreadLocal threadLocal = E;
        ArrayMap arrayMap = (ArrayMap) threadLocal.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(arrayMap2);
        return arrayMap2;
    }

    public static boolean w(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.a.get(str);
        Object obj2 = transitionValues2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public Transition A(TransitionListener transitionListener) {
        Transition transition;
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.s) != null) {
                transition.A(transitionListener);
            }
            if (this.t.size() == 0) {
                this.t = null;
            }
        }
        return this;
    }

    public void B(View view) {
        this.f.remove(view);
    }

    public void C(View view) {
        if (this.q) {
            if (!this.r) {
                ArrayList arrayList = this.n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
                this.o = B;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.o = animatorArr;
                x(this, TransitionNotification.e, false);
            }
            this.q = false;
        }
    }

    public void E(long j, long j2) {
        long j3 = this.y;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.r = false;
            x(this, TransitionNotification.a, z);
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = B;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            Impl26.b(animator, Math.min(Math.max(0L, j), Impl26.a(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.o = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.r = true;
        }
        x(this, TransitionNotification.b, z);
    }

    public void F(long j) {
        this.c = j;
    }

    public void H(EpicenterCallback epicenterCallback) {
        this.w = epicenterCallback;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void J(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.x = D;
        } else {
            this.x = pathMotion;
        }
    }

    public void K(TransitionPropagation transitionPropagation) {
        this.v = transitionPropagation;
    }

    public void L(long j) {
        this.b = j;
    }

    public final void M() {
        if (this.p == 0) {
            x(this, TransitionNotification.a, false);
            this.r = false;
        }
        this.p++;
    }

    public String N(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append(UserDetailsUtils.UserDetailsLiterals.AT);
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(TransitionListener transitionListener) {
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(transitionListener);
    }

    public void b(View view) {
        this.f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.o = animatorArr;
        x(this, TransitionNotification.c, false);
    }

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            TransitionValues transitionValues = new TransitionValues(view);
            if (z) {
                g(transitionValues);
            } else {
                d(transitionValues);
            }
            transitionValues.c.add(this);
            f(transitionValues);
            if (z) {
                c(this.g, view, transitionValues);
            } else {
                c(this.h, view, transitionValues);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void f(TransitionValues transitionValues) {
        HashMap map = transitionValues.a;
        if (this.v == null || map.isEmpty()) {
            return;
        }
        this.v.getClass();
        for (int i = 0; i < 2; i++) {
            if (!map.containsKey(VisibilityPropagation.a[i])) {
                this.v.a(transitionValues);
                return;
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            this.g.a.clear();
            this.g.b.clear();
            this.g.c.a();
        } else {
            this.h.a.clear();
            this.h.b.clear();
            this.h.c.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0120 A[SYNTHETIC] */
    public void l(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorK;
        int i;
        boolean z;
        View view;
        TransitionValues transitionValues;
        TransitionPropagation transitionPropagation;
        Object obj;
        ArrayMap arrayMapP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = o().z != null;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            TransitionValues transitionValues2 = (TransitionValues) arrayList.get(i2);
            TransitionValues transitionValues3 = (TransitionValues) arrayList2.get(i2);
            if (transitionValues2 != null && !transitionValues2.c.contains(this)) {
                transitionValues2 = null;
            }
            if (transitionValues3 != null && !transitionValues3.c.contains(this)) {
                transitionValues3 = null;
            }
            if (!(transitionValues2 == null && transitionValues3 == null) && ((transitionValues2 == null || transitionValues3 == null || u(transitionValues2, transitionValues3)) && (animatorK = k(viewGroup, transitionValues2, transitionValues3)) != null)) {
                String str = this.a;
                if (transitionValues3 != null) {
                    view = transitionValues3.b;
                    i = size;
                    String[] strArrQ = q();
                    z = z2;
                    if (strArrQ != null && strArrQ.length > 0) {
                        transitionValues = new TransitionValues(view);
                        i2 = i2;
                        TransitionValues transitionValues4 = (TransitionValues) transitionValuesMaps2.a.get(view);
                        if (transitionValues4 != null) {
                            int i3 = 0;
                            while (i3 < strArrQ.length) {
                                String str2 = strArrQ[i3];
                                transitionValues.a.put(str2, transitionValues4.a.get(str2));
                                i3++;
                                strArrQ = strArrQ;
                            }
                        }
                        int i4 = arrayMapP.c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            AnimationInfo animationInfo = (AnimationInfo) arrayMapP.get((Animator) arrayMapP.f(i5));
                            if (animationInfo.c != null && animationInfo.a == view && animationInfo.b.equals(str) && animationInfo.c.equals(transitionValues)) {
                                animatorK = null;
                                break;
                            }
                        }
                    }
                    if (animatorK == null) {
                        transitionPropagation = this.v;
                        if (transitionPropagation != null) {
                            long jB = transitionPropagation.b(viewGroup, this, transitionValues2, transitionValues3);
                            sparseIntArray.put(this.u.size(), (int) jB);
                            jMin = Math.min(jB, jMin);
                        }
                        WindowId windowId = viewGroup.getWindowId();
                        AnimationInfo animationInfo2 = new AnimationInfo();
                        animationInfo2.a = view;
                        animationInfo2.b = str;
                        animationInfo2.c = transitionValues;
                        animationInfo2.d = windowId;
                        animationInfo2.e = this;
                        animationInfo2.f = animatorK;
                        obj = animatorK;
                        if (z) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animatorK);
                            obj = animatorSet;
                        }
                        arrayMapP.put(obj, animationInfo2);
                        this.u.add(obj);
                    }
                } else {
                    i = size;
                    z = z2;
                    view = transitionValues2.b;
                }
                transitionValues = null;
                if (animatorK == null) {
                    transitionPropagation = this.v;
                    if (transitionPropagation != null) {
                        long jB2 = transitionPropagation.b(viewGroup, this, transitionValues2, transitionValues3);
                        sparseIntArray.put(this.u.size(), (int) jB2);
                        jMin = Math.min(jB2, jMin);
                    }
                    WindowId windowId2 = viewGroup.getWindowId();
                    AnimationInfo animationInfo3 = new AnimationInfo();
                    animationInfo3.a = view;
                    animationInfo3.b = str;
                    animationInfo3.c = transitionValues;
                    animationInfo3.d = windowId2;
                    animationInfo3.e = this;
                    animationInfo3.f = animatorK;
                    obj = animatorK;
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(animatorK);
                        obj = animatorSet2;
                    }
                    arrayMapP.put(obj, animationInfo3);
                    this.u.add(obj);
                }
            } else {
                i = size;
                z = z2;
                i2 = i2;
            }
            i2++;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                AnimationInfo animationInfo4 = (AnimationInfo) arrayMapP.get((Animator) this.u.get(sparseIntArray.keyAt(i6)));
                animationInfo4.f.setStartDelay(animationInfo4.f.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - jMin));
            }
        }
    }

    public final void m() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            x(this, TransitionNotification.b, false);
            for (int i2 = 0; i2 < this.g.c.g(); i2++) {
                View view = (View) this.g.c.h(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.h.c.g(); i3++) {
                View view2 = (View) this.h.c.h(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.r = true;
        }
    }

    public final TransitionValues n(View view, boolean z) {
        TransitionSet transitionSet = this.i;
        if (transitionSet != null) {
            return transitionSet.n(view, z);
        }
        ArrayList arrayList = z ? this.k : this.l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            TransitionValues transitionValues = (TransitionValues) arrayList.get(i);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (TransitionValues) (z ? this.l : this.k).get(i);
        }
        return null;
    }

    public final Transition o() {
        TransitionSet transitionSet = this.i;
        return transitionSet != null ? transitionSet.o() : this;
    }

    public final TransitionValues r(View view, boolean z) {
        TransitionSet transitionSet = this.i;
        if (transitionSet != null) {
            return transitionSet.r(view, z);
        }
        return (TransitionValues) (z ? this.g : this.h).a.get(view);
    }

    public boolean s() {
        return !this.n.isEmpty();
    }

    public boolean t() {
        return this instanceof ChangeBounds;
    }

    public final String toString() {
        return N("");
    }

    public final void x(Transition transition, TransitionNotification transitionNotification, boolean z) {
        Transition transition2 = this.s;
        if (transition2 != null) {
            transition2.x(transition, transitionNotification, z);
        }
        ArrayList arrayList = this.t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.t.size();
        TransitionListener[] transitionListenerArr = this.m;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.m = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.t.toArray(transitionListenerArr);
        for (int i = 0; i < size; i++) {
            transitionNotification.a(transitionListenerArr2[i], transition, z);
            transitionListenerArr2[i] = null;
        }
        this.m = transitionListenerArr2;
    }

    public void y(View view) {
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.o = animatorArr;
        x(this, TransitionNotification.d, false);
        this.q = true;
    }

    public void D() {
        M();
        final ArrayMap arrayMapP = p();
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (arrayMapP.containsKey(animator)) {
                M();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            arrayMapP.remove(animator2);
                            Transition.this.n.remove(animator2);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator2) {
                            Transition.this.n.add(animator2);
                        }
                    });
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            Transition.this.m();
                            animator2.removeListener(this);
                        }
                    });
                    animator.start();
                }
            }
        }
        this.u.clear();
        m();
    }

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                TransitionValues transitionValues = new TransitionValues(viewFindViewById);
                if (z) {
                    g(transitionValues);
                } else {
                    d(transitionValues);
                }
                transitionValues.c.add(this);
                f(transitionValues);
                if (z) {
                    c(this.g, viewFindViewById, transitionValues);
                } else {
                    c(this.h, viewFindViewById, transitionValues);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            TransitionValues transitionValues2 = new TransitionValues(view);
            if (z) {
                g(transitionValues2);
            } else {
                d(transitionValues2);
            }
            transitionValues2.c.add(this);
            f(transitionValues2);
            if (z) {
                c(this.g, view, transitionValues2);
            } else {
                c(this.h, view, transitionValues2);
            }
        }
    }

    public final boolean v(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public void z() {
        ArrayMap arrayMapP = p();
        this.y = 0L;
        int i = 0;
        while (true) {
            int size = this.u.size();
            ArrayList arrayList = this.u;
            if (i < size) {
                Animator animator = (Animator) arrayList.get(i);
                AnimationInfo animationInfo = (AnimationInfo) arrayMapP.get(animator);
                if (animator != null && animationInfo != null) {
                    Animator animator2 = animationInfo.f;
                    long j = this.c;
                    if (j >= 0) {
                        animator2.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator2.setStartDelay(animator2.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator2.setInterpolator(timeInterpolator);
                    }
                    this.n.add(animator);
                    this.y = Math.max(this.y, Impl26.a(animator));
                }
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
