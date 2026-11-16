package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class yo extends com.bytedance.sdk.openadsdk.core.ct.uq {
    private int ahm;
    private float kgy;

    @Override // com.bytedance.sdk.openadsdk.core.ct.uq, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.ct.uq, android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static com.bytedance.sdk.openadsdk.core.ct.uq ahm(Context context) {
        return new yo(context, 28, 5.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ct.uq, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iAhm = gbb.ahm(getContext(), this.ahm);
            layoutParams.width = iAhm;
            layoutParams.height = iAhm;
        }
        super.setLayoutParams(layoutParams);
    }

    public yo(Context context) {
        super(context);
        this.kgy = 2.25f;
        this.ahm = 12;
        kgy();
    }

    private void kgy() {
        setBackground(uq.kgy());
        setImageResource(ay.uq(getContext(), "tt_close_btn"));
        int iAhm = gbb.ahm(getContext(), this.kgy);
        setPadding(iAhm, iAhm, iAhm, iAhm);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public yo(Context context, int i, float f) {
        super(context);
        this.kgy = f;
        this.ahm = i;
        kgy();
    }

    public static com.bytedance.sdk.openadsdk.core.ct.uq kgy(Context context) {
        return new yo(context);
    }

    public static com.bytedance.sdk.openadsdk.core.ct.uq kgy(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return null;
        }
        yo yoVar = new yo(context, 28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        yoVar.setImageResource(ay.uq(context, "tt_ad_close_backup"));
        yoVar.setVisibility(8);
        viewGroup.addView(yoVar);
        return yoVar;
    }
}
