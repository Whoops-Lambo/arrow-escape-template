package io.p071bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ w c;

    public /* synthetic */ v(w wVar, r rVar, int i) {
        this.a = i;
        this.c = wVar;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        r rVar = this.b;
        w wVar = this.c;
        switch (i) {
            case 0:
                wVar.i(1);
                if (wVar.B) {
                    rVar.post(wVar.s);
                    wVar.B = false;
                }
                break;
            case 1:
                wVar.i(2);
                if (wVar.B) {
                    rVar.post(wVar.s);
                    wVar.B = false;
                }
                break;
            default:
                wVar.i(2);
                if (wVar.B) {
                    rVar.post(wVar.s);
                    wVar.B = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        w wVar = this.c;
        switch (i) {
            case 0:
                wVar.i(3);
                break;
            case 1:
                wVar.i(3);
                break;
            default:
                wVar.i(3);
                break;
        }
    }
}
