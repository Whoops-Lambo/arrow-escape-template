package defpackage;

import com.google.android.gms.internal.ads.zzhhb;
import com.google.android.gms.internal.ads.zzhno;
import com.google.android.gms.internal.ads.zzhnq;
import com.google.android.gms.internal.ads.zzhqq;
import com.google.android.gms.internal.ads.zzicx;
import com.google.android.gms.internal.ads.zzidg;
import com.google.android.gms.internal.ads.zzidh;
import com.google.android.gms.internal.ads.zzidu;
import com.google.android.gms.internal.ads.zzidv;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class px4 implements zzhhb {
    public final RSAPublicKey a;
    public final zzidg b;
    public final byte[] c;
    public final byte[] d;

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.c;
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
        byte[] bArrA;
        int i;
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            e.d("invalid signature's length");
            return;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            e.d("signature out of range");
            return;
        }
        byte[] bArrB = zzhnq.b(bigInteger.modPow(publicExponent, modulus), iBitLength);
        zzidg zzidgVar = this.b;
        zzidv.b(zzidgVar);
        MessageDigest messageDigest = (MessageDigest) zzicx.e.a.a(zzidu.a(zzidgVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.d;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = zzidgVar.ordinal();
        int i2 = 2;
        if (iOrdinal == 2) {
            bArrA = zzidh.a("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrA = zzidh.a("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zzidgVar.toString()));
            }
            bArrA = zzidh.a("3051300d060960864801650304020305000440");
        }
        int length = bArrA.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            e.d("intended encoded message length too short");
            return;
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i3 = 0;
        while (true) {
            i = i2 + 1;
            if (i3 >= (iBitLength - length) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i3++;
            i2 = i;
        }
        bArr4[i2] = 0;
        int length2 = bArrA.length;
        System.arraycopy(bArrA, 0, bArr4, i, length2);
        System.arraycopy(bArrDigest, 0, bArr4, i + length2, bArrDigest.length);
        if (MessageDigest.isEqual(bArrB, bArr4)) {
            return;
        }
        e.d("invalid signature");
    }

    public /* synthetic */ px4(RSAPublicKey rSAPublicKey, zzidg zzidgVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzhno.a()) {
            zzidv.b(zzidgVar);
            zzidv.c(rSAPublicKey.getModulus().bitLength());
            zzidv.d(rSAPublicKey.getPublicExponent());
            this.a = rSAPublicKey;
            this.b = zzidgVar;
            this.c = bArr;
            this.d = bArr2;
            return;
        }
        e.d("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        throw null;
    }
}
