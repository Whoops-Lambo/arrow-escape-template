package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.gl0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhy {
    public final SecretKeySpec a;

    public final byte[] a(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            e.d("iv is wrong size");
            return null;
        }
        if (bArr2.length < i + 16) {
            e.d("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = zzhb.a(0, bArr.length, bArr);
        Cipher cipherB = zzhb.b();
        cipherB.init(2, this.a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipherB.updateAAD(bArr3);
        }
        return cipherB.doFinal(bArr2, i, bArr2.length - i);
    }

    public zzhy(byte[] bArr) throws GeneralSecurityException {
        if (zzjd.zza.b.zza()) {
            gl0 gl0Var = zzhb.a;
            zzaap.b(bArr.length);
            this.a = new SecretKeySpec(bArr, "AES");
            return;
        }
        e.d("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
