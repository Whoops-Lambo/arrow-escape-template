package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import defpackage.tw4;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzis implements zzbm {
    public final byte[] a;
    public final byte[] b;
    public final Provider c;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            d.w("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        if (length < bArr3.length + 40) {
            e.d("ciphertext too short");
            return null;
        }
        if (!zzqu.b(bArr3, bArr)) {
            e.d("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(tw4.c(this.a, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = zzhp.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            d.w("plaintext is null");
            return null;
        }
        byte[] bArrA = zzqm.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(tw4.c(this.a, bArrA), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArrA, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        byte[] bArr4 = zzhp.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr5 = this.b;
        if (outputSize > 2147483623 - bArr5.length) {
            e.d("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + 24 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr5.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr5.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        e.d("not enough data written");
        return null;
    }

    public zzis(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzjd.zza.a.zza()) {
            if (bArr.length == 32) {
                this.a = bArr;
                this.b = bArr2;
                this.c = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        e.d("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }
}
