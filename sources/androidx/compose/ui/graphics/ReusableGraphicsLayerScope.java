package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public long f;
    public long g;
    public float h;
    public float i;
    public long j;
    public Shape k;
    public boolean l;
    public Density m;
    public RenderEffect n;

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void e() {
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void f() {
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void q() {
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void E(boolean z) {
        this.l = z;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void G(long j) {
        this.j = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void L(float f) {
        this.e = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void b(float f) {
        this.c = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void c(float f) {
        this.d = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void g(float f) {
        this.i = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void g0(long j) {
        this.f = j;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getA() {
        return this.m.getA();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getFontScale */
    public final float getB() {
        return this.m.getB();
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void h(float f) {
        this.h = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void l(float f) {
        this.a = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void m0(long j) {
        this.g = j;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void o(float f) {
        this.b = f;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void o0(BlurEffect blurEffect) {
        this.n = blurEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void Q(Shape shape) {
        shape.getClass();
        this.k = shape;
    }
}
