package io.p071bidmachine.rendering.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import defpackage.wr0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends AnimatorListenerAdapter {
    public final wr0 a;
    public final WeakReference b;
    public boolean c;

    public b0(wr0 wr0Var, View view) {
        view.getClass();
        this.a = wr0Var;
        this.b = new WeakReference(view);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        this.c = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        if (!this.c) {
            this.a.invoke(this.b.get());
        }
    }
}
