package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzibk implements zzhha {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final byte[] i = {1, 2, 3};
    public final RSAPrivateCrtKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final zzhhb e;
    public final Provider f;

    public zzibk(RSAPrivateCrtKey rSAPrivateCrtKey, zzhze zzhzeVar, byte[] bArr, byte[] bArr2, zzhhb zzhhbVar, Provider provider) throws GeneralSecurityException {
        if (zzhnn.a(2)) {
            if (zzhzeVar != zzhze.b && zzhzeVar != zzhze.c && zzhzeVar != zzhze.d) {
                throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhzeVar)));
            }
            zzidv.c(rSAPrivateCrtKey.getModulus().bitLength());
            zzidv.d(rSAPrivateCrtKey.getPublicExponent());
            this.a = rSAPrivateCrtKey;
            this.b = zzibl.b(zzhzeVar);
            this.c = bArr;
            this.d = bArr2;
            this.e = zzhhbVar;
            this.f = provider;
            return;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
