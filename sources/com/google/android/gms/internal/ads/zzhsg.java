package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhsg implements zzhra {
    public static zzhsg a(zzhqs zzhqsVar, Provider provider) throws GeneralSecurityException {
        zzhsg zzhsgVar = new zzhsg();
        if (!zzhnn.a(1)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhqsVar.c.b();
            zzidz zzidzVar = zzhqsVar.b;
            zzhhg zzhhgVar = zzhhg.a;
            new SecretKeySpec(zzidzVar.a.b(), "AES");
            return zzhsgVar;
        } catch (NoSuchAlgorithmException e) {
            io.p071bidmachine.media3.extractor.ts.y.m("AES-CMAC not available.", e);
            return null;
        }
    }
}
