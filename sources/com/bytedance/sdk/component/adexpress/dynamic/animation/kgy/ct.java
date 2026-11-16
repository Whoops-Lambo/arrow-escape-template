package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ct extends uq {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq
    public List<ObjectAnimator> kgy() {
        ArrayList arrayList = new ArrayList();
        String strGm = this.ahm.gm();
        switch (strGm.hashCode()) {
            case 3029889:
                if (strGm.equals("both")) {
                    kgy(arrayList);
                    return arrayList;
                }
                break;
            case 3387192:
                strGm.equals("none");
                break;
            case 483313230:
                if (strGm.equals("forwards")) {
                    uq(arrayList);
                    return arrayList;
                }
                break;
            case 1356771568:
                if (strGm.equals("backwards")) {
                    ahm(arrayList);
                    return arrayList;
                }
                break;
        }
        rz(arrayList);
        return arrayList;
    }

    public ct(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        super(view, kgyVar);
    }

    private void ahm(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), this.ahm.sx())).setDuration((int) (this.ahm.ra() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.ct.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ct.this.rz.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        });
        list.add(kgy(duration));
    }

    private void rz(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), this.ahm.sx())).setDuration((int) (this.ahm.ra() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.ct.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ct.this.rz.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        });
        list.add(kgy(duration));
    }

    private void uq(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), this.ahm.sx())).setDuration((int) (this.ahm.ra() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(kgy(duration));
    }

    private void kgy(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), this.ahm.sx())).setDuration(((int) (this.ahm.ra() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar = this.ahm;
        kgyVar.noq(kgyVar.vs() * 2);
        list.add(kgy(duration));
    }
}
