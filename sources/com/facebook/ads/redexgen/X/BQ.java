package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class BQ implements InterfaceC2772eF {
    public final View A00;
    public final C2055Hi A01;

    public BQ(C2055Hi c2055Hi, View view) {
        this.A01 = c2055Hi;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2772eF
    public final double AA9() {
        C2634c0 result = C2636c2.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
