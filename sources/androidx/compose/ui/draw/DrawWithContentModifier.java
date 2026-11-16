package androidx.compose.ui.draw;

import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DrawWithContentModifier extends InspectorValueInfo implements DrawModifier {
    public final wr0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawWithContentModifier)) {
            return false;
        }
        return s71.b(this.b, ((DrawWithContentModifier) obj).b);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void f0(LayoutNodeDrawScope layoutNodeDrawScope) {
        this.b.invoke(layoutNodeDrawScope);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawWithContentModifier(wr0 wr0Var, wr0 wr0Var2) {
        super(wr0Var2);
        wr0Var.getClass();
        this.b = wr0Var;
    }
}
