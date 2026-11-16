package com.google.android.gms.internal.ads;

import defpackage.dr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzawc implements zzawb {
    @Override // com.google.android.gms.internal.ads.zzawb
    public final zzawn a(zzawn zzawnVar, int i, int i2) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i < 0 || i > i2 || i2 > (length = (bArr = zzawnVar.a).length) || i > i2 || i2 > length) {
            dr0.b();
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr3, 0, i3);
            bArr2 = bArr3;
        }
        return new zzawn(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final zzawb zzc() {
        return new zzawc();
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final byte b(zzawn zzawnVar, int i) {
        return zzawnVar.b(i);
    }
}
