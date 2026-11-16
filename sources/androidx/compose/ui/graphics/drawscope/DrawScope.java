package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@DrawScopeMarker
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface DrawScope extends Density {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void D(Path path, long j, DrawStyle drawStyle);

    void H(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter);

    void P(long j, float f, long j2, DrawStyle drawStyle);

    /* JADX INFO: renamed from: S */
    CanvasDrawScope$drawContext$1 getB();

    void V(Brush brush, long j, long j2, float f, float f2);

    void c0(long j, float f, float f2, long j2, long j3, Stroke stroke);

    void d0(long j, long j2, long j3, float f, int i);

    LayoutDirection getLayoutDirection();

    void h0(ImageBitmap imageBitmap, long j, ColorFilter colorFilter);

    void j0(Path path, Brush brush, float f, DrawStyle drawStyle, int i);

    void p0(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle);

    void r0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    void t(long j, long j2, long j3, long j4, DrawStyle drawStyle);

    void y0(ArrayList arrayList, long j, float f);

    static void B0(DrawScope drawScope, long j, float f, float f2, long j2, long j3, Stroke stroke, int i) {
        drawScope.c0(j, f, f2, (i & 16) != 0 ? Offset.b : j2, j3, stroke);
    }

    static void I(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, int i) {
        drawScope.t(j, (i & 2) != 0 ? Offset.b : j2, j3, j4, (i & 16) != 0 ? Fill.a : drawStyle);
    }

    static void M(DrawScope drawScope, long j, long j2, long j3, float f, ColorFilter colorFilter, int i) {
        long j4 = (i & 2) != 0 ? Offset.b : j2;
        drawScope.r0(j, j4, (i & 4) != 0 ? v0(drawScope.i(), j4) : j3, (i & 8) != 0 ? 1.0f : f, Fill.a, (i & 32) != 0 ? null : colorFilter, (i & 64) != 0 ? 3 : 0);
    }

    static void O(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        if ((i & 2) != 0) {
            j = Offset.b;
        }
        long j3 = j;
        drawScope.H(brush, j3, (i & 4) != 0 ? v0(drawScope.i(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? Fill.a : drawStyle, (i & 32) != 0 ? null : colorFilter);
    }

    static void T(ContentDrawScope contentDrawScope, Brush brush, long j, long j2, long j3, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            j = Offset.b;
        }
        long j4 = j;
        contentDrawScope.p0(brush, j4, (i & 4) != 0 ? v0(contentDrawScope.i(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? Fill.a : drawStyle);
    }

    static void Z(DrawScope drawScope, ImageBitmap imageBitmap, long j, ColorFilter colorFilter, int i) {
        if ((i & 2) != 0) {
            j = Offset.b;
        }
        if ((i & 16) != 0) {
            colorFilter = null;
        }
        drawScope.h0(imageBitmap, j, colorFilter);
    }

    static /* synthetic */ void a0(DrawScope drawScope, Path path, long j, Stroke stroke, int i) {
        DrawStyle drawStyle = stroke;
        if ((i & 8) != 0) {
            drawStyle = Fill.a;
        }
        drawScope.D(path, j, drawStyle);
    }

    static /* synthetic */ void e0(DrawScope drawScope, long j, float f, long j2, DrawStyle drawStyle, int i) {
        if ((i & 4) != 0) {
            j2 = drawScope.U();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            drawStyle = Fill.a;
        }
        drawScope.P(j, f, j3, drawStyle);
    }

    static void u(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3) {
        drawScope.A0(imageBitmap, (i3 & 2) != 0 ? IntOffset.b : j, j2, (i3 & 8) != 0 ? IntOffset.b : j3, (i3 & 16) != 0 ? j2 : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.a : drawStyle, colorFilter, (i3 & 256) != 0 ? 3 : i, (i3 & 512) != 0 ? 1 : i2);
    }

    static /* synthetic */ void v(DrawScope drawScope, Path path, Brush brush, float f, Stroke stroke, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        DrawStyle drawStyle = stroke;
        if ((i & 8) != 0) {
            drawStyle = Fill.a;
        }
        drawScope.j0(path, brush, f2, drawStyle, (i & 32) != 0 ? 3 : 0);
    }

    static long v0(long j, long j2) {
        return SizeKt.a(Size.d(j) - Offset.c(j2), Size.b(j) - Offset.d(j2));
    }

    default void A0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        imageBitmap.getClass();
        drawStyle.getClass();
        u(this, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512);
    }

    default long U() {
        return SizeKt.b(getB().b());
    }

    default long i() {
        return getB().b();
    }
}
