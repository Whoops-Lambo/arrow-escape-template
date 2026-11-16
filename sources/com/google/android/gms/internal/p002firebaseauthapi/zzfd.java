package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.j65;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfd {
    public static final zzol a;
    public static final zzfg b;
    public static final j65 c;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.firebase-auth-api.zzfg] */
    static {
        zzyc.A();
        a = new zzol("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzbm.class, zzxg.zza.SYMMETRIC);
        b = new zzob() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
            public final zzbt a(zzcs zzcsVar, Integer num) {
                zzol zzolVar = zzfd.a;
                return zzfp.e((zzfo) zzcsVar, num);
            }
        };
        c = new j65(zzfp.class, zzbm.class, new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzff
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
            public final Object a(zzbt zzbtVar) throws GeneralSecurityException {
                zzfp zzfpVar = (zzfp) zzbtVar;
                zzol zzolVar = zzfd.a;
                zzfo zzfoVar = zzfpVar.a;
                String str = zzfoVar.b;
                zzdo zzdoVar = zzfoVar.d;
                zznr zznrVarZza = zzcn.a(str).zza(str);
                byte[] bArr = zzfe.d;
                try {
                    return new zzig(new zzfe(zzxk.w(zzdg.b(zzdoVar), zzalf.b), zznrVarZza), zzfpVar.b.b());
                } catch (zzamd e) {
                    throw new GeneralSecurityException(e);
                }
            }
        });
    }
}
