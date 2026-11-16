package com.bytedance.sdk.component.adexpress.noq;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ct extends FrameLayout {
    private AnimatorSet ahm;
    private ImageView kgy;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void rz() {
        ImageView imageView = new ImageView(getContext());
        this.kgy = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.ay.uq(getContext(), "tt_white_hand"));
        int iKgy = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iKgy, iKgy);
        layoutParams.gravity = 17;
        addView(this.kgy, layoutParams);
    }

    private void uq() {
        this.ahm = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.kgy, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.kgy, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.ahm.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void ahm() {
        AnimatorSet animatorSet = this.ahm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void kgy() {
        AnimatorSet animatorSet = this.ahm;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public ct(Context context) {
        super(context);
        rz();
        uq();
    }
}
