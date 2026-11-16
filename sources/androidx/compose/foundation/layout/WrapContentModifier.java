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
import defpackage.jc1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class WrapContentModifier extends InspectorValueInfo implements LayoutModifier {
    public final Direction b;
    public final zr0 c;
    public final Object d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) obj;
        return this.b == wrapContentModifier.b && s71.b(this.d, wrapContentModifier.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + jc1.f(this.b.hashCode() * 31, 31, false);
    }

    public WrapContentModifier(Direction direction, zr0 zr0Var, Object obj, wr0 wr0Var) {
        super(wr0Var);
        this.b = direction;
        this.c = zr0Var;
        this.d = obj;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        int iJ;
        measureScope.getClass();
        measurable.getClass();
        Direction direction = Direction.a;
        int i = 0;
        Direction direction2 = this.b;
        if (direction2 != direction) {
            iJ = 0;
        } else {
            iJ = Constraints.j(j);
        }
        if (direction2 == Direction.b) {
            i = Constraints.i(j);
        }
        Placeable placeableY = measurable.Y(ConstraintsKt.a(iJ, Constraints.h(j), i, Constraints.g(j)));
        int iG = tb5.g(placeableY.a, Constraints.j(j), Constraints.h(j));
        int iG2 = tb5.g(placeableY.b, Constraints.i(j), Constraints.g(j));
        return measureScope.C(iG, iG2, hg0.a, new WrapContentModifier$measure$1(this, iG, placeableY, iG2, measureScope));
    }
}
