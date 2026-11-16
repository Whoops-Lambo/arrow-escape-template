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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjx {
    public static final b65 a = new b65(zzjp.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzka
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
        public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
            zzjp zzjpVar = (zzjp) zzcsVar;
            b65 b65Var = zzjx.a;
            zzjp.zzb zzbVar = zzjpVar.b;
            Map map = zzjx.e;
            if (!map.containsKey(zzbVar)) {
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
            }
            zzcv zzcvVar = (zzcv) map.get(zzbVar);
            zzvb.zza zzaVarY = zzvb.y();
            int i = zzjpVar.a;
            zzaVarY.i();
            ((zzvb) zzaVarY.b).zze = i;
            return zzcx.a(((zzvb) zzaVarY.f()).a(), zzcvVar, "type.googleapis.com/google.crypto.tink.AesSivKey");
        }
    });
    public static final y55 b = new y55("type.googleapis.com/google.crypto.tink.AesSivKey", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjz
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
            b65 b65Var = zzjx.a;
            String str = zzcxVar.b;
            if (!str.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                d.r(n30.y("Wrong type URL in call to AesSivParameters.parseParameters: ", str));
                return null;
            }
            try {
                zzvb zzvbVarV = zzvb.v(zzcxVar.a, zzalf.b);
                if (zzvbVarV.x() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                zzjp.zza zzaVar = new zzjp.zza(0);
                zzaVar.b(zzvbVarV.u());
                zzaVar.b = zzjx.a(zzcxVar.c);
                return zzaVar.a();
            } catch (zzamd e2) {
                y.m("Parsing AesSivParameters failed: ", e2);
                return null;
            }
        }
    });
    public static final x45 c = new x45(zzji.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkc
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
        public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
            zzji zzjiVar = (zzji) zzbtVar;
            b65 b65Var = zzjx.a;
            zzuy.zza zzaVarX = zzuy.x();
            zzaav zzaavVar = zzjiVar.b;
            zzdd.a(zzddVar);
            byte[] bArrC = zzaavVar.c(zzddVar);
            lr3 lr3VarK = zzakb.k(0, bArrC.length, bArrC);
            zzaVarX.i();
            zzuy.w((zzuy) zzaVarX.b, lr3VarK);
            lr3 lr3VarA = ((zzuy) zzaVarX.f()).a();
            zzjp.zzb zzbVar = zzjiVar.a.b;
            Map map = zzjx.e;
            if (!map.containsKey(zzbVar)) {
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
            }
            return zzct.a("type.googleapis.com/google.crypto.tink.AesSivKey", lr3VarA, zzcw.c, (zzcv) map.get(zzbVar), zzjiVar.d);
        }
    });
    public static final u45 d = new u45("type.googleapis.com/google.crypto.tink.AesSivKey", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkb
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
        public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
            b65 b65Var = zzjx.a;
            if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                d.r("Wrong type URL in call to AesSivParameters.parseParameters");
                return null;
            }
            try {
                zzuy zzuyVarV = zzuy.v(zzctVar.b, zzalf.b);
                if (zzuyVarV.u() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                zzjp.zza zzaVar = new zzjp.zza(0);
                zzaVar.b(zzuyVarV.z().d());
                zzaVar.b = zzjx.a(zzctVar.d);
                zzjp zzjpVarA = zzaVar.a();
                zzji.zza zzaVar2 = new zzji.zza(0);
                zzaVar2.a = zzjpVarA;
                byte[] bArrA = zzuyVarV.z().A();
                zzdd.a(zzddVar);
                zzaVar2.b = zzaav.b(bArrA, zzddVar);
                zzaVar2.c = zzctVar.e;
                return zzaVar2.a();
            } catch (zzamd unused) {
                e.d("Parsing AesSivKey failed");
                return null;
            }
        }
    });
    public static final Map e;

    static {
        HashMap map = new HashMap();
        map.put(zzjp.zzb.d, zzcv.e);
        map.put(zzjp.zzb.b, zzcv.c);
        map.put(zzjp.zzb.c, zzcv.f);
        e = Collections.unmodifiableMap(map);
    }

    public static zzjp.zzb a(zzcv zzcvVar) throws GeneralSecurityException {
        if (zzcvVar == zzcv.e) {
            return zzjp.zzb.d;
        }
        if (zzcvVar == zzcv.c) {
            return zzjp.zzb.b;
        }
        zzcv zzcvVar2 = zzcv.f;
        zzjp.zzb zzbVar = zzjp.zzb.c;
        if (zzcvVar == zzcvVar2 || zzcvVar == zzcv.d) {
            return zzbVar;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }
}
