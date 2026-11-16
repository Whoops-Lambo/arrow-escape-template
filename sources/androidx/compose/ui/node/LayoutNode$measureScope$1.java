package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/ui/node/LayoutNode$measureScope$1", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/unit/Density;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutNode$measureScope$1 implements MeasureScope, Density {
    public final /* synthetic */ LayoutNode a;

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getA() {
        return this.a.p.getA();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getFontScale */
    public final float getB() {
        return this.a.p.getB();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    /* JADX INFO: renamed from: getLayoutDirection */
    public final LayoutDirection getA() {
        return this.a.r;
    }

    public LayoutNode$measureScope$1(LayoutNode layoutNode) {
        this.a = layoutNode;
    }
}
