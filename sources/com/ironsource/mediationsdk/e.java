package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.A2;
import com.ironsource.C4788i2;
import com.ironsource.C4796ia;
import com.ironsource.C4805j2;
import com.ironsource.C4916p5;
import com.ironsource.C4950r4;
import com.ironsource.C5074y2;
import com.ironsource.InterfaceC4680c2;
import com.ironsource.Q9;
import com.ironsource.Ue;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    private final String a = "1";
    private final String b = "102";
    private final String c = "102";
    private final String d = "GenericNotifications";
    private f e;
    private IronSource.a f;
    private A2 g;
    private InterfaceC4680c2 h;
    private ISBannerSize i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements Runnable {
        protected InterfaceC4680c2 a;
        protected d.a b;
        protected int c;
        protected String d;
        protected long e;
        protected int f;
        private int h;
        private final URL k;
        private final JSONObject l;
        private final boolean m;
        private final int n;
        private final long o;
        private final boolean p;
        private final boolean q;
        private final boolean r;
        protected String i = "";
        protected int j = 0;
        protected String g = a((Integer) null);

        public boolean b() {
            this.e = new Date().getTime();
            try {
                this.h = this.j == 1015 ? 1 : this.h;
                this.f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i = this.f;
                    int i2 = this.n;
                    if (i >= i2) {
                        this.f = i2 - 1;
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                    try {
                        long time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f + 1) + " out of " + this.n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnectionA = a(this.k, this.o);
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.l);
                        a(httpURLConnectionA, this.l, this.p);
                        int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionA);
                        if (iHttpUrlConnectionGetResponseCode == 200 || iHttpUrlConnectionGetResponseCode == 204) {
                            try {
                                a(a(httpURLConnectionA), this.m, this.q);
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                                return true;
                            } catch (JSONException e) {
                                C4950r4.d().a(e);
                                if (e.getMessage() != null && e.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.c = 1003;
                                    this.d = "Auction decryption error";
                                } else if (e.getMessage() == null || !e.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.c = 1002;
                                    this.d = "Auction parsing error";
                                } else {
                                    this.c = 1008;
                                    this.d = "Auction decompression error";
                                }
                                this.g = a(Integer.valueOf(this.c));
                                IronLog.INTERNAL.error("Auction handle response exception " + e.getMessage());
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                                return false;
                            }
                        }
                        this.c = 1001;
                        String str2 = "Auction response code not valid, error code response from server - " + iHttpUrlConnectionGetResponseCode;
                        this.d = str2;
                        ironLog.error(str2);
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        if (this.f < this.n - 1) {
                            a(this.o, time);
                        }
                        this.f++;
                    } catch (SocketTimeoutException e2) {
                        C4950r4.d().a(e2);
                        if (httpURLConnectionA != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        }
                        this.c = 1006;
                        this.d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e2.getMessage());
                    } catch (Throwable th) {
                        C4950r4.d().a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnectionA != null) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionA);
                        }
                        this.c = 1000;
                        this.d = th.getMessage();
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                }
            } catch (Exception e3) {
                C4950r4.d().a(e3);
                this.c = 1007;
                this.d = e3.getMessage();
                this.f = 0;
                this.g = a(Integer.valueOf(this.c));
                IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        public a(InterfaceC4680c2 interfaceC4680c2, URL url, JSONObject jSONObject, boolean z, A2 a2) {
            this.a = interfaceC4680c2;
            this.k = url;
            this.l = jSONObject;
            this.m = z;
            this.n = a2.g();
            this.o = a2.m();
            this.p = a2.o();
            this.q = a2.p();
            this.h = a2.d();
            this.r = a2.n();
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z) throws Exception {
            String strA;
            String strE;
            String str;
            OutputStream outputStreamUrlConnectionGetOutputStream = IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamUrlConnectionGetOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.h == 2) {
                try {
                    strA = C4916p5.b().a();
                } catch (JSONException e) {
                    C4950r4.d().a(e);
                    this.i = e.getLocalizedMessage();
                    this.j = 1015;
                    this.h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strE = Q9.a(strA2, string);
            } else {
                strE = Q9.e(strA2, string);
            }
            if (this.h == 2) {
                str = String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strA, strE);
            } else {
                str = String.format("{\"request\" : \"%1$s\"}", strE);
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStreamUrlConnectionGetOutputStream.close();
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            InterfaceC4680c2 interfaceC4680c2 = this.a;
            if (interfaceC4680c2 == null) {
                return;
            }
            a(zB, interfaceC4680c2, new Date().getTime() - this.e);
        }

        private String a() {
            if (this.h == 2) {
                return C4916p5.b().d();
            }
            return C4916p5.b().c();
        }

        private void a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        private HttpURLConnection a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        public JSONObject a(JSONObject jSONObject, boolean z) throws JSONException {
            String str;
            String strA = a();
            if (this.h == 2) {
                str = "ct";
            } else {
                str = Ue.n;
            }
            String string = jSONObject.getString(str);
            if (z) {
                return b(strA, string);
            }
            return a(strA, string);
        }

        public void a(String str, boolean z, boolean z2) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                if (z) {
                    jSONObjectJsonObjectInit = a(jSONObjectJsonObjectInit, z2);
                }
                d.a aVarA = d.b().a(jSONObjectJsonObjectInit);
                this.b = aVarA;
                this.c = aVarA.c();
                this.d = this.b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strB = Q9.b(str, str2);
            if (!TextUtils.isEmpty(strB)) {
                return IronSourceNetworkBridge.jsonObjectInit(strB);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        public void a(boolean z, InterfaceC4680c2 interfaceC4680c2, long j) {
            if (z) {
                interfaceC4680c2.a(this.b.h(), this.b.a(), this.b.e(), this.b.f(), this.b.b(), this.f + 1, j, this.j, this.i);
            } else {
                interfaceC4680c2.a(this.c, this.d, this.f + 1, this.g, j);
            }
        }

        private String a(Integer num) {
            return C4788i2.a.a(this.r, num);
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strD = Q9.d(str, str2);
            if (strD != null) {
                return IronSourceNetworkBridge.jsonObjectInit(strD);
            }
            throw new JSONException("decompression error");
        }
    }

    @Deprecated
    public e(IronSource.a aVar, A2 a2, InterfaceC4680c2 interfaceC4680c2) {
        this.f = aVar;
        this.g = a2;
        this.h = interfaceC4680c2;
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C5074y2> concurrentHashMap, int i, C5074y2 c5074y2, C5074y2 c5074y3) {
        String str;
        int iJ = c5074y3.j();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            String str2 = arrayList.get(i2);
            i2++;
            String str3 = str2;
            if (!str3.equals(c5074y3.c())) {
                C5074y2 c5074y4 = concurrentHashMap.get(str3);
                int iJ2 = c5074y4.j();
                String strI = c5074y4.i();
                if (iJ2 < iJ) {
                    str = "1";
                } else {
                    str = "102";
                }
                String str4 = str;
                IronLog.INTERNAL.verbose("instance=" + c5074y4.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str4 + ", winnerInstance=" + c5074y3.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it = c5074y4.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", c5074y4.c(), d.b().a(it.next(), i, c5074y3, strI, str4, ""));
                }
            }
        }
        if (c5074y2 != null) {
            Iterator<String> it2 = c5074y2.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i, c5074y3, "", "102", ""));
            }
        }
    }

    public e(f fVar) {
        this.e = fVar;
    }

    public void a(Context context, h hVar, InterfaceC4680c2 interfaceC4680c2) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.e.a(context, hVar, interfaceC4680c2));
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (interfaceC4680c2 != null) {
                interfaceC4680c2.a(1000, e.getMessage(), 0, C4788i2.a.a(this.e.a(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, C4805j2 c4805j2, int i, C4796ia c4796ia) {
        e eVar;
        try {
            boolean zG = IronSourceUtils.g();
            JSONObject jSONObjectA = a(map, list, c4805j2, i, zG, c4796ia);
            eVar = this;
            try {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.h, new URL(eVar.g.a(false)), jSONObjectA, zG, eVar.g));
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C4950r4.d().a(exc);
                IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
                eVar.h.a(1000, exc.getMessage(), 0, C4788i2.a.a(eVar.g.n(), 1000), 0L);
            }
        } catch (Exception e2) {
            e = e2;
            eVar = this;
        }
    }

    public void a(C5074y2 c5074y2, int i, C5074y2 c5074y3, String str) {
        Iterator<String> it = c5074y2.b().iterator();
        while (it.hasNext()) {
            C5074y2 c5074y4 = c5074y2;
            int i2 = i;
            String str2 = str;
            d.b().a("reportImpression", c5074y4.c(), d.b().a(it.next(), i2, c5074y4, "", "", str2));
            i = i2;
            c5074y2 = c5074y4;
            str = str2;
        }
        C5074y2 c5074y5 = c5074y2;
        int i3 = i;
        String str3 = str;
        if (c5074y3 != null) {
            Iterator<String> it2 = c5074y3.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i3, c5074y5, "", "102", str3));
            }
        }
    }

    public void a(C5074y2 c5074y2, int i, C5074y2 c5074y3) {
        Iterator<String> it = c5074y2.h().iterator();
        while (it.hasNext()) {
            C5074y2 c5074y4 = c5074y2;
            int i2 = i;
            d.b().a("reportLoadSuccess", c5074y4.c(), d.b().a(it.next(), i2, c5074y4, "", "", ""));
            i = i2;
            c5074y2 = c5074y4;
        }
        C5074y2 c5074y5 = c5074y2;
        int i3 = i;
        if (c5074y3 != null) {
            Iterator<String> it2 = c5074y3.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i3, c5074y5, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<u> copyOnWriteArrayList, ConcurrentHashMap<String, C5074y2> concurrentHashMap, int i, C5074y2 c5074y2, C5074y2 c5074y3) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<u> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i, c5074y2, c5074y3);
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, C4805j2 c4805j2, int i, C4796ia c4796ia, ISBannerSize iSBannerSize) {
        this.i = iSBannerSize;
        a(context, map, list, c4805j2, i, c4796ia);
    }

    private JSONObject a(Map<String, Object> map, List<String> list, C4805j2 c4805j2, int i, boolean z, C4796ia c4796ia) throws JSONException {
        h hVar = new h(this.f);
        hVar.a(map);
        hVar.a(list);
        hVar.a(c4805j2);
        hVar.a(i);
        hVar.a(this.i);
        hVar.a(c4796ia);
        hVar.b(z);
        return d.b().a(hVar);
    }

    public boolean a() {
        return this.e.b();
    }
}
