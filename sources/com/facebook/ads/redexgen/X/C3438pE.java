package com.facebook.ads.redexgen.X;

import android.app.Activity;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3438pE {
    public static final C3438pE A04 = new C3438pE(new GD(), new GC());
    public final InterfaceC3437pD A02;
    public final InterfaceC3512qR A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C3438pE(InterfaceC3512qR interfaceC3512qR, InterfaceC3437pD interfaceC3437pD) {
        this.A03 = interfaceC3512qR;
        this.A02 = interfaceC3437pD;
    }

    public static C3438pE A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A6M();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A8y();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C3438pE.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A6M() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
