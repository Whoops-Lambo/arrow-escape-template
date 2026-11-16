package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzclg;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzho;
import com.google.android.gms.internal.ads.zzhx;
import com.google.android.gms.internal.ads.zzia;
import com.google.android.gms.internal.ads.zzil;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzio;
import com.google.android.gms.internal.ads.zzip;
import com.ironsource.C4664b4;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k34 extends zzho implements zzip {
    public static final Pattern u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference v = new AtomicReference();
    public final j34 e;
    public final int f;
    public final int g;
    public final String h;
    public final zzio i;
    public zzia j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public final ConcurrentHashMap.KeySetView t;

    public k34(String str, zzclg zzclgVar, int i, int i2, int i3) {
        super(true);
        this.e = new j34(this);
        this.t = ConcurrentHashMap.newKeySet();
        zzgvz.a(true ^ TextUtils.isEmpty(str));
        this.h = str;
        this.i = new zzio();
        this.f = i;
        this.g = i2;
        this.s = i3;
        if (zzclgVar != null) {
            a(zzclgVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0235  */
    /* JADX WARN: Code duplicated, block: B:92:0x026a A[Catch: IOException -> 0x003f, TryCatch #2 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0020, B:6:0x0026, B:8:0x0036, B:11:0x0042, B:12:0x005a, B:14:0x0060, B:22:0x008b, B:24:0x00ae, B:26:0x00d4, B:27:0x00d9, B:40:0x010f, B:90:0x025d, B:92:0x026a, B:94:0x027b, B:97:0x0284, B:98:0x0291, B:100:0x029a, B:101:0x02a1, B:102:0x02a2, B:103:0x02bf), top: B:110:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) throws zzil {
        long j;
        int iHttpUrlConnectionGetResponseCode;
        String headerField;
        String protocol;
        int iHttpUrlConnectionGetResponseCode2;
        zzin zzinVar;
        long jMax;
        this.j = zziaVar;
        long j2 = 0;
        this.r = 0L;
        this.q = 0L;
        try {
            Uri uri = zziaVar.a;
            long j3 = zziaVar.d;
            long j4 = zziaVar.c;
            URL url = new URL(uri.toString());
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i2);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                long j5 = j2;
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.e);
                }
                httpURLConnection.setConnectTimeout(this.f);
                httpURLConnection.setReadTimeout(this.g);
                for (Map.Entry entry : this.i.a().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j4 == j5) {
                    if (j3 != -1) {
                        j = j5;
                    } else {
                        j4 = j4;
                    }
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.h);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                        this.k = httpURLConnection;
                        try {
                            iHttpUrlConnectionGetResponseCode2 = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            this.n = iHttpUrlConnectionGetResponseCode2;
                            if (iHttpUrlConnectionGetResponseCode2 >= 200 || iHttpUrlConnectionGetResponseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.k.getHeaderFields();
                                o();
                                zzinVar = new zzin(this.n, null, null, headerFields, zziaVar, zzfq.b);
                                if (this.n == 416) {
                                    throw zzinVar;
                                }
                                zzinVar.initCause(new zzhx(2008));
                                throw zzinVar;
                            }
                            this.o = (iHttpUrlConnectionGetResponseCode2 != 200 || j4 == j5) ? j5 : j4;
                            if (j3 != -1) {
                                this.p = j3;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.k;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        String strO = jc1.o("Unexpected Content-Length [", headerField2, new StringBuilder(String.valueOf(headerField2).length() + 28), C4664b4.j.e);
                                        int i3 = zze.zza;
                                        zzo.zzf(strO);
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = u.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j6 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < j5) {
                                                jMax = j6;
                                            } else if (jMax != j6) {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                sb2.append("Inconsistent headers [");
                                                sb2.append(headerField2);
                                                sb2.append("] [");
                                                sb2.append(headerField3);
                                                sb2.append(C4664b4.j.e);
                                                String string = sb2.toString();
                                                int i4 = zze.zza;
                                                zzo.zzi(string);
                                                jMax = Math.max(jMax, j6);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            String strO2 = jc1.o("Unexpected Content-Range [", headerField3, new StringBuilder(String.valueOf(headerField3).length() + 27), C4664b4.j.e);
                                            int i5 = zze.zza;
                                            zzo.zzf(strO2);
                                        }
                                    }
                                }
                                this.p = jMax != -1 ? jMax - this.o : -1L;
                            }
                            try {
                                this.l = AdMobNetworkBridge.urlConnectionGetInputStream(this.k);
                                this.m = true;
                                l(zziaVar);
                                return this.p;
                            } catch (IOException e) {
                                o();
                                throw new zzil(e, zziaVar, 2000, 1);
                            }
                        } catch (IOException e2) {
                            o();
                            throw new zzil("Unable to connect to ".concat(zziaVar.a.toString()), e2, zziaVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !g.e.equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = j5;
                    j4 = j4;
                } else {
                    j = j4;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 7);
                sb3.append("bytes=");
                long j7 = j;
                sb3.append(j7);
                sb3.append("-");
                String string2 = sb3.toString();
                if (j3 != -1) {
                    long j8 = (j7 + j3) - 1;
                    StringBuilder sb4 = new StringBuilder(string2.length() + String.valueOf(j8).length());
                    sb4.append(string2);
                    sb4.append(j8);
                    string2 = sb4.toString();
                }
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string2);
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.h);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                if (iHttpUrlConnectionGetResponseCode != 300) {
                    this.k = httpURLConnection;
                    iHttpUrlConnectionGetResponseCode2 = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    this.n = iHttpUrlConnectionGetResponseCode2;
                    if (iHttpUrlConnectionGetResponseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.k.getHeaderFields();
                    o();
                    zzinVar = new zzin(this.n, null, null, headerFields2, zziaVar, zzfq.b);
                    if (this.n == 416) {
                        throw zzinVar;
                    }
                    zzinVar.initCause(new zzhx(2008));
                    throw zzinVar;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!HttpRequest.DEFAULT_SCHEME.equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i = i2;
                j2 = j5;
                j4 = j4;
            }
        } catch (IOException e3) {
            throw new zzil("Unable to connect to ".concat(zziaVar.a.toString()), e3, zziaVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) throws zzil {
        try {
            if (this.q != this.o) {
                AtomicReference atomicReference = v;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.q;
                    long j2 = this.o;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i3 = this.l.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.q += (long) i3;
                    m(i3);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.p;
            if (j3 != -1) {
                long j4 = j3 - this.r;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int i4 = this.l.read(bArr, i, i2);
            if (i4 == -1) {
                if (this.p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.r += (long) i4;
            m(i4);
            return i4;
        } catch (IOException e) {
            throw new zzil(e, this.j, 2000, 2);
        }
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (RuntimeException e) {
                int i = zze.zza;
                zzo.zzg("Unexpected error while disconnecting", e);
            }
            this.k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        ConcurrentHashMap.KeySetView keySetView = this.t;
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzil(e, this.j, 2000, 3);
                }
            }
            this.l = null;
            o();
            if (this.m) {
                this.m = false;
                n();
            }
            keySetView.clear();
        } catch (Throwable th) {
            this.l = null;
            o();
            if (this.m) {
                this.m = false;
                n();
            }
            keySetView.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
