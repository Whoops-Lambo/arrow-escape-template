package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgn {
    public static final j65 a = new j65(zzgl.class, zzbm.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgm
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) {
            zzgl zzglVar = (zzgl) zzbtVar;
            zzaau zzaauVar = zzglVar.c;
            zzaav zzaavVar = zzglVar.b;
            j65 j65Var = zzgn.a;
            if (!zzhp.d()) {
                return new zzaar(zzaavVar.c(zzdd.a), zzaauVar.b());
            }
            return new zzis(zzaavVar.c(zzdd.a), zzaauVar.b(), zzhp.c().getProvider());
        }
    });
    public static final zzol b;
    public static final zzgp c;
    public static final zzgo d;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzgp] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzgo] */
    static {
        zzyt.A();
        b = new zzol("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzbm.class, zzxg.zza.SYMMETRIC);
        c = new zzoz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
        };
        d = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgo
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzbt a(zzcs zzcsVar, Integer num) {
                j65 j65Var = zzgn.a;
                return zzgl.e(((zzgq) zzcsVar).a, zzaav.a(32), num);
            }
        };
    }
}
