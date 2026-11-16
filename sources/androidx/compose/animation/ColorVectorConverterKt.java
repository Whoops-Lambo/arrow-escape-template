package androidx.compose.animation;

import androidx.compose.ui.graphics.Color;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ColorVectorConverterKt {
    public static final wr0 a = null;
    public static final float[] b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};
    public static final float[] c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    public static final float a(int i, float f, float f2, float f3, float[] fArr) {
        return (f3 * fArr[i + 6]) + (f2 * fArr[i + 3]) + (f * fArr[i]);
    }

    public static final wr0 b() {
        int i = Color.j;
        return ColorVectorConverterKt$ColorToVector$1.i;
    }
}
