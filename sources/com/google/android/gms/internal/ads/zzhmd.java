package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhmd implements zzhfw {
    public static final byte[] d = zzidh.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] e = zzidh.a("070000004041424344454647");
    public static final byte[] f = zzidh.a("a0784d7a4716f3feb4f64e7f4b39bf04");
    public final SecretKeySpec a;
    public final byte[] b;
    public final Provider c;

    @Override // com.google.android.gms.internal.ads.zzhfw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            defpackage.d.w("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("ciphertext too short");
            return null;
        }
        if (!zzhqq.a(bArr3, bArr)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, this.a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }

    public static Cipher b() {
        Cipher cipher = (Cipher) zzicx.b.a.a("ChaCha20-Poly1305");
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
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }

    public zzhmd(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhnn.a(1)) {
            if (bArr.length == 32) {
                this.a = new SecretKeySpec(bArr, "ChaCha20");
                this.b = bArr2;
                this.c = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }
}
