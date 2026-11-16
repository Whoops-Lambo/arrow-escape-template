package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3158kZ {
    public final long A00;
    public final EnumC3157kY A01;
    public final String A02;
    public final boolean A03;

    public C3158kZ(String str, boolean z, EnumC3157kY enumC3157kY) {
        this(str, z, enumC3157kY, System.currentTimeMillis());
    }

    public C3158kZ(String str, boolean z, EnumC3157kY enumC3157kY, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC3157kY;
        this.A00 = j;
    }

    public static C3158kZ A00() {
        return new C3158kZ("", true, EnumC3157kY.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC3157kY A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
