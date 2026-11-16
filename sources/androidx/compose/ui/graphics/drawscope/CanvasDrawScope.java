package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.s71;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CanvasDrawScope implements DrawScope {
    public final DrawParams a;
    public final CanvasDrawScope$drawContext$1 b;
    public AndroidPaint c;
    public AndroidPaint d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DrawParams {
        public Density a;
        public LayoutDirection b;
        public Canvas c;
        public long d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return s71.b(this.a, drawParams.a) && this.b == drawParams.b && s71.b(this.c, drawParams.c) && Size.a(this.d, drawParams.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            long j = this.d;
            int i = Size.d;
            return Long.hashCode(j) + iHashCode;
        }

        public final String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) Size.e(this.d)) + ')';
        }

        public final void a(LayoutDirection layoutDirection) {
            layoutDirection.getClass();
            this.b = layoutDirection;
        }
    }

    public static Paint k(CanvasDrawScope canvasDrawScope, long j, float f, int i) {
        AndroidPaint androidPaintA = canvasDrawScope.d;
        if (androidPaintA == null) {
            androidPaintA = AndroidPaint_androidKt.a();
            androidPaintA.t(1);
            canvasDrawScope.d = androidPaintA;
        }
        if (!Color.c(androidPaintA.a(), j)) {
            androidPaintA.e(j);
        }
        if (androidPaintA.c != null) {
            androidPaintA.h(null);
        }
        if (!s71.b(androidPaintA.d, null)) {
            androidPaintA.n(null);
        }
        if (androidPaintA.b != 3) {
            androidPaintA.m(3);
        }
        if (androidPaintA.l() != f) {
            androidPaintA.s(f);
        }
        if (androidPaintA.k() != 4.0f) {
            androidPaintA.r(4.0f);
        }
        if (androidPaintA.i() != i) {
            androidPaintA.p(i);
        }
        if (androidPaintA.j() != 0) {
            androidPaintA.q(0);
        }
        if (androidPaintA.c() == 1) {
            return androidPaintA;
        }
        androidPaintA.o(1);
        return androidPaintA;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: S, reason: from getter */
    public final CanvasDrawScope$drawContext$1 getB() {
        return this.b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void V(Brush brush, long j, long j2, float f, float f2) {
        Canvas canvas = this.a.c;
        AndroidPaint androidPaintA = this.d;
        if (androidPaintA == null) {
            androidPaintA = AndroidPaint_androidKt.a();
            androidPaintA.t(1);
            this.d = androidPaintA;
        }
        brush.a(f2, i(), androidPaintA);
        if (!s71.b(androidPaintA.d, null)) {
            androidPaintA.n(null);
        }
        if (androidPaintA.b != 3) {
            androidPaintA.m(3);
        }
        if (androidPaintA.l() != f) {
            androidPaintA.s(f);
        }
        if (androidPaintA.k() != 4.0f) {
            androidPaintA.r(4.0f);
        }
        if (androidPaintA.i() != 0) {
            androidPaintA.p(0);
        }
        if (androidPaintA.j() != 0) {
            androidPaintA.q(0);
        }
        if (androidPaintA.c() != 1) {
            androidPaintA.o(1);
        }
        canvas.q(j, j2, androidPaintA);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void c0(long j, float f, float f2, long j2, long j3, Stroke stroke) {
        this.a.c.b(Offset.c(j2), Offset.d(j2), Size.d(j3) + Offset.c(j2), Size.b(j3) + Offset.d(j2), f, f2, a(this, j, stroke, 1.0f, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void d0(long j, long j2, long j3, float f, int i) {
        this.a.c.q(j2, j3, k(this, j, f, i));
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getA() {
        return this.a.a.getA();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getFontScale */
    public final float getB() {
        return this.a.a.getB();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.a.b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void h0(ImageBitmap imageBitmap, long j, ColorFilter colorFilter) {
        this.a.c.m(imageBitmap, j, j(null, Fill.a, 1.0f, colorFilter, 3, 1));
    }

    public final Paint m(DrawStyle drawStyle) {
        if (s71.b(drawStyle, Fill.a)) {
            AndroidPaint androidPaint = this.c;
            if (androidPaint != null) {
                return androidPaint;
            }
            AndroidPaint androidPaintA = AndroidPaint_androidKt.a();
            androidPaintA.t(0);
            this.c = androidPaintA;
            return androidPaintA;
        }
        if (!(drawStyle instanceof Stroke)) {
            e.b();
            return null;
        }
        AndroidPaint androidPaintA2 = this.d;
        if (androidPaintA2 == null) {
            androidPaintA2 = AndroidPaint_androidKt.a();
            androidPaintA2.t(1);
            this.d = androidPaintA2;
        }
        float fL = androidPaintA2.l();
        Stroke stroke = (Stroke) drawStyle;
        float f = stroke.a;
        if (fL != f) {
            androidPaintA2.s(f);
        }
        int i = androidPaintA2.i();
        int i2 = stroke.c;
        if (i != i2) {
            androidPaintA2.p(i2);
        }
        float fK = androidPaintA2.k();
        float f2 = stroke.b;
        if (fK != f2) {
            androidPaintA2.r(f2);
        }
        int iJ = androidPaintA2.j();
        int i3 = stroke.d;
        if (iJ != i3) {
            androidPaintA2.q(i3);
        }
        return androidPaintA2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void r0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.a.c.l(Offset.c(j2), Offset.d(j2), Size.d(j3) + Offset.c(j2), Size.b(j3) + Offset.d(j2), a(this, j, drawStyle, f, colorFilter, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void y0(ArrayList arrayList, long j, float f) {
        this.a.c.p(arrayList, k(this, j, f, 1));
    }

    public CanvasDrawScope() {
        Density density = CanvasDrawScopeKt.a;
        EmptyCanvas emptyCanvas = new EmptyCanvas();
        long j = Size.b;
        DrawParams drawParams = new DrawParams();
        drawParams.a = density;
        drawParams.b = LayoutDirection.a;
        drawParams.c = emptyCanvas;
        drawParams.d = j;
        this.a = drawParams;
        this.b = new CanvasDrawScope$drawContext$1(this);
    }

    public static Paint a(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        Paint paintM = canvasDrawScope.m(drawStyle);
        if (f != 1.0f) {
            j = Color.b(j, Color.d(j) * f);
        }
        AndroidPaint androidPaint = (AndroidPaint) paintM;
        if (!Color.c(androidPaint.a(), j)) {
            androidPaint.e(j);
        }
        if (androidPaint.c != null) {
            androidPaint.h(null);
        }
        if (!s71.b(androidPaint.d, colorFilter)) {
            androidPaint.n(colorFilter);
        }
        if (androidPaint.b != i) {
            androidPaint.m(i);
        }
        if (androidPaint.c() == 1) {
            return paintM;
        }
        androidPaint.o(1);
        return paintM;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void A0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        imageBitmap.getClass();
        drawStyle.getClass();
        this.a.c.a(imageBitmap, j, j2, j3, j4, j(null, drawStyle, f, colorFilter, i, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void D(Path path, long j, DrawStyle drawStyle) {
        path.getClass();
        drawStyle.getClass();
        this.a.c.t(path, a(this, j, drawStyle, 1.0f, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void H(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter) {
        brush.getClass();
        drawStyle.getClass();
        this.a.c.l(Offset.c(j), Offset.d(j), Size.d(j2) + Offset.c(j), Size.b(j2) + Offset.d(j), j(brush, drawStyle, f, colorFilter, 3, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void P(long j, float f, long j2, DrawStyle drawStyle) {
        drawStyle.getClass();
        this.a.c.j(f, j2, a(this, j, drawStyle, 1.0f, null, 3));
    }

    public final Paint j(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        Paint paintM = m(drawStyle);
        if (brush != null) {
            brush.a(f, i(), paintM);
        } else {
            AndroidPaint androidPaint = (AndroidPaint) paintM;
            if (androidPaint.d() != f) {
                androidPaint.b(f);
            }
        }
        AndroidPaint androidPaint2 = (AndroidPaint) paintM;
        if (!s71.b(androidPaint2.d, colorFilter)) {
            androidPaint2.n(colorFilter);
        }
        if (androidPaint2.b != i) {
            androidPaint2.m(i);
        }
        if (androidPaint2.c() == i2) {
            return paintM;
        }
        androidPaint2.o(i2);
        return paintM;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void j0(Path path, Brush brush, float f, DrawStyle drawStyle, int i) {
        path.getClass();
        brush.getClass();
        drawStyle.getClass();
        this.a.c.t(path, j(brush, drawStyle, f, null, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void p0(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle) {
        brush.getClass();
        drawStyle.getClass();
        this.a.c.v(Offset.c(j), Offset.d(j), Size.d(j2) + Offset.c(j), Size.b(j2) + Offset.d(j), CornerRadius.b(j3), CornerRadius.c(j3), j(brush, drawStyle, f, null, 3, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void t(long j, long j2, long j3, long j4, DrawStyle drawStyle) {
        drawStyle.getClass();
        this.a.c.v(Offset.c(j2), Offset.d(j2), Size.d(j3) + Offset.c(j2), Size.b(j3) + Offset.d(j2), CornerRadius.b(j4), CornerRadius.c(j4), a(this, j, drawStyle, 1.0f, null, 3));
    }
}
