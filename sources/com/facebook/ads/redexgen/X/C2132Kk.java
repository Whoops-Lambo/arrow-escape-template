package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2132Kk {
    public long A00 = Long.MIN_VALUE;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final C2132Kk A05(long j) {
        AbstractC2159Ln.A07(j == Long.MIN_VALUE || j >= 0);
        this.A00 = j;
        return this;
    }

    public final C2132Kk A06(long j) {
        AbstractC2159Ln.A07(j >= 0);
        this.A01 = j;
        return this;
    }

    public final C2132Kk A07(boolean z) {
        this.A02 = z;
        return this;
    }

    public final C2132Kk A08(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C2132Kk A09(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C9P A0A() {
        return A0B();
    }

    @Deprecated
    public final C9P A0B() {
        return new C9P(this);
    }
}
