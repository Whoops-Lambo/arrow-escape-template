package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"AppCompatCustomView"})
public class vs extends com.bytedance.sdk.openadsdk.core.ct.uq {
    private RectF ahm;
    private Paint kgy;

    @Override // com.bytedance.sdk.openadsdk.core.ct.uq, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    private void kgy() {
        Paint paint = new Paint();
        this.kgy = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.kgy.setColor(Color.parseColor("#99333333"));
        this.kgy.setAntiAlias(true);
        this.kgy.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.ahm = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.ahm;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.kgy);
        super.onDraw(canvas);
    }

    public vs(Context context) {
        super(context);
        kgy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ct.uq, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ahm.right == getMeasuredWidth() && this.ahm.bottom == getMeasuredHeight()) {
            return;
        }
        this.ahm.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight());
    }
}
