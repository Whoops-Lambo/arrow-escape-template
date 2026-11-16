package com.google.android.gms.internal.ads;

import defpackage.nv4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhnb implements zzhfw {
    public final byte[] a;
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
        if (length < length2 + 40) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("ciphertext too short");
            return null;
        }
        if (!zzhqq.a(bArr3, bArr)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] iArrD = nv4.d(nv4.c(this.a), nv4.c(bArr4));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrD.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = zzhmd.d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }

    public zzhnb(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhnn.a(1)) {
            if (bArr.length == 32) {
                this.a = bArr;
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
