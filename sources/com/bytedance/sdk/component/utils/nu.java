package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class nu {
    private static final byte[] kgy = kgy("VP8X");

    public static boolean kgy(byte[] bArr, int i) {
        try {
            boolean zKgy = kgy(bArr, i + 12, kgy);
            int i2 = i + 20;
            if (bArr.length <= i2) {
                return false;
            }
            return zKgy && ((bArr[i2] & 2) == 2);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "cuMskgaQZsaEf8NUgAI=", "Uv0MmwqxaNOFTuBYjgGILVrqKIc=", 30);
            return false;
        }
    }

    private static byte[] kgy(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "cuMskgaQZsaEf8NUgAI=", "Wv0unAqecNOFWQ==", 14);
            return new byte[1];
        }
    }

    private static boolean kgy(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
