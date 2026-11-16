package com.bytedance.sdk.openadsdk.core.at.ahm.ct;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.ct;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy extends View {
    private Paint ahm;
    private ValueAnimator at;
    private int ct;
    private boolean dg;
    private int fi;
    private int gf;
    private Paint kgy;
    private float kus;
    private float noq;
    private ct nu;
    private String ra;
    private RectF rz;
    private int twf;
    private int uq;
    private String vs;
    private long xh;
    private float yo;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    private void ahm(Canvas canvas) {
        Paint paint = this.kgy;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f = this.noq;
        float f2 = this.yo;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f, f2, f2, this.kgy);
        float width2 = (getWidth() * this.kus) / this.gf;
        this.ahm.setStyle(style);
        if (!TextUtils.equals(this.ra, "line_reverse")) {
            float f3 = this.noq;
            float f4 = this.yo;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, f3, f4, f4, this.ahm);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f5 = this.noq;
            float f6 = this.yo;
            canvas.drawRoundRect(width3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width4, f5, f6, f6, this.ahm);
        }
    }

    private void kgy(Canvas canvas) {
        float f;
        int i;
        float f2 = this.noq / 2.0f;
        this.rz.set(f2, f2, getWidth() - f2, getHeight() - f2);
        Paint paint = this.kgy;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.kgy.setStrokeWidth(this.noq);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f2, this.kgy);
        boolean zEquals = TextUtils.equals(this.ra, "ring_reverse");
        float f3 = this.kus;
        if (zEquals) {
            f = f3 * (-360.0f);
            i = this.gf;
        } else {
            f = f3 * 360.0f;
            i = this.gf;
        }
        float f4 = f / i;
        this.ahm.setStyle(style);
        this.ahm.setStrokeWidth(this.noq);
        float f5 = this.yo;
        Paint paint2 = this.ahm;
        if (f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            paint2.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            paint2.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.rz, -90.0f, f4, false, this.ahm);
    }

    private TimeInterpolator rz() {
        return TextUtils.equals("ease-out", this.vs) ? new TimeInterpolator() { // from class: com.bytedance.sdk.openadsdk.core.at.ahm.ct.kgy.2
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) Math.pow(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f)), 0.3d);
            }
        } : new LinearInterpolator();
    }

    public int getMaxProgress() {
        return this.gf;
    }

    public int getProgress() {
        return this.fi;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ct ctVar = this.nu;
        if (ctVar != null) {
            int[] iArrKgy = ctVar.kgy(i, i2);
            super.onMeasure(iArrKgy[0], iArrKgy[1]);
        } else {
            super.onMeasure(i, i2);
        }
        if (TextUtils.equals(this.ra, "ring") || TextUtils.equals(this.ra, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.noq);
        }
        ct ctVar2 = this.nu;
        if (ctVar2 != null) {
            ctVar2.ct();
        }
    }

    public void setAnimationDuration(int i) {
        this.twf = i;
        this.at.setDuration(i);
    }

    public void setMaxProgress(int i) {
        this.gf = i;
        invalidate();
    }

    public void setProgress(int i) {
        int iMin = Math.min(i, this.gf);
        this.fi = iMin;
        if (iMin < 0) {
            this.fi = 0;
        }
        this.dg = false;
        this.xh = 0L;
        ValueAnimator valueAnimator = this.at;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.at.setDuration(this.twf);
            this.at.setFloatValues(this.kus, this.fi);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.kus + " progress=" + i);
            this.at.start();
        }
    }

    public kgy(Context context) {
        super(context);
        this.uq = com.bytedance.adsdk.ugeno.fi.kgy.kgy("#FFD813");
        this.ct = com.bytedance.adsdk.ugeno.fi.kgy.kgy("rgba(0, 0, 0, 0.5)");
        this.noq = 3.0f;
        this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.fi = 0;
        this.gf = 100;
        this.ra = "line";
        this.twf = 1000;
        this.vs = "linear";
        setBackgroundColor(0);
        ahm();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.at;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!TextUtils.equals(this.ra, "ring") && !TextUtils.equals(this.ra, "ring_reverse")) {
            ahm(canvas);
        } else {
            kgy(canvas);
        }
    }

    private void ahm() {
        Paint paint = new Paint(1);
        this.kgy = paint;
        paint.setColor(this.ct);
        Paint paint2 = this.kgy;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.ahm = paint3;
        paint3.setColor(this.uq);
        this.ahm.setStyle(style);
        this.rz = new RectF();
        this.kus = this.fi;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.at = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.twf);
        this.at.setInterpolator(rz());
        this.at.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.at.ahm.ct.kgy.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                kgy.this.kus = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kgy.this.invalidate();
            }
        });
    }

    public kgy ahm(int i) {
        this.kgy.setColor(i);
        return this;
    }

    public kgy ahm(float f) {
        this.yo = f;
        return this;
    }

    public kgy ahm(String str) {
        this.vs = TextUtils.equals("ease-out", str) ? "ease-out" : "linear";
        this.at.setInterpolator(rz());
        return this;
    }

    public kgy kgy(int i) {
        this.ahm.setColor(i);
        return this;
    }

    public kgy kgy(float f) {
        this.noq = f;
        invalidate();
        return this;
    }

    public kgy kgy(String str) {
        this.ra = str;
        return this;
    }

    public void kgy(ct ctVar) {
        this.nu = ctVar;
    }

    public void kgy() {
        ValueAnimator valueAnimator = this.at;
        if (valueAnimator == null || !valueAnimator.isStarted() || this.dg) {
            return;
        }
        this.xh = this.at.getCurrentPlayTime();
        this.dg = true;
        this.at.pause();
    }
}
