package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3191l9 {
    public static final AtomicReference<C2054Hh> A00 = new AtomicReference<>();

    public static C2054Hh A00() {
        return A00.get();
    }

    public static void A01(C2054Hh c2054Hh) {
        if (c2054Hh == null) {
            return;
        }
        AbstractC2033Gm.A00(A00, null, c2054Hh);
    }
}
