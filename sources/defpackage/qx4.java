package defpackage;

import com.google.android.gms.internal.ads.zzhhb;
import com.google.android.gms.internal.ads.zzhno;
import com.google.android.gms.internal.ads.zzhnq;
import com.google.android.gms.internal.ads.zzhqq;
import com.google.android.gms.internal.ads.zzicx;
import com.google.android.gms.internal.ads.zzidg;
import com.google.android.gms.internal.ads.zzidu;
import com.google.android.gms.internal.ads.zzidv;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qx4 implements zzhhb {
    public final RSAPublicKey a;
    public final zzidg b;
    public final zzidg c;
    public final int d;
    public final byte[] e;
    public final byte[] f;

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else if (zzhqq.a(bArr3, bArr)) {
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        } else {
            e.d("Invalid signature (output prefix mismatch)");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            e.d("invalid signature's length");
            return;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            e.d("signature out of range");
            return;
        }
        byte[] bArrB = zzhnq.b(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        zzidg zzidgVar = this.b;
        zzidv.b(zzidgVar);
        zzicx zzicxVar = zzicx.e;
        MessageDigest messageDigest = (MessageDigest) zzicxVar.a.a(zzidu.a(zzidgVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrB.length;
        int i = this.d;
        if (length < digestLength + i + 2) {
            e.d("inconsistent");
            return;
        }
        if (bArrB[length - 1] != -68) {
            e.d("inconsistent");
            return;
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrB, i3);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrB, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            long j = (((long) length) * 8) - ((long) iBitLength3);
            if (i4 < j) {
                if (((bArrCopyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    e.d("inconsistent");
                    return;
                }
                i4++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zzicxVar.a.a(zzidu.a(this.c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i3];
                int i5 = 0;
                int i6 = 0;
                while (i5 <= (i2 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    messageDigest2.update(zzhnq.b(BigInteger.valueOf(i5), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i6, Math.min(length3, i3 - i6));
                    i6 += length3;
                    i5++;
                    messageDigest2 = messageDigest2;
                }
                byte[] bArr5 = new byte[i3];
                for (int i7 = 0; i7 < i3; i7++) {
                    bArr5[i7] = (byte) (bArr4[i7] ^ bArrCopyOf[i7]);
                }
                for (int i8 = 0; i8 <= j; i8++) {
                    int i9 = i8 / 8;
                    bArr5[i9] = (byte) ((~(1 << (7 - (i8 % 8)))) & bArr5[i9]);
                }
                int i10 = 0;
                while (true) {
                    int i11 = (i2 - i) - 2;
                    if (i10 >= i11) {
                        if (bArr5[i11] != 1) {
                            e.d("inconsistent");
                            return;
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i3 - i, i3);
                        int i12 = digestLength + 8;
                        byte[] bArr6 = new byte[i + i12];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i12, bArrCopyOfRange2.length);
                        if (MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            return;
                        }
                        e.d("inconsistent");
                        return;
                    }
                    if (bArr5[i10] != 0) {
                        e.d("inconsistent");
                        return;
                    }
                    i10++;
                }
            }
        }
    }

    public /* synthetic */ qx4(RSAPublicKey rSAPublicKey, zzidg zzidgVar, zzidg zzidgVar2, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzhno.a()) {
            zzidv.b(zzidgVar);
            if (zzidgVar.equals(zzidgVar2)) {
                zzidv.c(rSAPublicKey.getModulus().bitLength());
                zzidv.d(rSAPublicKey.getPublicExponent());
                this.a = rSAPublicKey;
                this.b = zzidgVar;
                this.c = zzidgVar2;
                this.d = i;
                this.e = bArr;
                this.f = bArr2;
                return;
            }
            e.d("sigHash and mgf1Hash must be the same");
            throw null;
        }
        e.d("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
