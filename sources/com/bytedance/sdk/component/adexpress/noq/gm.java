package com.bytedance.sdk.component.adexpress.noq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class gm extends RelativeLayout {
    private ImageView ahm;
    private TextView ct;
    private AnimatorSet fi;
    private AnimatorSet gf;
    private ImageView kgy;
    private AnimatorSet noq;
    private int nu;
    private String ra;
    private ImageView rz;
    private TextView uq;
    private AnimatorSet yo;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
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
            AnimatorSet animatorSet3 = this.yo;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.gf;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "aOIkkQaJefGJT8A=", "WO8jlgawWsuJTtJonDCuIVbvOZoR", 178);
            e.getMessage();
        }
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.noq;
    }

    public void kgy(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.uq.kgy();
        }
        if ("5".equals(this.ra)) {
            addView(com.bytedance.sdk.component.adexpress.rz.kgy.noq(context));
            this.nu = (int) (((double) this.nu) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.rz.kgy.ct(context));
        }
        this.kgy = (ImageView) findViewById(2097610734);
        this.ahm = (ImageView) findViewById(2097610735);
        this.uq = (TextView) findViewById(2097610730);
        this.rz = (ImageView) findViewById(2097610733);
        this.ct = (TextView) findViewById(2097610731);
    }

    public void rz() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.kgy, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.kgy, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.kgy, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.uq.yo.kgy(getContext(), -this.nu));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(getContext(), this.nu));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.noq.gm.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (gm.this.rz != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) gm.this.rz.getLayoutParams();
                    layoutParams.height = num.intValue();
                    gm.this.rz.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.rz, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.rz, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.ahm, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.ahm, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.ahm, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.ahm, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.ahm, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.uq.yo.kgy(getContext(), -this.nu));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.yo.setDuration(50L);
        this.gf.setDuration(1500L);
        this.fi.setDuration(50L);
        this.yo.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.fi.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.gf.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.noq.playSequentially(this.fi, this.gf, this.yo);
    }

    public void setGuideText(String str) {
        TextView textView = this.uq;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.ct != null) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            TextView textView = this.ct;
            if (zIsEmpty) {
                textView.setText("");
            } else {
                textView.setText(str);
            }
        }
    }

    public gm(Context context, String str) {
        super(context);
        this.noq = new AnimatorSet();
        this.yo = new AnimatorSet();
        this.fi = new AnimatorSet();
        this.gf = new AnimatorSet();
        this.nu = 100;
        setClipChildren(false);
        this.ra = str;
        kgy(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ahm();
    }

    public gm(Context context) {
        super(context);
        this.noq = new AnimatorSet();
        this.yo = new AnimatorSet();
        this.fi = new AnimatorSet();
        this.gf = new AnimatorSet();
        this.nu = 100;
        kgy(context);
    }

    public void kgy() {
        rz();
        this.noq.start();
        this.noq.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.noq.gm.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                gm.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.gm.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.noq.start();
                    }
                }, 200L);
            }
        });
    }
}
