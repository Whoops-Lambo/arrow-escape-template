package com.google.common.base;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@ElementTypesAreNonnullByDefault
public final class Strings {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{49, 108, -103, -19, -31, -21, -34, -16, -103, 79, -99, 65, 104, 123, -125, 126, 124, -115, 116, 118, 66, -121, -114, -123, -123, 74, 62, -119, -59, 95, -110, 125, 127, -118, -114, -125, -119, -120, 58, 126, -113, -116, -125, -120, -127, 58, -122, 127, -120, -125, 127, -120, -114, 96, -119, -116, -121, 123, -114, 58, -128, -119, -116, 58, -37, -25, -27, -90, -33, -25, -25, -33, -28, -35, -90, -37, -25, -27, -27, -25, -26, -90, -38, -39, -21, -35, -90, -53, -20, -22, -31, -26, -33, -21, -79, -72, -81, -81};
    }

    public static String A01(@CheckForNull Object o) {
        if (o == null) {
            return A00(94, 4, 50);
        }
        try {
            return o.toString();
        } catch (Exception e) {
            String str = o.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o));
            Logger.getLogger(A00(64, 30, 103)).log(Level.WARNING, A00(29, 35, 9) + str, (Throwable) e);
            return A00(27, 1, 60) + str + A00(2, 7, 104) + e.getClass().getName() + A00(28, 1, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        }
    }

    public static String A02(@CheckForNull String template, @CheckForNull Object... args) {
        int i;
        String strValueOf = String.valueOf(template);
        if (args == null) {
            args = new Object[]{A00(11, 14, 8)};
        } else {
            for (int templateStart = 0; templateStart < i; templateStart++) {
                args[templateStart] = A01(args[templateStart]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (args.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i3 < args.length && (i = strValueOf.indexOf(A00(9, 2, 25), i2)) != -1) {
            sb.append((CharSequence) strValueOf, i2, i);
            int templateStart2 = i3 + 1;
            sb.append(args[i3]);
            i2 = i + 2;
            i3 = templateStart2;
        }
        sb.append((CharSequence) strValueOf, i2, strValueOf.length());
        if (i3 < args.length) {
            sb.append(A00(0, 2, 0));
            int i4 = i3 + 1;
            sb.append(args[i3]);
            while (i4 < args.length) {
                sb.append(A00(25, 2, 13));
                int templateStart3 = i4 + 1;
                sb.append(args[i4]);
                i4 = templateStart3;
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
