package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import defpackage.kz1;
import defpackage.lz1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Gp implements View.OnAttachStateChangeListener {
    public final /* synthetic */ lz1 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;

    public Gp(lz1 lz1Var, View view, ViewGroup viewGroup) {
        this.a = lz1Var;
        this.b = view;
        this.c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        ((kz1) this.a).c(Boolean.valueOf(Jp.a(this.b, this.c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        ((kz1) this.a).c(Boolean.FALSE);
    }
}
