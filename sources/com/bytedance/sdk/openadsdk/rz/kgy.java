package com.bytedance.sdk.openadsdk.rz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy extends com.bytedance.sdk.openadsdk.core.ct.fi {
    private float ahm;
    private Paint kgy;
    private boolean rz;
    private int uq;

    @Override // com.bytedance.sdk.openadsdk.core.ct.fi, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void setMinTextSize(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.ahm = f;
    }

    private void kgy(String str, int i) {
        if (!this.rz && i > 0) {
            float textSize = getTextSize();
            this.kgy.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float fKgy = kgy(textSize, str);
            while (fKgy > paddingLeft) {
                textSize -= 1.0f;
                this.kgy.setTextSize(textSize);
                if (textSize <= this.ahm) {
                    break;
                } else {
                    fKgy = kgy(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.rz = true;
        }
    }

    public kgy(Context context) {
        super(context);
        kgy();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kgy(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.ct.fi, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.uq = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.uq);
        } else {
            layoutParams.height = this.uq;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ct.fi, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.uq;
        if (i != 0 && layoutParams != null) {
            layoutParams.height = i;
        }
    }

    private void kgy() {
        this.ahm = gbb.kgy(getContext(), 8.0f);
        this.kgy = new Paint();
    }

    private float kgy(float f, String str) {
        this.kgy.setTextSize(f);
        return this.kgy.measureText(str);
    }
}
