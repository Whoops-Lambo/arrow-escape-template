package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2152Lg implements InterfaceC3175kr {
    public final /* synthetic */ C18177m A00;

    public C2152Lg(C18177m c18177m) {
        this.A00 = c18177m;
    }

    private void A00(boolean z) {
        if (!z) {
            this.A00.A01.AGw(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AGt(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3175kr
    public final void AEJ() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3175kr
    public final void AEU() {
        A00(true);
    }
}
