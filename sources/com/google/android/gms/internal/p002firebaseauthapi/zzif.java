package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.d;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzif {
    public static void b(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static long a(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16))) & 4294967295L;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            d.r("The key length in bytes must be 32.");
            return null;
        }
        long jA = a(0, bArr) & 67108863;
        int i = 3;
        long jA2 = (a(3, bArr) >> 2) & 67108611;
        long jA3 = (a(6, bArr) >> 4) & 67092735;
        long jA4 = (a(9, bArr) >> 6) & 66076671;
        long jA5 = (a(12, bArr) >> 8) & 1048575;
        long j = jA2 * 5;
        long j2 = jA3 * 5;
        long j3 = jA4 * 5;
        long j4 = jA5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jA6 = j9 + (a(0, bArr3) & 67108863);
            long jA7 = j5 + ((a(i, bArr3) >> 2) & 67108863);
            long jA8 = j6 + ((a(6, bArr3) >> 4) & 67108863);
            long jA9 = j7 + ((a(9, bArr3) >> 6) & 67108863);
            long j10 = jA2;
            long jA10 = j8 + (((a(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jA10 * j) + (jA9 * j2) + (jA8 * j3) + (jA7 * j4) + (jA6 * jA);
            long j12 = (jA10 * j2) + (jA9 * j3) + (jA8 * j4) + (jA7 * jA) + (jA6 * j10);
            long j13 = (jA10 * j3) + (jA9 * j4) + (jA8 * jA) + (jA7 * j10) + (jA6 * jA3);
            long j14 = (jA10 * j4) + (jA9 * jA) + (jA8 * j10) + (jA7 * jA3) + (jA6 * jA4);
            long j15 = jA9 * j10;
            long j16 = jA10 * jA;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jA8 * jA3) + (jA7 * jA4) + (jA6 * jA5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jA2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jA11 = a(16, bArr) + j50;
        long j54 = jA11 & 4294967295L;
        long jA12 = a(20, bArr) + j51 + (jA11 >> 32);
        long jA13 = a(24, bArr) + j52 + (jA12 >> 32);
        long jA14 = (a(28, bArr) + j53 + (jA13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        b(j54, bArr4, 0);
        b(jA12 & 4294967295L, bArr4, 4);
        b(jA13 & 4294967295L, bArr4, 8);
        b(jA14, bArr4, 12);
        return bArr4;
    }
}
