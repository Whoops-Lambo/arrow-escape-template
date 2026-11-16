package com.adsurge.adn.p014d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.adsurge.adn.p032j0.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class o extends AnimatorListenerAdapter {
    public boolean a = false;
    public int b = 0;
    public a c;
    public final com.adsurge.adn.p026h0.a d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements Runnable {
        public Animator a;

        @Override // java.lang.Runnable
        public void run() {
            Animator animator = this.a;
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).reverse();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.a = true;
        this.b = 0;
        a aVar = this.c;
        if (aVar != null) {
            aVar.a = null;
        }
        animator.setStartDelay(this.d.d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        com.adsurge.adn.p026h0.a aVar = this.d;
        int i = aVar.g;
        if (this.a || (i >= 0 && this.b >= i)) {
            this.b = 0;
            return;
        }
        this.b++;
        if (!aVar.e() || this.b % 2 != 1) {
            animator.setStartDelay(this.d.f);
            animator.start();
        } else {
            if (this.c == null) {
                this.c = new a();
            }
            this.c.a = animator;
            d.a().postDelayed(this.c, this.d.f);
        }
    }

    public o(com.adsurge.adn.p026h0.a aVar) {
        this.d = aVar;
    }
}
