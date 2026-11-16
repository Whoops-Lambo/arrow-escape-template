package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ShaderBrush extends Brush {
    public Shader a;
    public long b = Size.c;

    public abstract Shader b(long j);

    @Override // androidx.compose.ui.graphics.Brush
    public final void a(float f, long j, Paint paint) {
        Shader shaderB = this.a;
        if (shaderB == null || !Size.a(this.b, j)) {
            shaderB = b(j);
            this.a = shaderB;
            this.b = j;
        }
        long jA = paint.a();
        long j2 = Color.b;
        if (!Color.c(jA, j2)) {
            paint.e(j2);
        }
        if (!s71.b(paint.getC(), shaderB)) {
            paint.h(shaderB);
        }
        if (paint.d() == f) {
            return;
        }
        paint.b(f);
    }
}
