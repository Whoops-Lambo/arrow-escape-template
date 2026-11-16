package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ColorPainter extends Painter {
    public final long f;
    public ColorFilter h;
    public float g = 1.0f;
    public final long i = Size.c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ColorPainter) {
            return Color.c(this.f, ((ColorPainter) obj).f);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(float f) {
        this.g = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean c(ColorFilter colorFilter) {
        this.h = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getI() {
        return this.i;
    }

    public final int hashCode() {
        int i = Color.j;
        return Long.hashCode(this.f);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) Color.i(this.f)) + ')';
    }

    public ColorPainter(long j) {
        this.f = j;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(DrawScope drawScope) {
        drawScope.getClass();
        DrawScope.M(drawScope, this.f, 0L, 0L, this.g, this.h, 86);
    }
}
