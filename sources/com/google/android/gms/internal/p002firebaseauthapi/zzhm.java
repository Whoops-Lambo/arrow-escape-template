package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.b65;
import defpackage.d;
import defpackage.lr3;
import defpackage.n30;
import defpackage.u45;
import defpackage.x45;
import defpackage.y55;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.media3.extractor.ts.y;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhm {
    public static final b65 a = new b65(zzes.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhl
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
        public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
            zzes zzesVar = (zzes) zzcsVar;
            b65 b65Var = zzhm.a;
            zzcv zzcvVarA = zzhm.a(zzesVar.b);
            zzuv.zza zzaVarY = zzuv.y();
            int i = zzesVar.a;
            zzaVarY.i();
            ((zzuv) zzaVarY.b).zze = i;
            return zzcx.a(((zzuv) zzaVarY.f()).a(), zzcvVarA, "type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        }
    });
    public static final y55 b = new y55("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzho
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
            b65 b65Var = zzhm.a;
            String str = zzcxVar.b;
            if (!str.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                d.r(n30.y("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", str));
                return null;
            }
            try {
                zzuv zzuvVarV = zzuv.v(zzcxVar.a, zzalf.b);
                if (zzuvVarV.x() != 0) {
                    e.d("Only version 0 parameters are accepted");
                    return null;
                }
                zzes.zzb zzbVarB = zzes.b();
                zzbVarB.b(zzuvVarV.u());
                zzbVarB.b = zzhm.b(zzcxVar.c);
                return zzbVarB.a();
            } catch (zzamd e) {
                y.m("Parsing AesGcmSivParameters failed: ", e);
                return null;
            }
        }
    });
    public static final x45 c = new x45(zzen.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
        public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
            zzen zzenVar = (zzen) zzbtVar;
            b65 b65Var = zzhm.a;
            zzus.zza zzaVarX = zzus.x();
            zzaav zzaavVar = zzenVar.b;
            zzdd.a(zzddVar);
            byte[] bArrC = zzaavVar.c(zzddVar);
            lr3 lr3VarK = zzakb.k(0, bArrC.length, bArrC);
            zzaVarX.i();
            zzus.w((zzus) zzaVarX.b, lr3VarK);
            return zzct.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzus) zzaVarX.f()).a(), zzcw.c, zzhm.a(zzenVar.a.b), zzenVar.d);
        }
    });
    public static final u45 d = new u45("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
            b65 b65Var = zzhm.a;
            if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                d.r("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                return null;
            }
            try {
                zzus zzusVarV = zzus.v(zzctVar.b, zzalf.b);
                if (zzusVarV.u() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                zzes.zzb zzbVarB = zzes.b();
                zzbVarB.b(zzusVarV.z().d());
                zzbVarB.b = zzhm.b(zzctVar.d);
                zzes zzesVarA = zzbVarB.a();
                zzen.zza zzaVar = new zzen.zza(0);
                zzaVar.a = zzesVarA;
                byte[] bArrA = zzusVarV.z().A();
                zzdd.a(zzddVar);
                zzaVar.b = zzaav.b(bArrA, zzddVar);
                zzaVar.c = zzctVar.e;
                return zzaVar.a();
            } catch (zzamd unused) {
                e.d("Parsing AesGcmSivKey failed");
                return null;
            }
        }
    });

    public static zzcv a(zzes.zza zzaVar) throws GeneralSecurityException {
        if (zzaVar.equals(zzes.zza.b)) {
            return zzcv.c;
        }
        if (zzaVar == zzes.zza.c) {
            return zzcv.f;
        }
        if (zzaVar == zzes.zza.d) {
            return zzcv.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static zzes.zza b(zzcv zzcvVar) throws GeneralSecurityException {
        if (zzcvVar == zzcv.c) {
            return zzes.zza.b;
        }
        zzcv zzcvVar2 = zzcv.f;
        zzes.zza zzaVar = zzes.zza.c;
        if (zzcvVar == zzcvVar2 || zzcvVar == zzcv.d) {
            return zzaVar;
        }
        if (zzcvVar == zzcv.e) {
            return zzes.zza.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }
}
