package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.ironsource.C4887nc;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.h50;
import defpackage.js4;
import defpackage.ny4;
import defpackage.q63;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzih extends zzho implements zzip {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final zzio i;
    public final zzio j;
    public zzia k;
    public HttpURLConnection l;
    public InputStream m;
    public boolean n;
    public int o;
    public long p;
    public long q;

    public /* synthetic */ zzih(String str, int i, int i2, boolean z, zzio zzioVar) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = zzioVar;
        this.j = new zzio();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        try {
            InputStream inputStream = this.m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzia zziaVar = this.k;
                    String str = zzfq.a;
                    throw new zzil(e, zziaVar, 2000, 3);
                }
            }
            this.m = null;
            q();
            if (this.n) {
                this.n = false;
                n();
            }
            this.l = null;
            this.k = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.m = null;
            q();
            if (this.n) {
                this.n = false;
                n();
            }
            this.l = null;
            this.k = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b A[Catch: NumberFormatException -> 0x0193, TryCatch #2 {NumberFormatException -> 0x0193, blocks: (B:62:0x0135, B:64:0x013b, B:66:0x0145, B:71:0x015b, B:72:0x0191, B:73:0x0192), top: B:154:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0145 A[Catch: NumberFormatException -> 0x0193, TryCatch #2 {NumberFormatException -> 0x0193, blocks: (B:62:0x0135, B:64:0x013b, B:66:0x0145, B:71:0x015b, B:72:0x0191, B:73:0x0192), top: B:154:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x0157  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b A[Catch: NumberFormatException -> 0x0193, TryCatch #2 {NumberFormatException -> 0x0193, blocks: (B:62:0x0135, B:64:0x013b, B:66:0x0145, B:71:0x015b, B:72:0x0191, B:73:0x0192), top: B:154:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0191 A[Catch: NumberFormatException -> 0x0193, TryCatch #2 {NumberFormatException -> 0x0193, blocks: (B:62:0x0135, B:64:0x013b, B:66:0x0145, B:71:0x015b, B:72:0x0191, B:73:0x0192), top: B:154:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0192 A[Catch: NumberFormatException -> 0x0193, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0193, blocks: (B:62:0x0135, B:64:0x013b, B:66:0x0145, B:71:0x015b, B:72:0x0191, B:73:0x0192), top: B:154:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb  */
    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) throws Throwable {
        zzih zzihVar;
        HttpURLConnection httpURLConnectionO;
        byte[] bArrA;
        boolean z;
        long j;
        Throwable th;
        long j2;
        Matcher matcher;
        String strGroup;
        long j3;
        String strGroup2;
        long j4;
        zzih zzihVar2 = this;
        zzihVar2.k = zziaVar;
        zzihVar2.q = 0L;
        zzihVar2.p = 0L;
        k(zziaVar);
        int i = 1;
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            Uri uri = zziaVar.a;
            long j5 = zziaVar.d;
            long j6 = zziaVar.c;
            URL url = new URL(uri.toString());
            long j7 = zziaVar.c;
            long j8 = zziaVar.d;
            long j9 = j6;
            boolean z2 = false;
            try {
                if (zzihVar2.e) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (i2 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i3);
                            throw new zzil(new NoRouteToHostException(sb.toString()), zziaVar, 2001, 1);
                        }
                        zzihVar = this;
                        HttpURLConnection httpURLConnectionO2 = zzihVar.o(url, j7, j8, z2, false, zziaVar.b);
                        int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionO2);
                        String headerField = httpURLConnectionO2.getHeaderField("Location");
                        if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                            httpURLConnectionO = httpURLConnectionO2;
                            break;
                        }
                        AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionO2);
                        url = zzihVar.p(url, headerField, zziaVar);
                        i2 = i3;
                        z2 = false;
                        i = 1;
                    }
                } else {
                    httpURLConnectionO = zzihVar2.o(url, j7, j8, false, true, zziaVar.b);
                    zzihVar = this;
                }
                zzihVar.l = httpURLConnectionO;
                zzihVar.o = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionO);
                String responseMessage = httpURLConnectionO.getResponseMessage();
                int i4 = zzihVar.o;
                long jMax = -1;
                if (i4 < 200 || i4 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionO.getHeaderFields();
                    if (zzihVar.o == 416) {
                        String headerField2 = httpURLConnectionO.getHeaderField("Content-Range");
                        Pattern pattern = zziq.a;
                        if (TextUtils.isEmpty(headerField2)) {
                            z = true;
                            j = -1;
                        } else {
                            Matcher matcher2 = zziq.b.matcher(headerField2);
                            if (matcher2.matches()) {
                                z = true;
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                j = Long.parseLong(strGroup3);
                            } else {
                                z = true;
                                j = -1;
                            }
                        }
                        if (j9 == j) {
                            zzihVar.n = z;
                            l(zziaVar);
                            if (j5 != -1) {
                                return j5;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionO.getErrorStream();
                    try {
                        bArrA = errorStream != null ? zzhca.a(errorStream) : zzfq.b;
                    } catch (IOException unused) {
                        bArrA = zzfq.b;
                    }
                    byte[] bArr = bArrA;
                    zzihVar.q();
                    throw new zzin(zzihVar.o, responseMessage, zzihVar.o == 416 ? new zzhx(2008) : null, headerFields, zziaVar, bArr);
                }
                httpURLConnectionO.getContentType();
                if (zzihVar.o != 200 || j9 == 0) {
                    j9 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionO.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase || j5 != -1) {
                    zzihVar.p = j5;
                } else {
                    String headerField3 = httpURLConnectionO.getHeaderField("Content-Length");
                    String headerField4 = httpURLConnectionO.getHeaderField("Content-Range");
                    Pattern pattern2 = zziq.a;
                    if (TextUtils.isEmpty(headerField3)) {
                        th = null;
                    } else {
                        try {
                            jMax = Long.parseLong(headerField3);
                            th = null;
                        } catch (NumberFormatException unused2) {
                            th = null;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                            sb2.append("Unexpected Content-Length [");
                            sb2.append(headerField3);
                            sb2.append(C4664b4.j.e);
                            zzeh.e("HttpUtil", sb2.toString());
                        }
                        if (!TextUtils.isEmpty(headerField4)) {
                            matcher = zziq.a.matcher(headerField4);
                            if (matcher.matches()) {
                                try {
                                    strGroup = matcher.group(2);
                                    if (strGroup != null) {
                                        throw th;
                                    }
                                    j3 = Long.parseLong(strGroup);
                                    strGroup2 = matcher.group(i);
                                    if (strGroup2 != null) {
                                        throw th;
                                    }
                                    j4 = (j3 - Long.parseLong(strGroup2)) + 1;
                                    if (jMax < 0) {
                                        jMax = j4;
                                    } else if (jMax != j4) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                        sb3.append("Inconsistent headers [");
                                        sb3.append(headerField3);
                                        sb3.append("] [");
                                        sb3.append(headerField4);
                                        sb3.append(C4664b4.j.e);
                                        zzeh.c("HttpUtil", sb3.toString());
                                        jMax = Math.max(jMax, j4);
                                    }
                                } catch (NumberFormatException unused3) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(headerField4).length() + 27);
                                    sb4.append("Unexpected Content-Range [");
                                    sb4.append(headerField4);
                                    sb4.append(C4664b4.j.e);
                                    zzeh.e("HttpUtil", sb4.toString());
                                }
                            }
                        }
                        if (jMax != jMax) {
                            j2 = jMax - j9;
                        } else {
                            j2 = -1;
                        }
                        zzihVar.p = j2;
                    }
                    if (!TextUtils.isEmpty(headerField4)) {
                        matcher = zziq.a.matcher(headerField4);
                        if (matcher.matches()) {
                            strGroup = matcher.group(2);
                            if (strGroup != null) {
                                throw th;
                            }
                            j3 = Long.parseLong(strGroup);
                            strGroup2 = matcher.group(i);
                            if (strGroup2 != null) {
                                throw th;
                            }
                            j4 = (j3 - Long.parseLong(strGroup2)) + 1;
                            if (jMax < 0) {
                                jMax = j4;
                            } else if (jMax != j4) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField4).length() + 1);
                                sb5.append("Inconsistent headers [");
                                sb5.append(headerField3);
                                sb5.append("] [");
                                sb5.append(headerField4);
                                sb5.append(C4664b4.j.e);
                                zzeh.c("HttpUtil", sb5.toString());
                                jMax = Math.max(jMax, j4);
                            }
                        }
                    }
                    if (jMax != jMax) {
                        j2 = jMax - j9;
                    } else {
                        j2 = -1;
                    }
                    zzihVar.p = j2;
                }
                try {
                    zzihVar.m = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnectionO);
                    if (zEqualsIgnoreCase) {
                        zzihVar.m = new GZIPInputStream(zzihVar.m);
                    }
                    zzihVar.n = true;
                    l(zziaVar);
                    if (j9 != 0) {
                        try {
                            byte[] bArr2 = new byte[4096];
                            long j10 = j9;
                            while (j10 > 0) {
                                int iMin = (int) Math.min(j10, 4096L);
                                InputStream inputStream = zzihVar.m;
                                String str = zzfq.a;
                                int i5 = inputStream.read(bArr2, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzil(new InterruptedIOException(), zziaVar, 2000, 1);
                                }
                                if (i5 == -1) {
                                    throw new zzil(zziaVar, 2008, 1);
                                }
                                j10 -= (long) i5;
                                zzihVar.m(i5);
                            }
                        } catch (IOException e) {
                            zzihVar.q();
                            if (e instanceof zzil) {
                                throw ((zzil) e);
                            }
                            throw new zzil(e, zziaVar, 2000, 1);
                        }
                    }
                    return zzihVar.p;
                } catch (IOException e2) {
                    zzihVar.q();
                    throw new zzil(e2, zziaVar, 2000, 1);
                }
            } catch (IOException e3) {
                e = e3;
                zzihVar2 = this;
                zzihVar2.q();
                throw zzil.a(e, zziaVar, 1);
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) throws zzil {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.p;
            if (j != -1) {
                long j2 = j - this.q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.m;
            String str = zzfq.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.q += (long) i3;
            m(i3);
            return i3;
        } catch (IOException e) {
            zzia zziaVar = this.k;
            String str2 = zzfq.a;
            throw zzil.a(e, zziaVar, 2);
        }
    }

    public final URL p(URL url, String str, zzia zziaVar) throws zzil {
        if (str == null) {
            throw new zzil("Null location redirect", zziaVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !com.safedk.android.analytics.brandsafety.creatives.g.e.equals(protocol)) {
                throw new zzil("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zziaVar, 2001, 1);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(q63.a(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzil(sb.toString(), zziaVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzil(e, zziaVar, 2001, 1);
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e) {
                zzeh.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzia zziaVar = this.k;
        if (zziaVar != null) {
            return zziaVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection == null ? js4.d : new ny4(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    public final HttpURLConnection o(URL url, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sbO;
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap map2 = new HashMap();
        map2.putAll(this.i.a());
        map2.putAll(this.j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                string = null;
            } else {
                j = 0;
                sbO = h50.o(j, "bytes=", "-");
                if (j2 != -1) {
                    sbO.append((j + j2) - 1);
                }
                string = sbO.toString();
            }
        } else {
            sbO = h50.o(j, "bytes=", "-");
            if (j2 != -1) {
                sbO.append((j + j2) - 1);
            }
            string = sbO.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        String str2 = this.h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str2);
        }
        if (true != z) {
            str = "identity";
        } else {
            str = "gzip";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i = zzia.f;
        httpURLConnection.setRequestMethod(C4887nc.a);
        httpURLConnection.connect();
        return httpURLConnection;
    }
}
