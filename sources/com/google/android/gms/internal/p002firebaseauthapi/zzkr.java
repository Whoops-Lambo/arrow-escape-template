package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import defpackage.e32;
import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkr extends zzlp {
    public final zzkl a;
    public final ECPoint b;
    public final zzaau c;
    public final zzaau d;
    public final Integer e;

    public static zzaau e(zzkl.zzd zzdVar, Integer num) {
        if (zzdVar == zzkl.zzd.d) {
            return zzpj.a;
        }
        if (num == null) {
            e32.i("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(zzdVar)));
            return null;
        }
        if (zzdVar == zzkl.zzd.c) {
            return zzpj.a(num.intValue());
        }
        if (zzdVar == zzkl.zzd.b) {
            return zzpj.b(num.intValue());
        }
        e32.i("Unknown EciesParameters.Variant: ".concat(String.valueOf(zzdVar)));
        return null;
    }

    public static zzkr f(zzkl zzklVar, zzaau zzaauVar, Integer num) throws GeneralSecurityException {
        zzkl.zzc zzcVar = zzklVar.a;
        zzkl.zzd zzdVar = zzklVar.d;
        if (!zzcVar.equals(zzkl.zzc.e)) {
            e.d("createForCurveX25519 may only be called with parameters for curve X25519");
            return null;
        }
        h(zzdVar, num);
        if (zzaauVar.a.length == 32) {
            return new zzkr(zzklVar, null, zzaauVar, e(zzdVar, num), num);
        }
        e.d("Encoded public point byte length for X25519 curve must be 32");
        return null;
    }

    public static zzkr g(zzkl zzklVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzkl.zzc zzcVar = zzklVar.a;
        zzkl.zzd zzdVar = zzklVar.d;
        if (zzcVar.equals(zzkl.zzc.e)) {
            e.d("createForNistCurve may only be called with parameters for NIST curve");
            return null;
        }
        h(zzdVar, num);
        if (zzcVar == zzkl.zzc.b) {
            curve = zznv.a.getCurve();
        } else if (zzcVar == zzkl.zzc.c) {
            curve = zznv.b.getCurve();
        } else {
            if (zzcVar != zzkl.zzc.d) {
                d.r("Unable to determine NIST curve type for ".concat(String.valueOf(zzcVar)));
                return null;
            }
            curve = zznv.c.getCurve();
        }
        zznv.g(eCPoint, curve);
        return new zzkr(zzklVar, eCPoint, null, e(zzdVar, num), num);
    }

    public static void h(zzkl.zzd zzdVar, Integer num) throws GeneralSecurityException {
        zzkl.zzd zzdVar2 = zzkl.zzd.d;
        if (!zzdVar.equals(zzdVar2) && num == null) {
            throw new GeneralSecurityException(pv1.n("'idRequirement' must be non-null for ", String.valueOf(zzdVar), " variant."));
        }
        if (zzdVar == zzdVar2 && num != null) {
            e.d("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcs a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzln a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    public final zzaau d() {
        return this.d;
    }

    public zzkr(zzkl zzklVar, ECPoint eCPoint, zzaau zzaauVar, zzaau zzaauVar2, Integer num) {
        this.a = zzklVar;
        this.b = eCPoint;
        this.c = zzaauVar;
        this.d = zzaauVar2;
        this.e = num;
    }
}
