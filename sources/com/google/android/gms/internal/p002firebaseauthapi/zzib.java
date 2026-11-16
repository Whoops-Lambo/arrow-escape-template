package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzib {
    public final SecretKeySpec a;
    public final Provider b;

    public zzib(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (zzjd.zza.a.zza()) {
            if (bArr.length == 32) {
                this.a = new SecretKeySpec(bArr, "ChaCha20");
                this.b = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        e.d("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }
}
