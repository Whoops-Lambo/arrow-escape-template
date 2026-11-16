package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbcu {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public static long b(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / ((double) displayMetrics.density));
    }

    public static byte[] a(String str) {
        int length = str.length();
        if ((length & 1) == 0) {
            byte[] bArr = new byte[length >> 1];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
            }
            return bArr;
        }
        defpackage.d.r("String must be of even-length");
        return null;
    }
}
