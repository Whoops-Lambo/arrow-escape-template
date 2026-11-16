package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import defpackage.p32;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultChipColors;", "Landroidx/compose/material/ChipColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
final class DefaultChipColors implements ChipColors {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p32.a(DefaultChipColors.class).equals(p32.a(obj.getClass()))) {
            return false;
        }
        return Color.c(0L, 0L) && Color.c(0L, 0L) && Color.c(0L, 0L) && Color.c(0L, 0L) && Color.c(0L, 0L) && Color.c(0L, 0L);
    }

    public final int hashCode() {
        int i = Color.j;
        return Long.hashCode(0L) + pv1.d(pv1.d(pv1.d(pv1.d(Long.hashCode(0L) * 31, 31, 0L), 31, 0L), 31, 0L), 31, 0L);
    }
}
