package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.gl0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o implements zzlu {
    public final int a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final byte[] a(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length < i) {
            e.d("ciphertext too short");
            return null;
        }
        if (bArr.length != this.a) {
            e.d("invalid key size");
            return null;
        }
        gl0 gl0Var = zzhb.a;
        zzaap.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        int i2 = i + 12;
        if (bArr2.length < i + 28) {
            e.d("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = zzhb.a(i, 12, bArr2);
        Cipher cipherB = zzhb.b();
        cipherB.init(2, secretKeySpec, algorithmParameterSpecA);
        return cipherB.doFinal(bArr2, i2, (bArr2.length - i) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final int zza() {
        return this.a;
    }

    public o(zzel zzelVar) throws GeneralSecurityException {
        if (zzelVar.b == 12) {
            if (zzelVar.c == 16) {
                if (zzelVar.d == zzel.zzb.d) {
                    this.a = zzelVar.a;
                    return;
                } else {
                    e.d("invalid variant");
                    throw null;
                }
            }
            e.d("invalid tag size");
            throw null;
        }
        e.d("invalid IV size");
        throw null;
    }
}
