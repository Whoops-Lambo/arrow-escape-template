package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class sx extends yo implements com.bytedance.sdk.component.adexpress.dynamic.rz {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz
    public void kgy(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (i != 0) {
            ((TextView) this.vs).setText(" | ".concat(String.format(com.bytedance.sdk.component.utils.ay.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), "tt_reward_full_skip_count_down"), Integer.valueOf(i))));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct
    public void noq() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.yo, this.fi);
        int i = this.gf;
        layoutParams.leftMargin = i;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public sx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        super(context, dynamicRootView, fiVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.vs).getText())) {
            setMeasuredDimension(0, this.fi);
        }
    }
}
