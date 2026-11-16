package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.PinnableParent;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPinningModifier;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class LazyListPinningModifier implements ModifierLocalProvider<PinnableParent>, ModifierLocalConsumer, PinnableParent {
    public static final LazyListPinningModifier$Companion$EmptyPinnedItemsHandle$1 b = new LazyListPinningModifier$Companion$EmptyPinnedItemsHandle$1();
    public PinnableParent a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPinningModifier$Companion;", "", "androidx/compose/foundation/lazy/LazyListPinningModifier$Companion$EmptyPinnedItemsHandle$1", "EmptyPinnedItemsHandle", "Landroidx/compose/foundation/lazy/LazyListPinningModifier$Companion$EmptyPinnedItemsHandle$1;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.foundation.lazy.layout.PinnableParent
    public final PinnableParent.PinnedItemsHandle b() {
        throw null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return PinnableParentKt.a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
        this.a = (PinnableParent) modifierLocalReadScope.a(PinnableParentKt.a);
    }
}
