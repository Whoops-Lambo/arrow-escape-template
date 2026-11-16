package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ScaleFactorKt {
    public static final long a(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = ScaleFactor.b;
        return jFloatToIntBits;
    }

    public static final long b(long j, long j2) {
        float fD = Size.d(j);
        long j3 = ScaleFactor.a;
        if (j2 != j3) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * fD;
            float fB = Size.b(j);
            if (j2 != j3) {
                return SizeKt.a(fIntBitsToFloat, Float.intBitsToFloat((int) (j2 & 4294967295L)) * fB);
            }
            e32.i("ScaleFactor is unspecified");
            return 0L;
        }
        e32.i("ScaleFactor is unspecified");
        return 0L;
    }
}
