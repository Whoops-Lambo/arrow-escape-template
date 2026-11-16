package com.google.android.gms.internal.ads;

import defpackage.nv4;
import defpackage.ov4;
import defpackage.wb0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhmo extends ov4 {
    @Override // defpackage.ov4
    public final int[] d(int i, int[] iArr) {
        int length = iArr.length;
        if (length != 6) {
            wb0.g("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        int[] iArrD = nv4.d(this.a, iArr);
        int[] iArr3 = nv4.a;
        int length2 = iArr3.length;
        System.arraycopy(iArr3, 0, iArr2, 0, length2);
        System.arraycopy(iArrD, 0, iArr2, length2, 8);
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // defpackage.ov4
    public final int e() {
        return 24;
    }
}
