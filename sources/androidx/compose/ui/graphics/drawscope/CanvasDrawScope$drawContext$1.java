package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScope$drawContext$1", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CanvasDrawScope$drawContext$1 implements DrawContext {
    public final CanvasDrawScopeKt$asDrawTransform$1 a;
    public final /* synthetic */ CanvasDrawScope b;

    public final Canvas a() {
        return this.b.a.c;
    }

    public final long b() {
        return this.b.a.d;
    }

    public final void c(long j) {
        this.b.a.d = j;
    }

    public CanvasDrawScope$drawContext$1(CanvasDrawScope canvasDrawScope) {
        this.b = canvasDrawScope;
        Density density = CanvasDrawScopeKt.a;
        this.a = new CanvasDrawScopeKt$asDrawTransform$1(this);
    }
}
