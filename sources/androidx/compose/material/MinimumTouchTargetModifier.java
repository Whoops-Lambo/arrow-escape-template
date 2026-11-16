package androidx.compose.material;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpSize;
import defpackage.hg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/MinimumTouchTargetModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class MinimumTouchTargetModifier implements LayoutModifier {
    public final long a;

    public final boolean equals(Object obj) {
        MinimumTouchTargetModifier minimumTouchTargetModifier = obj instanceof MinimumTouchTargetModifier ? (MinimumTouchTargetModifier) obj : null;
        if (minimumTouchTargetModifier == null) {
            return false;
        }
        long j = minimumTouchTargetModifier.a;
        int i = DpSize.d;
        return this.a == j;
    }

    public final int hashCode() {
        int i = DpSize.d;
        return Long.hashCode(this.a);
    }

    public MinimumTouchTargetModifier(long j) {
        this.a = j;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableY = measurable.Y(j);
        int i = placeableY.a;
        long j2 = this.a;
        int iMax = Math.max(i, measureScope.mo1roundToPx0680j_4(DpSize.b(j2)));
        int iMax2 = Math.max(placeableY.b, measureScope.mo1roundToPx0680j_4(DpSize.a(j2)));
        return measureScope.C(iMax, iMax2, hg0.a, new MinimumTouchTargetModifier$measure$1(iMax, iMax2, placeableY));
    }
}
