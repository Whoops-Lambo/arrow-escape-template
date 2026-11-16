package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2899gJ {

    @Nullable
    public static HandlerC2898gI A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC2898gI A00(C2054Hh c2054Hh) {
        if (A00 == null) {
            A00 = new HandlerC2898gI(c2054Hh);
        }
        return A00;
    }

    public static void A01(C2054Hh c2054Hh) {
        if (AbstractC3303my.A0M(c2054Hh)) {
            A03(c2054Hh);
        }
    }

    public static void A02(C2054Hh c2054Hh) {
        if (AbstractC3303my.A0L(c2054Hh)) {
            A03(c2054Hh);
        }
    }

    public static void A03(C2054Hh c2054Hh) {
        if (A01.compareAndSet(false, true)) {
            ExecutorC3516qV.A01.execute(new C2102Je(c2054Hh));
        }
    }
}
