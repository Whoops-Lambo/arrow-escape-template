package androidx.compose.animation;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public final FlingCalculator a;

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long a(float f) {
        return ((long) (Math.exp(this.a.b(f) / (((double) FlingCalculatorKt.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float b(float f, float f2) {
        FlingCalculator flingCalculator = this.a;
        double dB = flingCalculator.b(f2);
        double d = FlingCalculatorKt.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (flingCalculator.a * flingCalculator.c))))) + f;
    }

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.a = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.a, density);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(long j, float f) {
        float f2;
        long j2 = j / 1000000;
        FlingCalculator.FlingInfo flingInfoA = this.a.a(f);
        long j3 = flingInfoA.c;
        if (j3 > 0) {
            f2 = j2 / j3;
        } else {
            f2 = 1.0f;
        }
        return (((Math.signum(flingInfoA.a) * AndroidFlingSpline.a(f2).b) * flingInfoA.b) / j3) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(float f, float f2, long j) {
        float f3;
        long j2 = j / 1000000;
        FlingCalculator.FlingInfo flingInfoA = this.a.a(f2);
        long j3 = flingInfoA.c;
        if (j3 > 0) {
            f3 = j2 / j3;
        } else {
            f3 = 1.0f;
        }
        return (Math.signum(flingInfoA.a) * flingInfoA.b * AndroidFlingSpline.a(f3).a) + f;
    }
}
