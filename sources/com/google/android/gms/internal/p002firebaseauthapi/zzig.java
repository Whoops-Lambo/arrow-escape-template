package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzig implements zzbm {
    public final zzbm a;
    public final byte[] b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        zzbm zzbmVar = this.a;
        if (length == 0) {
            return zzbmVar.a(bArr, bArr2);
        }
        if (zzqu.b(bArr3, bArr)) {
            return zzbmVar.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        e.d("wrong prefix");
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        zzbm zzbmVar = this.a;
        return length == 0 ? zzbmVar.b(bArr, bArr2) : zzzi.d(bArr3, zzbmVar.b(bArr, bArr2));
    }

    public zzig(zzbm zzbmVar, byte[] bArr) {
        this.a = zzbmVar;
        if (bArr.length != 0 && bArr.length != 5) {
            d.r("identifier has an invalid length");
            throw null;
        }
        this.b = bArr;
    }
}
