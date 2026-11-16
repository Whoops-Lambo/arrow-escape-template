package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfa {
    public static final j65 a = new j65(zzfi.class, zzbm.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfc
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) {
            zzfi zzfiVar = (zzfi) zzbtVar;
            j65 j65Var = zzfa.a;
            zzfh zzfhVar = zzfiVar.a;
            return new zzig(zzcn.a(zzfhVar.a).zza(zzfhVar.a), zzfiVar.b.b());
        }
    });
    public static final zzol b;
    public static final zzfb c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzfb] */
    static {
        zzxw.A();
        b = new zzol("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzbm.class, zzxg.zza.REMOTE);
        c = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzbt a(zzcs zzcsVar, Integer num) {
                j65 j65Var = zzfa.a;
                return zzfi.e((zzfh) zzcsVar, num);
            }
        };
    }
}
