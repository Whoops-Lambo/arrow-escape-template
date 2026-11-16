package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzei {
    public static final j65 a = new j65(zzee.class, zzbm.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeh
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) {
            return zzzd.c((zzee) zzbtVar);
        }
    });
    public static final zzol b;
    public static final zzek c;
    public static final zzej d;
    public static final m e;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzek] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzej] */
    static {
        zzum.A();
        b = new zzol("type.googleapis.com/google.crypto.tink.AesGcmKey", zzbm.class, zzxg.zza.SYMMETRIC);
        c = new zzoz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzek
        };
        d = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzej
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzbt a(zzcs zzcsVar, Integer num) throws GeneralSecurityException {
                zzel zzelVar = (zzel) zzcsVar;
                j65 j65Var = zzei.a;
                int i = zzelVar.a;
                if (i == 24) {
                    e.d("192 bit AES GCM Parameters are not valid");
                    return null;
                }
                zzee.zza zzaVar = new zzee.zza(0);
                zzaVar.a = zzelVar;
                zzaVar.c = num;
                zzaVar.b = zzaav.a(i);
                return zzaVar.a();
            }
        };
        e = zzjd.zza.b;
    }
}
