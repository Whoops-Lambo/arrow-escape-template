package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class LimitInsets implements WindowInsets {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof LimitInsets);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "(null only " + ((Object) WindowInsetsSides.a()) + ')';
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        density.getClass();
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        density.getClass();
        layoutDirection.getClass();
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        density.getClass();
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        density.getClass();
        layoutDirection.getClass();
        return 0;
    }
}
