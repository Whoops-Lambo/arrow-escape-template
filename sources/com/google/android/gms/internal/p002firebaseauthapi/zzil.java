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
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzil {
    public static final b65 a = new b65(zzgj.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzio
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
        public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
            zzgj zzgjVar = (zzgj) zzcsVar;
            b65 b65Var = zzil.a;
            zzcv zzcvVarA = zzil.a(zzgjVar.a);
            zzyn.zza zzaVarX = zzyn.x();
            zzyq.zza zzaVarW = zzyq.w();
            int i = zzgjVar.b;
            zzaVarW.i();
            ((zzyq) zzaVarW.b).zze = i;
            zzyq zzyqVar = (zzyq) zzaVarW.f();
            zzaVarX.i();
            zzyn.w((zzyn) zzaVarX.b, zzyqVar);
            return zzcx.a(((zzyn) zzaVarX.f()).a(), zzcvVarA, "type.googleapis.com/google.crypto.tink.XAesGcmKey");
        }
    });
    public static final y55 b = new y55("type.googleapis.com/google.crypto.tink.XAesGcmKey", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzin
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
            zzgj.zza zzaVar;
            b65 b65Var = zzil.a;
            String str = zzcxVar.b;
            if (!str.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                d.r(n30.y("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", str));
                return null;
            }
            try {
                zzyn zzynVarV = zzyn.v(zzcxVar.a, zzalf.b);
                if (zzynVarV.u() != 0) {
                    e.d("Only version 0 parameters are accepted");
                    return null;
                }
                zzcv zzcvVar = zzcxVar.c;
                if (zzcvVar == zzcv.c) {
                    zzaVar = zzgj.zza.b;
                } else {
                    if (zzcvVar != zzcv.e) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
                    }
                    zzaVar = zzgj.zza.c;
                }
                return zzgj.b(zzaVar, zzynVarV.z().u());
            } catch (zzamd e) {
                y.m("Parsing XAesGcmParameters failed: ", e);
                return null;
            }
        }
    });
    public static final x45 c = new x45(zzgf.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zziq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
        public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
            zzgf zzgfVar = (zzgf) zzbtVar;
            b65 b65Var = zzil.a;
            zzyk.zza zzaVarY = zzyk.y();
            zzaav zzaavVar = zzgfVar.b;
            zzdd.a(zzddVar);
            byte[] bArrC = zzaavVar.c(zzddVar);
            lr3 lr3VarK = zzakb.k(0, bArrC.length, bArrC);
            zzaVarY.i();
            zzyk.x((zzyk) zzaVarY.b, lr3VarK);
            zzyq.zza zzaVarW = zzyq.w();
            zzgj zzgjVar = zzgfVar.a;
            int i = zzgjVar.b;
            zzaVarW.i();
            ((zzyq) zzaVarW.b).zze = i;
            zzyq zzyqVar = (zzyq) zzaVarW.f();
            zzaVarY.i();
            zzyk.w((zzyk) zzaVarY.b, zzyqVar);
            return zzct.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzyk) zzaVarY.f()).a(), zzcw.c, zzil.a(zzgjVar.a), zzgfVar.d);
        }
    });
    public static final u45 d = new u45("type.googleapis.com/google.crypto.tink.XAesGcmKey", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzip
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
            zzgj.zza zzaVar;
            b65 b65Var = zzil.a;
            if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                d.r("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                return null;
            }
            try {
                zzyk zzykVarV = zzyk.v(zzctVar.b, zzalf.b);
                if (zzykVarV.u() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                if (zzykVarV.B().d() != 32) {
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
                zzcv zzcvVar = zzctVar.d;
                if (zzcvVar == zzcv.c) {
                    zzaVar = zzgj.zza.b;
                } else {
                    if (zzcvVar != zzcv.e) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
                    }
                    zzaVar = zzgj.zza.c;
                }
                zzgj zzgjVarB = zzgj.b(zzaVar, zzykVarV.A().u());
                byte[] bArrA = zzykVarV.B().A();
                zzdd.a(zzddVar);
                return zzgf.e(zzgjVarB, zzaav.b(bArrA, zzddVar), zzctVar.e);
            } catch (zzamd unused) {
                e.d("Parsing XAesGcmKey failed");
                return null;
            }
        }
    });

    public static zzcv a(zzgj.zza zzaVar) throws GeneralSecurityException {
        if (Objects.equals(zzaVar, zzgj.zza.b)) {
            return zzcv.c;
        }
        if (Objects.equals(zzaVar, zzgj.zza.c)) {
            return zzcv.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }
}
