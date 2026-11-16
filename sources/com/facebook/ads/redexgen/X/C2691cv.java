package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2691cv {
    public static byte[] A02;
    public final List<VC> A00;
    public final ZP[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-2, 35, 43, 22, 33, 30, 25, -43, 24, 33, 36, 40, 26, 25, -43, 24, 22, 37, 41, 30, 36, 35, -43, 34, 30, 34, 26, -43, 41, 46, 37, 26, -43, 37, 39, 36, 43, 30, 25, 26, 25, -17, -43, -68, -53, -53, -57, -60, -66, -68, -49, -60, -54, -55, -118, -66, -64, -68, -120, -111, -117, -109, -50, -35, -35, -39, -42, -48, -50, -31, -42, -36, -37, -100, -48, -46, -50, -102, -92, -99, -91};
    }

    public C2691cv(List<VC> list) {
        this.A00 = list;
        this.A01 = new ZP[list.size()];
    }

    public final void A02(long j, C2181Mk c2181Mk) {
        AbstractC2474Yp.A03(j, c2181Mk, this.A01);
    }

    public final void A03(InterfaceC2481Yw interfaceC2481Yw, C2698d2 c2698d2) {
        for (int i = 0; i < i; i++) {
            c2698d2.A05();
            ZP zpALm = interfaceC2481Yw.ALm(c2698d2.A03(), 3);
            VC vc = this.A00.get(i);
            String str = vc.A0W;
            AbstractC2159Ln.A09(A00(43, 19, 17).equals(str) || A00(62, 19, 35).equals(str), A00(0, 43, 107) + str);
            C2126Ke c2126KeA11 = new C2126Ke().A0y(vc.A0T != null ? vc.A0T : c2698d2.A04()).A11(str);
            int i2 = vc.A0H;
            C2126Ke c2126KeA10 = c2126KeA11.A0n(i2).A10(vc.A0V);
            int i3 = vc.A03;
            zpALm.A7E(c2126KeA10.A0Z(i3).A12(vc.A0X).A14());
            this.A01[i] = zpALm;
        }
    }
}
