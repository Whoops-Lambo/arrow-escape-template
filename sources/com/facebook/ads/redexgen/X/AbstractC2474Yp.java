package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2474Yp {
    public static byte[] A00;
    public static String[] A01 = {"JKm0JUAjQEUHOkcp6hO5rnWr8MwHHkDW", "TUTC0kMJz1fV", "ctliOTGP2wkkCylecXDLY", "7yUThtqIf", "AJVWBaJPAROkxsDLWVyTf9VXCdLa0S3R", "l9NKwaE5DphjYVOjujGINoU8XccIVo6S", "LcQIihvayP3Cbpd3FHlBSzSyBU3Sxvoc", "huNpIJsJ2h6PoPtozajWK"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{7, 33, 37, 17, 48, 45, 40, 20, 44, 46, 55, 55, 46, 41, 32, 103, 53, 34, 42, 38, 46, 41, 35, 34, 53, 103, 40, 33, 103, 42, 38, 43, 33, 40, 53, 42, 34, 35, 103, 20, 2, 14, 103, 9, 6, 11, 103, 50, 41, 46, 51, 105};
    }

    static {
        A02();
    }

    public static int A00(C2181Mk c2181Mk) {
        int i = 0;
        while (value != 0) {
            int b = c2181Mk.A0I();
            i += b;
            if (b != 255) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    public static void A03(long j, C2181Mk c2181Mk, ZP[] zpArr) {
        while (true) {
            int iA07 = c2181Mk.A07();
            String[] strArr = A01;
            if (strArr[0].charAt(12) == strArr[6].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "QuwVt3McBrRQsTYg5HbYJlPhURdGltNk";
            strArr2[6] = "E2RIVQJLzAlCF03p6JKrmJJT1m8evFc3";
            if (iA07 > 1) {
                int iA00 = A00(c2181Mk);
                int iA01 = A00(c2181Mk);
                int iA09 = c2181Mk.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c2181Mk.A07();
                    if (iA01 > payloadType) {
                        MV.A07(A01(0, 7, 23), A01(7, 45, 20));
                        iA09 = c2181Mk.A0A();
                    } else if (iA00 == 4 && iA01 >= 8) {
                        int iA0I = c2181Mk.A0I();
                        int userIdentifier = c2181Mk.A0M();
                        int providerCode = 0;
                        if (userIdentifier == 49) {
                            providerCode = c2181Mk.A0C();
                        }
                        int iA0I2 = c2181Mk.A0I();
                        if (userIdentifier == 47) {
                            c2181Mk.A0g(1);
                        }
                        boolean z = iA0I == 181 && (userIdentifier == 49 || userIdentifier == 47) && iA0I2 == 3;
                        if (userIdentifier == 49) {
                            z &= providerCode == 1195456820;
                        }
                        if (z) {
                            A04(j, c2181Mk, zpArr);
                        }
                    }
                } else {
                    MV.A07(A01(0, 7, 23), A01(7, 45, 20));
                    iA09 = c2181Mk.A0A();
                }
                c2181Mk.A0f(iA09);
            } else {
                return;
            }
        }
    }

    public static void A04(long j, C2181Mk c2181Mk, ZP[] zpArr) {
        int firstByte = c2181Mk.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c2181Mk.A0g(1);
        int i = (firstByte & 31) * 3;
        int iA09 = c2181Mk.A09();
        for (ZP zp : zpArr) {
            c2181Mk.A0f(iA09);
            zp.AK9(c2181Mk, i);
            if (j != -9223372036854775807L) {
                String[] strArr = A01;
                if (strArr[0].charAt(12) == strArr[6].charAt(12)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "lwAucefG6GoIk2MFZH0nph40fdR061wg";
                strArr2[6] = "Yi999lFOlA7299JVgsHEsxtW0HZbsSnk";
                zp.AKC(j, 1, i, 0, null);
            }
        }
    }
}
