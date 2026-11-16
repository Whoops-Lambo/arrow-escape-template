package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.b65;
import defpackage.d;
import defpackage.lr3;
import defpackage.n30;
import defpackage.pv1;
import defpackage.u45;
import defpackage.x45;
import defpackage.y55;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.media3.extractor.ts.y;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzsi {
    public static final zznx a;
    public static final b65 b;
    public static final y55 c;
    public static final x45 d;
    public static final u45 e;

    public static zzcv a(zzrl.zzb zzbVar) throws GeneralSecurityException {
        if (zzbVar == zzrl.zzb.e) {
            return zzcv.e;
        }
        if (zzbVar == zzrl.zzb.b) {
            return zzcv.c;
        }
        if (zzbVar == zzrl.zzb.d) {
            return zzcv.d;
        }
        if (zzbVar == zzrl.zzb.c) {
            return zzcv.f;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(zzbVar)));
    }

    public static zzrl.zzb b(zzcv zzcvVar) throws GeneralSecurityException {
        if (zzcvVar == zzcv.e) {
            return zzrl.zzb.e;
        }
        if (zzcvVar == zzcv.c) {
            return zzrl.zzb.b;
        }
        if (zzcvVar == zzcv.d) {
            return zzrl.zzb.d;
        }
        if (zzcvVar == zzcv.f) {
            return zzrl.zzb.c;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }

    static {
        zzoa zzoaVarA = zznx.a();
        zzoaVarA.b(zzwh.SHA1, zzrl.zzc.b);
        zzoaVarA.b(zzwh.SHA224, zzrl.zzc.c);
        zzoaVarA.b(zzwh.SHA256, zzrl.zzc.d);
        zzoaVarA.b(zzwh.SHA384, zzrl.zzc.e);
        zzoaVarA.b(zzwh.SHA512, zzrl.zzc.f);
        a = zzoaVarA.a();
        b = new b65(zzrl.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
            public final zzcx a(zzcs zzcsVar) throws GeneralSecurityException {
                zzrl zzrlVar = (zzrl) zzcsVar;
                zznx zznxVar = zzsi.a;
                zzcv zzcvVarA = zzsi.a(zzrlVar.c);
                zzwj.zza zzaVarZ = zzwj.z();
                zzwm.zza zzaVarY = zzwm.y();
                int i = zzrlVar.b;
                zzaVarY.i();
                ((zzwm) zzaVarY.b).zzf = i;
                zzwh zzwhVar = (zzwh) zzsi.a.b(zzrlVar.d);
                zzaVarY.i();
                ((zzwm) zzaVarY.b).zze = zzwhVar.zza();
                zzwm zzwmVar = (zzwm) zzaVarY.f();
                zzaVarZ.i();
                zzwj.x((zzwj) zzaVarZ.b, zzwmVar);
                int i2 = zzrlVar.a;
                zzaVarZ.i();
                ((zzwj) zzaVarZ.b).zzg = i2;
                return zzcx.a(((zzwj) zzaVarZ.f()).a(), zzcvVarA, "type.googleapis.com/google.crypto.tink.HmacKey");
            }
        });
        c = new y55("type.googleapis.com/google.crypto.tink.HmacKey", new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
            public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
                zznx zznxVar = zzsi.a;
                String str = zzcxVar.b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    d.r(n30.y("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    zzwj zzwjVarV = zzwj.v(zzcxVar.a, zzalf.b);
                    if (zzwjVarV.y() != 0) {
                        throw new GeneralSecurityException(pv1.k(zzwjVarV.y(), "Parsing HmacParameters failed: unknown Version "));
                    }
                    zzrl.zza zzaVarB = zzrl.b();
                    zzaVarB.a = Integer.valueOf(zzwjVarV.u());
                    zzaVarB.b = Integer.valueOf(zzwjVarV.C().u());
                    zzaVarB.c = (zzrl.zzc) zzsi.a.c(zzwjVarV.C().x());
                    zzaVarB.d = zzsi.b(zzcxVar.c);
                    return zzaVarB.a();
                } catch (zzamd e2) {
                    y.m("Parsing HmacParameters failed: ", e2);
                    return null;
                }
            }
        });
        d = new x45(zzre.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
            public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
                zzre zzreVar = (zzre) zzbtVar;
                zznx zznxVar = zzsi.a;
                zzwg.zza zzaVarZ = zzwg.z();
                zzrl zzrlVar = zzreVar.a;
                zzwm.zza zzaVarY = zzwm.y();
                int i = zzrlVar.b;
                zzaVarY.i();
                ((zzwm) zzaVarY.b).zzf = i;
                zzwh zzwhVar = (zzwh) zzsi.a.b(zzrlVar.d);
                zzaVarY.i();
                ((zzwm) zzaVarY.b).zze = zzwhVar.zza();
                zzwm zzwmVar = (zzwm) zzaVarY.f();
                zzaVarZ.i();
                zzwg.y((zzwg) zzaVarZ.b, zzwmVar);
                zzaav zzaavVar = zzreVar.b;
                zzdd.a(zzddVar);
                byte[] bArrC = zzaavVar.c(zzddVar);
                lr3 lr3VarK = zzakb.k(0, bArrC.length, bArrC);
                zzaVarZ.i();
                zzwg.x((zzwg) zzaVarZ.b, lr3VarK);
                return zzct.a("type.googleapis.com/google.crypto.tink.HmacKey", ((zzwg) zzaVarZ.f()).a(), zzcw.c, zzsi.a(zzreVar.a.c), zzreVar.d);
            }
        });
        e = new u45("type.googleapis.com/google.crypto.tink.HmacKey", new zzof() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzof
            public final zzbt a(zzct zzctVar, zzdd zzddVar) throws GeneralSecurityException {
                zznx zznxVar = zzsi.a;
                if (!zzctVar.a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    d.r("Wrong type URL in call to HmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zzwg zzwgVarW = zzwg.w(zzctVar.b, zzalf.b);
                    if (zzwgVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzrl.zza zzaVarB = zzrl.b();
                    zzaVarB.a = Integer.valueOf(zzwgVarW.D().d());
                    zzaVarB.b = Integer.valueOf(zzwgVarW.C().u());
                    zzaVarB.c = (zzrl.zzc) zzsi.a.c(zzwgVarW.C().x());
                    zzaVarB.d = zzsi.b(zzctVar.d);
                    zzrl zzrlVarA = zzaVarB.a();
                    zzre.zza zzaVar = new zzre.zza(0);
                    zzaVar.a = zzrlVarA;
                    byte[] bArrA = zzwgVarW.D().A();
                    zzdd.a(zzddVar);
                    zzaVar.b = zzaav.b(bArrA, zzddVar);
                    zzaVar.c = zzctVar.e;
                    return zzaVar.a();
                } catch (zzamd | IllegalArgumentException unused) {
                    e.d("Parsing HmacKey failed");
                    return null;
                }
            }
        });
    }
}
