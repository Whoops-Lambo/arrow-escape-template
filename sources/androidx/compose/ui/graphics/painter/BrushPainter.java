package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BrushPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BrushPainter extends Painter {
    public float f;
    public ColorFilter g;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BrushPainter);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long h() {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(float f) {
        this.f = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean c(ColorFilter colorFilter) {
        this.g = colorFilter;
        return true;
    }

    public final String toString() {
        return "BrushPainter(brush=null)";
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(DrawScope drawScope) {
        drawScope.getClass();
        DrawScope.O(drawScope, null, 0L, 0L, this.f, null, this.g, 86);
    }
}
