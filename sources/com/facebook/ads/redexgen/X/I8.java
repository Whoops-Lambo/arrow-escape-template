package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class I8 extends AbstractRunnableC3403od {
    public final /* synthetic */ I5 A00;
    public final /* synthetic */ C3359nt A01;

    public I8(I5 i5, C3359nt c3359nt) {
        this.A00 = i5;
        this.A01 = c3359nt;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3403od
    public final void A01() {
        if (this.A00.A01.A00() != null) {
            this.A00.A01.A00().onAdError(AbstractC3451pS.A00(this.A01));
        }
    }
}
