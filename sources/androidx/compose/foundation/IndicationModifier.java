package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/IndicationModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class IndicationModifier implements DrawModifier {
    public final IndicationInstance a;

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void f0(LayoutNodeDrawScope layoutNodeDrawScope) {
        this.a.b(layoutNodeDrawScope);
    }

    public IndicationModifier(IndicationInstance indicationInstance) {
        indicationInstance.getClass();
        this.a = indicationInstance;
    }
}
