package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class pi1 extends Drawable implements TintAwareDrawable, ce2 {
    public static final Paint x;
    public oi1 a;
    public final ae2[] b;
    public final ae2[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public rd2 m;
    public final Paint n;
    public final Paint o;
    public final pd2 p;
    public final x41 q;
    public final td2 r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public int u;
    public final RectF v;
    public final boolean w;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    static {
        Paint paint = new Paint(1);
        x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void b(RectF rectF, Path path) {
        oi1 oi1Var = this.a;
        this.r.a(oi1Var.a, oi1Var.i, rectF, this.q, path);
        if (this.a.h != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.v, true);
    }

    public final int c(int i) {
        oi1 oi1Var = this.a;
        float f = oi1Var.m + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + oi1Var.l;
        zf0 zf0Var = oi1Var.b;
        return zf0Var != null ? zf0Var.a(f, i) : i;
    }

    public final void d(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("pi1", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.a.o;
        Path path = this.g;
        pd2 pd2Var = this.p;
        if (i != 0) {
            canvas.drawPath(path, pd2Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ae2 ae2Var = this.b[i2];
            int i3 = this.a.n;
            Matrix matrix = ae2.b;
            ae2Var.a(matrix, pd2Var, i3, canvas);
            this.c[i2].a(matrix, pd2Var, this.a.n, canvas);
        }
        if (this.w) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.a.o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.a.o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, x);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        Paint paint = this.n;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.a.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        Paint paint2 = this.o;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.a.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        Path path = this.g;
        if (z) {
            boolean zH = h();
            float strokeWidth = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f = -(zH ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            rd2 rd2Var = this.a.a;
            qd2 qd2VarE = rd2Var.e();
            py o4Var = rd2Var.e;
            if (!(o4Var instanceof g42)) {
                o4Var = new o4(f, o4Var);
            }
            qd2VarE.e = o4Var;
            py o4Var2 = rd2Var.f;
            if (!(o4Var2 instanceof g42)) {
                o4Var2 = new o4(f, o4Var2);
            }
            qd2VarE.f = o4Var2;
            py o4Var3 = rd2Var.h;
            if (!(o4Var3 instanceof g42)) {
                o4Var3 = new o4(f, o4Var3);
            }
            qd2VarE.h = o4Var3;
            py o4Var4 = rd2Var.g;
            if (!(o4Var4 instanceof g42)) {
                o4Var4 = new o4(f, o4Var4);
            }
            qd2VarE.g = o4Var4;
            rd2 rd2VarA = qd2VarE.a();
            this.m = rd2VarA;
            float f2 = this.a.i;
            RectF rectFG = g();
            RectF rectF = this.j;
            rectF.set(rectFG);
            if (h()) {
                strokeWidth = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(strokeWidth, strokeWidth);
            this.r.a(rd2VarA, f2, rectF, null, this.h);
            b(g(), path);
            this.e = false;
        }
        oi1 oi1Var = this.a;
        oi1Var.getClass();
        if (oi1Var.n > 0 && !this.a.a.d(g()) && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.a.o)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.a.o)));
            if (this.w) {
                RectF rectF2 = this.v;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    e32.i("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pv1.v(this.a.n, 2, (int) rectF2.width(), iWidth), pv1.v(this.a.n, 2, (int) rectF2.height(), iHeight), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.a.n) - iWidth;
                float f4 = (getBounds().top - this.a.n) - iHeight;
                canvas2.translate(-f3, -f4);
                d(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                d(canvas);
                canvas.restore();
            }
        }
        oi1 oi1Var2 = this.a;
        Paint.Style style = oi1Var2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, oi1Var2.a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void f(Canvas canvas) {
        rd2 rd2Var = this.m;
        RectF rectFG = g();
        RectF rectF = this.j;
        rectF.set(rectFG);
        boolean zH = h();
        Paint paint = this.o;
        float strokeWidth = zH ? paint.getStrokeWidth() / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.h, rd2Var, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.a.getClass();
        if (this.a.a.d(g())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(g()) * this.a.i);
            return;
        }
        RectF rectFG = g();
        Path path = this.g;
        b(rectFG, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            je0.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                ie0.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            ie0.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final boolean h() {
        Paint.Style style = this.a.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void i(Context context) {
        this.a.b = new zf0(context);
        n();
    }

    public final void j(float f) {
        oi1 oi1Var = this.a;
        if (oi1Var.m != f) {
            oi1Var.m = f;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        oi1 oi1Var = this.a;
        if (oi1Var.c != colorStateList) {
            oi1Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.t;
        oi1 oi1Var = this.a;
        ColorStateList colorStateList = oi1Var.e;
        PorterDuff.Mode mode = oi1Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.n.getColor();
            int iC = c(color);
            this.u = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.u = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.s = porterDuffColorFilter;
        this.a.getClass();
        this.t = null;
        this.a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.s) && Objects.equals(porterDuffColorFilter3, this.t)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new oi1(this.a);
        return this;
    }

    public final void n() {
        oi1 oi1Var = this.a;
        float f = oi1Var.m + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oi1Var.n = (int) Math.ceil(0.75f * f);
        this.a.o = (int) Math.ceil(f * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        oi1 oi1Var = this.a;
        if (oi1Var.k != i) {
            oi1Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.ce2
    public final void setShapeAppearanceModel(rd2 rd2Var) {
        this.a.a = rd2Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.e = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        oi1 oi1Var = this.a;
        if (oi1Var.f != mode) {
            oi1Var.f = mode;
            m();
            super.invalidateSelf();
        }
    }

    public pi1(oi1 oi1Var) {
        td2 td2Var;
        this.b = new ae2[4];
        this.c = new ae2[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new pd2();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            td2Var = sd2.a;
        } else {
            td2Var = new td2();
        }
        this.r = td2Var;
        this.v = new RectF();
        this.w = true;
        this.a = oi1Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.q = new x41(this, 6);
    }

    public final void e(Canvas canvas, Paint paint, Path path, rd2 rd2Var, RectF rectF) {
        if (rd2Var.d(rectF)) {
            float fA = rd2Var.f.a(rectF) * this.a.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.i;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.g;
        b(rectFG, path);
        Region region2 = this.l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.a.e;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.a.getClass();
                ColorStateList colorStateList2 = this.a.d;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.a.c;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean zL = l(iArr);
        boolean zM = m();
        if (!zL && !zM) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public pi1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(rd2.b(context, attributeSet, i, i2).a());
    }

    public pi1(rd2 rd2Var) {
        this(new oi1(rd2Var));
    }

    public pi1() {
        this(new rd2());
    }
}
