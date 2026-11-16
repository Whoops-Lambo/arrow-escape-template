package com.mbridge.msdk.tracker.network.toolbox;

import com.ironsource.C4887nc;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.tracker.network.t;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.e32;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class h extends com.mbridge.msdk.tracker.network.toolbox.a {
    private final SSLSocketFactory a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a extends FilterInputStream {
        private final HttpURLConnection a;

        public a(HttpURLConnection httpURLConnection) {
            super(h.b(httpURLConnection));
            this.a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            MintegralNetworkBridge.httpUrlConnectionDisconnect(this.a);
        }
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(t<?> tVar, Map<String, String> map) throws IOException {
        String strT;
        if (tVar.g() == 0) {
            strT = d.a(tVar.t(), tVar);
        } else {
            strT = tVar.t();
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(tVar.f());
        HttpsURLConnection httpsURLConnectionA = a(new URL(strT), tVar);
        try {
            for (String str : map2.keySet()) {
                httpsURLConnectionA.setRequestProperty(str, (String) map2.get(str));
            }
            b(httpsURLConnectionA, tVar);
            int iHttpUrlConnectionGetResponseCode = MintegralNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnectionA);
            if (iHttpUrlConnectionGetResponseCode != -1) {
                if (!a(tVar.g(), iHttpUrlConnectionGetResponseCode)) {
                    g gVar = new g(iHttpUrlConnectionGetResponseCode, a(httpsURLConnectionA.getHeaderFields()));
                    MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnectionA);
                    return gVar;
                }
                return new g(iHttpUrlConnectionGetResponseCode, a(httpsURLConnectionA.getHeaderFields()), httpsURLConnectionA.getContentLength(), a(tVar, httpsURLConnectionA));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                MintegralNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnectionA);
            }
            throw th;
        }
    }

    public void b(HttpURLConnection httpURLConnection, t<?> tVar) throws IOException {
        switch (tVar.g()) {
            case 0:
                httpURLConnection.setRequestMethod(C4887nc.a);
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                a(httpURLConnection, tVar);
                break;
            case 2:
                httpURLConnection.setRequestMethod(com.safedk.android.a.g.f);
                a(httpURLConnection, tVar);
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                a(httpURLConnection, tVar);
                break;
            default:
                e32.i("Unknown method type.");
                break;
        }
    }

    public h(b bVar) {
        this(bVar, null);
    }

    public h() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return MintegralNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static boolean a(int i, int i2) {
        if (i != 4) {
            return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
        }
        return false;
    }

    public static List<com.mbridge.msdk.tracker.network.g> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.g(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    public InputStream a(t<?> tVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    public HttpsURLConnection a(URL url) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(url));
        httpsURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpsURLConnection;
    }

    private HttpsURLConnection a(URL url, t<?> tVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpsURLConnection httpsURLConnectionA = a(url);
        int iQ = tVar.q();
        httpsURLConnectionA.setConnectTimeout(iQ);
        httpsURLConnectionA.setReadTimeout(iQ);
        httpsURLConnectionA.setUseCaches(false);
        httpsURLConnectionA.setDoInput(true);
        if (HttpRequest.DEFAULT_SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.a) != null) {
            httpsURLConnectionA.setSSLSocketFactory(sSLSocketFactory);
        }
        return httpsURLConnectionA;
    }

    private void a(HttpURLConnection httpURLConnection, t<?> tVar) throws IOException {
        byte[] bArrB = tVar.b();
        if (bArrB != null) {
            a(httpURLConnection, tVar, bArrB);
        }
    }

    private void a(HttpURLConnection httpURLConnection, t<?> tVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", tVar.c());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(a(tVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public OutputStream a(t<?> tVar, HttpURLConnection httpURLConnection, int i) throws IOException {
        return MintegralNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
    }
}
