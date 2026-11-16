package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C1990Eu extends AbstractRunnableC3416oq {
    public final /* synthetic */ C3712tf A00;

    public C1990Eu(C3712tf c3712tf) {
        this.A00 = c3712tf;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
