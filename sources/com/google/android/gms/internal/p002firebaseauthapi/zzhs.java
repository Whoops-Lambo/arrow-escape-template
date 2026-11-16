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
public final class zzhs {
    public static final b65 a = new b65(zzey.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
        public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
            b65 b65Var = zzhs.a;
            return zzcx.a(zzvh.w().a(), zzhs.a(((zzey) zzcsVar).a), "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        }
    });
    public static final y55 b = new y55("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
            b65 b65Var = zzhs.a;
            String str = zzcxVar.b;
            if (!str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                d.r(n30.y("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", str));
                return null;
            }
            try {
                zzvh.v(zzcxVar.a, zzalf.b);
                return new zzey(zzhs.b(zzcxVar.c));
            } catch (zzamd e) {
                y.m("Parsing ChaCha20Poly1305Parameters failed: ", e);
                return null;
            }
        }
    });
    public static final x45 c = new x45(zzeu.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzht
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
        public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
            zzeu zzeuVar = (zzeu) zzbtVar;
            b65 b65Var = zzhs.a;
            zzve.zza zzaVarX = zzve.x();
            zzaav zzaavVar = zzeuVar.b;
            zzdd.a(zzddVar);
            byte[] bArrC = zzaavVar.c(zzddVar);
            lr3 lr3VarK = zzakb.k(0, bArrC.length, bArrC);
            zzaVarX.i();
            zzve.w((zzve) zzaVarX.b, lr3VarK);
            return zzct.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzve) zzaVarX.f()).a(), zzcw.c, zzhs.a(zzeuVar.a.a), zzeuVar.d);
        }
    });
    public static final u45 d = new u45("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhw
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
            b65 b65Var = zzhs.a;
            if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                d.r("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                return null;
            }
            try {
                zzve zzveVarV = zzve.v(zzctVar.b, zzalf.b);
                if (zzveVarV.u() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                zzey.zza zzaVarB = zzhs.b(zzctVar.d);
                byte[] bArrA = zzveVarV.z().A();
                zzdd.a(zzddVar);
                return zzeu.e(zzaVarB, zzaav.b(bArrA, zzddVar), zzctVar.e);
            } catch (zzamd unused) {
                e.d("Parsing ChaCha20Poly1305Key failed");
                return null;
            }
        }
    });

    public static zzcv a(zzey.zza zzaVar) throws GeneralSecurityException {
        if (zzaVar.equals(zzey.zza.b)) {
            return zzcv.c;
        }
        if (zzaVar == zzey.zza.c) {
            return zzcv.f;
        }
        if (zzaVar == zzey.zza.d) {
            return zzcv.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static zzey.zza b(zzcv zzcvVar) throws GeneralSecurityException {
        if (zzcvVar == zzcv.c) {
            return zzey.zza.b;
        }
        zzcv zzcvVar2 = zzcv.f;
        zzey.zza zzaVar = zzey.zza.c;
        if (zzcvVar == zzcvVar2 || zzcvVar == zzcv.d) {
            return zzaVar;
        }
        if (zzcvVar == zzcv.e) {
            return zzey.zza.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }
}
