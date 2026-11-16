package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.hg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
interface IntrinsicSizeModifier extends LayoutModifier {
    long w0(MeasureScope measureScope, Measurable measurable, long j);

    default boolean z0() {
        return true;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    default int a(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.F(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    default int j(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.R(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    default int n(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.p(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    default int p(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.N(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    default MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        long jW0 = w0(measureScope, measurable, j);
        if (z0()) {
            jW0 = ConstraintsKt.d(j, jW0);
        }
        Placeable placeableY = measurable.Y(jW0);
        return measureScope.C(placeableY.a, placeableY.b, hg0.a, new IntrinsicSizeModifier$measure$1(placeableY));
    }
}
