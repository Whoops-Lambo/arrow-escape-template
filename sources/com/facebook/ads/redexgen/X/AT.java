package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class AT implements InterfaceC2626bs {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC3222le A00;
    public Executor A01;
    public boolean A02;
    public C2602bU A03;
    public final InterfaceC2588bG A04 = new AZ();
    public final InterfaceC2570ay A05;
    public final InterfaceC2566au A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final InterfaceC2630bw A01(AbstractC2577b5 abstractC2577b5) throws C2573b1 {
        String strA07 = A07(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 7, 7);
        HttpURLConnection httpURLConnection = null;
        AU auA05 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection httpURLConnectionA08 = A08(abstractC2577b5.A07(), C3450pR.A04() ? A09() : null);
                A0H(httpURLConnectionA08, abstractC2577b5);
                A0G(httpURLConnectionA08, abstractC2577b5);
                if (this.A06.ABH()) {
                    this.A06.ACi(httpURLConnectionA08, abstractC2577b5.A08());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                Set<String> setA01 = this.A03.A01();
                Set<String> setA02 = this.A03.A02();
                boolean z2 = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z = true;
                }
                if ((httpURLConnectionA08 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        AbstractC2563ar.A03((HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (CertificateException e) {
                        this.A00.ACp(strA07, AbstractC3223lf.A1z, new C3224lg(e));
                    } catch (Exception e2) {
                        this.A00.ACp(strA07, AbstractC3223lf.A1y, new C3224lg(e2));
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && abstractC2577b5.A08() != null) {
                    A00(httpURLConnectionA08, abstractC2577b5.A08());
                }
                AU auA06 = httpURLConnectionA08.getDoInput() ? A06(httpURLConnectionA08) : new AU(httpURLConnectionA08, null);
                if (this.A06.ABH()) {
                    this.A06.ACj(auA06);
                }
                if (httpURLConnectionA08 != null) {
                    httpURLConnectionA08.disconnect();
                }
                return auA06;
            } catch (Exception e3) {
                try {
                    try {
                        auA05 = A05(null);
                        if (auA05 == null || auA05.A9p() <= 0) {
                            throw new C2573b1(e3, auA05);
                        }
                        if (this.A06.ABH()) {
                            this.A06.ACj(auA05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return auA05;
                    } catch (Throwable unused) {
                        if (auA05 == null || auA05.A9p() <= 0) {
                            throw new C2573b1(e3, auA05);
                        }
                        if (this.A06.ABH()) {
                            this.A06.ACj(auA05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return auA05;
                    }
                } catch (Exception unused2) {
                    Log.e(getClass().getSimpleName(), A07(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 13, 53), e3);
                    if (auA05 == null || auA05.A9p() <= 0) {
                        throw new C2573b1(e3, auA05);
                    }
                    if (this.A06.ABH()) {
                        InterfaceC2566au interfaceC2566au = this.A06;
                        String[] strArr = A08;
                        if (strArr[0].charAt(28) == strArr[2].charAt(28)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[0] = "IlkFDbfWlXmKaUvETbHYmdNk6OEHYi1H";
                        strArr2[2] = "BN3YcSqfdOqAJI6hng3gZMbRThXyngdJ";
                        interfaceC2566au.ACj(auA05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return auA05;
                }
            }
        } catch (Throwable th) {
            if (this.A06.ABH()) {
                this.A06.ACj(auA05);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, 30, 106, 119, 106, 28, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, 28, 31, 7, 26, 3, 72, 13, 26, 26, 7, 26, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, 127, 126, 127, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, 24, 4, 4, 0, 94, 0, 2, 31, 8, 9, 56, 31, 3, 4, 127, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:72:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0108 A[EDGE_INSN: B:79:0x0108->B:40:0x0108 BREAK  A[LOOP:0: B:3:0x002a->B:26:0x00cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final InterfaceC2630bw A0J(AbstractC2577b5 abstractC2577b5) throws C2573b1 {
        InterfaceC2630bw interfaceC2630bwA00;
        long length;
        long length2;
        int iA9p;
        int i = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA01 = abstractC2577b5.A04().A01();
        long jA03 = abstractC2577b5.A04().A03();
        long jCurrentTimeMillis2 = System.currentTimeMillis() + ((long) abstractC2577b5.A04().A04());
        while (true) {
            if (A08[5].length() == 28) {
                A08[5] = "uw7CndVwumsNWx3tR5uVNB4kWYqq";
                if (i >= iA01 || jCurrentTimeMillis2 <= System.currentTimeMillis()) {
                    this.A00.ACc(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, 0L, abstractC2577b5.A04 == null ? 0L : abstractC2577b5.A04.length, 0, new TimeoutException(A07(82, 35, 27)));
                    return null;
                }
                try {
                    if (this.A06.ABH()) {
                        String str = (i + 1) + A07(37, 4, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) + iA01 + A07(56, 9, 70) + abstractC2577b5.A07();
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    InterfaceC2630bw interfaceC2630bwA01 = A01(abstractC2577b5);
                    if (interfaceC2630bwA01 != null) {
                        this.A00.ACc(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, interfaceC2630bwA01.A7c().length, abstractC2577b5.A04 == null ? 0L : abstractC2577b5.A04.length, interfaceC2630bwA01.A9p(), null);
                        return interfaceC2630bwA01;
                    }
                    continue;
                } catch (C2573b1 e) {
                    if (!A0I(e, jCurrentTimeMillis, abstractC2577b5) || i >= iA01 - 1) {
                        InterfaceC2570ay interfaceC2570ay = this.A05;
                        if (A08[5].length() == 28) {
                            A08[4] = "QCV1DKlppK5B8d9XgS0nl0pavHf";
                            if (!interfaceC2570ay.AEu(e)) {
                                break;
                            }
                            if (i < iA01 - 1) {
                                break;
                                break;
                            }
                            if (jA03 > 0) {
                                Thread.sleep(jA03);
                            } else {
                                continue;
                            }
                        } else {
                            A08[4] = "RTCgSwX4E1qAS9DeUF79c1CzYGzjCcSq";
                            if (!interfaceC2570ay.AEu(e)) {
                                break;
                            }
                            if (i < iA01 - 1) {
                                break;
                            }
                            if (jA03 > 0) {
                                try {
                                    Thread.sleep(jA03);
                                } catch (InterruptedException e2) {
                                    this.A00.ACc(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, 0L, abstractC2577b5.A04 != null ? abstractC2577b5.A04.length : 0L, 0, e2);
                                    throw e;
                                }
                            } else {
                                continue;
                            }
                        }
                        interfaceC2630bwA00 = e.A00();
                        InterfaceC3222le interfaceC3222le = this.A00;
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (interfaceC2630bwA00 == null) {
                            length = 0;
                        } else {
                            length = 0;
                        }
                        if (abstractC2577b5.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = abstractC2577b5.A04.length;
                        }
                        if (interfaceC2630bwA00 == null) {
                            iA9p = 0;
                        } else {
                            iA9p = interfaceC2630bwA00.A9p();
                        }
                        interfaceC3222le.ACc(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA9p, e);
                        throw e;
                    }
                    continue;
                }
                i++;
            }
            throw new RuntimeException();
        }
        interfaceC2630bwA00 = e.A00();
        InterfaceC3222le interfaceC3222le2 = this.A00;
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (interfaceC2630bwA00 == null && interfaceC2630bwA00.A7c() != null) {
            byte[] bArrA7c = interfaceC2630bwA00.A7c();
            String[] strArr = A08;
            if (strArr[3].length() != strArr[6].length()) {
                String[] strArr2 = A08;
                strArr2[3] = "kZCGiI5zGihRv0GXktBIsysHbk9bX5";
                strArr2[6] = "FynZg164G";
                length = bArrA7c.length;
            }
            throw new RuntimeException();
        }
        length = 0;
        if (abstractC2577b5.A04 == null) {
            length2 = 0;
        } else {
            length2 = abstractC2577b5.A04.length;
        }
        if (interfaceC2630bwA00 == null) {
            iA9p = 0;
        } else {
            iA9p = interfaceC2630bwA00.A9p();
        }
        interfaceC3222le2.ACc(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA9p, e);
        throw e;
    }

    static {
        A0A();
        A09 = InterfaceC2626bs.class.getSimpleName();
    }

    public AT(C2602bU c2602bU, InterfaceC3222le interfaceC3222le, Executor executor) {
        A0B();
        this.A03 = c2602bU;
        this.A06 = new AS(c2602bU.A04());
        final InterfaceC2566au interfaceC2566au = this.A06;
        final boolean zA05 = c2602bU.A05();
        this.A05 = new AY(interfaceC2566au, zA05) { // from class: com.facebook.ads.redexgen.X.4u
        };
        this.A01 = executor;
        this.A00 = interfaceC3222le;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStreamAI0 = null;
        try {
            outputStreamAI0 = this.A05.AI0(httpURLConnection);
            if (outputStreamAI0 != null) {
                this.A05.AMS(outputStreamAI0, bArr);
            }
            return httpURLConnection.getResponseCode();
        } finally {
            if (outputStreamAI0 != null) {
                try {
                    outputStreamAI0.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final InterfaceC2630bw A02(AbstractC2577b5 abstractC2577b5) {
        if (this.A03.A04()) {
            A0C(abstractC2577b5);
        }
        InterfaceC2630bw interfaceC2630bwA01 = null;
        try {
            interfaceC2630bwA01 = A01(abstractC2577b5);
            return interfaceC2630bwA01;
        } catch (C2573b1 hre) {
            this.A05.AEu(hre);
            return interfaceC2630bwA01;
        } catch (Exception e) {
            this.A05.AEu(new C2573b1(e, interfaceC2630bwA01));
            return interfaceC2630bwA01;
        }
    }

    private final InterfaceC2630bw A03(String str, C2571az c2571az, C2598bQ c2598bQ) {
        return A02(new AW(str, c2571az, c2598bQ));
    }

    private final InterfaceC2630bw A04(String str, String str2, byte[] bArr, C2598bQ c2598bQ) {
        return A02(new AV(str, null, str2, bArr, c2598bQ));
    }

    private final AU A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream = null;
        byte[] responseBody = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                responseBody = this.A05.AIg(errorStream);
            }
            AU au = new AU(httpURLConnection, responseBody);
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused) {
                }
            }
            return au;
        } catch (Throwable th) {
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            A08[4] = "eS";
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final AU A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStreamAHz = null;
        byte[] responseBody = null;
        try {
            inputStreamAHz = this.A05.AHz(httpURLConnection);
            if (inputStreamAHz != null) {
                responseBody = this.A05.AIg(inputStreamAHz);
            }
            return new AU(httpURLConnection, responseBody);
        } finally {
            if (inputStreamAHz != null) {
                try {
                    inputStreamAHz.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.AHy(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String property2 = System.getProperty(A07(206, 14, 74));
        int i = -1;
        if (property2 != null) {
            try {
                i = Integer.parseInt(property2);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String proxyAddress = strArr[0];
        String portStr = strArr[2];
        if (proxyAddress.charAt(28) == portStr.charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
        strArr2[6] = "26yRDH09B";
        if (!zIsEmpty && i > 0 && i <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private void A0C(AbstractC2577b5 abstractC2577b5) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 17));
        boolean zEquals = abstractC2577b5.A05().equals(EnumC2578b6.A06);
        String strA07 = A07(41, 1, 33);
        if (zEquals && abstractC2577b5.A08() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(abstractC2577b5.A08(), Charset.forName(A07(130, 5, 42))));
            sb.append(strA07);
        }
        Map<String, String> mapA06 = abstractC2577b5.A04().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : mapA06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
            sb.append(entry.getValue());
            sb.append(strA07);
        }
        sb.append(A07(0, 2, 109));
        sb.append(abstractC2577b5.A07());
        sb.append(strA07);
        String string = sb.toString();
        A0E(string, 1, (string.length() / 4000) + 1);
    }

    private void A0D(AbstractC2577b5 abstractC2577b5, InterfaceC2624bq interfaceC2624bq) {
        this.A04.A7Y(this, interfaceC2624bq, this.A01).A04(abstractC2577b5);
        if (this.A03.A04()) {
            A0C(abstractC2577b5);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE) + i + A07(65, 1, 35) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC2624bq interfaceC2624bq, C2598bQ c2598bQ) {
        AV req = new AV(str, null, str2, bArr, c2598bQ);
        A0D(req, interfaceC2624bq);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC2577b5 abstractC2577b5) {
        Map<String, String> mapA06 = abstractC2577b5.A04().A06();
        InterfaceC2631bx interfaceC2631bxA05 = abstractC2577b5.A04().A05();
        for (String str : mapA06.keySet()) {
            httpURLConnection.setRequestProperty(str, mapA06.get(str));
        }
        if (interfaceC2631bxA05 != null) {
            Map<String, String> mapA7G = interfaceC2631bxA05.A7G(this.A03.A03());
            for (String str2 : mapA7G.keySet()) {
                httpURLConnection.setRequestProperty(str2, mapA7G.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC2577b5 abstractC2577b5) throws IOException {
        C2598bQ c2598bQA04 = abstractC2577b5.A04();
        httpURLConnection.setConnectTimeout(c2598bQA04.A00());
        httpURLConnection.setReadTimeout(c2598bQA04.A02());
        this.A05.AIJ(httpURLConnection, abstractC2577b5.A05(), abstractC2577b5.A06());
    }

    private final boolean A0I(Throwable th, long j, AbstractC2577b5 abstractC2577b5) {
        C2598bQ c2598bQA04 = abstractC2577b5.A04();
        long elapsedTime = (System.currentTimeMillis() - j) + 10;
        if (this.A06.ABH()) {
            String str = A07(67, 15, 35) + elapsedTime + A07(42, 7, 23) + c2598bQA04.A00() + A07(49, 7, 109) + c2598bQA04.A02();
        }
        if (this.A02) {
            return elapsedTime >= ((long) c2598bQA04.A02());
        }
        long jA00 = c2598bQA04.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return elapsedTime >= jA00;
    }

    public final C2602bU A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2626bs
    @Deprecated
    public final InterfaceC2630bw AI9(String str, Map<String, String> parameters) {
        return A03(str, new C2571az(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2626bs
    @Deprecated
    public final InterfaceC2630bw AIA(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2626bs
    public final void AIB(String str, byte[] bArr, InterfaceC2624bq interfaceC2624bq) {
        A0F(str, A07(135, 47, 70), bArr, interfaceC2624bq, this.A03.A00());
    }
}
