package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ra extends uq {
    private float ct;
    private float noq;
    private kgy uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy {
        private View ahm;

        public kgy(View view) {
            this.ahm = view;
        }

        public void kgy(int i) {
            if (!"top".equals(ra.this.ahm.kgy())) {
                ViewGroup.LayoutParams layoutParams = this.ahm.getLayoutParams();
                layoutParams.height = i;
                this.ahm.setLayoutParams(layoutParams);
                this.ahm.requestLayout();
                return;
            }
            if (ra.this.rz instanceof ViewGroup) {
                for (int i2 = 0; i2 < ((ViewGroup) ra.this.rz).getChildCount(); i2++) {
                    ((ViewGroup) ra.this.rz).getChildAt(i2).setTranslationY(i - ra.this.ct);
                }
            }
            ra raVar = ra.this;
            raVar.rz.setTranslationY(raVar.ct - i);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq
    public List<ObjectAnimator> kgy() {
        int i;
        String str;
        View view = this.rz;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct)) {
            this.rz = (View) this.rz.getParent();
        }
        this.rz.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.ahm.ra() * 1000.0d));
        this.uq = new kgy(this.rz);
        final int i2 = this.rz.getLayoutParams().height;
        this.ct = i2;
        this.noq = this.rz.getLayoutParams().width;
        if ("left".equals(this.ahm.kgy()) || "right".equals(this.ahm.kgy())) {
            i = (int) this.noq;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.uq, str, 0, i).setDuration((int) (this.ahm.ra() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kgy(duration));
        arrayList.add(kgy(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.ra.1
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
                ra.this.uq.kgy(i2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }
        });
        return arrayList;
    }

    public ra(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        super(view, kgyVar);
    }
}
