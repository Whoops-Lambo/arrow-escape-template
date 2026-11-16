package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2172Mb {
    public static byte[] A00;
    public static String[] A01 = {"UOE", "OzW9X87JasmLstSP6B", "jnOtrEq1Da7DJLynCCVCLwS6SsKHs48l", "O2cSMO4CMvoJi034LwMavfQrBP3oFOAr", "zXr7HORls", "4U8gssiG", "b2wBHpmftLYpfuS3DNRk2GImOTPjiSVl", "vEOiOSf3kJqR3tF"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{121, 97, 102, 103, 108};
    }

    static {
        A01();
    }

    public static void A02(Context context, C2175Me c2175Me) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) AbstractC2159Ln.A01((TelephonyManager) context.getSystemService(A00(0, 5, 50)));
            C2171Ma callback = new C2171Ma(c2175Me);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), callback);
            telephonyManager.unregisterTelephonyCallback(callback);
        } catch (RuntimeException unused) {
            if (A01[0].length() != 3) {
                RuntimeException e = new RuntimeException();
                throw e;
            }
            String[] strArr = A01;
            strArr[4] = "OOzuyXFjn";
            strArr[1] = "Tl4vHdte33mqirbzG0";
            c2175Me.A07(5);
        }
    }
}
