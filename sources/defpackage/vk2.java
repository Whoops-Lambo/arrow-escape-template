package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.ui.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vk2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ StyledPlayerControlView b;
    public final /* synthetic */ m c;

    public /* synthetic */ vk2(m mVar, StyledPlayerControlView styledPlayerControlView, int i) {
        this.a = i;
        this.c = mVar;
        this.b = styledPlayerControlView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        StyledPlayerControlView styledPlayerControlView = this.b;
        m mVar = this.c;
        switch (i) {
            case 0:
                mVar.i(1);
                if (mVar.B) {
                    styledPlayerControlView.post(mVar.s);
                    mVar.B = false;
                }
                break;
            case 1:
                mVar.i(2);
                if (mVar.B) {
                    styledPlayerControlView.post(mVar.s);
                    mVar.B = false;
                }
                break;
            default:
                mVar.i(2);
                if (mVar.B) {
                    styledPlayerControlView.post(mVar.s);
                    mVar.B = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        m mVar = this.c;
        switch (i) {
            case 0:
                mVar.i(3);
                break;
            case 1:
                mVar.i(3);
                break;
            default:
                mVar.i(3);
                break;
        }
    }
}
