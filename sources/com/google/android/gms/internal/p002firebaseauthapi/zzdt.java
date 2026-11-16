package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdt {
    public static final j65 a = new j65(zzdp.class, zzbm.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzds
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) {
            return zzzs.c((zzdp) zzbtVar);
        }
    });
    public static final zzol b;
    public static final zzdv c;
    public static final zzdu d;
    public static final m e;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzdv] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzdu] */
    static {
        zzto.C();
        b = new zzol("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzbm.class, zzxg.zza.SYMMETRIC);
        c = new zzoz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdv
        };
        d = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzbt a(zzcs zzcsVar, Integer num) throws GeneralSecurityException {
                zzdw zzdwVar = (zzdw) zzcsVar;
                j65 j65Var = zzdt.a;
                int i = zzdwVar.a;
                if (i != 16 && i != 32) {
                    e.d("AES key size must be 16 or 32 bytes");
                    return null;
                }
                zzdp.zza zzaVar = new zzdp.zza(0);
                zzaVar.a = zzdwVar;
                zzaVar.d = num;
                zzaVar.b = zzaav.a(i);
                zzaVar.c = zzaav.a(zzdwVar.b);
                return zzaVar.a();
            }
        };
        e = zzjd.zza.b;
    }
}
