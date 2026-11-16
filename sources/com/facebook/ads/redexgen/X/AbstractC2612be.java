package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2612be {
    public static byte[] A00;
    public static String[] A01 = {"48XKwvEfJwcBdJlmydZ9q3zfkin", "6Eo7i0CZW1196XN", "aXowqGz1hBflQs7Fuf7fRoRGcNLFrTNx", "gAAFCtpqIzP3FTGJKsRiwumwgWIAbR0S", "PLtPm1eHapmuYi4h4OX7mFr2OXf", "6zIbnojHGkgqELK", "waa5U278dWyFSUddW0JUuxhgYdzAs96v", "yzz8W9jxPw0m7asRAapG6VLaofjK"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{83, 117, 113, 69, 100, 121, 124, 2, 58, 56, 33, 33, 56, 63, 54, 113, 35, 52, 60, 48, 56, 63, 53, 52, 35, 113, 62, 55, 113, 60, 48, 61, 55, 62, 35, 60, 52, 53, 113, 2, 20, 24, 113, 31, 16, 29, 113, 36, 63, 56, 37, 127};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A04(long j, C2181Mk c2181Mk, ZP[] zpArr) {
        int iA0I = c2181Mk.A0I();
        if ((iA0I & 64) != 0) {
            c2181Mk.A0g(1);
            int i = (iA0I & 31) * 3;
            int iA09 = c2181Mk.A09();
            for (ZP zp : zpArr) {
                c2181Mk.A0f(iA09);
                zp.AK9(c2181Mk, i);
                zp.AKC(j, 1, i, 0, null);
            }
        }
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

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    public static void A03(long j, C2181Mk c2181Mk, ZP[] zpArr) {
        while (true) {
            if (c2181Mk.A07() > 1) {
                int iA00 = A00(c2181Mk);
                int nextPayloadPosition = A00(c2181Mk);
                int iA09 = c2181Mk.A09() + nextPayloadPosition;
                if (nextPayloadPosition != -1) {
                    int iA07 = c2181Mk.A07();
                    if (A01[6].charAt(29) != '9') {
                        throw new RuntimeException();
                    }
                    A01[7] = "BK517ofCJita5znccar4agPI4WAj";
                    if (nextPayloadPosition > iA07) {
                        MV.A07(A01(0, 7, 10), A01(7, 45, 75));
                        iA09 = c2181Mk.A0A();
                    } else if (iA00 == 4 && nextPayloadPosition >= 8) {
                        int userDataTypeCode = c2181Mk.A0I();
                        int iA0M = c2181Mk.A0M();
                        int userIdentifier = 0;
                        if (iA0M == 49) {
                            userIdentifier = c2181Mk.A0C();
                        }
                        int iA0I = c2181Mk.A0I();
                        if (iA0M == 47) {
                            c2181Mk.A0g(1);
                        }
                        int i = (userDataTypeCode == 181 && (iA0M == 49 || iA0M == 47) && iA0I == 3) ? 1 : 0;
                        if (iA0M == 49) {
                            int providerCode = userIdentifier != 1195456820 ? 0 : 1;
                            i &= providerCode;
                        }
                        if (i != 0) {
                            A04(j, c2181Mk, zpArr);
                        }
                    }
                } else {
                    MV.A07(A01(0, 7, 10), A01(7, 45, 75));
                    iA09 = c2181Mk.A0A();
                }
                c2181Mk.A0f(iA09);
            } else {
                return;
            }
        }
    }
}
