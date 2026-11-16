package com.adsurge.adn.p014d0;

import android.animation.Animator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c implements Animator.AnimatorListener {
    public final i a;
    public final int b;
    public b c;
    public int d = 0;
    public boolean e;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.d = 0;
        this.e = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.e = false;
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        b bVar;
        int i = this.b;
        if (i <= 0 || this.e) {
            return;
        }
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 != i || (bVar = this.c) == null) {
            return;
        }
        bVar.a(this.a.a.b);
        this.d = 0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.d++;
    }

    public c(i iVar) {
        this.a = iVar;
        this.b = iVar.a.g + 1;
    }
}
