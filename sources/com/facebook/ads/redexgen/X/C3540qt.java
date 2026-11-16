package com.facebook.ads.redexgen.X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3540qt {
    public static C3540qt A02;
    public final C2020Fz A00;
    public final C3542qv A01;

    public C3540qt(C2055Hi c2055Hi, Executor executor, C3242ly c3242ly) {
        this.A01 = new C3542qv(c2055Hi);
        this.A00 = new C2020Fz(executor, c3242ly, c2055Hi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2055Hi c2055Hi, Executor executor, C3242ly c3242ly) {
        if (!C3300mv.A1c(c2055Hi)) {
            return;
        }
        if (A02 == null) {
            A02 = new C3540qt(c2055Hi, executor, c3242ly);
            A02.A00();
        } else {
            A02.A02(c3242ly);
        }
    }

    private void A02(C3242ly c3242ly) {
        this.A00.A07(c3242ly);
    }
}
