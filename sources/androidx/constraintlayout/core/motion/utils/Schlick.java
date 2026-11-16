package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class Schlick extends Easing {
    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public final double a(double d) {
        if (d < 0.0d) {
            return (0.0d * d) / (((0.0d - d) * 0.0d) + d);
        }
        return ((d - 1.0d) * (1.0d - 0.0d)) / ((1.0d - d) - ((0.0d - d) * 0.0d));
    }
}
