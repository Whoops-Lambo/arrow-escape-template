package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.b65;
import defpackage.d;
import defpackage.n30;
import defpackage.u45;
import defpackage.x45;
import defpackage.y55;
import io.p071bidmachine.media3.extractor.ts.y;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class k {
    public static final b65 a = new b65(zzfh.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfl
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
        public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
            zzfh zzfhVar = (zzfh) zzcsVar;
            b65 b65Var = k.a;
            zzcv zzcvVarA = k.a(zzfhVar.b);
            zzxz.zza zzaVarU = zzxz.u();
            String str = zzfhVar.a;
            zzaVarU.i();
            zzxz.w((zzxz) zzaVarU.b, str);
            return zzcx.a(((zzxz) zzaVarU.f()).a(), zzcvVarA, "type.googleapis.com/google.crypto.tink.KmsAeadKey");
        }
    });
    public static final y55 b = new y55("type.googleapis.com/google.crypto.tink.KmsAeadKey", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfk
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
            zzfh.zza zzaVar;
            b65 b65Var = k.a;
            String str = zzcxVar.b;
            if (!str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                d.r(n30.y("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", str));
                return null;
            }
            try {
                String strZ = zzxz.v(zzcxVar.a, zzalf.b).z();
                zzcv zzcvVar = zzcxVar.c;
                if (zzcvVar == zzcv.c) {
                    zzaVar = zzfh.zza.b;
                } else {
                    if (zzcvVar != zzcv.e) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
                    }
                    zzaVar = zzfh.zza.c;
                }
                return new zzfh(strZ, zzaVar);
            } catch (zzamd e) {
                y.m("Parsing KmsAeadKeyFormat failed: ", e);
                return null;
            }
        }
    });
    public static final x45 c = new x45(zzfi.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
        public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
            zzfi zzfiVar = (zzfi) zzbtVar;
            b65 b65Var = k.a;
            zzxw.zza zzaVarX = zzxw.x();
            zzxz.zza zzaVarU = zzxz.u();
            String str = zzfiVar.a.a;
            zzaVarU.i();
            zzxz.w((zzxz) zzaVarU.b, str);
            zzxz zzxzVar = (zzxz) zzaVarU.f();
            zzaVarX.i();
            zzxw.w((zzxw) zzaVarX.b, zzxzVar);
            return zzct.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzxw) zzaVarX.f()).a(), zzcw.f, k.a(zzfiVar.a.b), zzfiVar.c);
        }
    });
    public static final u45 d = new u45("type.googleapis.com/google.crypto.tink.KmsAeadKey", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfm
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
            zzfh.zza zzaVar;
            b65 b65Var = k.a;
            if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                d.r("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                return null;
            }
            try {
                zzxw zzxwVarV = zzxw.v(zzctVar.b, zzalf.b);
                if (zzxwVarV.u() != 0) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzxwVarV)));
                }
                String strZ = zzxwVarV.z().z();
                zzcv zzcvVar = zzctVar.d;
                if (zzcvVar == zzcv.c) {
                    zzaVar = zzfh.zza.b;
                } else {
                    if (zzcvVar != zzcv.e) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
                    }
                    zzaVar = zzfh.zza.c;
                }
                return zzfi.e(new zzfh(strZ, zzaVar), zzctVar.e);
            } catch (zzamd e) {
                y.m("Parsing KmsAeadKey failed: ", e);
                return null;
            }
        }
    });

    public static zzcv a(zzfh.zza zzaVar) throws GeneralSecurityException {
        if (zzaVar.equals(zzfh.zza.b)) {
            return zzcv.c;
        }
        if (zzaVar == zzfh.zza.c) {
            return zzcv.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }
}
