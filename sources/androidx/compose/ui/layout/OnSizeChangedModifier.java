package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class OnSizeChangedModifier extends InspectorValueInfo implements OnRemeasuredModifier {
    public final wr0 b;
    public long c;

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    public final void Y(long j) {
        if (IntSize.a(this.c, j)) {
            return;
        }
        this.b.invoke(new IntSize(j));
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        return s71.b(this.b, ((OnSizeChangedModifier) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnSizeChangedModifier(wr0 wr0Var, wr0 wr0Var2) {
        super(wr0Var2);
        wr0Var.getClass();
        this.b = wr0Var;
        this.c = IntSizeKt.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
