package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2292Rd implements InterfaceC2423Wl {
    public long A00;
    public long A01;
    public C2292Rd A02;
    public C2422Wk A03;

    public C2292Rd(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C2292Rd A01() {
        this.A03 = null;
        C2292Rd c2292Rd = this.A02;
        this.A02 = null;
        return c2292Rd;
    }

    public final void A02(long j, int i) {
        AbstractC2159Ln.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = ((long) i) + j;
    }

    public final void A03(C2422Wk c2422Wk, C2292Rd c2292Rd) {
        this.A03 = c2422Wk;
        this.A02 = c2292Rd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2423Wl
    public final C2422Wk A7U() {
        return (C2422Wk) AbstractC2159Ln.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2423Wl
    public final C2292Rd ADT() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
