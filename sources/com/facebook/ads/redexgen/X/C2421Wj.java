package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2421Wj {
    public final int A00;
    public final C2363Tx A01;
    public final Object A02;
    public final C2251Ph[] A03;
    public final RA[] A04;

    public C2421Wj(C2251Ph[] c2251PhArr, RA[] raArr, C2363Tx c2363Tx, Object obj) {
        this.A03 = c2251PhArr;
        this.A04 = (RA[]) raArr.clone();
        this.A01 = c2363Tx;
        this.A02 = obj;
        this.A00 = c2251PhArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C2421Wj c2421Wj, int i) {
        return c2421Wj != null && N1.A1E(this.A03[i], c2421Wj.A03[i]) && N1.A1E(this.A04[i], c2421Wj.A04[i]);
    }
}
