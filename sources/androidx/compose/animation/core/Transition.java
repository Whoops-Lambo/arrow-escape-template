package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.UnityAdsConstants;
import defpackage.s71;
import defpackage.wr0;
import defpackage.zr0;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Transition<S> {
    public final MutableTransitionState a;
    public final String b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public final SnapshotStateList h;
    public final SnapshotStateList i;
    public final ParcelableSnapshotMutableState j;
    public final State k;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @InternalAnimationApi
    public final class DeferredAnimation<T, V extends AnimationVector> {
        public final TwoWayConverter a;
        public final String b;
        public DeferredAnimationData c;
        public final /* synthetic */ Transition d;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            public final TransitionAnimationState a;
            public wr0 b;
            public wr0 c;

            @Override // androidx.compose.runtime.State
            /* JADX INFO: renamed from: getValue */
            public final Object getA() {
                c(DeferredAnimation.this.d.c());
                return this.a.h.getA();
            }

            public DeferredAnimationData(TransitionAnimationState transitionAnimationState, wr0 wr0Var, wr0 wr0Var2) {
                this.a = transitionAnimationState;
                this.b = wr0Var;
                this.c = wr0Var2;
            }

            public final void c(Segment segment) {
                segment.getClass();
                Object objInvoke = this.c.invoke(segment.getB());
                boolean zD = DeferredAnimation.this.d.d();
                TransitionAnimationState transitionAnimationState = this.a;
                if (zD) {
                    transitionAnimationState.g(this.c.invoke(segment.getA()), objInvoke, (FiniteAnimationSpec) this.b.invoke(segment));
                } else {
                    transitionAnimationState.h(objInvoke, (FiniteAnimationSpec) this.b.invoke(segment));
                }
            }
        }

        public final DeferredAnimationData a(wr0 wr0Var, wr0 wr0Var2) {
            DeferredAnimationData deferredAnimationData = this.c;
            Transition transition = this.d;
            if (deferredAnimationData == null) {
                Object objInvoke = wr0Var2.invoke(transition.b());
                Object objInvoke2 = wr0Var2.invoke(transition.b());
                TwoWayConverter twoWayConverter = this.a;
                twoWayConverter.getClass();
                AnimationVector animationVector = (AnimationVector) twoWayConverter.getA().invoke(objInvoke2);
                animationVector.getClass();
                TransitionAnimationState transitionAnimationState = new TransitionAnimationState(transition, objInvoke, animationVector.c(), this.a, this.b);
                deferredAnimationData = new DeferredAnimationData(transitionAnimationState, wr0Var, wr0Var2);
                this.c = deferredAnimationData;
                transition.h.add(transitionAnimationState);
            }
            deferredAnimationData.c = wr0Var2;
            deferredAnimationData.b = wr0Var;
            deferredAnimationData.c(transition.c());
            return deferredAnimationData;
        }

        public DeferredAnimation(Transition transition, TwoWayConverter twoWayConverter, String str) {
            twoWayConverter.getClass();
            str.getClass();
            this.d = transition;
            this.a = twoWayConverter;
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SegmentImpl<S> implements Segment<S> {
        public final Object a;
        public final Object b;

        public final int hashCode() {
            Object obj = this.a;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Object obj2 = this.b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getB() {
            return this.b;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Object getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            return s71.b(this.a, segment.getA()) && s71.b(this.b, segment.getB());
        }

        public SegmentImpl(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Stable
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        public final TwoWayConverter a;
        public final ParcelableSnapshotMutableState b;
        public final ParcelableSnapshotMutableState c;
        public final ParcelableSnapshotMutableState d;
        public final ParcelableSnapshotMutableState e;
        public final ParcelableSnapshotMutableState f;
        public final ParcelableSnapshotMutableState g;
        public final ParcelableSnapshotMutableState h;
        public AnimationVector i;
        public final SpringSpec j;
        public final /* synthetic */ Transition k;

        public static void d(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i) {
            if ((i & 1) != 0) {
                obj = transitionAnimationState.h.getA();
            }
            Object obj2 = obj;
            if ((i & 2) != 0) {
                z = false;
            }
            AnimationSpec animationSpec = (!z || (((FiniteAnimationSpec) transitionAnimationState.c.getA()) instanceof SpringSpec)) ? (FiniteAnimationSpec) transitionAnimationState.c.getA() : transitionAnimationState.j;
            transitionAnimationState.d.setValue(new TargetBasedAnimation(animationSpec, transitionAnimationState.a, obj2, transitionAnimationState.b.getA(), transitionAnimationState.i));
            Transition transition = transitionAnimationState.k;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.g;
            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
            if (transition.d()) {
                ListIterator listIterator = transition.h.listIterator();
                long jMax = 0;
                while (listIterator.hasNext()) {
                    TransitionAnimationState transitionAnimationState2 = (TransitionAnimationState) listIterator.next();
                    jMax = Math.max(jMax, transitionAnimationState2.c().h);
                    transitionAnimationState2.h.setValue(transitionAnimationState2.c().e(0L));
                    transitionAnimationState2.i = transitionAnimationState2.c().g(0L);
                }
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
            }
        }

        public final TargetBasedAnimation c() {
            return (TargetBasedAnimation) this.d.getA();
        }

        @Override // androidx.compose.runtime.State
        /* JADX INFO: renamed from: getValue */
        public final Object getA() {
            return this.h.getA();
        }

        public TransitionAnimationState(Transition transition, Object obj, AnimationVector animationVector, TwoWayConverter twoWayConverter, String str) {
            animationVector.getClass();
            twoWayConverter.getClass();
            str.getClass();
            this.k = transition;
            this.a = twoWayConverter;
            ParcelableSnapshotMutableState parcelableSnapshotMutableStateC = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
            this.b = parcelableSnapshotMutableStateC;
            Object objInvoke = null;
            ParcelableSnapshotMutableState parcelableSnapshotMutableStateC2 = SnapshotStateKt.c(AnimationSpecKt.a(7, null), StructuralEqualityPolicy.a);
            this.c = parcelableSnapshotMutableStateC2;
            this.d = SnapshotStateKt.c(new TargetBasedAnimation((FiniteAnimationSpec) parcelableSnapshotMutableStateC2.getA(), twoWayConverter, obj, parcelableSnapshotMutableStateC.getA(), animationVector), StructuralEqualityPolicy.a);
            this.e = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);
            this.f = SnapshotStateKt.c(0L, StructuralEqualityPolicy.a);
            this.g = SnapshotStateKt.c(Boolean.FALSE, StructuralEqualityPolicy.a);
            this.h = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
            this.i = animationVector;
            Float f = (Float) VisibilityThresholdsKt.b.get(twoWayConverter);
            if (f != null) {
                float fFloatValue = f.floatValue();
                AnimationVector animationVector2 = (AnimationVector) twoWayConverter.getA().invoke(obj);
                int iB = animationVector2.b();
                for (int i = 0; i < iB; i++) {
                    animationVector2.e(fFloatValue, i);
                }
                objInvoke = this.a.getB().invoke(animationVector2);
            }
            this.j = AnimationSpecKt.a(3, objInvoke);
        }

        public final void g(Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec) {
            finiteAnimationSpec.getClass();
            this.b.setValue(obj2);
            this.c.setValue(finiteAnimationSpec);
            if (s71.b(c().c, obj) && s71.b(c().d, obj2)) {
                return;
            }
            d(this, obj, false, 2);
        }

        public final void h(Object obj, FiniteAnimationSpec finiteAnimationSpec) {
            finiteAnimationSpec.getClass();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.b;
            boolean zB = s71.b(parcelableSnapshotMutableState.getA(), obj);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.g;
            if (zB && !((Boolean) parcelableSnapshotMutableState2.getA()).booleanValue()) {
                return;
            }
            parcelableSnapshotMutableState.setValue(obj);
            this.c.setValue(finiteAnimationSpec);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.e;
            d(this, null, !((Boolean) parcelableSnapshotMutableState3.getA()).booleanValue(), 1);
            Boolean bool = Boolean.FALSE;
            parcelableSnapshotMutableState3.setValue(bool);
            this.f.setValue(Long.valueOf(((Number) this.k.e.getA()).longValue()));
            parcelableSnapshotMutableState2.setValue(bool);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Segment<S> {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        /* JADX INFO: renamed from: b */
        Object getB();

        /* JADX INFO: renamed from: c */
        Object getA();

        default boolean a(Object obj, Object obj2) {
            if (obj.equals(getA()) && obj2.equals(getB())) {
                return true;
            }
            return false;
        }
    }

    public final Object b() {
        return this.a.a.getA();
    }

    public final Segment c() {
        return (Segment) this.d.getA();
    }

    public final boolean d() {
        return ((Boolean) this.j.getA()).booleanValue();
    }

    public final void e(long j, float f) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f;
        if (((Number) parcelableSnapshotMutableState.getA()).longValue() == Long.MIN_VALUE) {
            parcelableSnapshotMutableState.setValue(Long.valueOf(j));
            this.a.c.setValue(Boolean.TRUE);
        }
        this.g.setValue(Boolean.FALSE);
        Long lValueOf = Long.valueOf(j - ((Number) parcelableSnapshotMutableState.getA()).longValue());
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.e;
        parcelableSnapshotMutableState2.setValue(lValueOf);
        ListIterator listIterator = this.h.listIterator();
        boolean z = true;
        while (listIterator.hasNext()) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) listIterator.next();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = transitionAnimationState.e;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = transitionAnimationState.e;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = transitionAnimationState.f;
            if (!((Boolean) parcelableSnapshotMutableState3.getA()).booleanValue()) {
                long jLongValue = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? transitionAnimationState.c().h : (long) ((((Number) parcelableSnapshotMutableState2.getA()).longValue() - ((Number) parcelableSnapshotMutableState5.getA()).longValue()) / f);
                transitionAnimationState.h.setValue(transitionAnimationState.c().e(jLongValue));
                transitionAnimationState.i = transitionAnimationState.c().g(jLongValue);
                if (transitionAnimationState.c().b(jLongValue)) {
                    parcelableSnapshotMutableState4.setValue(Boolean.TRUE);
                    parcelableSnapshotMutableState5.setValue(0L);
                }
            }
            if (!((Boolean) parcelableSnapshotMutableState4.getA()).booleanValue()) {
                z = false;
            }
        }
        ListIterator listIterator2 = this.i.listIterator();
        while (listIterator2.hasNext()) {
            Transition transition = (Transition) listIterator2.next();
            if (!s71.b(transition.c.getA(), transition.b())) {
                transition.e(((Number) parcelableSnapshotMutableState2.getA()).longValue(), f);
            }
            if (!s71.b(transition.c.getA(), transition.b())) {
                z = false;
            }
        }
        if (z) {
            f();
        }
    }

    public final void f() {
        this.f.setValue(Long.MIN_VALUE);
        Object a = this.c.getA();
        MutableTransitionState mutableTransitionState = this.a;
        mutableTransitionState.a.setValue(a);
        this.e.setValue(0L);
        mutableTransitionState.c.setValue(Boolean.FALSE);
    }

    public final void g(Object obj, Object obj2) {
        this.f.setValue(Long.MIN_VALUE);
        MutableTransitionState mutableTransitionState = this.a;
        mutableTransitionState.c.setValue(Boolean.FALSE);
        boolean zD = d();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.c;
        if (!zD || !s71.b(b(), obj) || !s71.b(parcelableSnapshotMutableState.getA(), obj2)) {
            mutableTransitionState.a.setValue(obj);
            parcelableSnapshotMutableState.setValue(obj2);
            this.j.setValue(Boolean.TRUE);
            this.d.setValue(new SegmentImpl(obj, obj2));
        }
        ListIterator listIterator = this.i.listIterator();
        while (listIterator.hasNext()) {
            Transition transition = (Transition) listIterator.next();
            if (transition.d()) {
                transition.g(transition.b(), transition.c.getA());
            }
        }
        ListIterator listIterator2 = this.h.listIterator();
        while (listIterator2.hasNext()) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) listIterator2.next();
            transitionAnimationState.h.setValue(transitionAnimationState.c().e(0L));
            transitionAnimationState.i = transitionAnimationState.c().g(0L);
        }
    }

    public Transition(MutableTransitionState mutableTransitionState, String str) {
        mutableTransitionState.getClass();
        this.a = mutableTransitionState;
        this.b = str;
        this.c = SnapshotStateKt.c(b(), StructuralEqualityPolicy.a);
        this.d = SnapshotStateKt.c(new SegmentImpl(b(), b()), StructuralEqualityPolicy.a);
        this.e = SnapshotStateKt.c(0L, StructuralEqualityPolicy.a);
        this.f = SnapshotStateKt.c(Long.MIN_VALUE, StructuralEqualityPolicy.a);
        this.g = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);
        this.h = new SnapshotStateList();
        this.i = new SnapshotStateList();
        this.j = SnapshotStateKt.c(Boolean.FALSE, StructuralEqualityPolicy.a);
        this.k = SnapshotStateKt.b(new Transition$totalDurationNanos$2(this));
    }

    public final void a(Object obj, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        ComposerImpl composerImplT = composer.t(-1493585151);
        if ((i & 14) == 0) {
            if (composerImplT.l(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composerImplT.l(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else if (!d()) {
            h(obj, composerImplT, i2 & 126);
            if (!s71.b(obj, b()) || ((Number) this.f.getA()).longValue() != Long.MIN_VALUE || ((Boolean) this.g.getA()).booleanValue()) {
                composerImplT.B(1157296644);
                boolean zL = composerImplT.l(this);
                Object objB0 = composerImplT.b0();
                if (zL || objB0 == Composer.Companion.a) {
                    objB0 = new Transition$animateTo$1$1(this, null);
                    composerImplT.C0(objB0);
                }
                composerImplT.R(false);
                EffectsKt.c((zr0) objB0, composerImplT, this);
            }
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new Transition$animateTo$2(this, obj, i);
    }

    public final void h(Object obj, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        ComposerImpl composerImplT = composer.t(-583974681);
        if ((i & 14) == 0) {
            if (composerImplT.l(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composerImplT.l(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else if (!d()) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.c;
            if (!s71.b(parcelableSnapshotMutableState.getA(), obj)) {
                this.d.setValue(new SegmentImpl(parcelableSnapshotMutableState.getA(), obj));
                this.a.a.setValue(parcelableSnapshotMutableState.getA());
                parcelableSnapshotMutableState.setValue(obj);
                if (((Number) this.f.getA()).longValue() == Long.MIN_VALUE) {
                    this.g.setValue(Boolean.TRUE);
                }
                ListIterator listIterator = this.h.listIterator();
                while (listIterator.hasNext()) {
                    ((TransitionAnimationState) listIterator.next()).g.setValue(Boolean.TRUE);
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new Transition$updateTarget$2(this, obj, i);
    }
}
