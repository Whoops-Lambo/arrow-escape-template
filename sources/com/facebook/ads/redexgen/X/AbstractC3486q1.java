package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3486q1 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{46, 118, 110, 115, 109, 101, 34, 37, 56, 35, 48, 37, 36, 100, 39, 47, 62, 43, 100, 41, 37, 39};
    }

    public static boolean A02(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        return A00(6, 16, 3).equals(host) && path != null && path.startsWith(A00(0, 6, 72));
    }

    public static boolean A03(C2055Hi c2055Hi, Uri uri) {
        return C3434p8.A04() != null && ProcessUtils.isRemoteRenderingProcess() && A02(uri) && A04(c2055Hi, uri);
    }

    public static boolean A04(C2055Hi c2055Hi, Uri uri) {
        AudienceNetworkRemoteServiceApi.HorizonWorldUrlLauncher launcher = C3434p8.A04();
        if (launcher != null) {
            return launcher.launchUrl(c2055Hi, uri);
        }
        return false;
    }
}
