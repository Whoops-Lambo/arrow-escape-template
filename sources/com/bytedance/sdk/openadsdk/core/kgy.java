package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class kgy {
    private static final String kgy = rz();
    private static final String ahm = xh.uq().uq();

    public static String ahm() {
        return new String(Base64.decode(ahm, 0)).substring(2);
    }

    public static String kgy() {
        return new String(Base64.decode(kgy, 0)).substring(2);
    }

    private static String rz() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i = 23; i >= 0; i--) {
            cArr2[23 - i] = (char) (cArr[i] ^ 255);
        }
        return new String(cArr2);
    }
}
