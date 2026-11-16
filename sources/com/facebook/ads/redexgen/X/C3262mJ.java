package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3262mJ {
    public static C3262mJ A00 = new C3262mJ();

    public static C3262mJ A00() {
        return A00;
    }

    public final HD A01(C3192lA c3192lA, boolean z) {
        return new HD(c3192lA, z, new C3173kp());
    }

    public final Map<String, String> A02(C3192lA c3192lA) {
        try {
            return A01(c3192lA, false).A06();
        } catch (Throwable th) {
            c3192lA.A08().A4j(th);
            return C3254mB.A01(c3192lA);
        }
    }
}
