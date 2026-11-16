package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3168kk {
    public static InterfaceC3169kl A00;
    public static byte[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A00 = null;
    }

    public static void A01() {
        synchronized (C3168kk.class) {
            if (A00 == null) {
                return;
            }
            C3224lg c3224lg = new C3224lg(A00.AJt());
            c3224lg.A05(1);
            C2054Hh c2054HhA00 = AbstractC3191l9.A00();
            if (c2054HhA00 != null) {
                c2054HhA00.A08().ABz(A00(0, 9, 109), 3401, c3224lg);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new C2064Hr();
            new C3170km(j);
        }
    }
}
