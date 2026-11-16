package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2047Ha extends AbstractRunnableC3416oq {
    public final /* synthetic */ C2054Hh A00;

    public C2047Ha(C2054Hh c2054Hh) {
        this.A00 = c2054Hh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() throws Throwable {
        for (C3218la c3218la : C3217lZ.A02()) {
            C3217lZ.A0A(this.A00, c3218la.A02(), c3218la.A00(), c3218la.A01(), false);
        }
        C3217lZ.A02().clear();
    }
}
