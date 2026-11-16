package androidx.compose.ui.geometry;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OffsetKt {
    public static final boolean c(long j) {
        int i = Offset.e;
        return j != Offset.d;
    }

    public static final long a(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = Offset.e;
        return jFloatToIntBits;
    }

    public static final boolean b(long j) {
        float fC = Offset.c(j);
        if (!Float.isInfinite(fC) && !Float.isNaN(fC)) {
            float fD = Offset.d(j);
            if (!Float.isInfinite(fD) && !Float.isNaN(fD)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
