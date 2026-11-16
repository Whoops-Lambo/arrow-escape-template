package com.google.android.gms.internal.ads;

import defpackage.bw4;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhxl {
    public zzhxo a = null;
    public zzidy b = null;

    public final zzhxm a() throws GeneralSecurityException {
        ECPoint eCPoint;
        zzhxo zzhxoVar = this.a;
        if (zzhxoVar == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without a ecdsa public key");
            return null;
        }
        zzidy zzidyVar = this.b;
        if (zzidyVar == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without a private value");
            return null;
        }
        zzhhg zzhhgVar = zzhhg.a;
        BigInteger bigInteger = zzidyVar.a;
        ECPoint eCPoint2 = zzhxoVar.b;
        zzhxg zzhxgVar = zzhxoVar.a.b;
        BigInteger order = zzhxgVar.b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Invalid private value");
            return null;
        }
        ECParameterSpec eCParameterSpec = zzhxgVar.b;
        if (!zzhoc.b(eCParameterSpec, zzhoc.a) && !zzhoc.b(eCParameterSpec, zzhoc.b) && !zzhoc.b(eCParameterSpec, zzhoc.c)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        zzhoc.a(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = zzhoc.c(curve);
        bw4 bw4VarD = zzhoc.d(ECPoint.POINT_INFINITY, bigIntegerC);
        bw4 bw4VarD2 = zzhoc.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                bw4VarD = zzhoc.f(bw4VarD, bw4VarD2, a, bigIntegerC);
                bw4VarD2 = zzhoc.e(bw4VarD2, a, bigIntegerC);
            } else {
                bw4VarD2 = zzhoc.f(bw4VarD, bw4VarD2, a, bigIntegerC);
                bw4VarD = zzhoc.e(bw4VarD, a, bigIntegerC);
            }
        }
        if (bw4VarD.c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = bw4VarD.c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(bw4VarD.a.multiply(bigIntegerMod).mod(bigIntegerC), bw4VarD.b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        zzhoc.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new zzhxm(this.a, this.b);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Invalid private value");
        return null;
    }

    private zzhxl() {
    }

    public /* synthetic */ zzhxl(int i) {
    }
}
