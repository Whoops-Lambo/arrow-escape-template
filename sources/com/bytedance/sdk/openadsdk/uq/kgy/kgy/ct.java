package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ct {
    private static final byte[] kgy = {105, -42, 73, -118, 67, -35, 89, -76, 122, -9, 45, 88, 34, 76, 10, 55};
    private static final byte[] ahm = {105, -42, 73, -118, 67, -35, 89, -76, 122, -9, 45, 88, 34, 76, 10, 55, 44, -67, 12, 10, 55, 44, 99, 123, 32, 3, 49, -34, 61, 22, 72, 33};
    private static byte[] rz = null;
    private static byte[] uq = null;

    public static byte[] ahm() {
        if (uq == null) {
            byte[] bArr = new byte[ahm.length];
            int i = 0;
            while (true) {
                byte[] bArr2 = ahm;
                if (i >= bArr2.length) {
                    break;
                }
                bArr[i] = (byte) (bArr2[i] ^ 20);
                i++;
            }
            uq = bArr;
        }
        return uq;
    }

    public static byte[] kgy() {
        if (rz == null) {
            byte[] bArr = new byte[kgy.length];
            int i = 0;
            while (true) {
                byte[] bArr2 = kgy;
                if (i >= bArr2.length) {
                    break;
                }
                bArr[i] = (byte) (bArr2[i] ^ 20);
                i++;
            }
            rz = bArr;
        }
        return rz;
    }
}
