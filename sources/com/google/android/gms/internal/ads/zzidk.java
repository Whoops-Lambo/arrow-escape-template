package com.google.android.gms.internal.ads;

import defpackage.ca4;
import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzidk implements zzhsw {
    @Override // com.google.android.gms.internal.ads.zzhsw
    public final byte[] c(int i, byte[] bArr) {
        throw null;
    }

    public static zzhsw a(zzhsu zzhsuVar) {
        zzidz zzidzVar = zzhsuVar.b;
        zzhhg zzhhgVar = zzhhg.a;
        zzhta zzhtaVar = new zzhta(zzidzVar.a.b());
        try {
            Provider providerA = zzhnr.a();
            if (providerA == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerA);
            return new ca4(zzhtaVar, new zzhtb(zzidzVar.a.b(), providerA), false, 22);
        } catch (GeneralSecurityException unused) {
            return zzhtaVar;
        }
    }
}
