package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dr0;
import defpackage.e32;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class q {
    private final d0 a;
    private final g b;
    private final List<Certificate> c;
    private final List<Certificate> d;

    public List<Certificate> b() {
        return this.c;
    }

    public d0 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.b.equals(qVar.b) && this.c.equals(qVar.c) && this.d.equals(qVar.d);
    }

    public int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.a = d0Var;
        this.b = gVar;
        this.c = list;
        this.d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        List listA;
        List listA2;
        String cipherSuite = sSLSession.getCipherSuite();
        Certificate[] peerCertificates = null;
        if (cipherSuite != null) {
            if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                g gVarA = g.a(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        d0 d0VarA = d0.a(protocol);
                        try {
                            peerCertificates = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException unused) {
                        }
                        if (peerCertificates != null) {
                            listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates);
                        } else {
                            listA = Collections.EMPTY_LIST;
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            listA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates);
                        } else {
                            listA2 = Collections.EMPTY_LIST;
                        }
                        return new q(d0VarA, gVarA, listA, listA2);
                    }
                    dr0.h("tlsVersion == NONE");
                    return null;
                }
                e32.i("tlsVersion == null");
                return null;
            }
            dr0.h("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            return null;
        }
        e32.i("cipherSuite == null");
        return null;
    }

    public g a() {
        return this.b;
    }
}
