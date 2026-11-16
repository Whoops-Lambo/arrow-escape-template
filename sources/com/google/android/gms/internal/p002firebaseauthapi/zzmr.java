package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzmr implements zzbs {
    public final zzbs a;
    public final byte[] b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        zzbs zzbsVar = this.a;
        if (length == 0) {
            return zzbsVar.a(bArr, null);
        }
        if (zzqu.b(bArr3, bArr)) {
            return zzbsVar.a(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), null);
        }
        e.d("Invalid ciphertext (output prefix mismatch)");
        return null;
    }

    public zzmr(zzbs zzbsVar, byte[] bArr) {
        this.a = zzbsVar;
        this.b = bArr;
    }
}
