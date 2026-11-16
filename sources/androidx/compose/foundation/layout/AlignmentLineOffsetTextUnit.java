package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnit;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AlignmentLineOffsetTextUnit extends InspectorValueInfo implements LayoutModifier {
    public final int hashCode() {
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean zA = TextUnit.a(0L, 0L);
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlignmentLineOffsetTextUnit ? (AlignmentLineOffsetTextUnit) obj : null) != null && zA && zA;
    }

    public final String toString() {
        return "AlignmentLineOffset(alignmentLine=null, before=" + ((Object) TextUnit.d(0L)) + ", after=" + ((Object) TextUnit.d(0L)) + ')';
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        float fMo2toDpGaN1DYA;
        measureScope.getClass();
        measurable.getClass();
        float fMo2toDpGaN1DYA2 = Float.NaN;
        if (!TextUnitKt.d(0L)) {
            fMo2toDpGaN1DYA = measureScope.mo2toDpGaN1DYA(0L);
        } else {
            fMo2toDpGaN1DYA = Float.NaN;
        }
        if (!TextUnitKt.d(0L)) {
            fMo2toDpGaN1DYA2 = measureScope.mo2toDpGaN1DYA(0L);
        }
        return AlignmentLineKt.a(measureScope, null, fMo2toDpGaN1DYA, fMo2toDpGaN1DYA2, measurable, j);
    }
}
