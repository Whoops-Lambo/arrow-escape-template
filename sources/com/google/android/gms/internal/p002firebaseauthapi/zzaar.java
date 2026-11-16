package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaar implements zzbm {
    public final zzid a;
    public final byte[] b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrA = zzqm.a(24);
        byteBufferAllocate.put(bArrA);
        this.a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? bArrArray : zzzi.d(bArr3, bArrArray);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            e.d("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.a.d(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (zzqu.b(bArr3, bArr)) {
            return c(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
        e.d("Decryption failed (OutputPrefix mismatch).");
        return null;
    }

    public zzaar(byte[] bArr, byte[] bArr2) {
        this.a = new zzid(bArr);
        this.b = bArr2;
    }
}
