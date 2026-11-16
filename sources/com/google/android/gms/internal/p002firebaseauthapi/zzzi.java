package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzzi {
    public static final byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return b(bArr, 0, bArr.length, bArr2);
        }
        d.r("The lengths of x and y should match.");
        return null;
    }

    public static byte[] d(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                e.d("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            d.r("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] b(byte[] bArr, int i, int i2, byte[] bArr2) {
        if (i2 < 0 || bArr.length - i2 < i || bArr2.length - i2 < 0) {
            d.r("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
        }
        return bArr3;
    }
}
