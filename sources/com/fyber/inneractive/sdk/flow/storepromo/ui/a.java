package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements Animation.AnimationListener {
    public final /* synthetic */ c a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        c cVar;
        View view;
        c cVar2 = this.a;
        ViewGroup viewGroup = cVar2.b;
        if (viewGroup != null) {
            viewGroup.removeView(cVar2.a);
            this.a.b.setAnimation(null);
            this.a.b.setVisibility(8);
        }
        com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.a.f;
        if (bVar != null) {
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVar.d;
            com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.d) == null || cVar.b == null || (view = cVar.a) == null || view.getParent() == null || cVar.b.getVisibility() != 0) ? false : true, bVar.i);
            Iterator it = bVar.h.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
            }
        }
    }
}
