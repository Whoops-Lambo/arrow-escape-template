package com.bytedance.sdk.openadsdk.core.at.ahm.uq;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy extends com.bytedance.adsdk.ugeno.ra.ahm.kgy {
    private final com.bytedance.adsdk.ugeno.ra.ahm.kgy kgy;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.ugeno.ra.ahm.kgy, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public com.bytedance.adsdk.ugeno.ra.ahm.kgy getPlayableView() {
        return this.kgy;
    }

    public kgy(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.ra.ahm.kgy kgyVar = new com.bytedance.adsdk.ugeno.ra.ahm.kgy(context);
        this.kgy = kgyVar;
        addView(kgyVar, new FrameLayout.LayoutParams(-1, -1));
    }
}
