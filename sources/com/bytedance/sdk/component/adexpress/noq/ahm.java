package com.bytedance.sdk.component.adexpress.noq;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm extends FrameLayout {
    private ObjectAnimator ahm;
    private View ct;
    private int fi;
    private int gf;
    private AnimatorSet kgy;
    private View noq;
    private Context ra;
    private boolean rz;
    private View uq;
    private ImageView yo;

    private GradientDrawable kgy(String str, String str2) {
        GradientDrawable gradientDrawableB = q63.b(1);
        gradientDrawableB.setColor(Color.parseColor(str));
        gradientDrawableB.setStroke(1, Color.parseColor(str2));
        return gradientDrawableB;
    }

    public void ahm() {
        this.rz = true;
        ObjectAnimator objectAnimator = this.ahm;
        if (objectAnimator == null || this.kgy == null) {
            return;
        }
        objectAnimator.cancel();
        this.kgy.cancel();
    }

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
        View view = new View(this.ra);
        this.uq = view;
        view.setBackground(kgy("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.fi) * 0.45d), (int) (((double) this.gf) * 0.45d));
        layoutParams.gravity = 17;
        this.uq.setLayoutParams(layoutParams);
        addView(this.uq);
        View view2 = new View(this.ra);
        this.ct = view2;
        view2.setBackground(kgy("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.fi) * 0.25d), (int) (((double) this.gf) * 0.25d));
        layoutParams2.gravity = 17;
        this.ct.setLayoutParams(layoutParams2);
        addView(this.ct);
        View view3 = new View(this.ra);
        this.noq = view3;
        view3.setBackground(kgy("#807BBEFF", "#FF7BBEFF"));
        int i = this.fi;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i) * 0.25d), (int) (((double) i) * 0.25d));
        layoutParams3.gravity = 17;
        this.noq.setLayoutParams(layoutParams3);
        addView(this.noq);
        ImageView imageView = new ImageView(this.ra);
        this.yo = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.ay.uq(getContext(), "tt_blue_hand"));
        this.yo.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.fi) * 0.62d), (int) (((double) this.gf) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.yo.setLayoutParams(layoutParams4);
        addView(this.yo);
    }

    private void uq() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.uq, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.uq, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.ct, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.ct, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.noq, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.noq, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.yo, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.ahm = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.kgy.setDuration(1500L);
        this.kgy.setInterpolator(new AccelerateDecelerateInterpolator());
        this.kgy.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.kgy.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.noq.ahm.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ahm.this.rz = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ahm.this.rz) {
                    return;
                }
                ahm.this.ahm.start();
                ahm.this.kgy.start();
            }
        });
    }

    public ahm(Context context, int i, int i2) {
        super(context);
        this.rz = false;
        this.kgy = new AnimatorSet();
        this.fi = i;
        this.gf = i2;
        this.ra = context;
        rz();
        uq();
    }

    public void kgy() {
        this.rz = false;
        ObjectAnimator objectAnimator = this.ahm;
        if (objectAnimator == null || this.kgy == null) {
            return;
        }
        objectAnimator.start();
        this.kgy.start();
    }
}
