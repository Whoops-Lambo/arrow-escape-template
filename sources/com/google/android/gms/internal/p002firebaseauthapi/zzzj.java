package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzzj implements zzbr {
    public static final zznx b;
    public static final zznx c;
    public final zzlu a;

    public static zzzj a(zzkr zzkrVar) throws GeneralSecurityException {
        zzkl zzklVar = zzkrVar.a;
        zzzq zzzqVar = (zzzq) b.b(zzklVar.a);
        ECPoint eCPoint = zzkrVar.b;
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        ECParameterSpec eCParameterSpecD = zzzn.d(zzzqVar);
        ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        zznv.g(eCPoint2, eCParameterSpecD.getCurve());
        ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) zzzr.f.a.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, eCParameterSpecD));
        byte[] bArrB = new byte[0];
        zzaau zzaauVar = zzklVar.f;
        if (zzaauVar != null) {
            bArrB = zzaauVar.b();
        }
        return new zzzj(eCPublicKey, bArrB, b(zzklVar.b), (zzzp) c.b(zzklVar.c), zzlq.a(zzklVar), zzkrVar.d.b());
    }

    public static final String b(zzkl.zzb zzbVar) throws GeneralSecurityException {
        if (zzbVar.equals(zzkl.zzb.b)) {
            return "HmacSha1";
        }
        if (zzbVar == zzkl.zzb.c) {
            return "HmacSha224";
        }
        if (zzbVar == zzkl.zzb.d) {
            return "HmacSha256";
        }
        if (zzbVar == zzkl.zzb.e) {
            return "HmacSha384";
        }
        if (zzbVar == zzkl.zzb.f) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(zzbVar)));
    }

    static {
        zzoa zzoaVarA = zznx.a();
        zzoaVarA.b(zzzq.a, zzkl.zzc.b);
        zzoaVarA.b(zzzq.b, zzkl.zzc.c);
        zzoaVarA.b(zzzq.c, zzkl.zzc.d);
        b = zzoaVarA.a();
        zzoa zzoaVarA2 = zznx.a();
        zzoaVarA2.b(zzzp.a, zzkl.zze.c);
        zzoaVarA2.b(zzzp.b, zzkl.zze.b);
        zzoaVarA2.b(zzzp.c, zzkl.zze.d);
        c = zzoaVarA2.a();
    }

    public zzzj(ECPublicKey eCPublicKey, byte[] bArr, String str, zzzp zzzpVar, zzlu zzluVar, byte[] bArr2) throws GeneralSecurityException {
        zznv.g(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.a = zzluVar;
    }
}
