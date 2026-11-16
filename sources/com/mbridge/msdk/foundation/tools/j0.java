package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class j0 {
    public static final char[] a;
    public static final int[] b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        a = charArray;
        int[] iArr = new int[256];
        b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            b[a[i]] = i;
        }
        b[61] = 0;
    }

    public static byte[] b(String str) {
        int i;
        int i2;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i3 = length - 1;
        int i4 = 0;
        while (i4 < i3 && b[str.charAt(i4) & 255] < 0) {
            i4++;
        }
        while (i3 > 0 && b[str.charAt(i3) & 255] < 0) {
            i3--;
        }
        if (str.charAt(i3) == '=') {
            i = str.charAt(i3 + (-1)) == '=' ? 2 : 1;
        } else {
            i = 0;
        }
        int i5 = (i3 - i4) + 1;
        if (length > 76) {
            i2 = (str.charAt(76) == '\r' ? i5 / 78 : 0) << 1;
        } else {
            i2 = 0;
        }
        int i6 = (((i5 - i2) * 6) >> 3) - i;
        byte[] bArr = new byte[i6];
        int i7 = (i6 / 3) * 3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int[] iArr = b;
            int i10 = i4 + 4;
            int i11 = iArr[str.charAt(i4 + 3)] | (iArr[str.charAt(i4 + 1)] << 12) | (iArr[str.charAt(i4)] << 18) | (iArr[str.charAt(i4 + 2)] << 6);
            bArr[i8] = (byte) (i11 >> 16);
            int i12 = i8 + 2;
            bArr[i8 + 1] = (byte) (i11 >> 8);
            i8 += 3;
            bArr[i12] = (byte) i11;
            if (i2 <= 0 || (i9 = i9 + 1) != 19) {
                i4 = i10;
            } else {
                i4 += 6;
                i9 = 0;
            }
        }
        if (i8 < i6) {
            int i13 = 0;
            int i14 = 0;
            while (i4 <= i3 - i) {
                i13 |= b[str.charAt(i4)] << (18 - (i14 * 6));
                i14++;
                i4++;
            }
            int i15 = 16;
            while (i8 < i6) {
                bArr[i8] = (byte) (i13 >> i15);
                i15 -= 8;
                i8++;
            }
        }
        return bArr;
    }

    public static String a(String str) {
        byte[] bArrB = b(str);
        if (bArrB != null && bArrB.length != 0) {
            return new String(bArrB, StandardCharsets.UTF_8);
        }
        return "";
    }
}
