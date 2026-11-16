package androidx.compose.ui.graphics.colorspace;

import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class ColorSpaces$ExtendedSrgb$1 extends rc1 implements wr0 {
    public static final ColorSpaces$ExtendedSrgb$1 i = new ColorSpaces$ExtendedSrgb$1(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        double d;
        double dDoubleValue = ((Number) obj).doubleValue();
        double dPow = dDoubleValue < 0.0d ? -dDoubleValue : dDoubleValue;
        if (dPow >= 0.0031308049535603718d) {
            dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
            d = 0.9478672985781991d;
        } else {
            d = 0.07739938080495357d;
        }
        return Double.valueOf(Math.copySign(dPow / d, dDoubleValue));
    }
}
