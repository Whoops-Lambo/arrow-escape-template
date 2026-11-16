package com.bytedance.sdk.openadsdk.core.at.ahm.yo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy extends com.bytedance.adsdk.ugeno.ra.ahm.kgy {
    private final com.bytedance.adsdk.ugeno.ra.ahm.kgy ahm;
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

    public com.bytedance.adsdk.ugeno.ra.ahm.kgy getMarkView() {
        return this.ahm;
    }

    public com.bytedance.adsdk.ugeno.ra.ahm.kgy getVideoView() {
        return this.kgy;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.ahm.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.ahm.setOnTouchListener(onTouchListener);
    }

    public kgy(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.ra.ahm.kgy kgyVar = new com.bytedance.adsdk.ugeno.ra.ahm.kgy(context);
        this.kgy = kgyVar;
        addView(kgyVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.ra.ahm.kgy kgyVar2 = new com.bytedance.adsdk.ugeno.ra.ahm.kgy(context);
        this.ahm = kgyVar2;
        kgyVar2.setBackgroundColor(0);
        addView(kgyVar2, new FrameLayout.LayoutParams(-1, -1));
    }
}
