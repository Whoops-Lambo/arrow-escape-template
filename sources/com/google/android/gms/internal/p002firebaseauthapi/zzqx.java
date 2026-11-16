package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzqx {
    public static final zzqw a = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqw
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
        public final zzbt a(zzcs zzcsVar, Integer num) throws GeneralSecurityException {
            zzra zzraVar = (zzra) zzcsVar;
            zzqw zzqwVar = zzqx.a;
            int i = zzraVar.a;
            if (i != 32) {
                e.d("AesCmacKey size wrong, must be 32 bytes");
                return null;
            }
            zzqt.zza zzaVar = new zzqt.zza(0);
            zzaVar.a = zzraVar;
            zzaVar.b = zzaav.a(i);
            zzaVar.c = num;
            return zzaVar.a();
        }
    };
    public static final j65 b = new j65(zzqt.class, zzrd.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqz
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) throws GeneralSecurityException {
            zzqt zzqtVar = (zzqt) zzbtVar;
            zzqw zzqwVar = zzqx.a;
            if (zzqtVar.a.a != 32) {
                e.d("AesCmacKey size wrong, must be 32 bytes");
                return null;
            }
            if (!zzjd.zza.a.zza()) {
                e.d("Cannot use AES-CMAC in FIPS-mode.");
                return null;
            }
            Provider providerA = zznt.a();
            if (providerA != null) {
                try {
                    return zzsh.a(zzqtVar, providerA);
                } catch (GeneralSecurityException unused) {
                }
            }
            return new zzsg();
        }
    });
    public static final j65 c = new j65(zzqt.class, zzcp.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqy
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object a(zzbt zzbtVar) throws GeneralSecurityException {
            zzqt zzqtVar = (zzqt) zzbtVar;
            zzqw zzqwVar = zzqx.a;
            if (zzqtVar.a.a == 32) {
                return new zzaan(zzqtVar);
            }
            e.d("AesCmacKey size wrong, must be 32 bytes");
            return null;
        }
    });
    public static final zzol d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.firebase-auth-api.zzqw] */
    static {
        zztf.C();
        d = new zzol("type.googleapis.com/google.crypto.tink.AesCmacKey", zzcp.class, zzxg.zza.SYMMETRIC);
    }
}
