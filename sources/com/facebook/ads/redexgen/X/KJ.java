package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class KJ extends AbstractRunnableC3416oq {
    public final /* synthetic */ KI A00;
    public final /* synthetic */ C3359nt A01;

    public KJ(KI ki, C3359nt c3359nt) {
        this.A00 = ki;
        this.A01 = c3359nt;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        this.A00.A0B.A0F().A6F(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
