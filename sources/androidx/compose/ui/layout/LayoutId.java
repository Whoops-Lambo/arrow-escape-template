package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutId;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class LayoutId extends InspectorValueInfo implements ParentDataModifier, LayoutIdParentData {
    public final String b;

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutId layoutId = obj instanceof LayoutId ? (LayoutId) obj : null;
        if (layoutId == null) {
            return false;
        }
        return s71.b(this.b, layoutId.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LayoutId(id=" + ((Object) this.b) + ')';
    }

    public LayoutId(String str, wr0 wr0Var) {
        super(wr0Var);
        this.b = str;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object t0(MeasureScope measureScope, Object obj) {
        measureScope.getClass();
        return this;
    }
}
