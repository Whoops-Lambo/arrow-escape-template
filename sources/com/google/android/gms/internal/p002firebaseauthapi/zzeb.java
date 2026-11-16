package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeb {
    public static final j65 a = new j65(zzdx.class, zzbm.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzea
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) {
            return zzzb.c((zzdx) zzbtVar);
        }
    });
    public static final zzol b;
    public static final zzed c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzed] */
    static {
        zzud.C();
        b = new zzol("type.googleapis.com/google.crypto.tink.AesEaxKey", zzbm.class, zzxg.zza.SYMMETRIC);
        c = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzed
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzbt a(zzcs zzcsVar, Integer num) throws GeneralSecurityException {
                zzec zzecVar = (zzec) zzcsVar;
                j65 j65Var = zzeb.a;
                int i = zzecVar.a;
                if (i == 24) {
                    e.d("192 bit AES EAX Parameters are not valid");
                    return null;
                }
                zzdx.zza zzaVar = new zzdx.zza(0);
                zzaVar.a = zzecVar;
                zzaVar.c = num;
                zzaVar.b = zzaav.a(i);
                return zzaVar.a();
            }
        };
    }
}
