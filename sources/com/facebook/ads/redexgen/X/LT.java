package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class LT implements InterfaceC3147kO {
    public final /* synthetic */ C18177m A00;

    public LT(C18177m c18177m) {
        this.A00 = c18177m;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3147kO
    public final void ADt() {
        this.A00.A0C.set(true);
        this.A00.A01.AGt(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3147kO
    public final void ADu() {
        this.A00.A01.AGw(this.A00, AdError.CACHE_ERROR);
    }
}
