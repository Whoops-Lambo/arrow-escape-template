package com.bytedance.sdk.component.adexpress.noq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class sx extends FrameLayout {
    private ImageView ahm;
    private TextView ct;
    private AnimatorSet fi;
    private AnimatorSet gf;
    private Context kgy;
    private AnimatorSet noq;
    private ImageView rz;
    private ImageView uq;
    private AnimatorSet yo;

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
        ImageView imageView = new ImageView(this.kgy);
        this.uq = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.ay.uq(this.kgy, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 30.0f);
        addView(this.uq, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.kgy);
        this.rz = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.ay.uq(this.kgy, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 50.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 30.0f);
        addView(this.rz, layoutParams2);
        ImageView imageView3 = new ImageView(this.kgy);
        this.ahm = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.ay.uq(this.kgy, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 80.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 30.0f);
        addView(this.ahm, layoutParams3);
        TextView textView = new TextView(this.kgy);
        this.ct = textView;
        textView.setTextColor(-1);
        this.ct.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.ct, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.sx.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) sx.this.ahm.getLayoutParams();
                layoutParams5.topMargin = (int) ((sx.this.rz.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.uq.yo.kgy(sx.this.getContext(), 7.0f));
                int iKgy = (-sx.this.rz.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(sx.this.kgy, 30.0f));
                layoutParams5.leftMargin = iKgy;
                layoutParams5.setMarginStart(iKgy);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                sx.this.ahm.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) sx.this.uq.getLayoutParams();
                layoutParams6.topMargin = (int) ((sx.this.rz.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.uq.yo.kgy(sx.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((sx.this.rz.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(sx.this.kgy, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                sx.this.uq.setLayoutParams(layoutParams6);
            }
        });
    }

    private void uq() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ahm, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.rz, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.rz, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.uq, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.fi.setDuration(300L);
        this.fi.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.ahm, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.uq.yo.kgy(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.noq.sx.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sx.this.uq.getLayoutParams();
                layoutParams.width = num.intValue();
                sx.this.uq.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.rz, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.uq.yo.kgy(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.gf.setDuration(1500L);
        this.gf.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.ahm, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.uq, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.rz, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.yo.setDuration(50L);
        this.yo.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.noq.playSequentially(this.fi, this.gf, this.yo);
    }

    public void ahm() {
        try {
            AnimatorSet animatorSet = this.noq;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.fi;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.gf;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.yo;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "aOIkkQaOYMCIXuFUiQY=", "WO8jlgawSMmJR9ZJhR6u", 189);
        }
    }

    public void setGuideText(String str) {
        this.ct.setText(str);
    }

    public sx(@NonNull Context context) {
        super(context);
        this.noq = new AnimatorSet();
        this.yo = new AnimatorSet();
        this.fi = new AnimatorSet();
        this.gf = new AnimatorSet();
        this.kgy = context;
        rz();
    }

    public void kgy() {
        uq();
        this.noq.start();
        this.noq.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.noq.sx.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                sx.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.sx.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        sx.this.noq.start();
                    }
                }, 200L);
            }
        });
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
