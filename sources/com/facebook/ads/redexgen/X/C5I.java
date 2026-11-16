package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C5I extends B5 {
    public final /* synthetic */ C1885At A00;

    public C5I(C1885At c1885At) {
        this.A00 = c1885At;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC3269mQ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(B6 b6) {
        if (this.A00.A01 == null || b6.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C2753dw(this));
    }
}
