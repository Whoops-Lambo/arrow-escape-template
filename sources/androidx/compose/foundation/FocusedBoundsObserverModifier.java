package androidx.compose.foundation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import defpackage.az2;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Laz2;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class FocusedBoundsObserverModifier implements ModifierLocalConsumer, ModifierLocalProvider<wr0>, wr0 {
    public final wr0 a;
    public wr0 b;
    public LayoutCoordinates c;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    /* JADX INFO: renamed from: getKey */
    public final ProvidableModifierLocal getD() {
        return FocusedBoundsKt.a;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        this.c = layoutCoordinates;
        this.a.invoke(layoutCoordinates);
        wr0 wr0Var = this.b;
        if (wr0Var != null) {
            wr0Var.invoke(layoutCoordinates);
        }
        return az2.a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        wr0 wr0Var = (wr0) modifierLocalReadScope.a(FocusedBoundsKt.a);
        if (s71.b(wr0Var, this.b)) {
            return;
        }
        this.b = wr0Var;
    }

    public FocusedBoundsObserverModifier(wr0 wr0Var) {
        this.a = wr0Var;
    }
}
