package androidx.compose.foundation.relocation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.node.LayoutNodeWrapper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewChildModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class BringIntoViewChildModifier implements ModifierLocalConsumer, OnPlacedModifier {
    public final BringIntoViewParent a;
    public BringIntoViewParent b;
    public LayoutCoordinates c;

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        this.b = (BringIntoViewParent) modifierLocalReadScope.a(BringIntoViewKt.a);
    }

    public BringIntoViewChildModifier(BringIntoViewParent bringIntoViewParent) {
        this.a = bringIntoViewParent;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public final void F(LayoutNodeWrapper layoutNodeWrapper) {
        layoutNodeWrapper.getClass();
        this.c = layoutNodeWrapper;
    }
}
