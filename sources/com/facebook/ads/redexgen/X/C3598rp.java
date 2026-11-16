package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3598rp {
    public String A02;
    public String A03;
    public final C2839fL A06;
    public final C2853fZ A07;
    public final C2055Hi A08;
    public C2841fN A01 = C2841fN.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;
    public String A04 = "";

    public C3598rp(C2055Hi c2055Hi, C2839fL c2839fL, C2853fZ c2853fZ) {
        this.A08 = c2055Hi;
        this.A06 = c2839fL;
        this.A07 = c2853fZ;
    }

    public final C3598rp A09(int i) {
        this.A00 = i;
        return this;
    }

    public final C3598rp A0A(C2841fN c2841fN) {
        this.A01 = c2841fN;
        return this;
    }

    public final C3598rp A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C3598rp A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C3598rp A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C3598rp A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C3596rn A0F() {
        return new C3596rn(this, null);
    }
}
