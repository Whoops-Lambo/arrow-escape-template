package com.facebook.ads.redexgen.X;

import androidx.media3.common.PlaybackException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C16751d {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, 4, 9, 1, -2, 3, -61, -1, 11, 2, -61, -5, 10, 3, -8, 9, -2, 4, 3, 8, -61};
    }

    public final String A02(InterfaceC16560k interfaceC16560k) {
        String string = interfaceC16560k.getClass().getGenericInterfaces()[0].toString();
        String strA00 = A00(0, 21, 47);
        return string.startsWith(strA00) ? string.substring(strA00.length()) : string;
    }

    public final String A03(C0V c0v) {
        return A02(c0v);
    }
}
