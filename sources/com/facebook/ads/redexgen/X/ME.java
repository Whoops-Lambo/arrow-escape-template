package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ME extends AbstractRunnableC3416oq {
    public final /* synthetic */ C2812eu A00;

    public ME(C2812eu c2812eu) {
        this.A00 = c2812eu;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
