package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SweepGradient extends ShaderBrush {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SweepGradient) && Offset.a(0L, 0L);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    public final Shader b(long j) {
        if (0 != Offset.d) {
            OffsetKt.a(Offset.c(0L) == Float.POSITIVE_INFINITY ? Size.d(j) : Offset.c(0L), Offset.d(0L) == Float.POSITIVE_INFINITY ? Size.b(j) : Offset.d(0L));
        } else {
            SizeKt.b(j);
        }
        throw null;
    }

    public final int hashCode() {
        int i = Offset.e;
        Long.hashCode(0L);
        throw null;
    }

    public final String toString() {
        String str;
        if (OffsetKt.c(0L)) {
            str = "center=" + ((Object) Offset.h(0L)) + ", ";
        } else {
            str = "";
        }
        return pv1.n("SweepGradient(", str, "colors=null, stops=null)");
    }
}
