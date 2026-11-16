package androidx.compose.ui.graphics;

import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidPaint implements Paint {
    public android.graphics.Paint a;
    public int b;
    public Shader c;
    public ColorFilter d;

    @Override // androidx.compose.ui.graphics.Paint
    public final long a() {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        return ColorKt.b(paint.getColor());
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void b(float f) {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final int c() {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        return paint.isFilterBitmap() ? 1 : 0;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final float d() {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        return paint.getAlpha() / 255.0f;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void e(long j) {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        paint.setColor(ColorKt.g(j));
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: f, reason: from getter */
    public final android.graphics.Paint getA() {
        return this.a;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Shader getC() {
        return this.c;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void h(Shader shader) {
        this.c = shader;
        android.graphics.Paint paint = this.a;
        paint.getClass();
        paint.setShader(shader);
    }

    public final int i() {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        android.graphics.Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : AndroidPaint_androidKt.WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int j() {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        android.graphics.Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : AndroidPaint_androidKt.WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final float k() {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        return paint.getStrokeMiter();
    }

    public final float l() {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        return paint.getStrokeWidth();
    }

    public final void m(int i) {
        this.b = i;
        android.graphics.Paint paint = this.a;
        paint.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.a.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.b(i)));
        }
    }

    public final void n(ColorFilter colorFilter) {
        this.d = colorFilter;
        android.graphics.Paint paint = this.a;
        paint.getClass();
        paint.setColorFilter(colorFilter != null ? colorFilter.a : null);
    }

    public final void o(int i) {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        paint.setFilterBitmap(!(i == 0));
    }

    public final void p(int i) {
        android.graphics.Paint.Cap cap;
        android.graphics.Paint paint = this.a;
        paint.getClass();
        if (i == 2) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = android.graphics.Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public final void q(int i) {
        android.graphics.Paint.Join join;
        android.graphics.Paint paint = this.a;
        paint.getClass();
        if (i == 0) {
            join = android.graphics.Paint.Join.MITER;
        } else if (i == 2) {
            join = android.graphics.Paint.Join.BEVEL;
        } else {
            join = i == 1 ? android.graphics.Paint.Join.ROUND : android.graphics.Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public final void r(float f) {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        paint.setStrokeMiter(f);
    }

    public final void s(float f) {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        paint.setStrokeWidth(f);
    }

    public final void t(int i) {
        android.graphics.Paint paint = this.a;
        paint.getClass();
        paint.setStyle(i == 1 ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }
}
