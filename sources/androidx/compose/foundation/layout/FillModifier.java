package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import defpackage.hg0;
import defpackage.rd1;
import defpackage.tb5;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FillModifier extends InspectorValueInfo implements LayoutModifier {
    public final Direction b;
    public final float c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof FillModifier)) {
            return false;
        }
        FillModifier fillModifier = (FillModifier) obj;
        return this.b == fillModifier.b && this.c == fillModifier.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public FillModifier(Direction direction, wr0 wr0Var) {
        super(wr0Var);
        this.b = direction;
        this.c = 1.0f;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        measureScope.getClass();
        measurable.getClass();
        boolean zD = Constraints.d(j);
        float f = this.c;
        Direction direction = this.b;
        if (zD && direction != Direction.a) {
            iJ = tb5.g(rd1.p(Constraints.h(j) * f), Constraints.j(j), Constraints.h(j));
            iH = iJ;
        } else {
            iJ = Constraints.j(j);
            iH = Constraints.h(j);
        }
        if (Constraints.c(j) && direction != Direction.b) {
            i = tb5.g(rd1.p(Constraints.g(j) * f), Constraints.i(j), Constraints.g(j));
            iG = i;
        } else {
            i = Constraints.i(j);
            iG = Constraints.g(j);
        }
        Placeable placeableY = measurable.Y(ConstraintsKt.a(iJ, iH, i, iG));
        return measureScope.C(placeableY.a, placeableY.b, hg0.a, new FillModifier$measure$1(placeableY));
    }
}
