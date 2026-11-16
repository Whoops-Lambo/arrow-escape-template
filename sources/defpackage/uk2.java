package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uk2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ uk2(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                View view = mVar.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = mVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = mVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                mVar.i(0);
                break;
            case 3:
                mVar.i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = mVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = mVar.h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                View view = mVar.j;
                if ((view instanceof DefaultTimeBar) && !mVar.A) {
                    ((DefaultTimeBar) view).hideScrubber(250L);
                    break;
                }
                break;
            case 1:
                View view2 = mVar.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = mVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = mVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(mVar.A ? 0 : 4);
                }
                View view3 = mVar.j;
                if ((view3 instanceof DefaultTimeBar) && !mVar.A) {
                    ((DefaultTimeBar) view3).showScrubber(250L);
                    break;
                }
                break;
            case 2:
                mVar.i(4);
                break;
            case 3:
                mVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = mVar.h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    viewGroup3.setTranslationX(viewGroup3.getWidth());
                    viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup4 = mVar.f;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                }
                break;
        }
    }
}
