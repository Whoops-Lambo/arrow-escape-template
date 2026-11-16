package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.cm2;
import defpackage.dr0;
import defpackage.du;
import defpackage.e32;
import defpackage.e80;
import defpackage.eu;
import defpackage.gd1;
import defpackage.gg0;
import defpackage.rc1;
import defpackage.s71;
import defpackage.sr0;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 /2\u00020\u0001:\u0001/B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b\b\u0010\u0012R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010.\u001a\u00020\"*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u00060"}, d2 = {"Lcom/applovin/shadow/okhttp3/Handshake;", "", "Lcom/applovin/shadow/okhttp3/TlsVersion;", "tlsVersion", "Lcom/applovin/shadow/okhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lsr0;)V", "-deprecated_tlsVersion", "()Lcom/applovin/shadow/okhttp3/TlsVersion;", "-deprecated_cipherSuite", "()Lcom/applovin/shadow/okhttp3/CipherSuite;", "-deprecated_peerCertificates", "()Ljava/util/List;", "peerCertificates", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "peerPrincipal", "-deprecated_localCertificates", "-deprecated_localPrincipal", "localPrincipal", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/applovin/shadow/okhttp3/TlsVersion;", "()Lokhttp3/TlsVersion;", "Lcom/applovin/shadow/okhttp3/CipherSuite;", "()Lokhttp3/CipherSuite;", "Ljava/util/List;", "peerCertificates$delegate", "Lgd1;", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Handshake {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CipherSuite cipherSuite;

    @NotNull
    private final List<Certificate> localCertificates;

    /* JADX INFO: renamed from: peerCertificates$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 peerCertificates;

    @NotNull
    private final TlsVersion tlsVersion;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/applovin/shadow/okhttp3/Handshake$Companion;", "", "()V", "get", "Lcom/applovin/shadow/okhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lcom/applovin/shadow/okhttp3/TlsVersion;", "cipherSuite", "Lcom/applovin/shadow/okhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : gg0.a;
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m134deprecated_get(@NotNull SSLSession sslSession) throws IOException {
            sslSession.getClass();
            return get(sslSession);
        }

        @NotNull
        public final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
            boolean zEquals;
            List<Certificate> immutableList;
            sSLSession.getClass();
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL")) {
                    zEquals = true;
                } else {
                    zEquals = cipherSuite.equals("SSL_NULL_WITH_NULL_NULL");
                }
                if (!zEquals) {
                    CipherSuite cipherSuiteForJavaName = CipherSuite.INSTANCE.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!"NONE".equals(protocol)) {
                            TlsVersion tlsVersionForJavaName = TlsVersion.INSTANCE.forJavaName(protocol);
                            try {
                                immutableList = toImmutableList(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                immutableList = gg0.a;
                            }
                            return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(immutableList));
                        }
                        dr0.h("tlsVersion == NONE");
                        return null;
                    }
                    e32.i("tlsVersion == null");
                    return null;
                }
                dr0.h("cipherSuite == ".concat(cipherSuite));
                return null;
            }
            e32.i("cipherSuite == null");
            return null;
        }

        private Companion() {
        }

        @NotNull
        public final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> peerCertificates, @NotNull List<? extends Certificate> localCertificates) {
            tlsVersion.getClass();
            cipherSuite.getClass();
            peerCertificates.getClass();
            localCertificates.getClass();
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(localCertificates), new Handshake$Companion$get$1(Util.toImmutableList(peerCertificates)));
        }
    }

    /* JADX INFO: renamed from: com.applovin.shadow.okhttp3.Handshake$peerCertificates$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends rc1 implements sr0 {
        final /* synthetic */ sr0 $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(sr0 sr0Var) {
            super(0);
            this.$peerCertificatesFn = sr0Var;
        }

        @Override // defpackage.sr0
        @NotNull
        public final List<Certificate> invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return gg0.a;
            }
        }
    }

    @NotNull
    public static final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return INSTANCE.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name and from getter */
    public final CipherSuite getCipherSuite() {
        return this.cipherSuite;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m129deprecated_localCertificates() {
        return this.localCertificates;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name and from getter */
    public final TlsVersion getTlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) other;
        return handshake.tlsVersion == this.tlsVersion && s71.b(handshake.cipherSuite, this.cipherSuite) && s71.b(handshake.peerCertificates(), peerCertificates()) && s71.b(handshake.localCertificates, this.localCertificates);
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    @NotNull
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @Nullable
    public final Principal localPrincipal() {
        Object objC0 = du.c0(this.localCertificates);
        X509Certificate x509Certificate = objC0 instanceof X509Certificate ? (X509Certificate) objC0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @NotNull
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates.getValue();
    }

    @NotNull
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull sr0 sr0Var) {
        tlsVersion.getClass();
        cipherSuite.getClass();
        list.getClass();
        sr0Var.getClass();
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates = new cm2(new AnonymousClass2(sr0Var));
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m130deprecated_localPrincipal() {
        return localPrincipal();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m131deprecated_peerCertificates() {
        return peerCertificates();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m132deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @Nullable
    public final Principal peerPrincipal() {
        X509Certificate x509Certificate;
        Object objC0 = du.c0(peerCertificates());
        if (objC0 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) objC0;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    @NotNull
    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(eu.f(listPeerCertificates, 10));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(eu.f(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    @NotNull
    public static final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
        return INSTANCE.get(sSLSession);
    }
}
