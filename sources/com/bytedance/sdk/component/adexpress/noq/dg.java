package com.bytedance.sdk.component.adexpress.noq;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class dg extends View {
    private Paint ahm;
    private ValueAnimator ct;
    private Context kgy;
    private int noq;
    private RectF rz;
    private float uq;
    private boolean yo;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void kgy() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
        this.ct = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.noq);
        this.ct.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.noq.dg.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                dg.this.uq = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg.this.requestLayout();
            }
        });
        this.ct.start();
    }

    public void rz() {
        this.yo = true;
        invalidate();
    }

    public void ahm() {
        ValueAnimator valueAnimator = this.ct;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setDuration(int i) {
        this.noq = i;
    }

    public dg(Context context) {
        super(context);
        this.noq = 1500;
        this.kgy = context;
        Paint paint = new Paint();
        this.ahm = paint;
        paint.setAntiAlias(true);
        this.ahm.setStyle(Paint.Style.STROKE);
        this.ahm.setStrokeWidth(10.0f);
        this.ahm.setColor(Color.parseColor("#80FFFFFF"));
        this.rz = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.yo) {
            return;
        }
        canvas.drawArc(this.rz, 270.0f, this.uq, false, this.ahm);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.rz.set(5.0f, 5.0f, i - 5, i2 - 5);
    }
}
