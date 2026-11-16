package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "FlingInfo", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FlingCalculator {
    public final float a;
    public final Density b;
    public final float c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class FlingInfo {
        public final float a;
        public final float b;
        public final long c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.valueOf(this.a).equals(Float.valueOf(flingInfo.a)) && Float.valueOf(this.b).equals(Float.valueOf(flingInfo.b)) && this.c == flingInfo.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + n30.b(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.a);
            sb.append(", distance=");
            sb.append(this.b);
            sb.append(", duration=");
            return n30.o(sb, this.c, ')');
        }

        public FlingInfo(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }
    }

    public final double b(float f) {
        float[] fArr = AndroidFlingSpline.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.c)));
    }

    public FlingCalculator(float f, Density density) {
        this.a = f;
        this.b = density;
        float a = density.getA();
        float f2 = FlingCalculatorKt.a;
        this.c = a * 386.0878f * 160.0f * 0.84f;
    }

    public final FlingInfo a(float f) {
        double dB = b(f);
        double d = FlingCalculatorKt.a;
        double d2 = d - 1.0d;
        return new FlingInfo(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.c))), (long) (Math.exp(dB / d2) * 1000.0d));
    }
}
