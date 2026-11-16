package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RowScopeInstance implements RowScope {
    public static final RowScopeInstance a = new RowScopeInstance();

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier a(Modifier modifier) {
        modifier.getClass();
        return modifier.N(new LayoutWeightImpl(true, InspectableValueKt.a()));
    }

    public final Modifier b(Modifier modifier) {
        modifier.getClass();
        return modifier.N(new VerticalAlignModifier(InspectableValueKt.a()));
    }
}
