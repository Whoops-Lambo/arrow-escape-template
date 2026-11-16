package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedInfiniteRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    public final VectorizedDurationBasedAnimationSpec a;
    public final RepeatMode b;
    public final long c;
    public final long d = 0;

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean a() {
        return true;
    }

    public final long h(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.c;
        long j4 = j2 / j3;
        return (this.b == RepeatMode.a || j4 % 2 == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this.a = vectorizedDurationBasedAnimationSpec;
        this.b = repeatMode;
        this.c = ((long) (vectorizedDurationBasedAnimationSpec.c() + vectorizedDurationBasedAnimationSpec.getA())) * 1000000;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        AnimationVector animationVectorE;
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        long jH = h(j);
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        if (j3 > j4) {
            animationVectorE = e(j4 - j2, animationVector, animationVector3, animationVector2);
        } else {
            animationVectorE = animationVector3;
        }
        return this.a.e(jH, animationVector, animationVector2, animationVectorE);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        AnimationVector animationVectorE;
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        long jH = h(j);
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        if (j3 > j4) {
            animationVectorE = e(j4 - j2, animationVector, animationVector3, animationVector2);
        } else {
            animationVectorE = animationVector3;
        }
        return this.a.f(jH, animationVector, animationVector2, animationVectorE);
    }
}
