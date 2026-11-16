package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnAttachStateChangeListenerC3330nP implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC3328nN A00;
    public final /* synthetic */ C3329nO A01;

    public ViewOnAttachStateChangeListenerC3330nP(C3329nO c3329nO, EnumC3328nN enumC3328nN) {
        this.A01 = c3329nO;
        this.A00 = enumC3328nN;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
