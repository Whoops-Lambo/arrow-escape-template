package io.p071bidmachine.iab.utils;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final byte[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v22, types: [int] */
    public static void a(byte[] bArr, int i, b bVar) {
        byte b;
        if (bVar.e) {
            return;
        }
        ?? r2 = 1;
        if (i < 0) {
            bVar.e = true;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 == 61) {
                bVar.e = r2;
                break;
            }
            byte[] bArrB = b(bVar);
            if (b2 >= 0 && b2 < 123 && (b = a[b2]) >= 0) {
                int i5 = (bVar.f + r2) % 8;
                bVar.f = i5;
                long j = (bVar.a << 5) + ((long) b);
                bVar.a = j;
                if (i5 == 0) {
                    int i6 = bVar.c;
                    int i7 = i6 + 1;
                    bVar.c = i7;
                    bArrB[i6] = (byte) ((j >> 32) & 255);
                    int i8 = i6 + 2;
                    bVar.c = i8;
                    bArrB[i7] = (byte) ((j >> 24) & 255);
                    int i9 = i6 + 3;
                    bVar.c = i9;
                    bArrB[i8] = (byte) ((j >> 16) & 255);
                    int i10 = i6 + 4;
                    bVar.c = i10;
                    bArrB[i9] = (byte) ((j >> 8) & 255);
                    bVar.c = i6 + 5;
                    bArrB[i10] = (byte) (j & 255);
                }
            }
            i2++;
            i3 = i4;
            r2 = r2;
        }
        ?? r17 = r2;
        if (!bVar.e || bVar.f <= 0) {
            return;
        }
        byte[] bArrB2 = b(bVar);
        switch (bVar.f) {
            case 1:
            case 2:
                int i11 = bVar.c;
                bVar.c = i11 + 1;
                bArrB2[i11] = (byte) ((bVar.a >> 2) & 255);
                break;
            case 3:
                int i12 = bVar.c;
                bVar.c = i12 + 1;
                bArrB2[i12] = (byte) ((bVar.a >> 7) & 255);
                break;
            case 4:
                long j2 = bVar.a;
                long j3 = j2 >> 4;
                bVar.a = j3;
                int i13 = bVar.c;
                int i14 = i13 + 1;
                bVar.c = i14;
                bArrB2[i13] = (byte) ((j2 >> 12) & 255);
                bVar.c = i13 + 2;
                bArrB2[i14] = (byte) (j3 & 255);
                break;
            case 5:
                long j4 = bVar.a;
                long j5 = j4 >> (r17 == true ? 1L : 0L);
                bVar.a = j5;
                int i15 = bVar.c;
                int i16 = i15 + 1;
                bVar.c = i16;
                bArrB2[i15] = (byte) ((j4 >> 17) & 255);
                int i17 = i15 + 2;
                bVar.c = i17;
                bArrB2[i16] = (byte) ((j4 >> 9) & 255);
                bVar.c = i15 + 3;
                bArrB2[i17] = (byte) (j5 & 255);
                break;
            case 6:
                long j6 = bVar.a;
                long j7 = j6 >> 6;
                bVar.a = j7;
                int i18 = bVar.c;
                int i19 = i18 + 1;
                bVar.c = i19;
                bArrB2[i18] = (byte) ((j6 >> 22) & 255);
                int i20 = i18 + 2;
                bVar.c = i20;
                bArrB2[i19] = (byte) ((j6 >> 14) & 255);
                bVar.c = i18 + 3;
                bArrB2[i20] = (byte) (j7 & 255);
                break;
            case 7:
                long j8 = bVar.a;
                long j9 = j8 >> 3;
                bVar.a = j9;
                int i21 = bVar.c;
                int i22 = i21 + 1;
                bVar.c = i22;
                bArrB2[i21] = (byte) ((j8 >> 27) & 255);
                int i23 = i21 + 2;
                bVar.c = i23;
                bArrB2[i22] = (byte) ((j8 >> 19) & 255);
                int i24 = i21 + 3;
                bVar.c = i24;
                bArrB2[i23] = (byte) ((j8 >> 11) & 255);
                bVar.c = i21 + 4;
                bArrB2[i24] = (byte) (j9 & 255);
                break;
            default:
                e.e(bVar.f, "Impossible modulus ");
                break;
        }
    }

    public static byte[] b(b bVar) {
        byte[] bArr = bVar.b;
        if (bArr == null) {
            bVar.b = new byte[Math.max(7, 8192)];
            bVar.c = 0;
            bVar.d = 0;
        } else {
            int i = bVar.c;
            int i2 = i + 7;
            if (i2 - bArr.length > 0) {
                int length = bArr.length * 2;
                if (length - Integer.MIN_VALUE < i - 2147483641) {
                    length = i2;
                }
                int i3 = Integer.MIN_VALUE + length;
                if (i3 >= -9 && i3 != -9) {
                    length = Math.max(i2, 2147483639);
                }
                byte[] bArr2 = new byte[length];
                byte[] bArr3 = bVar.b;
                System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                bVar.b = bArr2;
                return bArr2;
            }
        }
        return bVar.b;
    }

    public static String c(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        if (bytes == null || bytes.length == 0) {
            return new String(bytes);
        }
        b bVar = new b();
        a(bytes, bytes.length, bVar);
        a(bytes, -1, bVar);
        int i = bVar.c;
        byte[] bArr = new byte[i];
        if (bVar.b != null) {
            int iMin = Math.min(i - bVar.d, i);
            System.arraycopy(bVar.b, bVar.d, bArr, 0, iMin);
            int i2 = bVar.d + iMin;
            bVar.d = i2;
            if (i2 >= bVar.c) {
                bVar.b = null;
            }
        }
        return new String(bArr);
    }
}
