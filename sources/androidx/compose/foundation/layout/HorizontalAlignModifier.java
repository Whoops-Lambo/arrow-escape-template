package androidx.compose.foundation.layout;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HorizontalAlignModifier extends InspectorValueInfo implements ParentDataModifier {
    public final BiasAlignment.Horizontal b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignModifier horizontalAlignModifier = obj instanceof HorizontalAlignModifier ? (HorizontalAlignModifier) obj : null;
        if (horizontalAlignModifier == null) {
            return false;
        }
        return s71.b(this.b, horizontalAlignModifier.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }

    public final String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.b + ')';
    }

    public HorizontalAlignModifier(BiasAlignment.Horizontal horizontal, wr0 wr0Var) {
        super(wr0Var);
        this.b = horizontal;
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
        BiasAlignment.Horizontal horizontal = this.b;
        horizontal.getClass();
        rowColumnParentData.c = new CrossAxisAlignment.HorizontalCrossAxisAlignment(horizontal);
        return rowColumnParentData;
    }
}
