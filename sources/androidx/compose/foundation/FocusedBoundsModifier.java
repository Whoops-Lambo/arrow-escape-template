package androidx.compose.foundation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FocusedBoundsModifier implements ModifierLocalConsumer, OnGloballyPositionedModifier {
    public wr0 a;
    public LayoutCoordinates b;

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        wr0 wr0Var;
        wr0 wr0Var2 = (wr0) modifierLocalReadScope.a(FocusedBoundsKt.a);
        if (wr0Var2 == null && (wr0Var = this.a) != null) {
            wr0Var.invoke(null);
        }
        this.a = wr0Var2;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public final void x0(LayoutCoordinates layoutCoordinates) {
        wr0 wr0Var;
        layoutCoordinates.getClass();
        this.b = layoutCoordinates;
        if (layoutCoordinates.s()) {
            LayoutCoordinates layoutCoordinates2 = this.b;
            if (layoutCoordinates2 != null && layoutCoordinates2.s() && (wr0Var = this.a) != null) {
                wr0Var.invoke(this.b);
                return;
            }
            return;
        }
        wr0 wr0Var2 = this.a;
        if (wr0Var2 != null) {
            wr0Var2.invoke(null);
        }
    }
}
