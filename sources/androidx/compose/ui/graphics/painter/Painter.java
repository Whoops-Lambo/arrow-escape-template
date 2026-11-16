package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Painter {
    public AndroidPaint a;
    public boolean b;
    public ColorFilter c;
    public float d = 1.0f;
    public LayoutDirection e = LayoutDirection.a;

    public boolean b(float f) {
        return false;
    }

    public boolean c(ColorFilter colorFilter) {
        return false;
    }

    public abstract long h();

    public abstract void i(DrawScope drawScope);

    public void f(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
    }

    public final void g(DrawScope drawScope, long j, float f, ColorFilter colorFilter) {
        drawScope.getClass();
        if (this.d != f) {
            if (!b(f)) {
                AndroidPaint androidPaintA = this.a;
                if (f == 1.0f) {
                    if (androidPaintA != null) {
                        androidPaintA.b(f);
                    }
                    this.b = false;
                } else {
                    if (androidPaintA == null) {
                        androidPaintA = AndroidPaint_androidKt.a();
                        this.a = androidPaintA;
                    }
                    androidPaintA.b(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!s71.b(this.c, colorFilter)) {
            if (!c(colorFilter)) {
                AndroidPaint androidPaintA2 = this.a;
                if (colorFilter == null) {
                    if (androidPaintA2 != null) {
                        androidPaintA2.n(null);
                    }
                    this.b = false;
                } else {
                    if (androidPaintA2 == null) {
                        androidPaintA2 = AndroidPaint_androidKt.a();
                        this.a = androidPaintA2;
                    }
                    androidPaintA2.n(colorFilter);
                    this.b = true;
                }
            }
            this.c = colorFilter;
        }
        LayoutDirection layoutDirection = drawScope.getLayoutDirection();
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
        float fD = Size.d(drawScope.i()) - Size.d(j);
        float fB = Size.b(drawScope.i()) - Size.b(j);
        drawScope.getB().a.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fD, fB);
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Size.d(j) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Size.b(j) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.b) {
                Rect rectA = RectKt.a(Offset.b, SizeKt.a(Size.d(j), Size.b(j)));
                Canvas canvasA = drawScope.getB().a();
                AndroidPaint androidPaintA3 = this.a;
                if (androidPaintA3 == null) {
                    androidPaintA3 = AndroidPaint_androidKt.a();
                    this.a = androidPaintA3;
                }
                try {
                    canvasA.d(rectA, androidPaintA3);
                    i(drawScope);
                    canvasA.n();
                } catch (Throwable th) {
                    canvasA.n();
                    throw th;
                }
            } else {
                i(drawScope);
            }
        }
        drawScope.getB().a.b(-0.0f, -0.0f, -fD, -fB);
    }
}
