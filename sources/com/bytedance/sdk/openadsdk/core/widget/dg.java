package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class dg extends com.bytedance.sdk.openadsdk.core.ct.fi {
    private RectF ahm;
    private Paint kgy;
    private int rz;

    private void kgy() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.kgy = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.kgy.setColor(Color.parseColor("#99333333"));
        this.kgy.setAntiAlias(true);
        this.kgy.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.ahm = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ct.fi, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.ahm;
        float f = rectF.bottom;
        canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.kgy);
        canvas.translate((this.ahm.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        super.onDraw(canvas);
    }

    public dg(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rz = 0;
        kgy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ct.fi, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int iMeasureText = (int) getPaint().measureText("00");
            this.rz = iMeasureText;
            if (measuredWidth < iMeasureText) {
                measuredWidth = iMeasureText;
            }
            int iE = jc1.e(measuredHeight, 2, 2, measuredWidth);
            setMeasuredDimension(iE, measuredHeight);
            this.ahm.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iE, measuredHeight);
            return;
        }
        this.ahm.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public dg(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public dg(Context context) {
        this(context, null);
    }
}
