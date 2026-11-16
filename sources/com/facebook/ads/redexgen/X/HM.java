package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class HM implements InterfaceC3195lD {
    public final C3192lA A00;

    public HM(C3192lA c3192lA) {
        this.A00 = c3192lA;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
    public final Map<String, String> A69() {
        return C3254mB.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
    public final Map<String, String> A7W() {
        return C3233lp.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
    public final String A8x() {
        return C3233lp.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
    public final String A8z() {
        return AbstractC3160kb.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
    public final boolean ABC() {
        return C3438pE.A00().A03();
    }
}
