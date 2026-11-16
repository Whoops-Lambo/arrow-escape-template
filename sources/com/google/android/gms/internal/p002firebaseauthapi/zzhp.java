package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
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
public final class zzhp implements zzbm {
    public static final byte[] d = zzaaf.b("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] e = zzaaf.b("070000004041424344454647");
    public static final byte[] f = zzaaf.b("a0784d7a4716f3feb4f64e7f4b39bf04");
    public final SecretKeySpec a;
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
        if (length < bArr3.length + 28) {
            e.d("ciphertext too short");
            return null;
        }
        if (!zzqu.b(bArr3, bArr)) {
            e.d("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, this.a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            d.w("plaintext is null");
            return null;
        }
        byte[] bArrA = zzqm.a(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrA);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(1, this.a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.b;
        if (outputSize > 2147483635 - bArr3.length) {
            e.d("plaintext too long");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        e.d("not enough data written");
        return null;
    }

    public static Cipher c() {
        Cipher cipher = (Cipher) zzzr.b.a.a("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(e);
            byte[] bArr = d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        e.d("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }

    public zzhp(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzjd.zza.a.zza()) {
            if (bArr.length == 32) {
                this.a = new SecretKeySpec(bArr, "ChaCha20");
                this.b = bArr2;
                this.c = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        e.d("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }

    public static boolean d() {
        try {
            c();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
