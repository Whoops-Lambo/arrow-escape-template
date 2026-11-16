package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/FloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    float b(long j, float f, float f2, float f3);

    long c(float f, float f2, float f3);

    float e(long j, float f, float f2, float f3);

    @Override // androidx.compose.animation.core.AnimationSpec
    default VectorizedFloatAnimationSpec a(TwoWayConverter twoWayConverter) {
        twoWayConverter.getClass();
        return new VectorizedFloatAnimationSpec(this);
    }

    default float d(float f, float f2, float f3) {
        return b(c(f, f2, f3), f, f2, f3);
    }
}
