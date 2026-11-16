package com.facebook.ads.redexgen.X;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2700d4 {
    public static String[] A00 = {CampaignEx.JSON_KEY_AD_Q, "", "cPr4W3", "kHXWkKmkRb2eUHnaHguQys1Si10FXsIA", "uZFKxIG3z3l5tcvE1Z6QufsEmHWnbqe6", "qN4HGXOIb", "YM48h", "AHYaa4vORgLBjrBGzfRTL0sqCQyhHS18"};

    public static int A00(byte[] bArr, int i, int i2) {
        while (i < i2) {
            byte b = bArr[i];
            String[] strArr = A00;
            String str = strArr[3];
            String str2 = strArr[7];
            int iCharAt = str.charAt(6);
            int position = str2.charAt(6);
            if (iCharAt == position) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[0] = "U";
            strArr2[6] = "9vOO0";
            if (b == 71) {
                break;
            }
            i++;
        }
        return i;
    }

    public static long A01(C2181Mk c2181Mk, int i, int i2) {
        c2181Mk.A0f(i);
        if (c2181Mk.A07() < 5) {
            return -9223372036854775807L;
        }
        int pid = c2181Mk.A0C();
        int tsPacketHeader = 8388608 & pid;
        if (tsPacketHeader != 0) {
            return -9223372036854775807L;
        }
        int tsPacketHeader2 = 2096896 & pid;
        if ((tsPacketHeader2 >> 8) != i2) {
            return -9223372036854775807L;
        }
        int tsPacketHeader3 = pid & 32;
        int tsPacketHeader4 = tsPacketHeader3 != 0 ? 1 : 0;
        if (tsPacketHeader4 == 0) {
            return -9223372036854775807L;
        }
        int tsPacketHeader5 = c2181Mk.A0I();
        if (tsPacketHeader5 >= 7) {
            int iA07 = c2181Mk.A07();
            if (A00[4].charAt(29) == 90) {
                throw new RuntimeException();
            }
            A00[5] = "kSPQfSkaSYbD7hJ";
            if (iA07 >= 7) {
                int tsPacketHeader6 = c2181Mk.A0I();
                if ((tsPacketHeader6 & 16) == 16) {
                    String[] strArr = A00;
                    String str = strArr[3];
                    String str2 = strArr[7];
                    int pid2 = str.charAt(6);
                    int tsPacketHeader7 = str2.charAt(6);
                    if (pid2 != tsPacketHeader7) {
                        String[] strArr2 = A00;
                        strArr2[2] = "1UwvFb";
                        strArr2[1] = "";
                        byte[] bArr = new byte[6];
                        int tsPacketHeader8 = bArr.length;
                        c2181Mk.A0k(bArr, 0, tsPacketHeader8);
                        return A02(bArr);
                    }
                    byte[] bArr2 = new byte[6];
                    int tsPacketHeader9 = bArr2.length;
                    c2181Mk.A0k(bArr2, 0, tsPacketHeader9);
                    return A02(bArr2);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long A02(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public static boolean A03(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            String[] strArr = A00;
            String str = strArr[3];
            String str2 = strArr[7];
            int i7 = str.charAt(6);
            int consecutiveSyncByteCount = str2.charAt(6);
            if (i7 != consecutiveSyncByteCount) {
                A00[5] = "yLEdlsl7C97OfRYEy8LQZix7JYsmYm";
                if (i6 < i || i6 >= i2) {
                    i4 = 0;
                } else {
                    int i8 = bArr[i6];
                    if (i8 != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            int i9 = A00[5].length();
                            if (i9 != 29) {
                                String[] strArr2 = A00;
                                strArr2[0] = "8";
                                strArr2[6] = "tDl2F";
                                return true;
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }
}
