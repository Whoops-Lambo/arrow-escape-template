package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnApplyWindowInsetsListenerC2975hZ implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ InterfaceC2961hL A00;
    public final /* synthetic */ C3N A01;

    public ViewOnApplyWindowInsetsListenerC2975hZ(C3N c3n, InterfaceC2961hL interfaceC2961hL) {
        this.A01 = c3n;
        this.A00 = interfaceC2961hL;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C2993hs compatInsets = this.A00.ADs(view, C2993hs.A00(windowInsets));
        return (WindowInsets) C2993hs.A01(compatInsets);
    }
}
