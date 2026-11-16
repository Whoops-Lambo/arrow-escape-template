package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzzn {
    public static KeyPair c(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzzr.e.a.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static int a(EllipticCurve ellipticCurve) {
        return (zznv.a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger b(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerA = zznv.a(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerA);
        if (bigIntegerA.signum() == 1) {
            BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerA);
            BigInteger bigIntegerAdd = BigInteger.ZERO;
            if (!bigIntegerMod2.equals(bigIntegerAdd)) {
                if (bigIntegerA.testBit(0) && bigIntegerA.testBit(1)) {
                    bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerA.add(BigInteger.ONE).shiftRight(2), bigIntegerA);
                } else if (bigIntegerA.testBit(0) && !bigIntegerA.testBit(1)) {
                    bigIntegerAdd = BigInteger.ONE;
                    BigInteger bigIntegerShiftRight = bigIntegerA.subtract(bigIntegerAdd).shiftRight(1);
                    int i = 0;
                    while (true) {
                        BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerA);
                        if (!bigIntegerMod3.equals(BigInteger.ZERO)) {
                            BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerA);
                            BigInteger bigIntegerMod4 = BigInteger.ONE;
                            if (!bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerA)) {
                                if (bigIntegerModPow.equals(bigIntegerMod4)) {
                                    bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                                    i++;
                                    if (i == 128 && !bigIntegerA.isProbablePrime(80)) {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                BigInteger bigIntegerShiftRight2 = bigIntegerA.add(bigIntegerMod4).shiftRight(1);
                                BigInteger bigIntegerMod5 = bigIntegerAdd;
                                for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                    BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                    bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerA).multiply(bigIntegerMod3)).mod(bigIntegerA);
                                    BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerA);
                                    if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                        BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerA);
                                        bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerA);
                                        bigIntegerMod5 = bigIntegerMod7;
                                    } else {
                                        bigIntegerMod4 = bigIntegerMod6;
                                    }
                                }
                                bigIntegerAdd = bigIntegerMod5;
                            }
                        }
                    }
                } else {
                    bigIntegerAdd = null;
                }
                if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerA).compareTo(bigIntegerMod2) != 0) {
                    e.d("Could not find a modular square root");
                    return null;
                }
            }
            if (z != bigIntegerAdd.testBit(0)) {
                return bigIntegerA.subtract(bigIntegerAdd).mod(bigIntegerA);
            }
            return bigIntegerAdd;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static ECParameterSpec d(zzzq zzzqVar) {
        int iOrdinal = zzzqVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return zznv.c;
                }
                throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(zzzqVar)));
            }
            return zznv.b;
        }
        return zznv.a;
    }

    public static ECPoint e(EllipticCurve ellipticCurve, zzzp zzzpVar, byte[] bArr) throws GeneralSecurityException {
        int iA = a(ellipticCurve);
        int iOrdinal = zzzpVar.ordinal();
        boolean z = false;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (bArr.length == iA * 2) {
                        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, iA)), new BigInteger(1, Arrays.copyOfRange(bArr, iA, bArr.length)));
                        zznv.g(eCPoint, ellipticCurve);
                        return eCPoint;
                    }
                    e.d("invalid point size");
                    return null;
                }
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzzpVar)));
            }
            BigInteger bigIntegerA = zznv.a(ellipticCurve);
            if (bArr.length == iA + 1) {
                byte b = bArr[0];
                if (b != 2) {
                    if (b == 3) {
                        z = true;
                    } else {
                        e.d("invalid format");
                        return null;
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(bigIntegerA) < 0) {
                    return new ECPoint(bigInteger, b(bigInteger, z, ellipticCurve));
                }
                e.d("x is out of range");
                return null;
            }
            e.d("compressed point has wrong length");
            return null;
        }
        if (bArr.length == (iA * 2) + 1) {
            if (bArr[0] == 4) {
                int i = iA + 1;
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
                zznv.g(eCPoint2, ellipticCurve);
                return eCPoint2;
            }
            e.d("invalid point format");
            return null;
        }
        e.d("invalid point size");
        return null;
    }

    public static byte[] f(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (zznv.h(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                ECPoint w = eCPublicKey.getW();
                zznv.g(w, eCPrivateKey.getParams().getCurve());
                PublicKey publicKeyGeneratePublic = ((KeyFactory) zzzr.f.a.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
                KeyAgreement keyAgreement = (KeyAgreement) zzzr.d.a.a("ECDH");
                keyAgreement.init(eCPrivateKey);
                try {
                    keyAgreement.doPhase(publicKeyGeneratePublic, true);
                    byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                    EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                    BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                    if (bigInteger.signum() != -1 && bigInteger.compareTo(zznv.a(curve)) < 0) {
                        b(bigInteger, true, curve);
                        return bArrGenerateSecret;
                    }
                    throw new GeneralSecurityException("shared secret is out of range");
                } catch (IllegalStateException e) {
                    throw new GeneralSecurityException(e);
                }
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }
}
