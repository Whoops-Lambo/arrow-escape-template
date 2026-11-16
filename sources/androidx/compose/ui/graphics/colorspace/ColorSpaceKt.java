package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ColorSpaceKt {
    public static Connector d(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        if ((i & 1) != 0) {
            colorSpace2 = ColorSpaces.c;
        }
        colorSpace.getClass();
        colorSpace2.getClass();
        if (colorSpace == colorSpace2) {
            return new Connector$Companion$identity$1(colorSpace, colorSpace, 1);
        }
        return (ColorModel.a(colorSpace.b, 12884901888L) && ColorModel.a(colorSpace2.b, 12884901888L)) ? new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2) : new Connector(colorSpace, colorSpace2, 0);
    }

    public static final float[] b(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr.getClass();
        g(fArr, fArr2);
        g(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrE = e(fArr);
        fArr.getClass();
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return f(fArrE, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final float[] e(float[] fArr) {
        fArr.getClass();
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static ColorSpace a(ColorSpace colorSpace) {
        colorSpace.getClass();
        if (ColorModel.a(colorSpace.b, 12884901888L)) {
            Rgb rgb = (Rgb) colorSpace;
            WhitePoint whitePoint = rgb.d;
            WhitePoint whitePoint2 = Illuminant.b;
            if (!c(whitePoint, whitePoint2)) {
                return new Rgb(rgb.a, rgb.h, whitePoint2, f(b(Adaptation.b.a, whitePoint.a(), whitePoint2.a()), rgb.i), rgb.k, rgb.m, rgb.e, rgb.f, rgb.g, -1);
            }
        }
        return colorSpace;
    }

    public static final boolean c(WhitePoint whitePoint, WhitePoint whitePoint2) {
        whitePoint.getClass();
        whitePoint2.getClass();
        if (whitePoint == whitePoint2) {
            return true;
        }
        if (Math.abs(whitePoint.a - whitePoint2.a) < 0.001f && Math.abs(whitePoint.b - whitePoint2.b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final float[] f(float[] fArr, float[] fArr2) {
        fArr.getClass();
        fArr2.getClass();
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f5 * f6) + (f3 * f4) + (f * f2);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f10 * f6) + (f9 * f4) + (f8 * f2);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f6 * f14) + (f4 * f13) + (f2 * f12);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f5 * f18) + (f3 * f17) + (f * f16);
        float f20 = (f10 * f18) + (f9 * f17) + (f8 * f16);
        float f21 = (f18 * f14) + (f17 * f13) + (f16 * f12);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = (f3 * f23) + (f * f22);
        float f25 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f5 * f25) + f24, (f10 * f25) + (f9 * f23) + (f8 * f22), (f14 * f25) + (f13 * f23) + (f12 * f22)};
    }

    public static final void g(float[] fArr, float[] fArr2) {
        fArr.getClass();
        fArr2.getClass();
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
    }
}
