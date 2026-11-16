package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfmz {
    public static final String a(byte[] bArr, byte[] bArr2, String str, zzear zzearVar) {
        zzhgn zzhgnVarA;
        if (str != null) {
            try {
                byte[] bArrDecode = Base64.decode(str, 11);
                zzhhg zzhhgVar = zzhhg.a;
                try {
                    zzhgnVarA = zzhgn.a(new zzhfy(new ByteArrayInputStream(bArrDecode)).a());
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().d("CryptoUtils.getHandle", e);
                zzhgnVarA = null;
            }
            try {
                if (zzhgnVarA != null) {
                    try {
                        if (zzhno.a()) {
                            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
                        }
                    } catch (GeneralSecurityException e2) {
                        try {
                            com.facebook.appevents.p.g(e2);
                        } catch (GeneralSecurityException e3) {
                            e = e3;
                            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                            com.google.android.gms.ads.internal.zzt.zzh().d("CryptoUtils.decrypt", e);
                            zzearVar.a.put("dsf", e.toString());
                            return null;
                        }
                    }
                    byte[] bArrA = ((zzhfw) zzhgnVarA.f(zzhho.a, zzhfw.class)).a(bArr, bArr2);
                    zzearVar.a.put("ds", "1");
                    return new String(bArrA, StandardCharsets.UTF_8);
                }
            } catch (UnsupportedOperationException e4) {
                e = e4;
            }
        }
        return null;
    }

    @VisibleForTesting
    public zzfmz() {
        try {
            zzhhl.a();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().d("CryptoUtils.registerAead", e);
        }
    }
}
