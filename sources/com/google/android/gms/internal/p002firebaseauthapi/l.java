package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import defpackage.ov4;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class l {
    public final ov4 a;
    public final ov4 b;

    public static byte[] c(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public abstract ov4 a(int i, byte[] bArr);

    public l(byte[] bArr) throws GeneralSecurityException {
        if (zzjd.zza.a.zza()) {
            this.a = a(1, bArr);
            this.b = a(0, bArr);
        } else {
            e.d("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
    }

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int iLimit = byteBuffer.limit();
            int iPosition = byteBuffer.position();
            ov4 ov4Var = this.a;
            ov4Var.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                ov4Var.c(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                int iPosition2 = byteBuffer.position();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iPosition2);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                ByteBuffer byteBufferB = this.b.b(0, bArr);
                byte[] bArr4 = new byte[32];
                byteBufferB.get(bArr4);
                byte[] bArrC = zzif.c(bArr4, c(byteBuffer, bArr3));
                byteBuffer.limit(iLimit);
                byteBuffer.position(iPosition2);
                byteBuffer.put(bArrC);
                return;
            }
            d.r("Given ByteBuffer output is too small");
            return;
        }
        d.r("Given ByteBuffer output is too small");
    }

    public final byte[] d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int iPosition = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.b.b(0, bArr).get(bArr4);
                if (MessageDigest.isEqual(zzif.c(bArr4, c(byteBuffer, bArr2)), bArr3)) {
                    byteBuffer.position(iPosition);
                    ov4 ov4Var = this.a;
                    ov4Var.getClass();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                    ov4Var.c(bArr, byteBufferAllocate, byteBuffer);
                    return byteBufferAllocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        e.d("ciphertext too short");
        return null;
    }
}
