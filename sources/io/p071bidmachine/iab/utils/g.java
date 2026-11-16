package io.p071bidmachine.iab.utils;

import android.animation.Animator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements Animator.AnimatorListener {
    public final /* synthetic */ h a;
    public final /* synthetic */ i b;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        i iVar = this.b;
        h hVar = this.a;
        i.a(iVar, 1.0f, hVar, true);
        hVar.j = hVar.d;
        hVar.k = hVar.e;
        hVar.l = hVar.f;
        int i = hVar.i + 1;
        int[] iArr = hVar.h;
        int length = i % iArr.length;
        hVar.i = length;
        hVar.o = iArr[length];
        if (!iVar.e) {
            iVar.d += 1.0f;
            return;
        }
        iVar.e = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public g(i iVar, h hVar) {
        this.b = iVar;
        this.a = hVar;
    }
}
