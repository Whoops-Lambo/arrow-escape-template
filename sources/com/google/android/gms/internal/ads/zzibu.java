package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzibu implements zzhhb {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public final RSAPublicKey a;
    public final String b;
    public final PSSParameterSpec c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    public static String b(zzhzq zzhzqVar) {
        if (zzhzqVar == zzhzq.b) {
            return "SHA256withRSA/PSS";
        }
        if (zzhzqVar == zzhzq.c) {
            return "SHA384withRSA/PSS";
        }
        if (zzhzqVar == zzhzq.d) {
            return "SHA512withRSA/PSS";
        }
        defpackage.d.r("Unsupported hash: ".concat(String.valueOf(zzhzqVar)));
        return null;
    }

    public static PSSParameterSpec c(zzhzq zzhzqVar, zzhzq zzhzqVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhzq zzhzqVar3 = zzhzq.d;
        zzhzq zzhzqVar4 = zzhzq.c;
        zzhzq zzhzqVar5 = zzhzq.b;
        if (zzhzqVar == zzhzqVar5) {
            str = "SHA-256";
        } else if (zzhzqVar == zzhzqVar4) {
            str = "SHA-384";
        } else {
            if (zzhzqVar != zzhzqVar3) {
                defpackage.d.r("Unsupported MD hash: ".concat(String.valueOf(zzhzqVar)));
                return null;
            }
            str = "SHA-512";
        }
        if (zzhzqVar2 == zzhzqVar5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhzqVar2 == zzhzqVar4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhzqVar2 != zzhzqVar3) {
                defpackage.d.r("Unsupported MGF1 hash: ".concat(String.valueOf(zzhzqVar2)));
                return null;
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    public static zzibu d(zzhzw zzhzwVar) throws NoSuchAlgorithmException, NoSuchProviderException {
        int i = zzhqq.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
        }
        Provider providerA = zzhnr.a();
        if (providerA == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerA);
        BigInteger bigInteger = zzhzwVar.b;
        zzhzs zzhzsVar = zzhzwVar.a;
        return new zzibu((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhzsVar.b)), zzhzsVar.d, zzhzsVar.e, zzhzsVar.f, zzhzwVar.c.b(), zzhzsVar.c.equals(zzhzr.d) ? h : g, providerA);
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        if (!zzhqq.a(bArr3, bArr)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.f);
        signature.initVerify(this.a);
        signature.setParameter(this.c);
        signature.update(bArr2);
        byte[] bArr4 = this.e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (signature.verify(bArr, length2, length - length2)) {
            return;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("signature verification failed");
    }

    public zzibu(RSAPublicKey rSAPublicKey, zzhzq zzhzqVar, zzhzq zzhzqVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhnn.a(2)) {
            if (zzhzqVar.equals(zzhzqVar2)) {
                zzidv.c(rSAPublicKey.getModulus().bitLength());
                zzidv.d(rSAPublicKey.getPublicExponent());
                this.a = rSAPublicKey;
                this.b = b(zzhzqVar);
                this.c = c(zzhzqVar, zzhzqVar2, i);
                this.d = bArr;
                this.e = bArr2;
                this.f = provider;
                return;
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("sigHash and mgf1Hash must be the same");
            throw null;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
