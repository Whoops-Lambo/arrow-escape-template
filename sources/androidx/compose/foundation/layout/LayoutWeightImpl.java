package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.h50;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightImpl;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutWeightImpl extends InspectorValueInfo implements ParentDataModifier {
    public final float b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightImpl layoutWeightImpl = obj instanceof LayoutWeightImpl ? (LayoutWeightImpl) obj : null;
        return layoutWeightImpl != null && this.b == layoutWeightImpl.b && this.c == layoutWeightImpl.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutWeightImpl(weight=");
        sb.append(this.b);
        sb.append(", fill=");
        return h50.m(sb, this.c, ')');
    }

    public LayoutWeightImpl(boolean z, wr0 wr0Var) {
        super(wr0Var);
        this.b = 1.0f;
        this.c = z;
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
        rowColumnParentData.a = this.b;
        rowColumnParentData.b = this.c;
        return rowColumnParentData;
    }
}
