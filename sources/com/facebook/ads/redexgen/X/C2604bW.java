package com.facebook.ads.redexgen.X;

import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2604bW {
    public C2598bQ A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;
    public boolean A05;

    public final C2604bW A00(C2598bQ c2598bQ) {
        this.A00 = c2598bQ;
        return this;
    }

    public final C2604bW A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C2604bW A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C2604bW A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C2604bW A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C2604bW A05(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C2602bU A06() {
        return new C2602bU(this.A00, this.A04, this.A02, this.A01, this.A03, this.A05);
    }
}
