package androidx.compose.ui;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.h50;
import defpackage.hg0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ZIndexModifier extends InspectorValueInfo implements LayoutModifier {
    public final float b;

    public final boolean equals(Object obj) {
        ZIndexModifier zIndexModifier = obj instanceof ZIndexModifier ? (ZIndexModifier) obj : null;
        return zIndexModifier != null && this.b == zIndexModifier.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return h50.k(new StringBuilder("ZIndexModifier(zIndex="), this.b, ')');
    }

    public ZIndexModifier(float f, wr0 wr0Var) {
        super(wr0Var);
        this.b = f;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableY = measurable.Y(j);
        return measureScope.C(placeableY.a, placeableY.b, hg0.a, new ZIndexModifier$measure$1(placeableY, this));
    }
}
