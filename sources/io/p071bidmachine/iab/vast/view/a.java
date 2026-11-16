package io.p071bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.iab.utils.p;
import io.p071bidmachine.iab.utils.q;
import io.p071bidmachine.iab.utils.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends View implements p {
    public Bitmap a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public final float f;
    public final RectF g;
    public final RectF h;
    public float i;
    public float j;
    public float k;
    public Paint l;
    public Paint m;
    public Rect n;
    public RectF o;
    public Paint p;
    public Paint q;
    public float r;
    public int s;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final float a(float f, boolean z) {
        float fWidth = this.g.width();
        if (z) {
            fWidth -= this.k * 2.0f;
        }
        float fSqrt = (float) (Math.sqrt(2.0d) * ((double) (fWidth / 2.0f)));
        return fSqrt - ((f * fSqrt) * 2.0f);
    }

    public final void c(float f, int i) {
        if (this.a == null || f == 100.0f) {
            this.r = f;
            this.s = i;
            postInvalidate();
        }
    }

    public int getAccentColor() {
        return this.c;
    }

    public int getBackgroundColor() {
        return this.d;
    }

    public void setImage(@Nullable Bitmap bitmap) {
        this.a = bitmap;
        if (bitmap != null) {
            this.r = 100.0f;
        }
        postInvalidate();
    }

    @Override // io.p071bidmachine.iab.utils.p
    public void setStyle(@NonNull q qVar) {
        Integer num = qVar.v;
        if (num == null) {
            num = 0;
        }
        this.b = num.intValue();
        Integer numValueOf = qVar.a;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(io.p071bidmachine.iab.utils.a.a);
        }
        this.c = numValueOf.intValue();
        this.d = qVar.f().intValue();
        Boolean bool = qVar.c;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.e = bool.booleanValue();
        this.k = qVar.k(getContext()).floatValue();
        setPadding(qVar.h(getContext()).intValue(), qVar.j(getContext()).intValue(), qVar.i(getContext()).intValue(), qVar.g(getContext()).intValue());
        Float fValueOf = qVar.h;
        if (fValueOf == null) {
            fValueOf = Float.valueOf(1.0f);
        }
        setAlpha(fValueOf.floatValue());
        b();
        postInvalidate();
    }

    public a(Context context) {
        super(context);
        this.c = io.p071bidmachine.iab.utils.a.a;
        this.d = io.p071bidmachine.iab.utils.a.b;
        this.e = false;
        this.f = 0.071428575f;
        this.g = new RectF();
        this.h = new RectF();
        this.i = 54.0f;
        this.j = 54.0f;
        this.k = 5.0f;
        this.r = 100.0f;
        setLayerType(1, null);
        this.k = y.c(context, 3.0f);
    }

    public final void b() {
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f = fMin / 2.0f;
        float width = (getWidth() / 2.0f) - f;
        float height = (getHeight() / 2.0f) - f;
        RectF rectF = this.g;
        rectF.set(width, height, width + fMin, fMin + height);
        this.i = rectF.centerX();
        this.j = rectF.centerY();
        float f2 = rectF.left;
        float f3 = this.k / 2.0f;
        this.h.set(f2 + f3, rectF.top + f3, rectF.right - f3, rectF.bottom - f3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            if (this.s != 0 || this.a != null) {
                if (this.l == null) {
                    this.l = new Paint(1);
                }
                float f = 360.0f - ((this.r * 360.0f) * 0.01f);
                this.l.setColor(this.d);
                Paint paint = this.l;
                Paint.Style style = Paint.Style.FILL;
                paint.setStyle(style);
                canvas.drawArc(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, false, this.l);
                this.l.setColor(this.c);
                Paint paint2 = this.l;
                Paint.Style style2 = Paint.Style.STROKE;
                paint2.setStyle(style2);
                this.l.setStrokeWidth(this.k);
                Paint paint3 = this.l;
                RectF rectF = this.h;
                canvas.drawArc(rectF, 270.0f, f, false, paint3);
                Bitmap bitmap = this.a;
                if (bitmap != null) {
                    if (this.p == null) {
                        Paint paint4 = new Paint(7);
                        this.p = paint4;
                        paint4.setStyle(style);
                        this.p.setAntiAlias(true);
                    }
                    if (this.n == null) {
                        this.n = new Rect();
                    }
                    if (this.o == null) {
                        this.o = new RectF();
                    }
                    float fA = a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e);
                    float f2 = fA / 2.0f;
                    float f3 = this.i - f2;
                    float f4 = this.j - f2;
                    this.n.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    this.o.set(f3, f4, f3 + fA, fA + f4);
                    this.p.setColorFilter(new PorterDuffColorFilter(this.c, PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, this.n, this.o, this.p);
                    if (this.e) {
                        if (this.q == null) {
                            Paint paint5 = new Paint(1);
                            this.q = paint5;
                            paint5.setStyle(style2);
                        }
                        this.q.setStrokeWidth(this.k);
                        this.q.setColor(this.c);
                        canvas.drawArc(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, false, this.q);
                        return;
                    }
                    return;
                }
                if (this.m == null) {
                    Paint paint6 = new Paint(1);
                    this.m = paint6;
                    paint6.setAntiAlias(true);
                    this.m.setStyle(style);
                    this.m.setTextAlign(Paint.Align.CENTER);
                }
                String strValueOf = String.valueOf(this.s);
                this.m.setColor(this.c);
                this.m.setTypeface(Typeface.create(Typeface.DEFAULT, this.b));
                this.m.setTextSize(a(this.f, true));
                canvas.drawText(strValueOf, this.i, this.j - ((this.m.ascent() + this.m.descent()) / 2.0f), this.m);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }
}
