package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhsf {
    public static byte[] a(byte[] bArr) {
        if (bArr.length != 16) {
            defpackage.d.r("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            byte b = bArr[i];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i2] >> 7) & 1) | b2);
            }
            i = i2;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
