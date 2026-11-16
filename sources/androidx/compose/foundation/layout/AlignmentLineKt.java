package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.hg0;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AlignmentLineKt {
    public static final MeasureResult a(MeasureScope measureScope, AlignmentLine alignmentLine, float f, float f2, Measurable measurable, long j) {
        long j2;
        long jA;
        boolean z = alignmentLine instanceof HorizontalAlignmentLine;
        if (z) {
            j2 = j;
            jA = Constraints.a(0, j2, 0, 0, 0, 11);
        } else {
            j2 = j;
            jA = Constraints.a(0, j2, 0, 0, 0, 14);
        }
        Placeable placeableY = measurable.Y(jA);
        int iF0 = placeableY.f0(alignmentLine);
        if (iF0 == Integer.MIN_VALUE) {
            iF0 = 0;
        }
        int i = z ? placeableY.b : placeableY.a;
        int iG = (z ? Constraints.g(j2) : Constraints.h(j2)) - i;
        int iG2 = tb5.g((!Dp.a(f, Float.NaN) ? measureScope.mo1roundToPx0680j_4(f) : 0) - iF0, 0, iG);
        int iG3 = tb5.g(((!Dp.a(f2, Float.NaN) ? measureScope.mo1roundToPx0680j_4(f2) : 0) - i) + iF0, 0, iG - iG2);
        int iMax = placeableY.a;
        if (!z) {
            iMax = Math.max(iMax + iG2 + iG3, Constraints.j(j2));
        }
        int iMax2 = placeableY.b;
        if (z) {
            iMax2 = Math.max(iMax2 + iG2 + iG3, Constraints.i(j2));
        }
        int i2 = iMax2;
        int i3 = iMax;
        return measureScope.C(i3, i2, hg0.a, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f, iG2, i3, iG3, placeableY, i2));
    }

    public static Modifier b(AlignmentLine alignmentLine, int i) {
        float f = (i & 2) != 0 ? Float.NaN : 30.0f;
        float f2 = (i & 4) == 0 ? 12.0f : Float.NaN;
        alignmentLine.getClass();
        return new AlignmentLineOffsetDp(alignmentLine, f, f2, InspectableValueKt.a());
    }
}
