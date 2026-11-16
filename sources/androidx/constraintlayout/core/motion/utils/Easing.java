package androidx.constraintlayout.core.motion.utils;

import com.singular.sdk.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class Easing {
    public static final String[] b = {BuildConfig.FLAVOR, "accelerate", "decelerate", "linear"};
    public final String a = "identity";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class CubicEasing extends Easing {
        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public final double a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = b(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dB = b(d4);
            double d5 = d3 + d2;
            double dB2 = b(d5);
            double dC = c(d4);
            return (((d - dB) * (c(d5) - dC)) / (dB2 - dB)) + dC;
        }

        public final double b(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (0.0d * d3 * d * d) + (0.0d * d2 * d3 * d) + (d * d * d);
        }

        public final double c(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (0.0d * d3 * d * d) + (0.0d * d2 * d3 * d) + (d * d * d);
        }
    }

    public double a(double d) {
        return d;
    }

    public final String toString() {
        return this.a;
    }
}
