package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2192Mv implements NK {
    public InterfaceC2768eB A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C2192Mv A00(InterfaceC2768eB interfaceC2768eB) {
        this.A02 = interfaceC2768eB;
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final C2191Mu A5q() {
        return new C2191Mu((InterfaceC2768eB) AbstractC2159Ln.A01(this.A02), this.A01, this.A00);
    }
}
