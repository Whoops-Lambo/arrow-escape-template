package androidx.compose.material;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MaterialTextSelectionColorsKt {
    public static final float a(long j, long j2, long j3, float f) {
        long jD = ColorKt.d(Color.b(j, f), j3);
        float f2 = ColorKt.f(ColorKt.d(j2, jD)) + 0.05f;
        float f3 = ColorKt.f(jD) + 0.05f;
        return Math.max(f2, f3) / Math.min(f2, f3);
    }
}
