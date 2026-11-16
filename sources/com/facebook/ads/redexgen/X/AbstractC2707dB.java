package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2707dB {
    public static byte[] A00;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2705d9 A02(Q9 q9) throws IOException {
        byte[] bArr;
        C2181Mk c2181Mk = new C2181Mk(16);
        C2706dA c2706dAA03 = A03(1718449184, q9, c2181Mk);
        AbstractC2159Ln.A08(c2706dAA03.A01 >= 16);
        q9.AI6(c2181Mk.A0l(), 0, 16);
        c2181Mk.A0f(0);
        int iA0G = c2181Mk.A0G();
        int iA0G2 = c2181Mk.A0G();
        int iA0F = c2181Mk.A0F();
        int iA0F2 = c2181Mk.A0F();
        int iA0G3 = c2181Mk.A0G();
        int iA0G4 = c2181Mk.A0G();
        int i = ((int) c2706dAA03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            q9.AI6(bArr, 0, i);
        } else {
            bArr = N1.A07;
        }
        q9.ALL((int) (q9.A9L() - q9.A9Q()));
        return new C2705d9(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{105, 66, 95, 68, 65, 10, 67, 89, 10, 94, 69, 69, 10, 70, 75, 88, 77, 79, 10, 2, 84, 24, 109, 104, 1, 3, 10, 94, 69, 10, 89, 65, 67, 90, 17, 10, 67, 78, 16, 10, 37, 11, 2, 3, 30, 5, 2, 11, 76, 25, 2, 7, 2, 3, 27, 2, 76, 59, 45, 58, 76, 15, 4, 25, 2, 7, 86, 76, 55, 12, 17, 23, 18, 18, 13, 16, 22, 7, 6, 66, 4, 13, 16, 15, 66, 22, 27, 18, 7, 88, 66, 51, 5, 18, 44, 1, 5, 0, 1, 22, 54, 1, 5, 0, 1, 22};
    }

    public static long A00(Q9 q9) throws IOException {
        C2181Mk c2181Mk = new C2181Mk(8);
        C2706dA chunkHeader = C2706dA.A00(q9, c2181Mk);
        if (chunkHeader.A00 != 1685272116) {
            q9.AK3();
            return -1L;
        }
        q9.A4X(8);
        c2181Mk.A0f(0);
        q9.AI6(c2181Mk.A0l(), 0, 8);
        long sampleDataSize = c2181Mk.A0N();
        q9.ALL(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(Q9 q9) throws IOException {
        q9.AK3();
        C2706dA c2706dAA03 = A03(1684108385, q9, new C2181Mk(8));
        q9.ALL(8);
        return Pair.create(Long.valueOf(q9.A9Q()), Long.valueOf(c2706dAA03.A01));
    }

    public static C2706dA A03(int i, Q9 q9, C2181Mk c2181Mk) throws IOException {
        C2706dA c2706dAA00 = C2706dA.A00(q9, c2181Mk);
        while (c2706dAA00.A00 != i) {
            MV.A07(A04(91, 15, 2), A04(40, 28, 10) + c2706dAA00.A00);
            long j = c2706dAA00.A01 + 8;
            if (j <= 2147483647L) {
                q9.ALL((int) j);
                c2706dAA00 = C2706dA.A00(q9, c2181Mk);
            } else {
                throw L9.A00(A04(0, 40, 76) + c2706dAA00.A00);
            }
        }
        return c2706dAA00;
    }

    public static boolean A06(Q9 q9) throws IOException {
        C2181Mk c2181Mk = new C2181Mk(8);
        C2706dA c2706dAA00 = C2706dA.A00(q9, c2181Mk);
        if (c2706dAA00.A00 != 1380533830 && c2706dAA00.A00 != 1380333108) {
            return false;
        }
        q9.AI6(c2181Mk.A0l(), 0, 4);
        c2181Mk.A0f(0);
        int iA0C = c2181Mk.A0C();
        if (iA0C != 1463899717) {
            MV.A05(A04(91, 15, 2), A04(68, 23, 4) + iA0C);
            return false;
        }
        return true;
    }
}
