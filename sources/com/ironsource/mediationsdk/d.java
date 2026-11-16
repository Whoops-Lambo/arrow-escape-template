package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.B7;
import com.ironsource.C4670ba;
import com.ironsource.C4796ia;
import com.ironsource.C4805j2;
import com.ironsource.C4877n2;
import com.ironsource.C4887nc;
import com.ironsource.C4921pa;
import com.ironsource.C4948r2;
import com.ironsource.C4950r4;
import com.ironsource.C5;
import com.ironsource.C5074y2;
import com.ironsource.D5;
import com.ironsource.InterfaceC4734f2;
import com.ironsource.Pb;
import com.ironsource.R6;
import com.ironsource.U0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.nj;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class d {
    public static final boolean A = false;
    public static final String B = "loadGrace";
    private static d C = new d();
    public static final String c = "auctionId";
    public static final String d = "armData";
    public static final String e = "larmData";
    public static final String f = "isAdUnitCapped";
    public static final String g = "settings";
    public static final String h = "waterfall";
    public static final String i = "genericParams";
    public static final String j = "configurations";
    public static final String k = "instances";
    public static final String l = "${AUCTION_LOSS}";
    public static final String m = "${AUCTION_MBR}";
    public static final String n = "${AUCTION_PRICE}";
    public static final String o = "${DYNAMIC_DEMAND_SOURCE}";
    public static final String p = "${INSTANCE}";
    public static final String q = "${INSTANCE_TYPE}";
    public static final String r = "${PLACEMENT_NAME}";
    private static final String s = "adMarkup";
    private static final String t = "dynamicDemandSource";
    private static final String u = "params";
    public static final String v = "dlpl";
    public static final String w = "adUnit";
    public static final String x = "parallelLoad";
    public static final String y = "bidderExclusive";
    public static final String z = "showPriorityEnabled";
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final B7 b = Pb.k0().a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        private String a;
        private List<C5074y2> b;
        private C5074y2 c;
        private JSONObject d;
        private JSONObject e;
        private int f;
        private String g;
        private InterfaceC4734f2 h;

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            InterfaceC4734f2 interfaceC4734f2 = this.h;
            return interfaceC4734f2 != null ? interfaceC4734f2.a(str) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }

        public a(String str) {
            this.a = str;
        }

        public JSONObject b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        public String d() {
            return this.g;
        }

        public C5074y2 e() {
            return this.c;
        }

        public InterfaceC4734f2 g() {
            return this.h;
        }

        public List<C5074y2> h() {
            return this.b;
        }

        public JSONObject f() {
            return this.d;
        }

        public String a() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b implements Runnable {
        private static final int d = 15000;
        private String a;
        private String b;
        private String c;

        @Override // java.lang.Runnable
        public void run() {
            String str = this.a + ";" + this.b + ";" + this.c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
                httpURLConnection.setRequestMethod(C4887nc.a);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                String responseMessage = httpURLConnection.getResponseMessage();
                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                Pb.k0().q().a(new C5(iHttpUrlConnectionGetResponseCode == 200 || iHttpUrlConnectionGetResponseCode == 204 ? D5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : D5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, IronSourceNetworkBridge.jsonObjectInit().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, iHttpUrlConnectionGetResponseCode).put("reason", responseMessage)));
            } catch (Exception e) {
                C4950r4.d().a(e);
                StringBuilder sb = new StringBuilder("Send auction url failed with params - ");
                sb.append(str);
                sb.append(";");
                IronLog.INTERNAL.error(nj.o(e, sb));
            }
        }

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum c {
        NOT_SECURE,
        SECURE
    }

    public Map<String, String> b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            if (jSONObjectJsonObjectInit.has("params")) {
                JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject("params");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
            return map;
        } catch (JSONException e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return map;
        }
    }

    public String c(String str) {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str) && C4921pa.a(str)) {
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                if (jSONObjectJsonObjectInit.has("params")) {
                    JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject("params");
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("parameters = " + jSONObject);
                    if (jSONObject.has("dynamicDemandSource")) {
                        string = jSONObject.getString("dynamicDemandSource");
                        ironLog.verbose("demand source = " + string);
                        return string;
                    }
                }
            }
            return "";
        } catch (JSONException e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return string;
        }
    }

    public JSONObject a(h hVar) throws JSONException {
        int i2;
        int i3;
        String strA;
        String strA2;
        String strA3;
        String strA4;
        IronSource.a aVarC = hVar.c();
        boolean zU = hVar.u();
        Map<String, Object> mapH = hVar.h();
        List<String> listL = hVar.l();
        C4805j2 c4805j2E = hVar.e();
        int iP = hVar.p();
        ISBannerSize iSBannerSizeF = hVar.f();
        C4796ia c4796iaO = hVar.o();
        boolean zQ = hVar.q();
        boolean zR = hVar.r();
        ArrayList<C4948r2> arrayListK = hVar.k();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        String strN = hVar.n();
        String str = R6.y0;
        if (strN != null) {
            JSONObject jSONObjectJsonObjectInit3 = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit3.put(R6.y0, 1);
            if (c4805j2E == null) {
                strA4 = "";
            } else {
                strA4 = c4805j2E.a(strN);
            }
            jSONObjectJsonObjectInit3.put(R6.B0, strA4);
            jSONObjectJsonObjectInit3.put(R6.C0, true);
            jSONObjectJsonObjectInit2.put(strN, jSONObjectJsonObjectInit3);
        }
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            Iterator<String> it2 = it;
            if (!it.hasNext()) {
                break;
            }
            String next = it2.next();
            C4796ia c4796ia = c4796iaO;
            JSONObject jSONObjectJsonObjectInit4 = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit4.put(R6.y0, 2);
            Map<String, Object> map = mapH;
            jSONObjectJsonObjectInit4.put(R6.p0, new JSONObject((Map) mapH.get(next)));
            if (c4805j2E == null) {
                strA3 = "";
            } else {
                strA3 = c4805j2E.a(next);
            }
            jSONObjectJsonObjectInit4.put(R6.B0, strA3);
            jSONObjectJsonObjectInit4.put("ts", zR ? 1 : 0);
            jSONObjectJsonObjectInit2.put(next, jSONObjectJsonObjectInit4);
            it = it2;
            c4796iaO = c4796ia;
            mapH = map;
        }
        C4796ia c4796ia2 = c4796iaO;
        for (String str2 : listL) {
            JSONObject jSONObjectJsonObjectInit5 = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit5.put(R6.y0, 1);
            if (c4805j2E == null) {
                strA2 = "";
            } else {
                strA2 = c4805j2E.a(str2);
            }
            jSONObjectJsonObjectInit5.put(R6.B0, strA2);
            jSONObjectJsonObjectInit2.put(str2, jSONObjectJsonObjectInit5);
        }
        int size = arrayListK.size();
        int i4 = 0;
        while (i4 < size) {
            C4948r2 c4948r2 = arrayListK.get(i4);
            i4++;
            C4948r2 c4948r3 = c4948r2;
            JSONObject jSONObjectJsonObjectInit6 = IronSourceNetworkBridge.jsonObjectInit();
            if (c4948r3.e()) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            jSONObjectJsonObjectInit6.put(str, i3);
            Map<String, Object> mapF = c4948r3.f();
            if (!mapF.isEmpty()) {
                jSONObjectJsonObjectInit6.put(R6.p0, new JSONObject(mapF));
            }
            if (c4805j2E == null) {
                strA = "";
            } else {
                strA = c4805j2E.a(c4948r3.g());
            }
            jSONObjectJsonObjectInit6.put(R6.B0, strA);
            jSONObjectJsonObjectInit6.put("ts", zR ? 1 : 0);
            if (!c4948r3.h().isEmpty()) {
                jSONObjectJsonObjectInit6.put(v, c4948r3.h());
            }
            jSONObjectJsonObjectInit2.put(c4948r3.g(), jSONObjectJsonObjectInit6);
            size = size;
            str = str;
        }
        jSONObjectJsonObjectInit.put(R6.x0, jSONObjectJsonObjectInit2);
        if (hVar.w()) {
            i2 = 1;
            jSONObjectJsonObjectInit.put(R6.x1, 1);
        } else {
            i2 = 1;
        }
        if (hVar.t()) {
            jSONObjectJsonObjectInit.put("do", i2);
        }
        new C4670ba().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new C4877n2(U0.a(aVarC)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(R6.z0, iP);
        jSONObjectA.put(R6.A0, a().ordinal());
        if (c4796ia2 != null) {
            jSONObjectA.put(R6.j1, c4796ia2.i());
        }
        jSONObjectJsonObjectInit.put(R6.u0, jSONObjectA);
        if (iSBannerSizeF != 0) {
            JSONObject jSONObjectJsonObjectInit7 = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit7.put(R6.r0, iSBannerSizeF.getDescription());
            jSONObjectJsonObjectInit7.put(R6.t0, iSBannerSizeF.getWidth());
            jSONObjectJsonObjectInit7.put(R6.s0, iSBannerSizeF.getHeight());
            jSONObjectJsonObjectInit.put(R6.q0, jSONObjectJsonObjectInit7);
        }
        jSONObjectJsonObjectInit.put(R6.l0, aVarC.toString());
        if (hVar.b() != null) {
            jSONObjectJsonObjectInit.put("adf", hVar.b());
        }
        if (hVar.d() != null) {
            jSONObjectJsonObjectInit.put("mediationAdUnitId", hVar.d());
        }
        if (hVar.v() != null) {
            jSONObjectJsonObjectInit.put(R6.o0, hVar.v());
        }
        jSONObjectJsonObjectInit.put(R6.v0, !zU ? 1 : 0);
        if (hVar.g() != null) {
            jSONObjectJsonObjectInit.put(R6.t1, IronSourceNetworkBridge.jsonObjectInit().put(R6.u1, hVar.g()));
        } else {
            Object objRemove = jSONObjectA.remove(R6.t1);
            if (objRemove != null) {
                jSONObjectJsonObjectInit.put(R6.t1, objRemove);
            }
        }
        if (zQ) {
            jSONObjectJsonObjectInit.put(R6.r1, 1);
        }
        return jSONObjectJsonObjectInit;
    }

    public static d b() {
        return C;
    }

    private c a() {
        c cVar = c.SECURE;
        if (Build.VERSION.SDK_INT >= 28) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar;
        }
        return (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (!TextUtils.isEmpty(strOptString)) {
            a aVar = new a(strOptString);
            JSONObject jSONObjectOptJSONObject = null;
            if (jSONObject.has("settings")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                aVar.c = new C5074y2(jSONObject2);
                jSONObjectOptJSONObject = jSONObject2.has(d) ? jSONObject2.optJSONObject(d) : null;
                if (jSONObject2.has("genericParams")) {
                    aVar.d = jSONObject2.optJSONObject("genericParams");
                }
                if (jSONObject2.has("configurations")) {
                    aVar.e = jSONObject2.optJSONObject("configurations");
                }
                if (jSONObject2.has(k)) {
                    aVar.h = new InterfaceC4734f2.a(jSONObject2.optJSONObject(k));
                }
            }
            aVar.b = new ArrayList();
            if (jSONObject.has(h)) {
                JSONArray jSONArray = jSONObject.getJSONArray(h);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    C5074y2 c5074y2 = new C5074y2(jSONArray.getJSONObject(i2), i2, jSONObjectOptJSONObject);
                    if (!c5074y2.n()) {
                        aVar.f = 1002;
                        aVar.g = "waterfall " + i2;
                        IronLog.INTERNAL.verbose("AuctionResponseItem " + i2 + " not valid - parsing error");
                        throw new JSONException("invalid response");
                    }
                    aVar.b.add(c5074y2);
                }
            }
            return aVar;
        }
        throw new JSONException("Invalid auction response - auction id is missing");
    }

    public String a(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(n, str4).replace(l, str6).replace(m, str5).replace(p, str2).replace(q, Integer.toString(i2)).replace(o, str3).replace(r, str7);
    }

    public String a(String str, int i2, C5074y2 c5074y2, String str2, String str3, String str4) {
        String strI = c5074y2.i();
        return a(str, c5074y2.c(), i2, b().c(c5074y2.k()), strI, b().a(strI, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
                if (jSONObjectJsonObjectInit.has("adMarkup")) {
                    return jSONObjectJsonObjectInit.getString("adMarkup");
                }
            }
        } catch (JSONException e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return str;
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d2 = Double.parseDouble(str);
        double d3 = Double.parseDouble(str2);
        return d3 == 0.0d ? "" : String.valueOf(Math.round((d2 / d3) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(R6.l1)) || !this.a.compareAndSet(false, true)) {
            return;
        }
        Pb.k0().q().a(new C5(D5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z2, true, -1)));
    }
}
