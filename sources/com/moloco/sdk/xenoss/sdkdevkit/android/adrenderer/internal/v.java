package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import defpackage.kz1;
import defpackage.lz1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    private final void a(View view) {
    }

    public /* synthetic */ v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                view.getClass();
                ((kz1) ((lz1) this.b)).c(Boolean.TRUE);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                view.getClass();
                ((kz1) ((lz1) obj)).c(Boolean.FALSE);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                io.p071bidmachine.nativead.f.e((io.p071bidmachine.nativead.f) obj);
                break;
        }
    }
}
