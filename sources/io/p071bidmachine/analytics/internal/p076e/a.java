package io.p071bidmachine.analytics.internal.p076e;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements b {
    private final byte[] a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws GeneralSecurityException {
        Mac mac = Mac.getInstance(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr2 != null && bArr2.length != 0) {
                mac.init(new SecretKeySpec(bArr2, str));
            } else {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            }
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
            byte[] bArrDoFinal = new byte[0];
            int i2 = 1;
            int length = 0;
            while (true) {
                mac.update(bArrDoFinal);
                if (bArr3 != null) {
                    mac.update(bArr3);
                }
                mac.update((byte) i2);
                bArrDoFinal = mac.doFinal();
                if (bArrDoFinal.length + length < i) {
                    System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
                    length += bArrDoFinal.length;
                    i2++;
                } else {
                    System.arraycopy(bArrDoFinal, 0, bArr4, length, i - length);
                    return bArr4;
                }
            }
        } else {
            e.d("size too large");
            return null;
        }
    }

    @Override // io.p071bidmachine.analytics.internal.p076e.b
    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a("HMACSHA256", bArr, bArr3, bArr2, 32);
    }
}
