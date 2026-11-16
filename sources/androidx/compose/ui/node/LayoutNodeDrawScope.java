package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public final CanvasDrawScope a = new CanvasDrawScope();
    public DrawEntity b;

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: S */
    public final CanvasDrawScope$drawContext$1 getB() {
        return this.a.b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final long U() {
        return this.a.U();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void V(Brush brush, long j, long j2, float f, float f2) {
        this.a.V(brush, j, j2, f, f2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public final void W() {
        Canvas canvasA = this.a.b.a();
        DrawEntity drawEntity = this.b;
        drawEntity.getClass();
        DrawEntity drawEntity2 = (DrawEntity) drawEntity.c;
        if (drawEntity2 != null) {
            drawEntity2.c(canvasA);
        } else {
            drawEntity.a.Z0(canvasA);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void c0(long j, float f, float f2, long j2, long j3, Stroke stroke) {
        this.a.c0(j, f, f2, j2, j3, stroke);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void d0(long j, long j2, long j3, float f, int i) {
        this.a.d0(j, j2, j3, f, i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getA() {
        return this.a.getA();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getFontScale */
    public final float getB() {
        return this.a.getB();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void h0(ImageBitmap imageBitmap, long j, ColorFilter colorFilter) {
        this.a.h0(imageBitmap, j, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final long i() {
        return this.a.i();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void r0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.a.r0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo0roundToPxR2X_6o(long j) {
        return this.a.mo0roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo1roundToPx0680j_4(float f) {
        return this.a.mo1roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo2toDpGaN1DYA(long j) {
        return this.a.mo2toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo3toDpu2uoSUM(float f) {
        return f / this.a.getA();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo5toDpSizekrfVVM(long j) {
        return this.a.mo5toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo6toPxR2X_6o(long j) {
        return this.a.mo6toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo7toPx0680j_4(float f) {
        return this.a.getA() * f;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo8toSizeXkaWNTQ(long j) {
        return this.a.mo8toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo9toSp0xMU5do(float f) {
        return this.a.mo9toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo10toSpkPz2Gy4(float f) {
        return this.a.mo10toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void y0(ArrayList arrayList, long j, float f) {
        this.a.y0(arrayList, j, f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void A0(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        imageBitmap.getClass();
        drawStyle.getClass();
        this.a.A0(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void D(Path path, long j, DrawStyle drawStyle) {
        path.getClass();
        drawStyle.getClass();
        this.a.D(path, j, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void H(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter) {
        brush.getClass();
        drawStyle.getClass();
        this.a.H(brush, j, j2, f, drawStyle, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void P(long j, float f, long j2, DrawStyle drawStyle) {
        drawStyle.getClass();
        this.a.P(j, f, j2, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void j0(Path path, Brush brush, float f, DrawStyle drawStyle, int i) {
        path.getClass();
        brush.getClass();
        drawStyle.getClass();
        this.a.j0(path, brush, f, drawStyle, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void p0(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle) {
        brush.getClass();
        drawStyle.getClass();
        this.a.p0(brush, j, j2, j3, f, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void t(long j, long j2, long j3, long j4, DrawStyle drawStyle) {
        drawStyle.getClass();
        this.a.t(j, j2, j3, j4, drawStyle);
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        dpRect.getClass();
        return this.a.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo11toSpkPz2Gy4(int i) {
        return this.a.mo11toSpkPz2Gy4(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo4toDpu2uoSUM(int i) {
        return this.a.mo4toDpu2uoSUM(i);
    }
}
