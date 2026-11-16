package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhmq implements zzhfw {
    public final zzhfw a;
    public final byte[] b;

    @Override // com.google.android.gms.internal.ads.zzhfw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        zzhfw zzhfwVar = this.a;
        if (length == 0) {
            return zzhfwVar.a(bArr, bArr2);
        }
        if (zzhqq.a(bArr3, bArr)) {
            return zzhfwVar.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("wrong prefix");
        return null;
    }

    public zzhmq(zzhfw zzhfwVar, byte[] bArr) {
        this.a = zzhfwVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            defpackage.d.r("identifier has an invalid length");
            throw null;
        }
        this.b = bArr;
    }
}
