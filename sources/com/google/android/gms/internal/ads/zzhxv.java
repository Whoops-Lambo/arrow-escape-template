package com.google.android.gms.internal.ads;

import defpackage.pv1;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhxv extends zziad {
    public final zzhyb a;
    public final zzidz b;

    public static zzhxv d(zzhyb zzhybVar, zzidz zzidzVar) throws GeneralSecurityException {
        zzidx zzidxVar = zzidzVar.a;
        if (zzidxVar.a.length != 32) {
            int length = zzidxVar.a.length;
            throw new GeneralSecurityException(pv1.l(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        byte[] bArrB = zzhybVar.b.b();
        zzhhg zzhhgVar = zzhhg.a;
        if (Arrays.equals(bArrB, zzhny.a(zzhny.b(zzidxVar.b())))) {
            return new zzhxv(zzhybVar, zzidzVar);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Ed25519 keys mismatch");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zziad, com.google.android.gms.internal.ads.zzhgc
    public final zzhgt a() {
        return this.a.a;
    }

    @Override // com.google.android.gms.internal.ads.zziad
    public final /* synthetic */ zziae c() {
        return this.a;
    }

    public zzhxv(zzhyb zzhybVar, zzidz zzidzVar) {
        this.a = zzhybVar;
        this.b = zzidzVar;
    }
}
