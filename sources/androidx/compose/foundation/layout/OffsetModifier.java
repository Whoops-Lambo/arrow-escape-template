package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.h50;
import defpackage.hg0;
import defpackage.n30;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class OffsetModifier extends InspectorValueInfo implements LayoutModifier {
    public final float b;
    public final float c;
    public final boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetModifier offsetModifier = obj instanceof OffsetModifier ? (OffsetModifier) obj : null;
        return offsetModifier != null && Dp.a(this.b, offsetModifier.b) && Dp.a(this.c, offsetModifier.c) && this.d == offsetModifier.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + n30.b(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifier(x=");
        sb.append((Object) Dp.b(this.b));
        sb.append(", y=");
        sb.append((Object) Dp.b(this.c));
        sb.append(", rtlAware=");
        return h50.m(sb, this.d, ')');
    }

    public OffsetModifier(float f, float f2, wr0 wr0Var) {
        super(wr0Var);
        this.b = f;
        this.c = f2;
        this.d = true;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableY = measurable.Y(j);
        return measureScope.C(placeableY.a, placeableY.b, hg0.a, new OffsetModifier$measure$1(this, placeableY, measureScope));
    }
}
