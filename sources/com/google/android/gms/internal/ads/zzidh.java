package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzidh {
    public static byte[] a(String str) {
        if ((str.length() & 1) == 0) {
            int length = str.length() >> 1;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                int iDigit = Character.digit(str.charAt(i2), 16);
                int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (iDigit != -1 && iDigit2 != -1) {
                    bArr[i] = (byte) ((iDigit * 16) + iDigit2);
                } else {
                    defpackage.d.r("input is not hexadecimal");
                    return null;
                }
            }
            return bArr;
        }
        defpackage.d.r("Expected a string of even length");
        return null;
    }
}
