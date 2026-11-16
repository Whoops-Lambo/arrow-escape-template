package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VerticalAlignModifier extends InspectorValueInfo implements ParentDataModifier {
    public final BiasAlignment.Vertical b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignModifier verticalAlignModifier = obj instanceof VerticalAlignModifier ? (VerticalAlignModifier) obj : null;
        if (verticalAlignModifier == null) {
            return false;
        }
        return s71.b(this.b, verticalAlignModifier.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }

    public final String toString() {
        return "VerticalAlignModifier(vertical=" + this.b + ')';
    }

    public VerticalAlignModifier(wr0 wr0Var) {
        super(wr0Var);
        this.b = Alignment.Companion.k;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object t0(MeasureScope measureScope, Object obj) {
        RowColumnParentData rowColumnParentData;
        measureScope.getClass();
        if (obj instanceof RowColumnParentData) {
            rowColumnParentData = (RowColumnParentData) obj;
        } else {
            rowColumnParentData = null;
        }
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData();
        }
        BiasAlignment.Vertical vertical = this.b;
        vertical.getClass();
        rowColumnParentData.c = new CrossAxisAlignment.VerticalCrossAxisAlignment(vertical);
        return rowColumnParentData;
    }
}
