package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ra {
    private kgy ahm;
    private int ct;
    Paint kgy;
    private int noq;
    private AnimatorSet rz = new AnimatorSet();
    private View uq;
    private String yo;

    public void ahm() {
        AnimatorSet animatorSet = this.rz;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void kgy() {
        ArrayList arrayList = new ArrayList();
        List<kgy.C0190kgy> listRz = this.ahm.rz();
        if (listRz == null || listRz.size() <= 0) {
            return;
        }
        for (kgy.C0190kgy c0190kgy : listRz) {
            if (c0190kgy != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0190kgy.kgy());
                if (TextUtils.equals(c0190kgy.ct(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0190kgy.ct(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0190kgy.ct());
                }
                objectAnimator.setStartDelay(c0190kgy.uq());
                objectAnimator.setTarget(this.uq);
                if (TextUtils.equals(c0190kgy.ct(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0190kgy.noq(), (int) c0190kgy.yo());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0190kgy.noq() + "; to=" + c0190kgy.yo());
                } else {
                    objectAnimator.setFloatValues(c0190kgy.noq(), c0190kgy.yo());
                }
                int iAhm = (int) this.ahm.ahm();
                if (iAhm != 0) {
                    objectAnimator.setRepeatCount(iAhm);
                } else {
                    objectAnimator.setRepeatCount((int) c0190kgy.ahm());
                }
                if (TextUtils.equals(c0190kgy.ct(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strNoq = this.ahm.noq();
                if (TextUtils.isEmpty(strNoq)) {
                    strNoq = c0190kgy.rz();
                }
                if (TextUtils.equals(strNoq, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0190kgy.fi() != null && c0190kgy.fi().length > 0) {
                    objectAnimator.setFloatValues(c0190kgy.fi());
                }
                if (TextUtils.equals(c0190kgy.ct(), "rotationX")) {
                    this.uq.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ra.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ra.this.uq.setPivotX(ra.this.uq.getWidth() / 2.0f);
                            ra.this.uq.setPivotY(ra.this.uq.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0190kgy.ct(), "ripple")) {
                    this.yo = c0190kgy.ra();
                }
                String strGf = c0190kgy.gf();
                strGf.getClass();
                switch (strGf) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.ahm.uq() != 0) {
            this.rz.setDuration(this.ahm.uq());
        }
        this.rz.setStartDelay(this.ahm.ct());
        boolean zEquals = TextUtils.equals(this.ahm.kgy(), "sequentially");
        AnimatorSet animatorSet = this.rz;
        if (zEquals) {
            animatorSet.playSequentially(arrayList);
        } else {
            animatorSet.playTogether(arrayList);
        }
        this.rz.start();
    }

    public ra(View view, kgy kgyVar) {
        this.uq = view;
        this.ahm = kgyVar;
        Paint paint = new Paint();
        this.kgy = paint;
        paint.setAntiAlias(true);
    }

    public void kgy(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || TextUtils.isEmpty(this.yo)) {
                return;
            }
            this.kgy.setColor(com.bytedance.adsdk.ugeno.fi.kgy.kgy(this.yo));
            this.kgy.setAlpha(90);
            ((ViewGroup) this.uq.getParent()).setClipChildren(true);
            int i = this.ct;
            int i2 = this.noq;
            canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * iAnimation.getRipple(), this.kgy);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void kgy(int i, int i2) {
        this.ct = i / 2;
        this.noq = i2 / 2;
    }
}
