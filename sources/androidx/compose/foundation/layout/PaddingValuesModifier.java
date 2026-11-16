package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.hg0;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class PaddingValuesModifier extends InspectorValueInfo implements LayoutModifier {
    public final PaddingValues b;

    public final boolean equals(Object obj) {
        PaddingValuesModifier paddingValuesModifier = obj instanceof PaddingValuesModifier ? (PaddingValuesModifier) obj : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return s71.b(this.b, paddingValuesModifier.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(PaddingValues paddingValues, wr0 wr0Var) {
        super(wr0Var);
        paddingValues.getClass();
        this.b = paddingValues;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        LayoutDirection a = measureScope.getA();
        PaddingValues paddingValues = this.b;
        if (Float.compare(paddingValues.b(a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 0 && Float.compare(paddingValues.getB(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 0 && Float.compare(paddingValues.c(measureScope.getA()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 0 && Float.compare(paddingValues.getD(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) >= 0) {
            int iMo1roundToPx0680j_4 = measureScope.mo1roundToPx0680j_4(paddingValues.c(measureScope.getA())) + measureScope.mo1roundToPx0680j_4(paddingValues.b(measureScope.getA()));
            int iMo1roundToPx0680j_5 = measureScope.mo1roundToPx0680j_4(paddingValues.getD()) + measureScope.mo1roundToPx0680j_4(paddingValues.getB());
            Placeable placeableY = measurable.Y(ConstraintsKt.h(-iMo1roundToPx0680j_4, -iMo1roundToPx0680j_5, j));
            return measureScope.C(ConstraintsKt.f(placeableY.a + iMo1roundToPx0680j_4, j), ConstraintsKt.e(placeableY.b + iMo1roundToPx0680j_5, j), hg0.a, new PaddingValuesModifier$measure$2(placeableY, measureScope, this));
        }
        d.r("Padding must be non-negative");
        return null;
    }
}
