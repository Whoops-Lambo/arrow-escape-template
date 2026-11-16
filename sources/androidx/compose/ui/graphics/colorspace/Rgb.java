package androidx.compose.ui.graphics.colorspace;

import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.dr0;
import defpackage.p32;
import defpackage.rc1;
import defpackage.s71;
import defpackage.wr0;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Rgb extends ColorSpace {
    public static final wr0 p = null;
    public final WhitePoint d;
    public final float e;
    public final float f;
    public final TransferParameters g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final wr0 k;
    public final wr0 l;
    public final wr0 m;
    public final wr0 n;
    public final boolean o;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public final /* synthetic */ TransferParameters i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransferParameters transferParameters) {
            super(1);
            this.i = transferParameters;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            double dDoubleValue = ((Number) obj).doubleValue();
            TransferParameters transferParameters = this.i;
            double d = transferParameters.b;
            double d2 = transferParameters.c;
            double d3 = transferParameters.d;
            return Double.valueOf(dDoubleValue >= transferParameters.e * d3 ? (Math.pow(dDoubleValue, 1.0d / transferParameters.a) - d2) / d : dDoubleValue / d3);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass2 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((Number) obj).doubleValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass3 extends rc1 implements wr0 {
        public final /* synthetic */ TransferParameters i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TransferParameters transferParameters) {
            super(1);
            this.i = transferParameters;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            double dDoubleValue = ((Number) obj).doubleValue();
            TransferParameters transferParameters = this.i;
            double d = transferParameters.b;
            return Double.valueOf(dDoubleValue >= transferParameters.e ? Math.pow((d * dDoubleValue) + transferParameters.c, transferParameters.a) : transferParameters.d * dDoubleValue);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass4 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((Number) obj).doubleValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass5 extends rc1 implements wr0 {
        public final /* synthetic */ double i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(double d) {
            super(1);
            this.i = d;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            double dDoubleValue = ((Number) obj).doubleValue();
            if (dDoubleValue < 0.0d) {
                dDoubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(dDoubleValue, 1.0d / this.i));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass6 extends rc1 implements wr0 {
        public final /* synthetic */ double i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(double d) {
            super(1);
            this.i = d;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            double dDoubleValue = ((Number) obj).doubleValue();
            if (dDoubleValue < 0.0d) {
                dDoubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(dDoubleValue, this.i));
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] e(float[] fArr) {
        Double dValueOf = Double.valueOf(fArr[0]);
        Rgb$eotf$1 rgb$eotf$1 = (Rgb$eotf$1) this.n;
        fArr[0] = (float) ((Number) rgb$eotf$1.invoke(dValueOf)).doubleValue();
        fArr[1] = (float) ((Number) rgb$eotf$1.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) rgb$eotf$1.invoke(Double.valueOf(fArr[2]))).doubleValue();
        ColorSpaceKt.g(this.i, fArr);
        return fArr;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "Lkotlin/Function1;", "", "DoubleIdentity", "Lwr0;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static float a(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -f7 : f7;
        }

        public static float c(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public static boolean b(double d, wr0 wr0Var, wr0 wr0Var2) {
            if (Math.abs(((Number) wr0Var.invoke(Double.valueOf(d))).doubleValue() - ((Number) wr0Var2.invoke(Double.valueOf(d))).doubleValue()) <= 0.001d) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:42:0x0208  */
    /* JADX WARN: Code duplicated, block: B:45:0x020d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0211  */
    /* JADX WARN: Code duplicated, block: B:53:0x022f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0238  */
    /* JADX WARN: Code duplicated, block: B:63:0x024c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0255  */
    /* JADX WARN: Code duplicated, block: B:70:0x0265  */
    /* JADX WARN: Code duplicated, block: B:79:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0268 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, wr0 wr0Var, wr0 wr0Var2, float f, float f2, TransferParameters transferParameters, int i) {
        int i2;
        float f3;
        float f4;
        boolean z;
        float[] fArr3;
        Rgb rgb;
        double d;
        int i3;
        super(str, 12884901888L, i);
        fArr.getClass();
        wr0Var.getClass();
        wr0Var2.getClass();
        this.d = whitePoint;
        this.e = f;
        this.f = f2;
        this.g = transferParameters;
        this.k = wr0Var;
        this.l = new Rgb$oetf$1(this);
        this.m = wr0Var2;
        this.n = new Rgb$eotf$1(this);
        if (fArr.length != 6 && fArr.length != 9) {
            d.r("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            y.k("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
            throw null;
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr4[0] = f5 / f7;
            fArr4[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr4[2] = f8 / f10;
            fArr4[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr4[4] = f11 / f13;
            fArr4[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.h = fArr4;
        if (fArr2 == null) {
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr4[2];
            float f17 = fArr4[3];
            float f18 = fArr4[4];
            float f19 = fArr4[5];
            f3 = 1.0f;
            float f20 = whitePoint.a;
            i2 = 0;
            float f21 = whitePoint.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            i2 = 0;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                dr0.c(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.i = fArr2;
        }
        this.j = ColorSpaceKt.e(this.i);
        float fA = Companion.a(fArr4);
        float[] fArr5 = ColorSpaces.a;
        if (fA / Companion.a(ColorSpaces.b) > 0.9f) {
            float[] fArr6 = ColorSpaces.a;
            float f38 = fArr4[i2];
            float f39 = fArr6[i2];
            float f40 = fArr4[1];
            float f41 = fArr6[1];
            float f42 = fArr4[2] - fArr6[2];
            float f43 = fArr4[3] - fArr6[3];
            float f44 = fArr4[4];
            float f45 = fArr6[4];
            float f46 = fArr4[5];
            float f47 = fArr6[5];
            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float[] fArr7 = new float[6];
            fArr7[i2] = f38 - f39;
            fArr7[1] = f40 - f41;
            fArr7[2] = f42;
            fArr7[3] = f43;
            fArr7[4] = f44 - f45;
            fArr7[5] = f46 - f47;
            if (Companion.c(fArr7[i2], fArr7[1], f39 - f45, f41 - f47) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Companion.c(fArr6[i2] - fArr6[2], fArr6[1] - fArr6[3], fArr7[i2], fArr7[1]) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Companion.c(fArr7[2], fArr7[3], fArr6[2] - fArr6[i2], fArr6[3] - fArr6[1]) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Companion.c(fArr6[2] - fArr6[4], fArr6[3] - fArr6[5], fArr7[2], fArr7[3]) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Companion.c(fArr7[4], fArr7[5], fArr6[4] - fArr6[2], fArr6[5] - fArr6[3]) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Companion.c(fArr6[4] - fArr6[i2], fArr6[5] - fArr6[1], fArr7[4], fArr7[5]) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            if (i != 0) {
                fArr3 = ColorSpaces.a;
                if (fArr4 == fArr3) {
                    i3 = i2;
                    while (true) {
                        if (i3 < 6) {
                            if (Float.compare(fArr4[i3], fArr3[i3]) != 0 || Math.abs(fArr4[i3] - fArr3[i3]) <= 0.001f) {
                                i3++;
                            }
                        } else if (ColorSpaceKt.c(whitePoint, Illuminant.d)) {
                            float[] fArr8 = ColorSpaces.a;
                            rgb = ColorSpaces.c;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = 1;
                                } else if (Companion.b(d, wr0Var, rgb.k)) {
                                    d += 0.00392156862745098d;
                                }
                            }
                        }
                    }
                } else if (ColorSpaceKt.c(whitePoint, Illuminant.d) && f == f4 && f2 == f3) {
                    float[] fArr9 = ColorSpaces.a;
                    rgb = ColorSpaces.c;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = 1;
                        } else if (Companion.b(d, wr0Var, rgb.k) && Companion.b(d, wr0Var2, rgb.m)) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = i2;
            } else {
                z = 1;
            }
            this.o = z;
        }
        f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr3 = ColorSpaces.a;
            if (fArr4 == fArr3) {
                i3 = i2;
                while (true) {
                    if (i3 < 6) {
                        if (Float.compare(fArr4[i3], fArr3[i3]) != 0) {
                        }
                        i3++;
                    } else if (ColorSpaceKt.c(whitePoint, Illuminant.d)) {
                        float[] fArr10 = ColorSpaces.a;
                        rgb = ColorSpaces.c;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = 1;
                            } else if (Companion.b(d, wr0Var, rgb.k)) {
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                }
            } else if (ColorSpaceKt.c(whitePoint, Illuminant.d)) {
                float[] fArr11 = ColorSpaces.a;
                rgb = ColorSpaces.c;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = 1;
                    } else if (Companion.b(d, wr0Var, rgb.k)) {
                        d += 0.00392156862745098d;
                    }
                }
            }
            z = i2;
        } else {
            z = 1;
        }
        this.o = z;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float b(int i) {
        return this.f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float c(int i) {
        return this.e;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getO() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p32.a(Rgb.class).equals(p32.a(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.e, this.e) != 0 || Float.compare(rgb.f, this.f) != 0 || !s71.b(this.d, rgb.d) || !Arrays.equals(this.h, rgb.h)) {
            return false;
        }
        TransferParameters transferParameters = rgb.g;
        TransferParameters transferParameters2 = this.g;
        if (transferParameters2 != null) {
            return transferParameters2.equals(transferParameters);
        }
        if (transferParameters == null) {
            return true;
        }
        if (s71.b(this.k, rgb.k)) {
            return s71.b(this.m, rgb.m);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] a(float[] fArr) {
        fArr.getClass();
        ColorSpaceKt.g(this.j, fArr);
        Double dValueOf = Double.valueOf(fArr[0]);
        Rgb$oetf$1 rgb$oetf$1 = (Rgb$oetf$1) this.l;
        fArr[0] = (float) ((Number) rgb$oetf$1.invoke(dValueOf)).doubleValue();
        fArr[1] = (float) ((Number) rgb$oetf$1.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) rgb$oetf$1.invoke(Double.valueOf(fArr[2]))).doubleValue();
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final int hashCode() {
        int iFloatToIntBits;
        int iFloatToIntBits2;
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iHashCode2 = 0;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            iFloatToIntBits = 0;
        } else {
            iFloatToIntBits = Float.floatToIntBits(f);
        }
        int i = (iHashCode + iFloatToIntBits) * 31;
        float f2 = this.f;
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            iFloatToIntBits2 = 0;
        } else {
            iFloatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i2 = (i + iFloatToIntBits2) * 31;
        TransferParameters transferParameters = this.g;
        if (transferParameters != null) {
            iHashCode2 = transferParameters.hashCode();
        }
        int i3 = i2 + iHashCode2;
        if (transferParameters == null) {
            return this.m.hashCode() + ((this.k.hashCode() + (i3 * 31)) * 31);
        }
        return i3;
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i) {
        this(str, fArr, whitePoint, null, new AnonymousClass1(transferParameters), new AnonymousClass3(transferParameters), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, transferParameters, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d, float f, float f2, int i) {
        wr0 wr0Var = Rgb$Companion$DoubleIdentity$1.i;
        this(str, fArr, whitePoint, null, d == 1.0d ? wr0Var : new AnonymousClass5(d), d != 1.0d ? new AnonymousClass6(d) : wr0Var, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
