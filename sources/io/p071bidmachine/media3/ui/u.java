package io.p071bidmachine.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class u extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ u(w wVar, int i) {
        this.a = i;
        this.b = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        w wVar = this.b;
        switch (i) {
            case 0:
                View view = wVar.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = wVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = wVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                wVar.i(0);
                break;
            case 3:
                wVar.i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = wVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = wVar.h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        w wVar = this.b;
        switch (i) {
            case 0:
                View view = wVar.j;
                if ((view instanceof e) && !wVar.A) {
                    e eVar = (e) view;
                    ValueAnimator valueAnimator = eVar.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(eVar.F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = wVar.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = wVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = wVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(wVar.A ? 0 : 4);
                }
                View view3 = wVar.j;
                if ((view3 instanceof e) && !wVar.A) {
                    e eVar2 = (e) view3;
                    ValueAnimator valueAnimator2 = eVar2.E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    eVar2.G = false;
                    valueAnimator2.setFloatValues(eVar2.F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                wVar.i(4);
                break;
            case 3:
                wVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = wVar.h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    viewGroup3.setTranslationX(viewGroup3.getWidth());
                    viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup4 = wVar.f;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                }
                break;
        }
    }
}
