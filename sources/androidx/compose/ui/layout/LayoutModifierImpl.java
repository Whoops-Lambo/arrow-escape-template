package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import defpackage.as0;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierImpl;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class LayoutModifierImpl extends InspectorValueInfo implements LayoutModifier {
    public final as0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutModifierImpl layoutModifierImpl = obj instanceof LayoutModifierImpl ? (LayoutModifierImpl) obj : null;
        if (layoutModifierImpl == null) {
            return false;
        }
        return s71.b(this.b, layoutModifierImpl.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.b + ')';
    }

    public LayoutModifierImpl(wr0 wr0Var, as0 as0Var) {
        super(wr0Var);
        this.b = as0Var;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        return (MeasureResult) this.b.invoke(measureScope, measurable, new Constraints(j));
    }
}
