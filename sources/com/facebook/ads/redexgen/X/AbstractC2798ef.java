package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2798ef {
    public static byte[] A04;
    public static String[] A05 = {"1rpqzMoQPEd3EHTy", "IijlYjxUhlQ6PevMfYRhYV7WfLROcFkT", "dB1UvEzmowJDDyIJQtC", "Y16LfJ4", "bBkzI77rkxWR3W5jJ6r", "5uBInXd6C4n2aG1XSy1EsoMIhhWhzvVD", "qxy12m4DqJTCc2OP", "vMu6B29f41r3aRkKMkBlS2SukisJI3wS"};
    public InterfaceC2796ed A00;
    public final C2055Hi A01;
    public final InterfaceC3321nG A02;
    public final String A03;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
            if (A05[3].length() != 7) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "aufIPJgKJ4HaFI8w";
            strArr[6] = "trPirB4HX7kF0W7G";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A04 = new byte[]{-126, -111, -111, -128, -126, -123, -38, -41, -36, -39, -51, -47, -38, -41, -47, -39, -128, 106, 125, 108, 113, 104, 106, 119, 109, 104, 107, 123, 120, -128, 124, 110};
    }

    public abstract EnumC2795ec A0G(String str);

    static {
        A0F();
    }

    public AbstractC2798ef(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, String str) {
        this.A01 = c2055Hi;
        this.A02 = interfaceC3321nG;
        this.A03 = str;
    }

    public static String A0C() {
        return A0D(16, 16, 5);
    }

    public static String A0E(AbstractC2798ef abstractC2798ef) {
        if (abstractC2798ef instanceof C18257u) {
            return A0D(6, 10, 106);
        }
        return A0D(0, 6, 29);
    }

    public final InterfaceC2796ed A0H() {
        return this.A00;
    }

    public final void A0I(InterfaceC2796ed interfaceC2796ed) {
        this.A00 = interfaceC2796ed;
    }
}
