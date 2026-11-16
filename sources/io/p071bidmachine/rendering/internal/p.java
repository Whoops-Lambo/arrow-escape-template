package io.p071bidmachine.rendering.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final WeakReference b;
    public final Object c;

    public p(View view, Map map) {
        view.getClass();
        map.getClass();
        this.c = map;
        this.b = new WeakReference(view);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                animator.getClass();
                Map map = (Map) this.c;
                WeakReference weakReference = this.b;
                View view = (View) weakReference.get();
                if (view != null) {
                    map.remove(view);
                    weakReference.clear();
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                animator.getClass();
                Map map = (Map) this.c;
                WeakReference weakReference = this.b;
                View view = (View) weakReference.get();
                if (view != null) {
                    map.remove(view);
                    weakReference.clear();
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                animator.getClass();
                View view = (View) this.b.get();
                if (view != null) {
                    view.setBackground((Drawable) this.c);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public p(WeakReference weakReference, Drawable drawable) {
        this.b = weakReference;
        this.c = drawable;
    }
}
