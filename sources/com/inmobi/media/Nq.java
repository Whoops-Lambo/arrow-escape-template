package com.inmobi.media;

import android.view.View;
import defpackage.kz1;
import defpackage.lz1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Nq implements View.OnAttachStateChangeListener {
    public final /* synthetic */ lz1 a;

    public Nq(lz1 lz1Var) {
        this.a = lz1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        ((kz1) this.a).c(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        ((kz1) this.a).c(Boolean.FALSE);
    }
}
