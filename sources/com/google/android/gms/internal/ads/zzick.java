package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzick implements zzhfw {
    public final zzhmm a;
    public final byte[] b;

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("ciphertext too short");
            return null;
        }
        return this.a.l(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0) {
            return b(bArr, bArr2);
        }
        if (zzhqq.a(bArr3, bArr)) {
            return b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Decryption failed (OutputPrefix mismatch).");
        return null;
    }

    public zzick(byte[] bArr, byte[] bArr2) {
        this.a = new zzhmm(bArr);
        this.b = bArr2;
    }
}
