package com.bytedance.sdk.openadsdk.core.at.ahm.rz;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ahm.noq;
import com.bytedance.adsdk.ugeno.ct;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm extends noq {
    private ct kgy;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void kgy(ct ctVar) {
        this.kgy = ctVar;
    }

    public ahm(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ahm.noq, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.yo();
        }
    }

    @Override // com.bytedance.adsdk.ahm.noq, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.fi();
        }
    }
}
