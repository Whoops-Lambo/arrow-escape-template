package com.adsurge.adn.Y;

import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import com.adsurge.adn.X.AbstractC1630c;
import com.adsurge.adn.Y0.v;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static final String a = "com.adsurge.adn.Y.e";
    public static volatile String b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public final X509Certificate[] a;
        public final b.a b;
        public final byte[] c;
        public final Map d;
        public final int e;

        public a(X509Certificate[] x509CertificateArr, b.a aVar, byte[] bArr, Map map, int i) {
            this.a = x509CertificateArr;
            this.b = aVar;
            this.c = bArr;
            this.d = map;
            this.e = i;
        }
    }

    public static String a() {
        Signature[] signatureArr;
        Signature[] signatureArr2;
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        try {
            a aVarA = com.adsurge.adn.Y.a.a(new RandomAccessFile(new File(com.adsurge.adn.s1.a.b().a().getApplicationInfo().sourceDir), "r"), false);
            Signature[] signatureArrA = a(new Certificate[][]{aVarA.a});
            b.a aVar = aVarA.b;
            if (aVar != null) {
                int size = aVar.a.size();
                signatureArr = new Signature[size];
                for (int i = 0; i < size; i++) {
                    signatureArr[i] = new Signature(((X509Certificate) aVarA.b.a.get(i)).getEncoded());
                }
            } else {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                signatureArr2 = new Signature[]{signatureArr[0]};
            } else if (signatureArrA.length > 0) {
                int length = signatureArrA.length;
                Signature[] signatureArr3 = new Signature[length];
                System.arraycopy(signatureArrA, 0, signatureArr3, 0, length);
                signatureArr2 = signatureArr3;
            } else {
                signatureArr2 = null;
            }
            b = AbstractC1630c.a(signatureArr2);
            return b;
        } catch (Exception e) {
            com.adsurge.adn.J0.a.a(a, "exception is " + e);
            com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
            dVar.a("data", Log.getStackTraceString(e));
            v.a(9130084, null, 1, null, dVar);
            return "";
        }
    }

    public static Signature[] a(Certificate[][] certificateArr) {
        Signature[] signatureArr = new Signature[certificateArr.length];
        for (int i = 0; i < certificateArr.length; i++) {
            signatureArr[i] = new Signature(certificateArr[i][0].getEncoded());
        }
        return signatureArr;
    }
}
