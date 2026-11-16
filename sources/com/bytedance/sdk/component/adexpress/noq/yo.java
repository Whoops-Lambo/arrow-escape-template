package com.bytedance.sdk.component.adexpress.noq;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class yo extends gm {
    private View ahm;
    private TextView kgy;
    private AnimatorSet rz;

    @Override // com.bytedance.sdk.component.adexpress.noq.gm, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.gm, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void uq() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ahm, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.uq.yo.kgy(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ahm, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.rz.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.rz.setDuration(1000L);
        this.rz.start();
    }

    public void setButtonText(String str) {
        if (this.kgy == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.kgy.setText(str);
    }

    public yo(Context context) {
        super(context);
        this.rz = new AnimatorSet();
        ahm(context);
    }

    private void ahm(Context context) {
        View viewKgy = com.bytedance.sdk.component.adexpress.rz.kgy.kgy(context);
        this.ahm = viewKgy;
        addView(viewKgy);
        setClipChildren(false);
        this.kgy = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.gm
    public void kgy() {
        uq();
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.gm
    public void kgy(Context context) {
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.gm
    public void ahm() {
        this.rz.cancel();
    }
}
