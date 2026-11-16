package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzicr {
    public static byte[] b(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }

    public static ECParameterSpec a(zzicp zzicpVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzicpVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return zzhoc.c;
                }
                throw new NoSuchAlgorithmException("curve not implemented:".concat(zzicpVar.toString()));
            }
            return zzhoc.b;
        }
        return zzhoc.a;
    }
}
