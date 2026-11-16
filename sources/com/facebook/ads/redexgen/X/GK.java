package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class GK extends AbstractRunnableC3416oq {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C3382oH A01;
    public final /* synthetic */ C3385oK A02;
    public final /* synthetic */ String A03;

    public GK(C3385oK c3385oK, String str, long j, C3382oH c3382oH) {
        this.A02 = c3385oK;
        this.A03 = str;
        this.A00 = j;
        this.A01 = c3382oH;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        this.A02.A0N(this.A03, this.A00, this.A01);
    }
}
