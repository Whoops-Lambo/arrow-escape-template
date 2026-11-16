package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SolidColor extends Brush {
    public final long a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SolidColor) {
            return Color.c(this.a, ((SolidColor) obj).a);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    public final void a(float f, long j, Paint paint) {
        paint.b(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = Color.b(jB, Color.d(jB) * f);
        }
        paint.e(jB);
        if (paint.getC() != null) {
            paint.h(null);
        }
    }

    public final int hashCode() {
        int i = Color.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) Color.i(this.a)) + ')';
    }

    public SolidColor(long j) {
        this.a = j;
    }
}
