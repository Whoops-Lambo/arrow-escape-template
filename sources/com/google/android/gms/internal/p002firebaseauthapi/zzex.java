package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzex {
    public static final j65 a = new j65(zzeu.class, zzbm.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzew
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) {
            zzeu zzeuVar = (zzeu) zzbtVar;
            zzaau zzaauVar = zzeuVar.c;
            zzaav zzaavVar = zzeuVar.b;
            j65 j65Var = zzex.a;
            if (!zzhp.d()) {
                return new zzzh(zzaavVar.c(zzdd.a), zzaauVar.b());
            }
            return new zzhp(zzaavVar.c(zzdd.a), zzaauVar.b(), zzhp.c().getProvider());
        }
    });
    public static final zzez b = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzez
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
        public final zzbt a(zzcs zzcsVar, Integer num) {
            j65 j65Var = zzex.a;
            return zzeu.e(((zzey) zzcsVar).a, zzaav.a(32), num);
        }
    };
    public static final zzol c;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.firebase-auth-api.zzez] */
    static {
        zzve.A();
        c = new zzol("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzbm.class, zzxg.zza.SYMMETRIC);
    }
}
