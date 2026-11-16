package androidx.compose.foundation.layout;

import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AndroidFlingSpline {
    public static final float[] a = new float[101];
    public static final float[] b = new float[101];

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class FlingResult {
        public final boolean equals(Object obj) {
            return obj instanceof FlingResult;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        public final String toString() {
            return "FlingResult(packedValue=0)";
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                b[100] = 1.0f;
                a[100] = 1.0f;
                return;
            }
            float f12 = i / 100.0f;
            float f13 = 1.0f;
            while (true) {
                f = ((f13 - f9) / 2.0f) + f9;
                f2 = f11 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f14 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f11 = f11;
                float f15 = f13;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                }
                if (f14 > f12) {
                    f13 = f;
                } else {
                    f9 = f;
                    f13 = f15;
                }
            }
            float f16 = 0.5f;
            a[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f17 = f11;
            while (true) {
                f5 = ((f17 - f10) / 2.0f) + f10;
                f6 = f11 - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f18 = (((f6 * f16) + f5) * f7) + f8;
                if (Math.abs(f18 - f12) >= 1.0E-5d) {
                    if (f18 > f12) {
                        f17 = f5;
                    } else {
                        f10 = f5;
                    }
                    f16 = 0.5f;
                }
            }
            b[i] = (((f5 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static long a(float f) {
        float fC;
        float f2;
        int i = (int) (100.0f * f);
        if (i < 100) {
            float f3 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = a;
            float f4 = fArr[i];
            f2 = (fArr[i2] - f4) / ((i2 / 100.0f) - f3);
            fC = h50.c(f, f3, f2, f4);
        } else {
            fC = 1.0f;
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (((long) Float.floatToIntBits(fC)) << 32) | (((long) Float.floatToIntBits(f2)) & 4294967295L);
    }
}
