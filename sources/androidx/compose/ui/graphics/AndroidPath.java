package androidx.compose.ui.graphics;

import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import defpackage.d;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidPath implements Path {
    public final android.graphics.Path a;
    public final RectF b = new RectF();
    public final float[] c = new float[8];
    public final android.graphics.Matrix d = new android.graphics.Matrix();

    @Override // androidx.compose.ui.graphics.Path
    public final void a(float f, float f2) {
        this.a.rMoveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void c(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void close() {
        this.a.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void d(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void e(RoundRect roundRect) {
        float f = roundRect.a;
        float f2 = roundRect.b;
        float f3 = roundRect.c;
        float f4 = roundRect.d;
        RectF rectF = this.b;
        rectF.set(f, f2, f3, f4);
        long j = roundRect.e;
        float fB = CornerRadius.b(j);
        float[] fArr = this.c;
        fArr[0] = fB;
        fArr[1] = CornerRadius.c(j);
        long j2 = roundRect.f;
        fArr[2] = CornerRadius.b(j2);
        fArr[3] = CornerRadius.c(j2);
        long j3 = roundRect.g;
        fArr[4] = CornerRadius.b(j3);
        fArr[5] = CornerRadius.c(j3);
        long j4 = roundRect.h;
        fArr[6] = CornerRadius.b(j4);
        fArr[7] = CornerRadius.c(j4);
        this.a.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void f(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean g() {
        return this.a.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void h(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void i(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void k(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    public final boolean m(Path path, Path path2, int i) {
        android.graphics.Path.Op op;
        if (i == 0) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (i == 4) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        if (!(path instanceof AndroidPath)) {
            d.u("Unable to obtain android.graphics.Path");
            return false;
        }
        android.graphics.Path path3 = ((AndroidPath) path).a;
        if (path2 instanceof AndroidPath) {
            return this.a.op(path3, ((AndroidPath) path2).a, op);
        }
        d.u("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.a.reset();
    }

    public AndroidPath(android.graphics.Path path) {
        this.a = path;
    }

    public final void l(Rect rect) {
        rect.getClass();
        float f = rect.d;
        float f2 = rect.c;
        float f3 = rect.b;
        float f4 = rect.a;
        if (!Float.isNaN(f4)) {
            if (!Float.isNaN(f3)) {
                if (!Float.isNaN(f2)) {
                    if (!Float.isNaN(f)) {
                        RectF rectF = new RectF(f4, f3, f2, f);
                        RectF rectF2 = this.b;
                        rectF2.set(rectF);
                        this.a.addRect(rectF2, android.graphics.Path.Direction.CCW);
                        return;
                    }
                    e32.i("Rect.bottom is NaN");
                    return;
                }
                e32.i("Rect.right is NaN");
                return;
            }
            e32.i("Rect.top is NaN");
            return;
        }
        e32.i("Rect.left is NaN");
    }
}
