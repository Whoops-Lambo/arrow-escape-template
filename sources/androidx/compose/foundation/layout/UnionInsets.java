package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/UnionInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class UnionInsets implements WindowInsets {
    public final WindowInsets a;
    public final WindowInsets b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsets)) {
            return false;
        }
        UnionInsets unionInsets = (UnionInsets) obj;
        return s71.b(unionInsets.a, this.a) && s71.b(unionInsets.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }

    public UnionInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        windowInsets.getClass();
        windowInsets2.getClass();
        this.a = windowInsets;
        this.b = windowInsets2;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int a(Density density) {
        density.getClass();
        return Math.max(this.a.a(density), this.b.a(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int b(Density density, LayoutDirection layoutDirection) {
        density.getClass();
        layoutDirection.getClass();
        return Math.max(this.a.b(density, layoutDirection), this.b.b(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int c(Density density) {
        density.getClass();
        return Math.max(this.a.c(density), this.b.c(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int d(Density density, LayoutDirection layoutDirection) {
        density.getClass();
        layoutDirection.getClass();
        return Math.max(this.a.d(density, layoutDirection), this.b.d(density, layoutDirection));
    }
}
