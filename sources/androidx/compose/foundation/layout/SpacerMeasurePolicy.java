package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import defpackage.hg0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SpacerMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SpacerMeasurePolicy implements MeasurePolicy {
    public static final SpacerMeasurePolicy a = new SpacerMeasurePolicy();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult a(MeasureScope measureScope, List list, long j) {
        int iH;
        measureScope.getClass();
        list.getClass();
        int iG = 0;
        if (Constraints.f(j)) {
            iH = Constraints.h(j);
        } else {
            iH = 0;
        }
        if (Constraints.e(j)) {
            iG = Constraints.g(j);
        }
        return measureScope.C(iH, iG, hg0.a, SpacerMeasurePolicy$measure$1$1.i);
    }
}
