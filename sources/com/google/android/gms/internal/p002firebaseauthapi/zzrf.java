package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzrf {
    public static final j65 a = new j65(zzre.class, zzrd.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzri
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) throws GeneralSecurityException {
            zzsj zzsjVar = new zzsj();
            if (zzjd.zza.b.zza()) {
                return zzsjVar;
            }
            e.d("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
    });
    public static final j65 b = new j65(zzre.class, zzcp.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrh
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) {
            return new zzaan((zzre) zzbtVar);
        }
    });
    public static final zzol c;
    public static final zzrk d;
    public static final zzrj e;
    public static final m f;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzrk] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.firebase-auth-api.zzrj] */
    static {
        zzwg.u();
        c = new zzol("type.googleapis.com/google.crypto.tink.HmacKey", zzcp.class, zzxg.zza.SYMMETRIC);
        d = new zzoz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrk
        };
        e = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzbt a(zzcs zzcsVar, Integer num) {
                zzrl zzrlVar = (zzrl) zzcsVar;
                j65 j65Var = zzrf.a;
                zzre.zza zzaVar = new zzre.zza(0);
                zzaVar.a = zzrlVar;
                zzaVar.b = zzaav.a(zzrlVar.a);
                zzaVar.c = num;
                return zzaVar.a();
            }
        };
        f = zzjd.zza.b;
    }
}
