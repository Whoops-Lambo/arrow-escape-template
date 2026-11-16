package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final enum m extends zzjd.zza {
    public m() {
        super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzjd.zza
    public final boolean zza() {
        Boolean bool;
        if (zzjd.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                zzjd.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
