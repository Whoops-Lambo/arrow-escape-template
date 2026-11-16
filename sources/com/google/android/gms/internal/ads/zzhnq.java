package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhnq {
    public static byte[] a(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        defpackage.d.r("n must not be negative");
        return null;
    }

    public static byte[] b(BigInteger bigInteger, int i) {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (length == i) {
                return byteArray;
            }
            int i2 = i + 1;
            if (length <= i2) {
                if (length == i2) {
                    if (byteArray[0] == 0) {
                        return Arrays.copyOfRange(byteArray, 1, length);
                    }
                    io.p071bidmachine.ads.networks.adaptiverendering.e.d("integer too large");
                    return null;
                }
                byte[] bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, i - length, length);
                return bArr;
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("integer too large");
            return null;
        }
        defpackage.d.r("integer must be nonnegative");
        return null;
    }
}
