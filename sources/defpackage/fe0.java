package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import io.p071bidmachine.ads.networks.adaptiverendering.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fe0 extends Painter implements RememberObserver {
    public final Drawable f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public final cm2 i;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.i.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(float f) {
        this.f.setAlpha(tb5.g(rd1.p(f * 255.0f), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean c(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter != null ? colorFilter.a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void e() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: h */
    public final long getI() {
        return ((Size) this.h.getA()).a;
    }

    public fe0(Drawable drawable) {
        long jA;
        drawable.getClass();
        this.f = drawable;
        this.g = SnapshotStateKt.c(0, StructuralEqualityPolicy.a);
        gd1 gd1Var = ge0.a;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            jA = SizeKt.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            jA = Size.c;
        }
        this.h = SnapshotStateKt.c(new Size(jA), StructuralEqualityPolicy.a);
        this.i = new cm2(new r6(this, 5));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void d() {
        e();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void f(LayoutDirection layoutDirection) {
        int i;
        layoutDirection.getClass();
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                e.b();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(DrawScope drawScope) {
        drawScope.getClass();
        Canvas canvasA = drawScope.getB().a();
        ((Number) this.g.getA()).intValue();
        int iP = rd1.p(Size.d(drawScope.i()));
        int iP2 = rd1.p(Size.b(drawScope.i()));
        Drawable drawable = this.f;
        drawable.setBounds(0, 0, iP, iP2);
        try {
            canvasA.r();
            android.graphics.Canvas canvas = AndroidCanvas_androidKt.a;
            drawable.draw(((AndroidCanvas) canvasA).a);
        } finally {
            canvasA.n();
        }
    }
}
