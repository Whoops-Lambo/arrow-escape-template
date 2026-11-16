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
public final class zzir {
    public static final b65 a = new b65(zzgq.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zziu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
        public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
            b65 b65Var = zzir.a;
            return zzcx.a(zzyw.x().a(), zzir.a(((zzgq) zzcsVar).a), "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        }
    });
    public static final y55 b = new y55("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzit
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
            b65 b65Var = zzir.a;
            String str = zzcxVar.b;
            if (!str.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                d.r(n30.y("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", str));
                return null;
            }
            try {
                if (zzyw.v(zzcxVar.a, zzalf.b).u() == 0) {
                    return new zzgq(zzir.b(zzcxVar.c));
                }
                e.d("Only version 0 parameters are accepted");
                return null;
            } catch (zzamd e) {
                y.m("Parsing XChaCha20Poly1305Parameters failed: ", e);
                return null;
            }
        }
    });
    public static final x45 c = new x45(zzgl.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zziw
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
        public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
            zzgl zzglVar = (zzgl) zzbtVar;
            b65 b65Var = zzir.a;
            zzyt.zza zzaVarX = zzyt.x();
            zzaav zzaavVar = zzglVar.b;
            zzdd.a(zzddVar);
            byte[] bArrC = zzaavVar.c(zzddVar);
            lr3 lr3VarK = zzakb.k(0, bArrC.length, bArrC);
            zzaVarX.i();
            zzyt.w((zzyt) zzaVarX.b, lr3VarK);
            return zzct.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzyt) zzaVarX.f()).a(), zzcw.c, zzir.a(zzglVar.a.a), zzglVar.d);
        }
    });
    public static final u45 d = new u45("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zziv
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
            b65 b65Var = zzir.a;
            if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                d.r("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                return null;
            }
            try {
                zzyt zzytVarV = zzyt.v(zzctVar.b, zzalf.b);
                if (zzytVarV.u() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                zzgq.zza zzaVarB = zzir.b(zzctVar.d);
                byte[] bArrA = zzytVarV.z().A();
                zzdd.a(zzddVar);
                return zzgl.e(zzaVarB, zzaav.b(bArrA, zzddVar), zzctVar.e);
            } catch (zzamd unused) {
                e.d("Parsing XChaCha20Poly1305Key failed");
                return null;
            }
        }
    });

    public static zzcv a(zzgq.zza zzaVar) throws GeneralSecurityException {
        if (zzaVar.equals(zzgq.zza.b)) {
            return zzcv.c;
        }
        if (zzaVar == zzgq.zza.c) {
            return zzcv.f;
        }
        if (zzaVar == zzgq.zza.d) {
            return zzcv.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static zzgq.zza b(zzcv zzcvVar) throws GeneralSecurityException {
        if (zzcvVar == zzcv.c) {
            return zzgq.zza.b;
        }
        zzcv zzcvVar2 = zzcv.f;
        zzgq.zza zzaVar = zzgq.zza.c;
        if (zzcvVar == zzcvVar2 || zzcvVar == zzcv.d) {
            return zzaVar;
        }
        if (zzcvVar == zzcv.e) {
            return zzgq.zza.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }
}
