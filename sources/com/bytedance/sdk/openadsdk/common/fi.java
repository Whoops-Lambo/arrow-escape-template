package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi extends Button {
    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void kgy() {
        setId(com.bytedance.sdk.openadsdk.utils.xh.af);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, gbb.ahm(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.nu.kgy(context, "tt_browser_download_selector"));
        setText(com.bytedance.sdk.component.utils.ay.kgy(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }

    public fi(Context context) {
        super(context);
        kgy();
    }
}
