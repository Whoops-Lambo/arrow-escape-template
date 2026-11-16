package io.p071bidmachine.iab.utils;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class u implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ v a;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.a();
    }

    public u(v vVar) {
        this.a = vVar;
    }
}
