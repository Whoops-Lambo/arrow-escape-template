package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.h50;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class BoxChildData extends InspectorValueInfo implements ParentDataModifier {
    public final Alignment b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildData boxChildData = obj instanceof BoxChildData ? (BoxChildData) obj : null;
        return boxChildData != null && s71.b(this.b, boxChildData.b) && this.c == boxChildData.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxChildData(alignment=");
        sb.append(this.b);
        sb.append(", matchParentSize=");
        return h50.m(sb, this.c, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxChildData(Alignment alignment, boolean z, wr0 wr0Var) {
        super(wr0Var);
        alignment.getClass();
        this.b = alignment;
        this.c = z;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object t0(MeasureScope measureScope, Object obj) {
        measureScope.getClass();
        return this;
    }
}
