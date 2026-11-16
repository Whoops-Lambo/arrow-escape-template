package com.adsurge.adn.Y;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class f extends g {
    public final byte[] b;
    public int c;

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((f) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return this.b;
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (this.c == -1) {
            try {
                this.c = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.c = 0;
            }
        }
        return this.c;
    }

    public f(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.c = -1;
        this.b = bArr;
    }
}
