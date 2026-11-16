package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class p implements zzlu {
    public final zzdw a;
    public final int b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final byte[] a(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length < i) {
            e.d("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
        zzdw zzdwVar = this.a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, zzdwVar.a);
        int i2 = zzdwVar.a;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, zzdwVar.b + i2);
        zzdp.zza zzaVar = new zzdp.zza(0);
        zzaVar.a = zzdwVar;
        zzdd zzddVar = zzdd.a;
        zzaVar.b = zzaav.b(bArrCopyOf, zzddVar);
        zzaVar.c = zzaav.b(bArrCopyOfRange2, zzddVar);
        return zzzs.c(zzaVar.a()).a(bArrCopyOfRange, zzlq.a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final int zza() {
        return this.b;
    }

    public p(zzdw zzdwVar) {
        this.a = zzdwVar;
        this.b = zzdwVar.a + zzdwVar.b;
    }
}
