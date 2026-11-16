package com.adsurge.adn.Y;

import android.os.Build;
import android.util.ArrayMap;
import android.util.Pair;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.dr0;
import defpackage.jc1;
import defpackage.m93;
import defpackage.n30;
import defpackage.nj;
import defpackage.pv1;
import defpackage.vq2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public final RandomAccessFile a;
    public int b = -1;
    public int c;
    public int d;
    public boolean e;

    /* JADX INFO: renamed from: com.adsurge.adn.Y.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0097a extends Exception {
        public C0097a(String str) {
            super(str);
        }
    }

    public static int b(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        if (i == 1057 || i == 1059 || i == 1061) {
            return 3;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                defpackage.d.q(Long.toHexString(i), "Unknown signature algorithm: 0x");
                return 0;
        }
    }

    public static String c(int i) {
        if (i == 513 || i == 514) {
            return "EC";
        }
        if (i == 769) {
            return "DSA";
        }
        if (i == 1057) {
            return "RSA";
        }
        if (i == 1059) {
            return "EC";
        }
        if (i == 1061) {
            return "DSA";
        }
        switch (i) {
            case 257:
            case 258:
            case 259:
            case 260:
                return "RSA";
            default:
                defpackage.d.q(Long.toHexString(i), "Unknown signature algorithm: 0x");
                return null;
        }
    }

    public static Pair d(int i) {
        if (i != 513) {
            if (i == 514) {
                return Pair.create("SHA512withECDSA", null);
            }
            if (i != 769) {
                if (i != 1057) {
                    if (i != 1059) {
                        if (i != 1061) {
                            switch (i) {
                                case 257:
                                    return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                case 258:
                                    return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                case 259:
                                    break;
                                case 260:
                                    return Pair.create("SHA512withRSA", null);
                                default:
                                    defpackage.d.q(Long.toHexString(i), "Unknown signature algorithm: 0x");
                                    return null;
                            }
                        }
                    }
                }
                return Pair.create("SHA256withRSA", null);
            }
            return Pair.create("SHA256withDSA", null);
        }
        return Pair.create("SHA256withECDSA", null);
    }

    public static boolean e(int i) {
        if (i == 513 || i == 514 || i == 769 || i == 1057 || i == 1059 || i == 1061) {
            return true;
        }
        switch (i) {
            case 257:
            case 258:
            case 259:
            case 260:
                return true;
            default:
                return false;
        }
    }

    public final Pair a(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws C0097a, IOException {
        int i;
        ByteBuffer byteBufferA = a(byteBuffer);
        int i2 = byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < i2 || i4 > i3) {
            if (this.d == 462663009 && ((i = this.b) < 0 || i > i2)) {
                this.b = i2;
            }
            StringBuilder sbT = jc1.t("Signer not supported by this platform version. This platform: ", i4, ", signer minSdkVersion: ", i2, ", maxSdkVersion: ");
            sbT.append(i3);
            throw new C0097a(sbT.toString());
        }
        ByteBuffer byteBufferA2 = a(byteBuffer);
        byte[] bArrB = b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i5 = -1;
        int i6 = 0;
        byte[] bArrB2 = null;
        while (true) {
            int i7 = 8;
            if (!byteBufferA2.hasRemaining()) {
                if (i5 == -1) {
                    if (i6 == 0) {
                        vq2.y("No signatures found");
                        return null;
                    }
                    vq2.y("No supported signatures found");
                    return null;
                }
                String strC = c(i5);
                Pair pairD = d(i5);
                String str = (String) pairD.first;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairD.second;
                try {
                    PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(strC).generatePublic(new X509EncodedKeySpec(bArrB));
                    Signature signature = Signature.getInstance(str);
                    signature.initVerify(publicKeyGeneratePublic);
                    if (algorithmParameterSpec != null) {
                        signature.setParameter(algorithmParameterSpec);
                    }
                    signature.update(byteBufferA);
                    if (!signature.verify(bArrB2)) {
                        vq2.y(n30.m(str, " signature did not verify"));
                        return null;
                    }
                    byteBufferA.clear();
                    ByteBuffer byteBufferA3 = a(byteBufferA);
                    ArrayList arrayList2 = new ArrayList();
                    byte[] bArrB3 = null;
                    int i8 = 0;
                    while (byteBufferA3.hasRemaining()) {
                        i8++;
                        try {
                            ByteBuffer byteBufferA4 = a(byteBufferA3);
                            if (byteBufferA4.remaining() < i7) {
                                throw new IOException("Record too short");
                            }
                            int i9 = byteBufferA4.getInt();
                            arrayList2.add(Integer.valueOf(i9));
                            if (i9 == i5) {
                                bArrB3 = b(byteBufferA4);
                            }
                            i7 = 8;
                        } catch (IOException e) {
                            e = e;
                            throw new IOException(pv1.k(i8, "Failed to parse digest record #"), e);
                        } catch (BufferUnderflowException e2) {
                            e = e2;
                            throw new IOException(pv1.k(i8, "Failed to parse digest record #"), e);
                        }
                    }
                    if (!arrayList.equals(arrayList2)) {
                        vq2.y("Signature algorithms don't match between digests and signatures records");
                        return null;
                    }
                    int iB = b(i5);
                    byte[] bArr = (byte[]) map.put(Integer.valueOf(iB), bArrB3);
                    if (bArr != null && !MessageDigest.isEqual(bArr, bArrB3)) {
                        throw new SecurityException(a(iB) + " contents digest does not match the digest specified by a preceding signer");
                    }
                    ByteBuffer byteBufferA5 = a(byteBufferA);
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    while (byteBufferA5.hasRemaining()) {
                        i10++;
                        byte[] bArrB4 = b(byteBufferA5);
                        try {
                            arrayList3.add(new f((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrB4)), bArrB4));
                        } catch (CertificateException e3) {
                            throw new SecurityException(pv1.k(i10, "Failed to decode certificate #"), e3);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        vq2.y("No certificates listed");
                        return null;
                    }
                    if (!Arrays.equals(bArrB, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                        vq2.y("Public key mismatch between certificate and signature record");
                        return null;
                    }
                    int i11 = byteBufferA.getInt();
                    if (i11 != i2) {
                        vq2.y("minSdkVersion mismatch between signed and unsigned in v3 signer block.");
                        return null;
                    }
                    this.c = i11;
                    if (byteBufferA.getInt() == i3) {
                        return a(a(byteBufferA), arrayList3, certificateFactory);
                    }
                    vq2.y("maxSdkVersion mismatch between signed and unsigned in v3 signer block.");
                    return null;
                } catch (InvalidAlgorithmParameterException e4) {
                    e = e4;
                    throw new SecurityException(pv1.n("Failed to verify ", str, " signature"), e);
                } catch (InvalidKeyException e5) {
                    e = e5;
                    throw new SecurityException(pv1.n("Failed to verify ", str, " signature"), e);
                } catch (NoSuchAlgorithmException e6) {
                    e = e6;
                    throw new SecurityException(pv1.n("Failed to verify ", str, " signature"), e);
                } catch (SignatureException e7) {
                    e = e7;
                    throw new SecurityException(pv1.n("Failed to verify ", str, " signature"), e);
                } catch (InvalidKeySpecException e8) {
                    e = e8;
                    throw new SecurityException(pv1.n("Failed to verify ", str, " signature"), e);
                }
            }
            i6++;
            try {
                ByteBuffer byteBufferA6 = a(byteBufferA2);
                if (byteBufferA6.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferA6.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (e(i12) && (i5 == -1 || b(i12, i5) > 0)) {
                    bArrB2 = b(byteBufferA6);
                    i5 = i12;
                }
            } catch (IOException e9) {
                e = e9;
                throw new SecurityException(pv1.k(i6, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e10) {
                e = e10;
                throw new SecurityException(pv1.k(i6, "Failed to parse signature record #"), e);
            }
        }
    }

    public a(RandomAccessFile randomAccessFile, boolean z) {
        this.a = randomAccessFile;
        this.e = z;
    }

    public static byte[] b(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            StringBuilder sbS = jc1.s(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
            sbS.append(byteBuffer.remaining());
            throw new IOException(sbS.toString());
        }
        dr0.h("Negative length");
        return null;
    }

    public static int b(int i, int i2) {
        return a(b(i), b(i2));
    }

    public static e.a a(RandomAccessFile randomAccessFile, boolean z) {
        a aVar = new a(randomAccessFile, z);
        try {
            return aVar.a(a(randomAccessFile, 462663009), 462663009);
        } catch (C0097a | d unused) {
            try {
                return aVar.a(a(randomAccessFile, -262969152), -262969152);
            } catch (C0097a e) {
                throw new SecurityException(e);
            }
        }
    }

    public static c a(RandomAccessFile randomAccessFile, int i) {
        return b.a(randomAccessFile, i);
    }

    public final e.a a(c cVar, int i) throws C0097a {
        this.d = i;
        ArrayMap arrayMap = new ArrayMap();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer byteBufferA = a(cVar.a);
                int i2 = 0;
                Pair pairA = null;
                while (byteBufferA.hasRemaining()) {
                    try {
                        pairA = a(a(byteBufferA), arrayMap, certificateFactory);
                        i2++;
                    } catch (C0097a unused) {
                    } catch (IOException e) {
                        e = e;
                        throw new SecurityException(jc1.k(i2, "Failed to parse/verify signer #", " block"), e);
                    } catch (SecurityException e2) {
                        e = e2;
                        throw new SecurityException(jc1.k(i2, "Failed to parse/verify signer #", " block"), e);
                    } catch (BufferUnderflowException e3) {
                        e = e3;
                        throw new SecurityException(jc1.k(i2, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i2 < 1 || pairA == null) {
                    if (i == -262969152) {
                        vq2.y("No signers found");
                        return null;
                    }
                    throw new C0097a("None of the signers support the current platform version");
                }
                if (i2 == 1) {
                    if (!arrayMap.isEmpty()) {
                        return new e.a((X509Certificate[]) pairA.first, (b.a) pairA.second, arrayMap.containsKey(3) ? b.a((byte[]) arrayMap.get(3), this.a.getChannel().size(), cVar) : null, arrayMap, i);
                    }
                    vq2.y("No content digests found");
                    return null;
                }
                vq2.y("APK Signature Scheme V3 only supports one signer: multiple signers found.");
                return null;
            } catch (IOException e4) {
                throw new SecurityException("Failed to read list of signers", e4);
            }
        } catch (CertificateException e5) {
            vq2.n("Failed to obtain X.509 CertificateFactory", e5);
            return null;
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return b.b(byteBuffer, i);
                }
                StringBuilder sbS = jc1.s(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
                sbS.append(byteBuffer.remaining());
                throw new IOException(sbS.toString());
            }
            defpackage.d.r("Negative length");
            return null;
        }
        m93.f(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
        return null;
    }

    public static int a(int i, int i2) {
        if (i == 1) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2 || i2 == 3) {
                return -1;
            }
            defpackage.d.r(pv1.k(i2, "Unknown digestAlgorithm2: "));
            return 0;
        }
        if (i == 2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return 0;
                }
                if (i2 != 3) {
                    defpackage.d.r(pv1.k(i2, "Unknown digestAlgorithm2: "));
                    return 0;
                }
            }
            return 1;
        }
        if (i != 3) {
            defpackage.d.r(pv1.k(i, "Unknown digestAlgorithm1: "));
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return -1;
        }
        if (i2 == 3) {
            return 0;
        }
        defpackage.d.r(pv1.k(i2, "Unknown digestAlgorithm2: "));
        return 0;
    }

    public final Pair a(ByteBuffer byteBuffer, List list, CertificateFactory certificateFactory) throws C0097a, IOException {
        X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
        b.a aVarA = null;
        while (byteBuffer.hasRemaining()) {
            ByteBuffer byteBufferA = a(byteBuffer);
            if (byteBufferA.remaining() >= 4) {
                int i = byteBufferA.getInt();
                if (i != -1029262406) {
                    if (i != 1000370060) {
                        if (i != 1436519170) {
                            continue;
                        } else if (byteBufferA.remaining() >= 4) {
                            int i2 = byteBufferA.getInt();
                            int i3 = this.b;
                            if (i3 < 0) {
                                vq2.y(jc1.k(i2, "Expected a v3.1 signing block targeting SDK version ", ", but a v3.1 block was not found"));
                                return null;
                            }
                            if (i3 != i2) {
                                vq2.y(nj.i(i2, i3, "Expected a v3.1 signing block targeting SDK version ", ", but the v3.1 block was targeting "));
                                return null;
                            }
                        } else {
                            m93.f(byteBufferA.remaining(), "Remaining buffer too short to contain rotation minSdkVersion value. Remaining: ");
                            return null;
                        }
                    } else if (aVarA == null) {
                        aVarA = a(byteBufferA, certificateFactory);
                        try {
                            if (aVarA.a.size() > 0) {
                                List list2 = aVarA.a;
                                if (!Arrays.equals(((X509Certificate) list2.get(list2.size() - 1)).getEncoded(), x509CertificateArr[0].getEncoded())) {
                                    throw new SecurityException("Terminal certificate in Proof-of-rotation record does not match APK signing certificate");
                                }
                            } else {
                                continue;
                            }
                        } catch (CertificateEncodingException e) {
                            throw new SecurityException("Failed to encode certificate when comparing Proof-of-rotation record and signing certificate", e);
                        }
                    } else {
                        vq2.y("Encountered multiple Proof-of-rotation records when verifying APK Signature Scheme v3 signature");
                        return null;
                    }
                } else if (this.d == 462663009 && Build.VERSION.SDK_INT == this.c && "REL".equals(Build.VERSION.CODENAME)) {
                    this.b = this.c;
                    throw new C0097a(nj.l(this.c, ", but the signer is targeting a dev release", new StringBuilder("The device is running a release version of ")));
                }
            } else {
                m93.f(byteBufferA.remaining(), "Remaining buffer too short to contain additional attribute ID. Remaining: ");
                return null;
            }
        }
        return Pair.create(x509CertificateArr, aVarA);
    }

    public static String a(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        if (i != 3) {
            defpackage.d.r(pv1.k(i, "Unknown content digest algorthm: "));
            return null;
        }
        return "SHA-256";
    }

    public static b.a a(ByteBuffer byteBuffer, CertificateFactory certificateFactory) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        try {
            byteBuffer.getInt();
            HashSet hashSet = new HashSet();
            int i2 = -1;
            f fVar = null;
            while (byteBuffer.hasRemaining()) {
                i++;
                ByteBuffer byteBufferA = a(byteBuffer);
                ByteBuffer byteBufferA2 = a(byteBufferA);
                int i3 = byteBufferA.getInt();
                int i4 = byteBufferA.getInt();
                byte[] bArrB = b(byteBufferA);
                if (fVar != null) {
                    Pair pairD = d(i2);
                    PublicKey publicKey = fVar.getPublicKey();
                    Signature signature = Signature.getInstance((String) pairD.first);
                    signature.initVerify(publicKey);
                    Object obj = pairD.second;
                    if (obj != null) {
                        signature.setParameter((AlgorithmParameterSpec) obj);
                    }
                    signature.update(byteBufferA2);
                    if (!signature.verify(bArrB)) {
                        throw new SecurityException("Unable to verify signature of certificate #" + i + " using " + ((String) pairD.first) + " when verifying Proof-of-rotation record");
                    }
                }
                byteBufferA2.rewind();
                byte[] bArrB2 = b(byteBufferA2);
                int i5 = byteBufferA2.getInt();
                if (fVar != null && i2 != i5) {
                    throw new SecurityException("Signing algorithm ID mismatch for certificate #" + i + " when verifying Proof-of-rotation record");
                }
                fVar = new f((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrB2)), bArrB2);
                if (!hashSet.contains(fVar)) {
                    hashSet.add(fVar);
                    arrayList.add(fVar);
                    arrayList2.add(Integer.valueOf(i3));
                    i2 = i4;
                } else {
                    throw new SecurityException("Encountered duplicate entries in Proof-of-rotation record at certificate #" + i + ".  All signing certificates should be unique");
                }
            }
            return new b.a(arrayList, arrayList2);
        } catch (IOException e) {
            e = e;
            throw new IOException("Failed to parse Proof-of-rotation record", e);
        } catch (BufferUnderflowException e2) {
            e = e2;
            throw new IOException("Failed to parse Proof-of-rotation record", e);
        } catch (InvalidAlgorithmParameterException e3) {
            e = e3;
            throw new SecurityException(jc1.k(0, "Failed to verify signature over signed data for certificate #", " when verifying Proof-of-rotation record"), e);
        } catch (InvalidKeyException e4) {
            e = e4;
            throw new SecurityException(jc1.k(0, "Failed to verify signature over signed data for certificate #", " when verifying Proof-of-rotation record"), e);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            throw new SecurityException(jc1.k(0, "Failed to verify signature over signed data for certificate #", " when verifying Proof-of-rotation record"), e);
        } catch (SignatureException e6) {
            e = e6;
            throw new SecurityException(jc1.k(0, "Failed to verify signature over signed data for certificate #", " when verifying Proof-of-rotation record"), e);
        } catch (CertificateException e7) {
            throw new SecurityException(jc1.k(0, "Failed to decode certificate #", " when verifying Proof-of-rotation record"), e7);
        }
    }
}
