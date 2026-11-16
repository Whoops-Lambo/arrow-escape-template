package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2223Oa implements Comparable<C2223Oa> {
    public int A00;
    public long A01;
    public Object A02;
    public final PS A03;

    public C2223Oa(PS ps) {
        this.A03 = ps;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2223Oa c2223Oa) {
        if ((this.A02 == null) != (c2223Oa.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - c2223Oa.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = N1.A08(this.A01, c2223Oa.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
