package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C1898Bg extends AbstractRunnableC3416oq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1896Be A02;

    public C1898Bg(C1896Be c1896Be, int i, int i2) {
        this.A02 = c1896Be;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        this.A02.A0C.A02(new BA(this.A00, this.A01));
    }
}
