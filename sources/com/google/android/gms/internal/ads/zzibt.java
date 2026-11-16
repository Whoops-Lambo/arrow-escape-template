package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzibt implements zzhha {
    public static zzibt a(zzhzu zzhzuVar) throws GeneralSecurityException {
        int i = zzhqq.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
        }
        Provider providerA = zzhnr.a();
        if (providerA == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerA);
        zzhzw zzhzwVar = zzhzuVar.a;
        zzhzs zzhzsVar = zzhzwVar.a;
        BigInteger bigInteger = zzhzwVar.b;
        BigInteger bigInteger2 = zzhzsVar.b;
        zzidy zzidyVar = zzhzuVar.b;
        zzhhg zzhhgVar = zzhhg.a;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, zzidyVar.a, zzhzuVar.c.a, zzhzuVar.d.a, zzhzuVar.e.a, zzhzuVar.f.a, zzhzuVar.g.a));
        zzhzq zzhzqVar = zzhzsVar.d;
        zzhzq zzhzqVar2 = zzhzsVar.e;
        int i2 = zzhzsVar.f;
        zzhzwVar.c.b();
        zzhzsVar.c.getClass();
        zzibt zzibtVar = new zzibt();
        if (!zzhnn.a(2)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        zzidv.c(rSAPrivateCrtKey.getModulus().bitLength());
        zzidv.d(rSAPrivateCrtKey.getPublicExponent());
        zzibu.b(zzhzqVar);
        zzibu.c(zzhzqVar, zzhzqVar2, i2);
        return zzibtVar;
    }
}
