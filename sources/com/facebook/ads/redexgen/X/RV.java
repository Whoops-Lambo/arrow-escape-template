package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class RV implements InterfaceC2603bV {
    public final long A00;
    public final AbstractC18519l<C2348Th> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public RV(long j, AbstractC18519l<C2348Th> abstractC18519l) {
        this.A00 = j;
        this.A01 = abstractC18519l;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2603bV
    public final List<C2348Th> A88(long j) {
        return j >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2603bV
    public final long A8e(int i) {
        AbstractC2159Ln.A07(i == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2603bV
    public final int A8f() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2603bV
    public final int A9D(long j) {
        return this.A00 > j ? 0 : -1;
    }
}
