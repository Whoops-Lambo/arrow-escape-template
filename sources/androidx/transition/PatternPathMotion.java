package androidx.transition;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class PatternPathMotion extends PathMotion {
    @Override // androidx.transition.PathMotion
    public final Path a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        Math.sqrt((f6 * f6) + (f5 * f5));
        Math.atan2(f6, f5);
        throw null;
    }
}
