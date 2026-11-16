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
/* JADX INFO: loaded from: classes7.dex */
public final class zzsb {
    public static final b65 a = new b65(zzra.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsa
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
        public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
            zzra zzraVar = (zzra) zzcsVar;
            b65 b65Var = zzsb.a;
            zzcv zzcvVarA = zzsb.a(zzraVar.c);
            zzti.zza zzaVarY = zzti.y();
            zztl.zza zzaVarW = zztl.w();
            int i = zzraVar.b;
            zzaVarW.i();
            ((zztl) zzaVarW.b).zze = i;
            zztl zztlVar = (zztl) zzaVarW.f();
            zzaVarY.i();
            zzti.x((zzti) zzaVarY.b, zztlVar);
            int i2 = zzraVar.a;
            zzaVarY.i();
            ((zzti) zzaVarY.b).zzf = i2;
            return zzcx.a(((zzti) zzaVarY.f()).a(), zzcvVarA, "type.googleapis.com/google.crypto.tink.AesCmacKey");
        }
    });
    public static final y55 b = new y55("type.googleapis.com/google.crypto.tink.AesCmacKey", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsd
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
            b65 b65Var = zzsb.a;
            String str = zzcxVar.b;
            if (!str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                d.r(n30.y("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", str));
                return null;
            }
            try {
                zzti zztiVarV = zzti.v(zzcxVar.a, zzalf.b);
                zzra.zza zzaVar = new zzra.zza(0);
                zzaVar.b(zztiVarV.u());
                zzaVar.c(zztiVarV.A().u());
                zzaVar.c = zzsb.b(zzcxVar.c);
                return zzaVar.a();
            } catch (zzamd e) {
                y.m("Parsing AesCmacParameters failed: ", e);
                return null;
            }
        }
    });
    public static final x45 c = new x45(zzqt.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsc
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
        public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
            zzqt zzqtVar = (zzqt) zzbtVar;
            b65 b65Var = zzsb.a;
            zztf.zza zzaVarY = zztf.y();
            zzra zzraVar = zzqtVar.a;
            zztl.zza zzaVarW = zztl.w();
            int i = zzraVar.b;
            zzaVarW.i();
            ((zztl) zzaVarW.b).zze = i;
            zztl zztlVar = (zztl) zzaVarW.f();
            zzaVarY.i();
            zztf.w((zztf) zzaVarY.b, zztlVar);
            zzaav zzaavVar = zzqtVar.b;
            zzdd.a(zzddVar);
            byte[] bArrC = zzaavVar.c(zzddVar);
            lr3 lr3VarK = zzakb.k(0, bArrC.length, bArrC);
            zzaVarY.i();
            zztf.x((zztf) zzaVarY.b, lr3VarK);
            return zzct.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zztf) zzaVarY.f()).a(), zzcw.c, zzsb.a(zzqtVar.a.c), zzqtVar.d);
        }
    });
    public static final u45 d = new u45("type.googleapis.com/google.crypto.tink.AesCmacKey", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsf
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
            b65 b65Var = zzsb.a;
            if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                d.r("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                return null;
            }
            try {
                zztf zztfVarV = zztf.v(zzctVar.b, zzalf.b);
                if (zztfVarV.u() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                zzra.zza zzaVar = new zzra.zza(0);
                zzaVar.b(zztfVarV.B().d());
                zzaVar.c(zztfVarV.A().u());
                zzaVar.c = zzsb.b(zzctVar.d);
                zzra zzraVarA = zzaVar.a();
                zzqt.zza zzaVar2 = new zzqt.zza(0);
                zzaVar2.a = zzraVarA;
                byte[] bArrA = zztfVarV.B().A();
                zzdd.a(zzddVar);
                zzaVar2.b = zzaav.b(bArrA, zzddVar);
                zzaVar2.c = zzctVar.e;
                return zzaVar2.a();
            } catch (zzamd | IllegalArgumentException unused) {
                e.d("Parsing AesCmacKey failed");
                return null;
            }
        }
    });

    public static zzcv a(zzra.zzb zzbVar) throws GeneralSecurityException {
        if (zzbVar.equals(zzra.zzb.b)) {
            return zzcv.c;
        }
        if (zzbVar == zzra.zzb.c) {
            return zzcv.f;
        }
        if (zzbVar == zzra.zzb.e) {
            return zzcv.e;
        }
        if (zzbVar == zzra.zzb.d) {
            return zzcv.d;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static zzra.zzb b(zzcv zzcvVar) throws GeneralSecurityException {
        if (zzcvVar == zzcv.c) {
            return zzra.zzb.b;
        }
        if (zzcvVar == zzcv.f) {
            return zzra.zzb.c;
        }
        if (zzcvVar == zzcv.d) {
            return zzra.zzb.d;
        }
        if (zzcvVar == zzcv.e) {
            return zzra.zzb.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }
}
