package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2491Zg {
    public final ZP A00;

    public abstract boolean A0B(C2181Mk c2181Mk) throws L9;

    public abstract boolean A0C(C2181Mk c2181Mk, long j) throws L9;

    public AbstractC2491Zg(ZP zp) {
        this.A00 = zp;
    }

    public final boolean A00(C2181Mk c2181Mk, long j) throws L9 {
        return A0B(c2181Mk) && A0C(c2181Mk, j);
    }
}
