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
public final class zzhd {
    public static final b65 a = new b65(zzel.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhg
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
        public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
            zzel zzelVar = (zzel) zzcsVar;
            zzhd.c(zzelVar);
            zzcv zzcvVarA = zzhd.a(zzelVar.d);
            zzup.zza zzaVarY = zzup.y();
            int i = zzelVar.a;
            zzaVarY.i();
            ((zzup) zzaVarY.b).zze = i;
            return zzcx.a(((zzup) zzaVarY.f()).a(), zzcvVarA, "type.googleapis.com/google.crypto.tink.AesGcmKey");
        }
    });
    public static final y55 b = new y55("type.googleapis.com/google.crypto.tink.AesGcmKey", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhf
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
            b65 b65Var = zzhd.a;
            String str = zzcxVar.b;
            if (!str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                d.r(n30.y("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", str));
                return null;
            }
            try {
                zzup zzupVarV = zzup.v(zzcxVar.a, zzalf.b);
                if (zzupVarV.x() != 0) {
                    e.d("Only version 0 parameters are accepted");
                    return null;
                }
                zzel.zza zzaVarB = zzel.b();
                zzaVarB.c(zzupVarV.u());
                zzaVarB.b();
                zzaVarB.d();
                zzaVarB.d = zzhd.b(zzcxVar.c);
                return zzaVarB.a();
            } catch (zzamd e) {
                y.m("Parsing AesGcmParameters failed: ", e);
                return null;
            }
        }
    });
    public static final x45 c = new x45(zzee.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
        public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
            zzee zzeeVar = (zzee) zzbtVar;
            b65 b65Var = zzhd.a;
            zzhd.c(zzeeVar.a);
            zzum.zza zzaVarX = zzum.x();
            zzaav zzaavVar = zzeeVar.b;
            zzdd.a(zzddVar);
            byte[] bArrC = zzaavVar.c(zzddVar);
            lr3 lr3VarK = zzakb.k(0, bArrC.length, bArrC);
            zzaVarX.i();
            zzum.w((zzum) zzaVarX.b, lr3VarK);
            return zzct.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzum) zzaVarX.f()).a(), zzcw.c, zzhd.a(zzeeVar.a.d), zzeeVar.d);
        }
    });
    public static final u45 d = new u45("type.googleapis.com/google.crypto.tink.AesGcmKey", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhh
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
            b65 b65Var = zzhd.a;
            if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                d.r("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                return null;
            }
            try {
                zzum zzumVarV = zzum.v(zzctVar.b, zzalf.b);
                if (zzumVarV.u() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                zzel.zza zzaVarB = zzel.b();
                zzaVarB.c(zzumVarV.z().d());
                zzaVarB.b();
                zzaVarB.d();
                zzaVarB.d = zzhd.b(zzctVar.d);
                zzel zzelVarA = zzaVarB.a();
                zzee.zza zzaVar = new zzee.zza(0);
                zzaVar.a = zzelVarA;
                byte[] bArrA = zzumVarV.z().A();
                zzdd.a(zzddVar);
                zzaVar.b = zzaav.b(bArrA, zzddVar);
                zzaVar.c = zzctVar.e;
                return zzaVar.a();
            } catch (zzamd unused) {
                e.d("Parsing AesGcmKey failed");
                return null;
            }
        }
    });

    public static zzcv a(zzel.zzb zzbVar) throws GeneralSecurityException {
        if (zzbVar.equals(zzel.zzb.b)) {
            return zzcv.c;
        }
        if (zzbVar == zzel.zzb.c) {
            return zzcv.f;
        }
        if (zzbVar == zzel.zzb.d) {
            return zzcv.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static zzel.zzb b(zzcv zzcvVar) throws GeneralSecurityException {
        if (zzcvVar == zzcv.c) {
            return zzel.zzb.b;
        }
        zzcv zzcvVar2 = zzcv.f;
        zzel.zzb zzbVar = zzel.zzb.c;
        if (zzcvVar == zzcvVar2 || zzcvVar == zzcv.d) {
            return zzbVar;
        }
        if (zzcvVar == zzcv.e) {
            return zzel.zzb.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }

    public static void c(zzel zzelVar) throws GeneralSecurityException {
        int i = zzelVar.c;
        int i2 = zzelVar.b;
        if (i != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzelVar.c)));
        }
        if (i2 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i2)));
        }
    }
}
