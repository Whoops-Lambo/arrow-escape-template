package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Oklab;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ColorKt {
    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = Color.j;
        return j;
    }

    public static final long e(long j, float f, long j2) {
        Oklab oklab = ColorSpaces.t;
        long jA = Color.a(j, oklab);
        long jA2 = Color.a(j2, oklab);
        float fD = Color.d(jA);
        float fH = Color.h(jA);
        float fG = Color.g(jA);
        float fE = Color.e(jA);
        float fD2 = Color.d(jA2);
        float fH2 = Color.h(jA2);
        float fG2 = Color.g(jA2);
        float fE2 = Color.e(jA2);
        return Color.a(a(MathHelpersKt.a(fH, fH2, f), MathHelpersKt.a(fG, fG2, f), MathHelpersKt.a(fE, fE2, f), MathHelpersKt.a(fD, fD2, f), oklab), Color.f(j2));
    }

    public static final long a(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        colorSpace.getClass();
        float fC = colorSpace.c(0);
        if (f <= colorSpace.b(0) && fC <= f) {
            float fC2 = colorSpace.c(1);
            if (f2 <= colorSpace.b(1) && fC2 <= f2) {
                float fC3 = colorSpace.c(2);
                if (f3 <= colorSpace.b(2) && fC3 <= f3 && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f4 && f4 <= 1.0f) {
                    if (colorSpace.getO()) {
                        long j = (((long) ((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f)))) & 4294967295L) << 32;
                        int i = Color.j;
                        return j;
                    }
                    if (((int) (colorSpace.b >> 32)) == 3) {
                        int i2 = colorSpace.c;
                        if (i2 != -1) {
                            long jA = ((((long) Float16.a(f2)) & 65535) << 32) | ((((long) Float16.a(f)) & 65535) << 48) | ((((long) Float16.a(f3)) & 65535) << 16) | ((((long) ((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i2) & 63);
                            int i3 = Color.j;
                            return jA;
                        }
                        d.r("Unknown color space, please use a color space in ColorSpaces");
                        return 0L;
                    }
                    d.r("Color only works with ColorSpaces with 3 components");
                    return 0L;
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
    }

    public static final long d(long j, long j2) {
        float f;
        float f2;
        long jA = Color.a(j, Color.f(j2));
        float fD = Color.d(j2);
        float fD2 = Color.d(jA);
        float f3 = 1.0f - fD2;
        float f4 = (fD * f3) + fD2;
        float fH = Color.h(jA);
        float fH2 = Color.h(j2);
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        } else {
            f = (((fH2 * fD) * f3) + (fH * fD2)) / f4;
        }
        float fG = Color.g(jA);
        float fG2 = Color.g(j2);
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fD) * f3) + (fG * fD2)) / f4;
        }
        float fE = Color.e(jA);
        float fE2 = Color.e(j2);
        if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f5 = (((fE2 * fD) * f3) + (fE * fD2)) / f4;
        }
        return a(f, f2, f5, f4, Color.f(j2));
    }

    public static final float f(long j) {
        ColorSpace colorSpaceF = Color.f(j);
        if (ColorModel.a(colorSpaceF.b, 12884901888L)) {
            wr0 wr0Var = ((Rgb) colorSpaceF).n;
            double dDoubleValue = ((Number) wr0Var.invoke(Double.valueOf(Color.h(j)))).doubleValue();
            float fDoubleValue = (float) ((((Number) wr0Var.invoke(Double.valueOf(Color.e(j)))).doubleValue() * 0.0722d) + (((Number) wr0Var.invoke(Double.valueOf(Color.g(j)))).doubleValue() * 0.7152d) + (dDoubleValue * 0.2126d));
            if (fDoubleValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (fDoubleValue >= 1.0f) {
                return 1.0f;
            }
            return fDoubleValue;
        }
        d.t(ColorModel.b(colorSpaceF.b), "The specified color must be encoded in an RGB color space. The supplied color space is ");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final int g(long j) {
        ColorSpace colorSpaceF = Color.f(j);
        if (colorSpaceF.getO()) {
            return (int) (j >>> 32);
        }
        float[] fArr = {Color.h(j), Color.g(j), Color.e(j), Color.d(j)};
        ColorSpaceKt.d(colorSpaceF, null, 3).a(fArr);
        return (((int) ((fArr[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArr[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArr[1] * 255.0f) + 0.5f)) << 8) | ((int) ((fArr[2] * 255.0f) + 0.5f));
    }

    public static final long c(long j) {
        long j2 = (j & 4294967295L) << 32;
        int i = Color.j;
        return j2;
    }
}
