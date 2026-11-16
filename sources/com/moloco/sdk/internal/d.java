package com.moloco.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements View.OnAttachStateChangeListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ e b;
    public final /* synthetic */ FrameLayout c;

    public d(FrameLayout frameLayout, e eVar, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = eVar;
        this.c = frameLayout2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.a.removeOnAttachStateChangeListener(this);
        e.a(this.b, this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
