package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.muf;
import com.singular.sdk.internal.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class uq implements muf {
    com.bytedance.sdk.component.adexpress.dynamic.uq.kgy ahm;
    public View rz;
    private Set<ScheduledFuture<?>> uq = new HashSet();
    public List<ObjectAnimator> kgy = kgy();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy implements Runnable {
        ScheduledFuture<?> ahm;
        ObjectAnimator kgy;

        public kgy(ObjectAnimator objectAnimator) {
            this.kgy = objectAnimator;
        }

        public void kgy(ScheduledFuture<?> scheduledFuture) {
            this.ahm = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz() != null) {
                com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().rz().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq.kgy.1
                    @Override // java.lang.Runnable
                    public void run() {
                        kgy.this.kgy.resume();
                    }
                });
                if (this.ahm != null) {
                    uq.this.uq.remove(this.ahm);
                }
            }
        }
    }

    public abstract List<ObjectAnimator> kgy();

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.muf
    public void ahm() {
        List<ObjectAnimator> list = this.kgy;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.uq.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public ObjectAnimator kgy(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.ahm.kus() * 1000.0d));
        if (this.ahm.vs() > 0) {
            objectAnimator.setRepeatCount(this.ahm.vs() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.ahm.dg())) {
            if ("alternate".equals(this.ahm.dg()) || "alternate-reverse".equals(this.ahm.dg())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.ahm.twf())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.ahm.dg())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.ahm.dg())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    uq.this.rz.setVisibility(0);
                    if (uq.this.rz.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq) {
                        ((View) uq.this.rz.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    public void rz() {
        List<ObjectAnimator> list = this.kgy;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.ahm.xh() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        kgy kgyVar = uq.this.new kgy(objectAnimator);
                        ScheduledFuture<?> scheduledFutureKgy = com.bytedance.sdk.component.adexpress.uq.uq.kgy(kgyVar, (long) (uq.this.ahm.xh() * 1000.0d), TimeUnit.MILLISECONDS);
                        kgyVar.kgy(scheduledFutureKgy);
                        uq.this.uq.add(scheduledFutureKgy);
                    }
                });
            }
        }
    }

    public uq(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        this.rz = view;
        this.ahm = kgyVar;
    }
}
