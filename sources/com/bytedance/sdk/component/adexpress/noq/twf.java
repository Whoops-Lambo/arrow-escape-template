package com.bytedance.sdk.component.adexpress.noq;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class twf extends FrameLayout {
    private ImageView ahm;
    private boolean ct;
    private Context kgy;
    private TextView noq;
    private uq rz;
    private AnimatorSet uq;

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
        this.rz = new uq(this.kgy);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 80.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 20.0f);
        int iKgy = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 20.0f);
        layoutParams.leftMargin = iKgy;
        layoutParams.setMarginStart(iKgy);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.rz, layoutParams);
        this.rz.kgy();
        this.ahm = new ImageView(this.kgy);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 80.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 80.0f));
        this.ahm.setImageResource(com.bytedance.sdk.component.utils.ay.uq(this.kgy, "tt_splash_hand"));
        addView(this.ahm, layoutParams2);
        TextView textView = new TextView(this.kgy);
        this.noq = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 10.0f);
        addView(this.noq, layoutParams3);
    }

    private void uq() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ahm, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.noq.twf.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                boolean z = twf.this.ct;
                twf twfVar = twf.this;
                if (z) {
                    twfVar.rz.kgy();
                    twf.this.rz.setAlpha(1.0f);
                } else {
                    twfVar.rz.ahm();
                    twf.this.rz.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                twf twfVar2 = twf.this;
                twfVar2.ct = !twfVar2.ct;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(twf.this.ahm, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                twf.this.ahm.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ahm, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.uq.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void ahm() {
        AnimatorSet animatorSet = this.uq;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        uq uqVar = this.rz;
        if (uqVar != null) {
            uqVar.ahm();
        }
    }

    public void kgy() {
        this.uq.start();
    }

    public void setGuideText(String str) {
        this.noq.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.noq.setTextColor(i);
    }

    public twf(@NonNull Context context) {
        super(context);
        this.ct = true;
        this.kgy = context;
        this.uq = new AnimatorSet();
        rz();
        uq();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.twf.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) twf.this.ahm.getLayoutParams();
                layoutParams.topMargin = ((int) ((twf.this.rz.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.uq.yo.kgy(twf.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(twf.this.kgy, 20.0f));
                layoutParams.leftMargin = ((int) ((twf.this.rz.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.uq.yo.kgy(twf.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(twf.this.kgy, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.uq.yo.kgy(twf.this.getContext(), 5.0f) + ((-twf.this.rz.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.uq.yo.kgy(twf.this.getContext(), 5.0f) + ((-twf.this.rz.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                twf.this.ahm.setLayoutParams(layoutParams);
            }
        });
    }
}
