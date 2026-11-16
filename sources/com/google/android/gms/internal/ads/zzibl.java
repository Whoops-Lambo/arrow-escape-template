package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzibl implements zzhhb {
    public static final byte[] f = new byte[0];
    public static final byte[] g = {0};
    public final RSAPublicKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final Provider e;

    public static String b(zzhze zzhzeVar) throws GeneralSecurityException {
        if (zzhzeVar == zzhze.b) {
            return "SHA256withRSA";
        }
        if (zzhzeVar == zzhze.c) {
            return "SHA384withRSA";
        }
        if (zzhzeVar == zzhze.d) {
            return "SHA512withRSA";
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("unknown hash type");
        return null;
    }

    public static zzibl c(zzhzk zzhzkVar, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = zzhzkVar.b;
        zzhzg zzhzgVar = zzhzkVar.a;
        return new zzibl((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhzgVar.b)), zzhzgVar.d, zzhzkVar.c.b(), zzhzgVar.c.equals(zzhzf.d) ? g : f, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.c;
        if (!zzhqq.a(bArr3, bArr)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.e);
        signature.initVerify(this.a);
        signature.update(bArr2);
        byte[] bArr4 = this.d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Invalid signature");
    }

    public zzibl(RSAPublicKey rSAPublicKey, zzhze zzhzeVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhnn.a(2)) {
            zzidv.c(rSAPublicKey.getModulus().bitLength());
            zzidv.d(rSAPublicKey.getPublicExponent());
            this.a = rSAPublicKey;
            this.b = b(zzhzeVar);
            this.c = bArr;
            this.d = bArr2;
            this.e = provider;
            return;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
