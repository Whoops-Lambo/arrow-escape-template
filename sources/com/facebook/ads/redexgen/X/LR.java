package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class LR implements InterfaceC2874fu {
    public final /* synthetic */ C18177m A00;

    public LR(C18177m c18177m) {
        this.A00 = c18177m;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2874fu
    public final void AGK(AdError adError) {
        this.A00.A01.AGw(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2874fu
    public final void AGL() {
        this.A00.A0C.set(true);
        this.A00.A01.AGt(this.A00);
    }
}
