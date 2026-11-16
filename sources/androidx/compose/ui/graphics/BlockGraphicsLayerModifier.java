package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.hg0;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class BlockGraphicsLayerModifier extends InspectorValueInfo implements LayoutModifier {
    public final wr0 b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof BlockGraphicsLayerModifier)) {
            return false;
        }
        return s71.b(this.b, ((BlockGraphicsLayerModifier) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.b + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockGraphicsLayerModifier(wr0 wr0Var, wr0 wr0Var2) {
        super(wr0Var2);
        wr0Var.getClass();
        this.b = wr0Var;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableY = measurable.Y(j);
        return measureScope.C(placeableY.a, placeableY.b, hg0.a, new BlockGraphicsLayerModifier$measure$1(placeableY, this));
    }
}
