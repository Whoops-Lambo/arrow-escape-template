package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public final float a;

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long a(float f) {
        float[] fArr = AndroidFlingSpline.a;
        return (long) (Math.exp(Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (WindowInsetsConnection_androidKt.a * this.a))) / WindowInsetsConnection_androidKt.c) * 1.0E9d);
    }

    public final float e(float f) {
        float[] fArr = AndroidFlingSpline.a;
        float f2 = WindowInsetsConnection_androidKt.a;
        float f3 = this.a;
        return Math.signum(f) * ((float) (Math.exp((WindowInsetsConnection_androidKt.b / WindowInsetsConnection_androidKt.c) * Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (f2 * f3)))) * f2 * f3));
    }

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        density.getClass();
        this.a = density.getA() * 386.0878f * 160.0f * 0.84f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float b(float f, float f2) {
        return f + e(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(long j, float f) {
        float f2;
        long jA = a(f);
        if (jA > 0) {
            f2 = j / jA;
        } else {
            f2 = 1.0f;
        }
        return ((Float.intBitsToFloat((int) (AndroidFlingSpline.a(f2) & 4294967295L)) * e(f)) / jA) * 1.0E9f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(float f, float f2, long j) {
        float f3;
        long jA = a(f2);
        if (jA > 0) {
            f3 = j / jA;
        } else {
            f3 = 1.0f;
        }
        return (Float.intBitsToFloat((int) (AndroidFlingSpline.a(f3) >> 32)) * e(f2)) + f;
    }
}
