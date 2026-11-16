package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.media3.extractor.ts.y;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzsh implements zzrd {
    public static zzsh a(zzqt zzqtVar, Provider provider) throws GeneralSecurityException {
        zzsh zzshVar = new zzsh();
        if (!zzjd.zza.a.zza()) {
            e.d("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzqtVar.c.b();
            new SecretKeySpec(zzqtVar.b.c(zzdd.a), "AES");
            return zzshVar;
        } catch (NoSuchAlgorithmException e) {
            y.m("AES-CMAC not available.", e);
            return null;
        }
    }
}
