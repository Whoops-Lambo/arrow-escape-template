package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InfiniteTransition {
    public final MutableVector a;
    public final ParcelableSnapshotMutableState b;
    public long c;
    public final ParcelableSnapshotMutableState d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        public Number a;
        public Number b;
        public final TwoWayConverter c;
        public AnimationSpec d;
        public final ParcelableSnapshotMutableState e;
        public TargetBasedAnimation f;
        public boolean g;
        public boolean h;
        public long i;
        public final /* synthetic */ InfiniteTransition j;

        @Override // androidx.compose.runtime.State
        /* JADX INFO: renamed from: getValue */
        public final Object getA() {
            return this.e.getA();
        }

        public TransitionAnimationState(InfiniteTransition infiniteTransition, Number number, Number number2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec) {
            twoWayConverter.getClass();
            this.j = infiniteTransition;
            this.a = number;
            this.b = number2;
            this.c = twoWayConverter;
            this.d = infiniteRepeatableSpec;
            this.e = SnapshotStateKt.c(number, StructuralEqualityPolicy.a);
            this.f = new TargetBasedAnimation(this.d, twoWayConverter, this.a, this.b, null);
        }
    }

    public InfiniteTransition() {
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new TransitionAnimationState[16];
        mutableVector.c = 0;
        this.a = mutableVector;
        this.b = SnapshotStateKt.c(Boolean.FALSE, StructuralEqualityPolicy.a);
        this.c = Long.MIN_VALUE;
        this.d = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);
    }

    public final void a(Composer composer, int i) {
        ComposerImpl composerImplT = composer.t(-318043801);
        if (((Boolean) this.d.getA()).booleanValue() || ((Boolean) this.b.getA()).booleanValue()) {
            EffectsKt.c(new InfiniteTransition$run$1(this, null), composerImplT, this);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new InfiniteTransition$run$2(this, i);
    }
}
