package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhmr {
    public static void c(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long jB = b(0, bArr) & 67108863;
        int i = 3;
        long jB2 = b(3, bArr) >> 2;
        long jB3 = b(6, bArr) >> 4;
        long jB4 = b(9, bArr) >> 6;
        long jB5 = b(12, bArr) >> 8;
        byte[] bArr3 = new byte[17];
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j6 = j + (j2 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j3 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = ((j10 >> 26) * 5) + j5;
                long j13 = j12 >> 26;
                long j14 = j12 & 67108863;
                long j15 = j14 + 5;
                long j16 = (j2 & 67108863) + j13;
                long j17 = j16 + (j15 >> 26);
                long j18 = j7 + (j17 >> 26);
                long j19 = j9 + (j18 >> 26);
                long j20 = (j11 + (j19 >> 26)) - 67108864;
                long j21 = j20 >> 63;
                long j22 = ~j21;
                long j23 = (j16 & j21) | (j17 & 67108863 & j22);
                long j24 = (j7 & j21) | (j18 & 67108863 & j22);
                long j25 = (j9 & j21) | (j19 & 67108863 & j22);
                long jB6 = b(16, bArr) + (((j15 & 67108863 & j22) | (j14 & j21) | (j23 << 26)) & 4294967295L);
                long jB7 = b(20, bArr);
                long jB8 = b(24, bArr);
                long jB9 = b(28, bArr) + (((j25 >> 18) | (((j11 & j21) | (j20 & j22)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                c(jB6 & 4294967295L, bArr4, 0);
                long j26 = jB7 + (((j23 >> 6) | (j24 << 20)) & 4294967295L) + (jB6 >> 32);
                c(j26 & 4294967295L, bArr4, 4);
                long j27 = jB8 + (((j25 << 14) | (j24 >> 12)) & 4294967295L) + (j26 >> 32);
                c(j27 & 4294967295L, bArr4, 8);
                c((jB9 + (j27 >> 32)) & 4294967295L, bArr4, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j28 = jB5 & 1048575;
            long j29 = jB4 & 66076671;
            long j30 = jB3 & 67092735;
            long j31 = jB2 & 67108611;
            long j32 = j28 * 5;
            long j33 = j29 * 5;
            long j34 = j30 * 5;
            long jB10 = j5 + (b(0, bArr3) & 67108863);
            long jB11 = j2 + ((b(i, bArr3) >> 2) & 67108863);
            long jB12 = j + ((b(6, bArr3) >> 4) & 67108863);
            long jB13 = j3 + (b(9, bArr3) >> 6);
            long jB14 = j4 + ((b(12, bArr3) >> 8) | ((long) (bArr3[16] << 24)));
            long j35 = jB14 * jB;
            long j36 = (j31 * 5 * jB14) + (jB13 * j34) + (jB12 * j33) + (jB11 * j32) + (jB10 * jB);
            long j37 = (j34 * jB14) + (jB13 * j33) + (jB12 * j32) + (jB10 * j31) + (jB11 * jB) + (j36 >> 26);
            long j38 = j33 * jB14;
            long j39 = j38 + (jB13 * j32) + (jB11 * j31) + (jB10 * j30) + (jB12 * jB) + (j37 >> 26);
            long j40 = (jB14 * j32) + (jB12 * j31) + (jB11 * j30) + (jB10 * j29) + (jB13 * jB) + (j39 >> 26);
            long j41 = jB13 * j31;
            long j42 = j41 + (jB12 * j30) + (jB11 * j29) + (jB10 * j28) + j35 + (j40 >> 26);
            long j43 = j42 & 67108863;
            long j44 = ((j42 >> 26) * 5) + (j36 & 67108863);
            j5 = j44 & 67108863;
            j2 = (j37 & 67108863) + (j44 >> 26);
            i2 += 16;
            j3 = j40 & 67108863;
            jB2 = jB2;
            i = 3;
            j4 = j43;
            j = j39 & 67108863;
        }
    }

    public static long b(int i, byte[] bArr) {
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((long) (((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16))) & 4294967295L;
    }
}
