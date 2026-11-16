package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.px4;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzidp implements zzhhb {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final zzhoe c;

    static {
        zzhod zzhodVarA = zzhoe.a();
        zzhodVarA.a(zzidg.a, zzhze.b);
        zzhodVarA.a(zzidg.b, zzhze.c);
        zzhodVarA.a(zzidg.c, zzhze.d);
        c = zzhodVarA.b();
    }

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public static zzhhb b(zzhzk zzhzkVar) {
        try {
            int i = zzhqq.a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerA = zzhnr.a();
            if (providerA != null) {
                return zzibl.c(zzhzkVar, providerA);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) zzicx.g.a.a("RSA");
            BigInteger bigInteger = zzhzkVar.b;
            zzhzg zzhzgVar = zzhzkVar.a;
            return new px4((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhzgVar.b)), (zzidg) c.b(zzhzgVar.d), zzhzkVar.c.b(), zzhzgVar.c.equals(zzhzf.d) ? b : a);
        }
    }
}
