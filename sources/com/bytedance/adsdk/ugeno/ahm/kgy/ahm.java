package com.bytedance.adsdk.ugeno.ahm.kgy;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class ahm extends Drawable {
    private final float ahm;
    private final float at;
    private LinearGradient ay;
    private LinearGradient bmz;
    private final int[] ct;
    private final RectF dg;
    private final int fi;
    private final Path fpp;
    private ValueAnimator fpz;
    private Paint ft;
    private final int gf;
    private final Paint gm;
    private LinearGradient ikw;
    private LinearGradient ioy;
    private boolean jpc;
    private final Drawable kgy;
    private final int[] kus;
    private float lqi;
    private float muf;
    private boolean mw = true;
    private final float[] noq;
    private final float nu;
    private final boolean ra;
    private final float[] rz;
    private final Matrix sx;
    private final int twf;
    private PorterDuffXfermode uf;
    private final RectF um;
    private final boolean uq;
    private LinearGradient uxe;
    private LinearGradient vg;
    private Bitmap vrj;
    private final float[] vs;
    private Paint wy;
    private final Path xh;
    private final boolean yo;

    public ahm(Drawable drawable, int[] iArr, float[] fArr, float f, float[] fArr2, boolean z, int i, int i2, boolean z2, float f2, float f3, int i3, int[] iArr2, float[] fArr3) {
        this.kgy = drawable;
        this.ahm = f;
        this.rz = fArr2;
        this.uq = (iArr == null || fArr == null) ? false : true;
        this.ct = iArr;
        this.noq = fArr;
        this.yo = z;
        this.fi = i <= 0 ? 2200 : i;
        this.gf = i2;
        this.ra = z2;
        this.nu = f2;
        this.at = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f3));
        this.twf = Math.max(2, Math.min(i3, 50));
        this.kus = iArr2;
        this.vs = fArr3;
        this.dg = new RectF();
        this.xh = new Path();
        this.um = new RectF();
        this.fpp = new Path();
        this.sx = new Matrix();
        Paint paint = new Paint(1);
        this.gm = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        if (z2) {
            Paint paint2 = new Paint(1);
            this.ft = paint2;
            Paint.Style style = Paint.Style.FILL;
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.wy = paint3;
            paint3.setStyle(style);
            this.uf = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        }
    }

    public void ahm() {
        this.jpc = false;
        ValueAnimator valueAnimator = this.fpz;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.fpz = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void kgy(Canvas canvas) {
        Bitmap bitmap;
        RectF rectF = this.um;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = this.muf;
        int i = (int) (f3 - f);
        int i2 = (int) (f4 - f2);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.yo) {
            canvas.save();
            canvas.clipPath(this.fpp);
            canvas.saveLayer(f, f2, f3, f4, null);
            kgy(canvas, f, f2, f3, f4, f5);
            this.ft.setAlpha((int) (this.at * 255.0f));
            this.ft.setXfermode(this.uf);
            canvas.drawRect(f, f2, f3, f4, this.ft);
            this.ft.setXfermode(null);
            canvas.restore();
            canvas.restore();
            return;
        }
        if (this.mw || (bitmap = this.vrj) == null || bitmap.getWidth() < i || this.vrj.getHeight() < i2) {
            Bitmap bitmap2 = this.vrj;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.vrj = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.vrj);
            canvas2.translate(-f, -f2);
            canvas2.save();
            canvas2.clipPath(this.fpp);
            canvas2.saveLayer(f, f2, f3, f4, null);
            kgy(canvas2, f, f2, f3, f4, f5);
            f = f;
            f2 = f2;
            this.ft.setAlpha((int) (this.at * 255.0f));
            this.ft.setXfermode(this.uf);
            canvas2.drawRect(f, f2, f3, f4, this.ft);
            this.ft.setXfermode(null);
            canvas2.restore();
            canvas2.restore();
            this.mw = false;
        }
        canvas.drawBitmap(this.vrj, f, f2, (Paint) null);
    }

    private void uq() {
        RectF rectF = this.um;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        this.muf = Math.min(this.nu, Math.min(rectF.width(), this.um.height()) / 2.0f);
        int i = this.twf;
        int[] iArr = new int[i];
        float[] fArr = new float[i];
        int i2 = 0;
        while (true) {
            int i3 = this.twf;
            if (i2 >= i3) {
                float f5 = this.muf + f2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.vg = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, iArr, fArr, tileMode);
                this.bmz = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4 - this.muf, iArr, fArr, tileMode);
                this.ikw = new LinearGradient(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f + this.muf, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iArr, fArr, tileMode);
                this.uxe = new LinearGradient(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3 - this.muf, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iArr, fArr, tileMode);
                this.ft.setShader(this.ioy);
                return;
            }
            float f6 = i2 / (i3 - 1);
            fArr[i2] = f6;
            if (i2 == i3 - 1) {
                iArr[i2] = 16777215;
            } else {
                double d = f6;
                iArr[i2] = (((int) (Math.exp(((-4.0d) * d) * d) * 255.0d)) << 24) | 16777215;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.kgy.draw(canvas);
        if (this.ra && this.ioy != null) {
            kgy(canvas);
        }
        if (!this.uq || this.ay == null) {
            return;
        }
        canvas.drawPath(this.xh, this.gm);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.kgy.setAlpha(i);
        this.gm.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.kgy.setColorFilter(colorFilter);
    }

    private void ct() {
        ahm();
        this.jpc = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.lqi);
        this.fpz = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.fi);
        this.fpz.setInterpolator(new LinearInterpolator());
        int i = this.gf;
        ValueAnimator valueAnimator = this.fpz;
        if (i == -1) {
            valueAnimator.setRepeatCount(-1);
        } else {
            valueAnimator.setRepeatCount(Math.max(0, i - 1));
        }
        this.fpz.setRepeatMode(1);
        this.fpz.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ugeno.ahm.kgy.ahm.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ahm.this.sx.setTranslate(((Float) valueAnimator2.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (ahm.this.ay != null) {
                    ahm.this.ay.setLocalMatrix(ahm.this.sx);
                }
                if (ahm.this.ioy != null) {
                    ahm.this.ioy.setLocalMatrix(ahm.this.sx);
                }
                ahm.this.invalidateSelf();
            }
        });
        this.fpz.start();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.kgy.setBounds(rect);
        float f = this.ahm / 2.0f;
        this.dg.set(rect.left + f, rect.top + f, rect.right - f, rect.bottom - f);
        this.xh.reset();
        float[] fArr = this.rz;
        Path path = this.xh;
        if (fArr != null) {
            path.addRoundRect(this.dg, fArr, Path.Direction.CW);
        } else {
            path.addRect(this.dg, Path.Direction.CW);
        }
        this.um.set(rect.left, rect.top, rect.right, rect.bottom);
        this.fpp.reset();
        float[] fArr2 = this.rz;
        Path path2 = this.fpp;
        if (fArr2 != null) {
            path2.addRoundRect(this.um, fArr2, Path.Direction.CW);
        } else {
            path2.addRect(this.um, Path.Direction.CW);
        }
        this.lqi = this.dg.width();
        if (this.uq) {
            this.ay = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.lqi, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ct, this.noq, Shader.TileMode.REPEAT);
            this.sx.reset();
            this.gm.setShader(this.ay);
        }
        if (this.ra) {
            this.ioy = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.lqi, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.kus, this.vs, Shader.TileMode.REPEAT);
            uq();
            this.mw = true;
        }
        if (this.jpc) {
            ct();
        }
    }

    public boolean rz() {
        return this.yo;
    }

    private void kgy(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        this.wy.setShader(this.vg);
        canvas.drawRect(f, f2, f3, f2 + f5, this.wy);
        this.wy.setShader(this.bmz);
        canvas.drawRect(f, f4 - f5, f3, f4, this.wy);
        this.wy.setShader(this.ikw);
        canvas.drawRect(f, f2, f + f5, f4, this.wy);
        this.wy.setShader(this.uxe);
        canvas.drawRect(f3 - f5, f2, f3, f4, this.wy);
    }

    public void kgy() {
        if (this.yo) {
            this.jpc = true;
            if (this.lqi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (this.ay == null && this.ioy == null) {
                    return;
                }
                ct();
            }
        }
    }
}
