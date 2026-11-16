package com.bytedance.sdk.component.adexpress.noq;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class xh extends View {
    private float ahm;
    private Paint ct;
    private float fi;
    private Animator.AnimatorListener gf;
    private float kgy;
    private long noq;
    private int ra;
    private ValueAnimator rz;
    private ValueAnimator uq;
    private float yo;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void ahm() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fi);
        this.rz = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.noq);
        this.rz.setInterpolator(new LinearInterpolator());
        this.rz.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.noq.xh.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                xh.this.yo = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh.this.invalidate();
            }
        });
        this.rz.start();
    }

    public void kgy() {
        Paint paint = new Paint(1);
        this.ct = paint;
        paint.setStyle(Paint.Style.FILL);
        this.ct.setColor(this.ra);
    }

    public void rz() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.fi, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.uq = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.noq);
        this.uq.setInterpolator(new LinearInterpolator());
        this.uq.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.noq.xh.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                xh.this.yo = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.gf;
        if (animatorListener != null) {
            this.uq.addListener(animatorListener);
        }
        this.uq.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.gf = animatorListener;
    }

    public xh(Context context, int i) {
        super(context);
        this.noq = 300L;
        this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ra = i;
        kgy();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.kgy, this.ahm, this.yo, this.ct);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.kgy = i / 2.0f;
        this.ahm = i2 / 2.0f;
        this.fi = (float) (Math.hypot(i, i2) / 2.0d);
    }
}
