package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/UnionInsetsConsumingModifier;", "Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UnionInsetsConsumingModifier);
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public final WindowInsets c(WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsKt.a(null, windowInsets);
        throw null;
    }
}
