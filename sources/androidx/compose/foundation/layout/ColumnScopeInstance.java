package androidx.compose.foundation.layout;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/ColumnScopeInstance;", "Landroidx/compose/foundation/layout/ColumnScope;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ColumnScopeInstance implements ColumnScope {
    public static final ColumnScopeInstance a = new ColumnScopeInstance();

    public final Modifier a(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        modifier.getClass();
        return modifier.N(new HorizontalAlignModifier(horizontal, InspectableValueKt.a()));
    }
}
