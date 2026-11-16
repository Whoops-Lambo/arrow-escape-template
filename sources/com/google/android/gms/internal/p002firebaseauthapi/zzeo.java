package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeo {
    public static final j65 a = new j65(zzen.class, zzbm.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzer
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) {
            return zziy.c((zzen) zzbtVar);
        }
    });
    public static final zzeq b = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
        public final zzbt a(zzcs zzcsVar, Integer num) {
            zzes zzesVar = (zzes) zzcsVar;
            j65 j65Var = zzeo.a;
            zzen.zza zzaVar = new zzen.zza(0);
            zzaVar.a = zzesVar;
            zzaVar.c = num;
            zzaVar.b = zzaav.a(zzesVar.a);
            return zzaVar.a();
        }
    };
    public static final zzet c = new zzoz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzet
    };
    public static final zzol d;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.firebase-auth-api.zzeq] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzet] */
    static {
        zzus.A();
        d = new zzol("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzbm.class, zzxg.zza.SYMMETRIC);
    }
}
