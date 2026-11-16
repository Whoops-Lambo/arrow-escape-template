package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzzi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ov4 {
    public final int[] a;
    public final int b;

    public abstract int a();

    public void c(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != a()) {
            throw new GeneralSecurityException(pv1.k(a(), "The nonce length (in bytes) must be "));
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferB = b(this.b + i3, bArr);
            if (i3 == i) {
                zzzi.a(byteBuffer, byteBuffer2, byteBufferB, iRemaining % 64);
            } else {
                zzzi.a(byteBuffer, byteBuffer2, byteBufferB, 64);
            }
        }
    }

    public abstract int[] d(int i, int[] iArr);

    public abstract int e();

    public ov4(byte[] bArr, int i, int i2) throws InvalidKeyException {
        switch (i2) {
            case 1:
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.a = tw4.d(bArr);
                this.b = i;
                return;
            default:
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.a = nv4.c(bArr);
                this.b = i;
                return;
        }
    }

    public ByteBuffer b(int i, byte[] bArr) {
        int[] iArrD = d(i, tw4.d(bArr));
        int[] iArr = (int[]) iArrD.clone();
        tw4.b(iArr);
        for (int i2 = 0; i2 < iArrD.length; i2++) {
            iArrD[i2] = iArrD[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD, 0, 16);
        return byteBufferOrder;
    }

    public ByteBuffer f(int i, byte[] bArr) {
        int[] iArrD = d(i, nv4.c(bArr));
        int[] iArr = (int[]) iArrD.clone();
        nv4.a(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrD[i2] = iArrD[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD, 0, 16);
        return byteBufferOrder;
    }
}
