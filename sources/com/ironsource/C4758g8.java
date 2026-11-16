package com.ironsource;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C4758g8 {
    private static final String a = "POST";
    private static final String b = "GET";
    private static final String c = "ISHttpService";

    /* JADX INFO: renamed from: com.ironsource.g8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        private static final int h = 15000;
        private static final int i = 15000;
        private static final String j = "UTF-8";
        final String a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        ArrayList<Pair<String, String>> g;

        /* JADX INFO: renamed from: com.ironsource.g8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class C1366a {
            String b;
            String d;
            List<Pair<String, String>> a = new ArrayList();
            String c = "POST";
            int e = 15000;
            int f = 15000;
            String g = "UTF-8";

            public C1366a a(Pair<String, String> pair) {
                this.a.add(pair);
                return this;
            }

            public C1366a b(String str) {
                this.g = str;
                return this;
            }

            public C1366a c(String str) {
                this.b = str;
                return this;
            }

            public C1366a d(String str) {
                this.c = str;
                return this;
            }

            public C1366a b(int i) {
                this.f = i;
                return this;
            }

            public C1366a a(int i) {
                this.e = i;
                return this;
            }

            public C1366a a(String str) {
                this.d = str;
                return this;
            }

            public C1366a a(List<Pair<String, String>> list) {
                this.a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }

        public boolean a() {
            return "POST".equals(this.b);
        }

        public a(C1366a c1366a) {
            this.a = c1366a.b;
            this.b = c1366a.c;
            this.c = c1366a.d;
            this.g = new ArrayList<>(c1366a.a);
            this.d = c1366a.e;
            this.e = c1366a.f;
            this.f = c1366a.g;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0067: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:104), block:B:32:0x0067 */
    public static Rd b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream;
        InputStream inputStream2;
        if (!a(aVar.a, aVar.c)) {
            throw new InvalidParameterException("not valid params");
        }
        Rd rd = new Rd();
        InputStream inputStreamUrlConnectionGetInputStream = null;
        inputStreamUrlConnectionGetInputStream = null;
        inputStreamUrlConnectionGetInputStream = null;
        inputStreamUrlConnectionGetInputStream = null;
        inputStreamUrlConnectionGetInputStream = null;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnectionA = a(aVar);
                try {
                    a(httpURLConnectionA, aVar.g);
                    a(httpURLConnectionA, aVar);
                    inputStreamUrlConnectionGetInputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnectionA);
                    rd.a = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
                    if (inputStreamUrlConnectionGetInputStream != null) {
                        rd.b = C5034vg.a(inputStreamUrlConnectionGetInputStream);
                    }
                    if (inputStreamUrlConnectionGetInputStream != null) {
                        inputStreamUrlConnectionGetInputStream.close();
                    }
                } catch (InterruptedIOException e) {
                    e = e;
                    Log.d(c, "Failed post to " + aVar.a + " exception: " + e.getMessage());
                    throw e;
                } catch (SSLException e2) {
                    e = e2;
                    Log.d(c, "Failed post to " + aVar.a + " exception: " + e.getMessage());
                    throw e;
                } catch (IOException e3) {
                    e = e3;
                    inputStream = inputStreamUrlConnectionGetInputStream;
                    httpURLConnection = httpURLConnectionA;
                    C4950r4.d().a(e);
                    if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                        throw new Mc(e);
                    }
                    if (httpURLConnection != null) {
                        int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                        rd.a = iHttpUrlConnectionGetResponseCode;
                        if (iHttpUrlConnectionGetResponseCode >= 400) {
                            Log.d(c, "Failed post to " + aVar.a + " StatusCode: " + rd.a);
                            if (inputStream != null) {
                                InputStream inputStream3 = inputStream;
                                httpURLConnectionA = httpURLConnection;
                                inputStreamUrlConnectionGetInputStream = inputStream3;
                                inputStreamUrlConnectionGetInputStream.close();
                            } else {
                                httpURLConnectionA = httpURLConnection;
                            }
                        }
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (inputStreamUrlConnectionGetInputStream != null) {
                        inputStreamUrlConnectionGetInputStream.close();
                    }
                    if (httpURLConnectionA != null) {
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                    }
                    throw th;
                }
            } catch (InterruptedIOException e4) {
                e = e4;
                Log.d(c, "Failed post to " + aVar.a + " exception: " + e.getMessage());
                throw e;
            } catch (SSLException e5) {
                e = e5;
                Log.d(c, "Failed post to " + aVar.a + " exception: " + e.getMessage());
                throw e;
            } catch (IOException e6) {
                e = e6;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnectionA = null;
            }
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
            return rd;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionA = null;
            inputStreamUrlConnectionGetInputStream = inputStream2;
        }
    }

    public static Rd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C1366a c1366a = new a.C1366a();
        c1366a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c1366a.a());
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }

    public static Rd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C1366a c1366a = new a.C1366a();
        c1366a.c(str).a(str2).d("POST").a(list);
        return b(c1366a.a());
    }
}
