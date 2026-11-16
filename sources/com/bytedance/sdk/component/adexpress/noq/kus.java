package com.bytedance.sdk.component.adexpress.noq;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kus extends FrameLayout {
    private ImageView ahm;
    private boolean ct;
    private Context kgy;
    private ay rz;
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
        this.rz = new ay(this.kgy);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 40.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.rz, layoutParams);
        this.ahm = new ImageView(this.kgy);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 62.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 62.0f));
        layoutParams2.gravity = 16;
        this.ahm.setImageResource(com.bytedance.sdk.component.utils.ay.uq(this.kgy, "tt_splash_hand"));
        addView(this.ahm, layoutParams2);
    }

    private void uq() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ahm, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.noq.kus.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (kus.this.ct) {
                    kus.this.rz.kgy();
                }
                kus kusVar = kus.this;
                kusVar.ct = !kusVar.ct;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(kus.this.ahm, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                kus.this.ahm.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ahm, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.uq.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void ahm() {
        AnimatorSet animatorSet = this.uq;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ay ayVar = this.rz;
        if (ayVar != null) {
            ayVar.ahm();
        }
        ImageView imageView = this.ahm;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void kgy() {
        this.uq.start();
    }

    public kus(@NonNull Context context) {
        super(context);
        this.ct = true;
        this.kgy = context;
        this.uq = new AnimatorSet();
        rz();
        uq();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.kus.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kus.this.ahm.getLayoutParams();
                layoutParams.topMargin = (int) ((kus.this.rz.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.uq.yo.kgy(kus.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((kus.this.rz.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.uq.yo.kgy(kus.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.uq.yo.kgy(kus.this.getContext(), 5.0f) + ((-kus.this.rz.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.uq.yo.kgy(kus.this.getContext(), 5.0f) + ((-kus.this.rz.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                kus.this.ahm.setLayoutParams(layoutParams);
            }
        });
    }
}
