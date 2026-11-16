package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2230Oh implements InterfaceC2603bV {
    public final List<C2348Th> A00;

    public C2230Oh(List<C2348Th> list) {
        this.A00 = list;
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
