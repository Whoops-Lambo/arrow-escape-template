package androidx.compose.ui.graphics.colorspace;

import defpackage.wr0;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class Connector {
    public final ColorSpace a;
    public final ColorSpace b;
    public final float[] c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class RgbConnector extends Connector {
        public final Rgb d;
        public final Rgb e;
        public final float[] f;

        public RgbConnector(Rgb rgb, Rgb rgb2) {
            float[] fArrF;
            super(rgb, rgb2, (float[]) null);
            this.d = rgb;
            this.e = rgb2;
            float[] fArr = Adaptation.b.a;
            WhitePoint whitePoint = rgb.d;
            float[] fArr2 = rgb.i;
            WhitePoint whitePoint2 = rgb2.d;
            float[] fArr3 = rgb2.j;
            if (ColorSpaceKt.c(whitePoint, whitePoint2)) {
                fArrF = ColorSpaceKt.f(fArr3, fArr2);
            } else {
                float[] fArrA = whitePoint.a();
                float[] fArrA2 = whitePoint2.a();
                WhitePoint whitePoint3 = Illuminant.b;
                boolean zC = ColorSpaceKt.c(whitePoint, whitePoint3);
                float[] fArr4 = Illuminant.e;
                fArrF = ColorSpaceKt.f(ColorSpaceKt.c(whitePoint2, whitePoint3) ? fArr3 : ColorSpaceKt.e(ColorSpaceKt.f(ColorSpaceKt.b(fArr, fArrA2, Arrays.copyOf(fArr4, 3)), rgb2.i)), zC ? fArr2 : ColorSpaceKt.f(ColorSpaceKt.b(fArr, fArrA, Arrays.copyOf(fArr4, 3)), fArr2));
            }
            this.f = fArrF;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public final void a(float[] fArr) {
            Rgb rgb = this.d;
            fArr[0] = (float) ((Number) ((Rgb$eotf$1) rgb.n).invoke(Double.valueOf(fArr[0]))).doubleValue();
            wr0 wr0Var = rgb.n;
            fArr[1] = (float) ((Number) ((Rgb$eotf$1) wr0Var).invoke(Double.valueOf(fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) ((Rgb$eotf$1) wr0Var).invoke(Double.valueOf(fArr[2]))).doubleValue();
            ColorSpaceKt.g(this.f, fArr);
            wr0 wr0Var2 = this.e.l;
            fArr[0] = (float) ((Number) ((Rgb$oetf$1) wr0Var2).invoke(Double.valueOf(fArr[0]))).doubleValue();
            fArr[1] = (float) ((Number) ((Rgb$oetf$1) wr0Var2).invoke(Double.valueOf(fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) ((Rgb$oetf$1) wr0Var2).invoke(Double.valueOf(fArr[2]))).doubleValue();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Illegal instructions before constructor call */
    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        float[] fArr;
        ColorSpace colorSpaceA = ColorModel.a(colorSpace.b, 12884901888L) ? ColorSpaceKt.a(colorSpace) : colorSpace;
        ColorSpace colorSpaceA2 = ColorModel.a(colorSpace2.b, 12884901888L) ? ColorSpaceKt.a(colorSpace2) : colorSpace2;
        if (i == 3) {
            boolean zA = ColorModel.a(colorSpace.b, 12884901888L);
            boolean zA2 = ColorModel.a(colorSpace2.b, 12884901888L);
            if (!(zA && zA2) && (zA || zA2)) {
                WhitePoint whitePoint = ((Rgb) (zA ? colorSpace : colorSpace2)).d;
                float[] fArrA = Illuminant.e;
                float[] fArrA2 = zA ? whitePoint.a() : fArrA;
                fArrA = zA2 ? whitePoint.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(colorSpaceA, colorSpaceA2, fArr);
    }

    public void a(float[] fArr) {
        float[] fArrE = this.a.e(fArr);
        float[] fArr2 = this.c;
        if (fArr2 != null) {
            fArrE[0] = fArrE[0] * fArr2[0];
            fArrE[1] = fArrE[1] * fArr2[1];
            fArrE[2] = fArrE[2] * fArr2[2];
        }
        this.b.a(fArrE);
    }

    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, float[] fArr) {
        this.a = colorSpace;
        this.b = colorSpace2;
        this.c = fArr;
    }
}
