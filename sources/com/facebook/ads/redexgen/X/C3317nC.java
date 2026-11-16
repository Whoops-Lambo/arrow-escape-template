package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3317nC {
    public double A00;
    public EnumC3323nI A01;
    public EnumC3324nJ A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final C3317nC A00(double d) {
        this.A00 = d;
        return this;
    }

    public final C3317nC A01(EnumC3323nI enumC3323nI) {
        this.A01 = enumC3323nI;
        return this;
    }

    public final C3317nC A02(EnumC3324nJ enumC3324nJ) {
        this.A02 = enumC3324nJ;
        return this;
    }

    public final C3317nC A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C3317nC A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C3317nC A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C3317nC A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C3318nD A07(C3192lA c3192lA) {
        return new C3318nD(c3192lA, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
