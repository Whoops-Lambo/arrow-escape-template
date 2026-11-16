package androidx.compose.ui.graphics.colorspace;

import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Xyz extends ColorSpace {
    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] e(float[] fArr) {
        fArr[0] = f(fArr[0]);
        fArr[1] = f(fArr[1]);
        fArr[2] = f(fArr[2]);
        return fArr;
    }

    public static float f(float f) {
        return tb5.f(f, -2.0f, 2.0f);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float b(int i) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float c(int i) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] a(float[] fArr) {
        fArr.getClass();
        fArr[0] = f(fArr[0]);
        fArr[1] = f(fArr[1]);
        fArr[2] = f(fArr[2]);
        return fArr;
    }
}
