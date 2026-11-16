package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2706dA {
    public final int A00;
    public final long A01;

    public C2706dA(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static C2706dA A00(Q9 q9, C2181Mk c2181Mk) throws IOException {
        q9.AI6(c2181Mk.A0l(), 0, 8);
        c2181Mk.A0f(0);
        int iA0C = c2181Mk.A0C();
        long size = c2181Mk.A0O();
        return new C2706dA(iA0C, size);
    }
}
