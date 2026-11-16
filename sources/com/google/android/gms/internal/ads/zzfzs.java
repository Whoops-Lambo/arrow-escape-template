package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfzs {
    public static final byte[] c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    public static final byte[] d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    public final byte[] a = d;
    public final byte[] b = c;

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrA = zzatg.a(file.getAbsolutePath());
            if (x509CertificateArrA.length == 1) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrA[0][0].getEncoded());
                if (!Arrays.equals(this.b, bArrDigest) && ("user".equals(Build.TYPE) || !Arrays.equals(this.a, bArrDigest))) {
                    return false;
                }
                return true;
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("APK has more than one signature.");
            return false;
        } catch (zzatd e) {
            io.p071bidmachine.media3.extractor.ts.y.m("Package is not signed", e);
            return false;
        } catch (IOException e2) {
            e = e2;
            io.p071bidmachine.media3.extractor.ts.y.m("Failed to verify signatures", e);
            return false;
        } catch (RuntimeException e3) {
            e = e3;
            io.p071bidmachine.media3.extractor.ts.y.m("Failed to verify signatures", e);
            return false;
        }
    }
}
