package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/MinIntrinsicHeightModifier;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class MinIntrinsicHeightModifier implements IntrinsicSizeModifier {
    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.layout.LayoutModifier
    public final int n(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.F(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final long w0(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        return Constraints.Companion.d(measurable.F(Constraints.h(j)));
    }
}
