package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class OU implements InterfaceC2603bV {
    public static final OU A01 = new OU();
    public final List<C2348Th> A00;

    public OU() {
        this.A00 = Collections.emptyList();
    }

    public OU(C2348Th c2348Th) {
        this.A00 = Collections.singletonList(c2348Th);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2603bV
    public final List<C2348Th> A88(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2603bV
    public final long A8e(int i) {
        AbstractC2159Ln.A07(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2603bV
    public final int A8f() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2603bV
    public final int A9D(long j) {
        return j < 0 ? 0 : -1;
    }
}
