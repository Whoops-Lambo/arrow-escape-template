package androidx.compose.ui.graphics.colorspace;

import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class ColorSpaces$ExtendedSrgb$2 extends rc1 implements wr0 {
    public static final ColorSpaces$ExtendedSrgb$2 i = new ColorSpaces$ExtendedSrgb$2(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        double d = dDoubleValue < 0.0d ? -dDoubleValue : dDoubleValue;
        return Double.valueOf(Math.copySign(d >= 0.04045d ? Math.pow((0.9478672985781991d * d) + 0.05213270142180095d, 2.4d) : d * 0.07739938080495357d, dDoubleValue));
    }
}
