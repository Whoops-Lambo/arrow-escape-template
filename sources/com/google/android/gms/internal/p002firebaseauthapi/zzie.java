package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ov4;
import defpackage.tw4;
import defpackage.wb0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzie extends ov4 {
    @Override // defpackage.ov4
    public final int[] d(int i, int[] iArr) {
        if (iArr.length != 6) {
            wb0.g("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)});
            return null;
        }
        int[] iArr2 = new int[16];
        int[] iArrE = tw4.e(this.a, iArr);
        int[] iArr3 = tw4.a;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(iArrE, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // defpackage.ov4
    public final int a() {
        return 24;
    }
}
