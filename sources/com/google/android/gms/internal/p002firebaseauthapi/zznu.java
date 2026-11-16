package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zznu {
    public static BigInteger a(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] b(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        d.r("n must not be negative");
        return null;
    }

    public static byte[] c(BigInteger bigInteger, int i) throws GeneralSecurityException {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray.length == i) {
                return byteArray;
            }
            int i2 = i + 1;
            if (byteArray.length <= i2) {
                if (byteArray.length == i2) {
                    if (byteArray[0] == 0) {
                        return Arrays.copyOfRange(byteArray, 1, byteArray.length);
                    }
                    e.d("integer too large");
                    return null;
                }
                byte[] bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
                return bArr;
            }
            e.d("integer too large");
            return null;
        }
        d.r("integer must be nonnegative");
        return null;
    }
}
