package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class Ue {
    protected static final boolean A = false;
    protected static final String A0 = "parallelInit";
    protected static final String A1 = "adSourceName";
    protected static final int B = 60;
    protected static final String B0 = "waitUntilAllProvidersFinishInit";
    protected static final String B1 = "providerNetworkKey";
    protected static final int C = 10000;
    protected static final String C0 = "sharedManagersThread";
    protected static final String C1 = "spId";
    protected static final int D = 10000;
    protected static final String D0 = "parallelLoad";
    protected static final String D1 = "mpis";
    protected static final int E = -1;
    protected static final String E0 = "bidderExclusive";
    protected static final String E1 = "auction";
    protected static final int F = 5000;
    protected static final String F0 = "adapterTimeOutInSeconds";
    protected static final String F1 = "auctionData";
    protected static final int G = 3;
    protected static final String G0 = "atim";
    protected static final String G1 = "auctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "bannerInterval";
    protected static final String H1 = "extAuctioneerURL";
    protected static final int I = 3;
    protected static final String I0 = "isOneFlow";
    protected static final String I1 = "objectPerWaterfall";
    protected static final int J = 0;
    protected static final String J0 = "expiredDurationInMinutes";
    protected static final String J1 = "minTimeBeforeFirstAuction";
    protected static final int K = 2;
    protected static final String K0 = "server";
    protected static final String K1 = "timeToWaitBeforeAuction";
    protected static final int L = 15;
    protected static final String L0 = "publisher";
    protected static final String L1 = "timeToWaitBeforeLoad";
    protected static final long M = 10000;
    protected static final String M0 = "console";
    protected static final String M1 = "auctionRetryInterval";
    protected static final long N = 3000;
    protected static final String N0 = "sendUltraEvents";
    protected static final String N1 = "isLoadWhileShow";
    protected static final boolean O = false;
    protected static final String O0 = "sendEventsToggle";
    protected static final String O1 = "auctionTrials";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompression";
    protected static final String P1 = "auctionTimeout";
    protected static final int Q = 30000;
    protected static final String Q0 = "eventsCompressionLevel";
    protected static final String Q1 = "auctionSavedHistory";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsURL";
    protected static final String R1 = "disableLoadWhileShowSupportFor";
    protected static final int S = 5000;
    protected static final String S0 = "serverEventsType";
    protected static final String S1 = "tokenPerAdapter";
    protected static final int T = 1;
    protected static final String T0 = "backupThreshold";
    protected static final String T1 = "enableAuctionFallback";
    protected static final boolean U = false;
    protected static final String U0 = "maxNumberOfEvents";
    protected static final String U1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final int V = 15000;
    protected static final String V0 = "maxEventsPerBatch";
    protected static final String V1 = "compressAuctionRequest";
    protected static final int W = 15000;
    protected static final String W0 = "optOut";
    protected static final String W1 = "compressAuctionResponse";
    protected static final String X = "providerOrder";
    protected static final String X0 = "optIn";
    protected static final String X1 = "encryptionVersion";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "triggerEvents";
    protected static final String Y1 = "shouldSendBannerBURLFromImpression";
    protected static final String Z = "configurations";
    protected static final String Z0 = "nonConnectivityEvents";
    protected static final String Z1 = "impressionTimeout";
    protected static final String a0 = "genericParams";
    protected static final String a1 = "shouldSendPublisherLogsOnUIThread";
    protected static final String a2 = "optInKeys";
    protected static final String b0 = "adUnits";
    protected static final String b1 = "pixel";
    protected static final String b2 = "tokenGenericParams";
    protected static final String c0 = "providerLoadName";
    protected static final String c1 = "pixelEventsUrl";
    protected static final String c2 = "compressToken";
    protected static final String d0 = "application";
    protected static final String d1 = "pixelEventsEnabled";
    protected static final String d2 = "compressExternalToken";
    protected static final String e0 = "rewardedVideo";
    protected static final String e1 = "placements";
    protected static final String e2 = "instanceType";
    protected static final String f0 = "interstitial";
    protected static final String f1 = "placementId";
    protected static final String f2 = "maxAdsPerSession";
    protected static final String g0 = "banner";
    protected static final String g1 = "placementName";
    protected static final String g2 = "reward";
    protected static final String h0 = "nativeAd";
    protected static final String h1 = "delivery";
    protected static final String h2 = "name";
    protected static final String i0 = "integration";
    protected static final String i1 = "isDefault";
    protected static final String i2 = "amount";
    protected static final String j0 = "loggers";
    protected static final String j1 = "capping";
    protected static final String j2 = "bannerRefreshRate";
    protected static final String k0 = "segment";
    protected static final String k1 = "pacing";
    protected static final String k2 = "protocolVersion";
    public static final String l = "appKey";
    protected static final String l0 = "events";
    protected static final String l1 = "enabled";
    protected static final String l2 = "adFormats";
    public static final String m = "userId";
    protected static final String m0 = "crashReporter";
    protected static final String m1 = "maxImpressions";
    protected static final String m2 = "adUnits";
    public static final String n = "response";
    protected static final String n0 = "token";
    protected static final String n1 = "numOfSeconds";
    protected static final String n2 = "rewarded";
    protected static final String o = "error";
    protected static final String o0 = "external";
    protected static final String o1 = "unit";
    public static final String o2 = "preload";
    protected static final int p = 3;
    protected static final String p0 = "mediationTypes";
    protected static final String p1 = "virtualItemName";
    protected static final boolean q = false;
    protected static final String q0 = "providerDefaultInstance";
    protected static final String q1 = "virtualItemCount";
    protected static final boolean r = true;
    protected static final String r0 = "testSuite";
    protected static final String r1 = "uuidEnabled";
    protected static final boolean s = true;
    protected static final String s0 = "controllerUrl";
    protected static final String s1 = "abt";
    protected static final int t = 2;
    protected static final String t0 = "AdQuality";
    protected static final String t1 = "delayLoadFailure";
    protected static final int u = 2;
    protected static final String u0 = "initMode";
    protected static final String u1 = "keysToInclude";
    protected static final int v = 1;
    protected static final String v0 = "adq_init_blob";
    protected static final String v1 = "reporterURL";
    protected static final int w = 1;
    protected static final String w0 = "testMode";
    protected static final String w1 = "reporterKeyword";
    protected static final boolean x = true;
    protected static final String x0 = "settings";
    protected static final String x1 = "includeANR";
    protected static final boolean y = false;
    protected static final String y0 = "collectBiddingDataTimeout";
    protected static final String y1 = "timeout";
    protected static final boolean z = false;
    protected static final String z0 = "providers";
    protected static final String z1 = "setIgnoreDebugger";
    private Ld a;
    private Nd b;
    private S3 c;
    private String d;
    private String e;
    private JSONObject f;
    private Context g;
    private a h;
    private Q7.a i;
    private boolean j;
    private R5 k;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");

        private final String a;

        public String b() {
            return this.a;
        }

        a(String str) {
            this.a = str;
        }
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectC = c(jSONObject, str);
        String strA = a(str);
        if (jSONObjectC == null || strA == null) {
            return null;
        }
        return jSONObjectC.optJSONArray(strA);
    }

    private boolean o() {
        int iOptInt;
        try {
            iOptInt = this.f.optInt(k2, 0);
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    private R1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString = jSONObject.optString("serverEventsURL", "");
        String strOptString2 = jSONObject.optString("serverEventsType", "");
        int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
        int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
        int[] iArr4 = null;
        if (jSONArrayOptJSONArray != null) {
            int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                iArr5[i] = jSONArrayOptJSONArray.optInt(i);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                iArr6[i3] = jSONArrayOptJSONArray2.optInt(i3);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                iArr7[i4] = jSONArrayOptJSONArray3.optInt(i4);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            iArr4 = new int[jSONArrayOptJSONArray4.length()];
            for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                iArr4[i5] = jSONArrayOptJSONArray4.optInt(i5);
            }
        }
        return new R1(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, "AdQuality");
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt("initMode", 0));
            aVar.b(jSONObjectC.optBoolean(w0, false));
            new C4670ba().b(jSONObjectC.optString("adq_init_blob"));
        }
        return aVar;
    }

    private C4842l3 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(i1, false);
        C4888nd c4888ndA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C4842l3 c4842l3 = new C4842l3(iOptInt, strOptString, zOptBoolean, c4888ndA);
        if (c4888ndA != null) {
            this.i.b(this.g, c4842l3, IronSource.a.BANNER);
        }
        return c4842l3;
    }

    private P9 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(i1, false);
        C4888nd c4888ndA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        P9 p9 = new P9(iOptInt, strOptString, zOptBoolean, c4888ndA);
        if (c4888ndA != null) {
            this.i.b(this.g, p9, IronSource.a.INTERSTITIAL);
        }
        return p9;
    }

    private C4780hc f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(i1, false);
        C4888nd c4888ndA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C4780hc c4780hc = new C4780hc(iOptInt, strOptString, zOptBoolean, c4888ndA);
        if (c4888ndA != null) {
            this.i.b(this.g, c4780hc, IronSource.a.NATIVE_AD);
        }
        return c4780hc;
    }

    private C4870md g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(i1, false);
        String strOptString2 = jSONObject.optString("virtualItemName", "");
        int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
        C4888nd c4888ndA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || iOptInt2 <= 0) {
            return null;
        }
        C4870md c4870md = new C4870md(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, c4888ndA);
        if (c4888ndA != null) {
            this.i.b(this.g, c4870md, IronSource.a.REWARDED_VIDEO);
        }
        return c4870md;
    }

    private String m() {
        return this.j ? "rewarded" : "rewardedVideo";
    }

    private boolean n() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f, "configurations"), b());
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00b5  */
    private void r() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONObject jSONObject;
        String str8;
        String str9;
        String str10;
        String str11;
        C4800ie c4800ie;
        String str12;
        String str13;
        String str14;
        String str15;
        JSONObject jSONObject2;
        String str16;
        String str17;
        String str18;
        JSONObject jSONObject3;
        String str19;
        String str20;
        L9 l9;
        String str21;
        String str22;
        String str23;
        JSONObject jSONObject4;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        C4663b3 c4663b3;
        JSONObject jSONObject5;
        String str30;
        C4663b3 c4663b4;
        Wb wb;
        boolean zOptBoolean;
        String str31;
        JSONObject jSONObjectC;
        A2 a3;
        JSONObject jSONObjectC2;
        A2 a4;
        String str32;
        A2 a5;
        A2 a6;
        try {
            JSONObject jSONObjectC3 = c(this.f, "configurations");
            JSONObject jSONObjectC4 = c(jSONObjectC3, b());
            JSONObject jSONObjectC5 = c(jSONObjectC3, "application");
            JSONObject jSONObjectC6 = c(jSONObjectC4, m());
            JSONObject jSONObjectC7 = c(jSONObjectC4, "interstitial");
            JSONObject jSONObjectC8 = c(jSONObjectC4, "banner");
            JSONObject jSONObjectC9 = c(jSONObjectC4, "nativeAd");
            JSONObject jSONObjectC10 = c(jSONObjectC5, "events");
            JSONObject jSONObjectC11 = c(jSONObjectC5, "loggers");
            JSONObject jSONObjectC12 = c(jSONObjectC5, "token");
            JSONObject jSONObjectC13 = c(jSONObjectC5, "segment");
            JSONObject jSONObjectC14 = c(jSONObjectC5, "auction");
            JSONObject jSONObjectC15 = c(jSONObjectC5, "crashReporter");
            JSONObject jSONObjectC16 = c(jSONObjectC5, "settings");
            JSONObject jSONObjectC17 = c(jSONObjectC5, "external");
            JSONObject jSONObjectC18 = c(jSONObjectC10, b1);
            if (jSONObjectC5 != null) {
                IronSourceUtils.b(this.g, "uuidEnabled", jSONObjectC5.optBoolean("uuidEnabled", true));
            }
            if (jSONObjectC10 != null) {
                String strOptString = jSONObjectC10.optString("abt");
                if (TextUtils.isEmpty(strOptString)) {
                    str = null;
                } else {
                    Pb.k0().q().a(strOptString);
                    N9.i().a(strOptString);
                    C4835ke.i().a(strOptString);
                    str = strOptString;
                }
            } else {
                str = null;
            }
            R1 r1A = a(jSONObjectC10, Boolean.valueOf(jSONObjectC10.optBoolean("sendUltraEvents", false)));
            String str33 = "bidderExclusive";
            String str34 = T1;
            String str35 = S1;
            String str36 = X1;
            String str37 = W1;
            String str38 = t1;
            String str39 = V1;
            String str40 = B0;
            String str41 = A0;
            JSONObject jSONObject6 = jSONObjectC10;
            String str42 = G1;
            String str43 = H1;
            String str44 = F1;
            if (jSONObjectC6 != null) {
                str2 = "";
                JSONArray jSONArrayOptJSONArray = jSONObjectC6.optJSONArray("placements");
                JSONObject jSONObjectC19 = c(jSONObjectC6, "events");
                JSONObject jSONObjectD = d(jSONObjectC6, z0);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                long jOptLong = jSONObjectC6.optLong(y0, 3000L);
                boolean zOptBoolean2 = jSONObjectD.optBoolean(A0, false);
                boolean zOptBoolean3 = jSONObjectD.optBoolean(B0, false);
                boolean zOptBoolean4 = jSONObjectC6.optBoolean(C0, true);
                int iA = a(jSONObjectC6, jSONObjectC5, "parallelLoad", 2);
                boolean zA = a(jSONObjectC6, jSONObjectC5, "bidderExclusive", true);
                int iA2 = a(jSONObjectC6, jSONObjectC5, F0, 60);
                int iA3 = a(jSONObjectC6, jSONObjectC5, "expiredDurationInMinutes", -1);
                int iA4 = a(jSONObjectC6, jSONObjectC5, t1, 3);
                str8 = "isOneFlow";
                boolean zA2 = a(jSONObjectC6, jSONObjectC5, str8, false);
                jSONObject6 = jSONObject6;
                JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC19, jSONObject6);
                R1 r1A2 = a(jSONObjectB, Boolean.valueOf(jSONObjectB.optBoolean("sendUltraEvents", false)));
                if (jSONObjectC14 != null) {
                    JSONObject jSONObjectC20 = c(jSONObjectC14, m());
                    String strOptString2 = jSONObjectC14.optString(str44, str2);
                    String strOptString3 = jSONObjectC14.optString(str42, str2);
                    String strOptString4 = jSONObjectC14.optString(str43, str2);
                    int iOptInt = jSONObjectC14.optInt("auctionTrials", 2);
                    long jOptLong2 = jSONObjectC14.optLong(P1, 10000L);
                    int iOptInt2 = jSONObjectC14.optInt(Q1, 15);
                    str11 = P1;
                    boolean zOptBoolean5 = jSONObjectC14.optBoolean(str39, false);
                    boolean zOptBoolean6 = jSONObjectC14.optBoolean(str37, false);
                    int iOptInt3 = jSONObjectC14.optInt(str36, 1);
                    boolean zOptBoolean7 = jSONObjectC14.optBoolean(str35, true);
                    boolean zOptBoolean8 = jSONObjectC20.optBoolean(str34, true);
                    str10 = Q1;
                    int iOptInt4 = jSONObjectC20.optInt(J1, 2000);
                    str9 = J1;
                    str7 = "auctionTrials";
                    int iOptInt5 = jSONObjectC20.optInt(M1, 30000);
                    str6 = M1;
                    jSONObject = jSONObjectC14;
                    int iOptInt6 = jSONObjectC20.optInt(K1, 5000);
                    str5 = K1;
                    int iOptInt7 = jSONObjectC20.optInt(L1, 50);
                    boolean zOptBoolean9 = jSONObjectC20.optBoolean(I1, false);
                    str4 = I1;
                    str3 = "isLoadWhileShow";
                    A2 a7 = new A2(strOptString2, strOptString3, strOptString4, iOptInt, iOptInt2, jOptLong2, iOptInt4, iOptInt5, iOptInt6, iOptInt7, jSONObjectC20.optBoolean("isLoadWhileShow", true), jSONObjectC20.optInt(U1, 30000), zOptBoolean5, zOptBoolean6, zOptBoolean9, iOptInt3, false, zOptBoolean7, zOptBoolean8);
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectC20.optJSONArray(R1);
                    if (jSONArrayOptJSONArray2 != null) {
                        str44 = str44;
                        str42 = str42;
                        str2 = str2;
                        str43 = str43;
                        str39 = str39;
                        str37 = str37;
                        str36 = str36;
                        str35 = str35;
                        str34 = str34;
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            a7.a(jSONArrayOptJSONArray2.optString(i));
                        }
                    }
                    str44 = str44;
                    str42 = str42;
                    str2 = str2;
                    str43 = str43;
                    str39 = str39;
                    str37 = str37;
                    str36 = str36;
                    str35 = str35;
                    str34 = str34;
                    a6 = a7;
                } else {
                    str3 = "isLoadWhileShow";
                    str4 = I1;
                    str5 = K1;
                    str6 = M1;
                    str7 = "auctionTrials";
                    jSONObject = jSONObjectC14;
                    str9 = J1;
                    str10 = Q1;
                    str11 = P1;
                    a6 = new A2();
                }
                C4800ie c4800ie2 = new C4800ie(iA, zA, iA2, iA3, r1A2, a6, iA4, zA2, jOptLong, zOptBoolean2, zOptBoolean3, zOptBoolean4);
                if (jSONArray != null) {
                    int i3 = 0;
                    while (i3 < jSONArray.length()) {
                        JSONArray jSONArray2 = jSONArray;
                        C4870md c4870mdG = g(jSONArray2.optJSONObject(i3));
                        if (c4870mdG != null) {
                            c4800ie2.a(c4870mdG);
                        }
                        i3++;
                        jSONArray = jSONArray2;
                    }
                }
                c4800ie = c4800ie2;
            } else {
                str2 = "";
                str38 = t1;
                str3 = "isLoadWhileShow";
                str4 = I1;
                str5 = K1;
                str6 = M1;
                str7 = "auctionTrials";
                jSONObject = jSONObjectC14;
                str8 = "isOneFlow";
                str9 = J1;
                str10 = Q1;
                str11 = P1;
                str33 = "bidderExclusive";
                c4800ie = null;
            }
            if (jSONObjectC7 != null) {
                JSONArray jSONArrayOptJSONArray3 = jSONObjectC7.optJSONArray("placements");
                str18 = "events";
                JSONObject jSONObjectC21 = c(jSONObjectC7, str18);
                JSONObject jSONObjectD2 = d(jSONObjectC7, z0);
                str21 = "placements";
                long jOptLong3 = jSONObjectC7.optLong(y0, 3000L);
                boolean zOptBoolean10 = jSONObjectD2.optBoolean(A0, false);
                boolean zOptBoolean11 = jSONObjectD2.optBoolean(B0, false);
                boolean zOptBoolean12 = jSONObjectC7.optBoolean(C0, true);
                int iA5 = a(jSONObjectC7, jSONObjectC5, "parallelLoad", 2);
                boolean zA3 = a(jSONObjectC7, jSONObjectC5, str33, false);
                int iA6 = a(jSONObjectC7, jSONObjectC5, F0, 60);
                str13 = str38;
                int iA7 = a(jSONObjectC7, jSONObjectC5, str13, 3);
                str12 = str8;
                boolean zA4 = a(jSONObjectC7, jSONObjectC5, str12, false);
                jSONObject2 = jSONObject6;
                R1 r1A3 = a(IronSourceUtils.b(jSONObjectC21, jSONObject2), Boolean.FALSE);
                if (jSONObject != null) {
                    jSONObject3 = jSONObject;
                    JSONObject jSONObjectC22 = c(jSONObject3, "interstitial");
                    str16 = str44;
                    str17 = str2;
                    String strOptString5 = jSONObject3.optString(str16, str17);
                    String str45 = str42;
                    String strOptString6 = jSONObject3.optString(str45, str17);
                    str42 = str45;
                    String str46 = str43;
                    String strOptString7 = jSONObject3.optString(str46, str17);
                    String str47 = str7;
                    int iOptInt8 = jSONObject3.optInt(str47, 2);
                    String str48 = str10;
                    str20 = str47;
                    int iOptInt9 = jSONObject3.optInt(str48, 15);
                    String str49 = str11;
                    str19 = str48;
                    str43 = str46;
                    String str50 = str39;
                    String str51 = str37;
                    str14 = str49;
                    String str52 = str36;
                    str39 = str50;
                    String str53 = str35;
                    str36 = str52;
                    str37 = str51;
                    str32 = str34;
                    str35 = str53;
                    str15 = str9;
                    a5 = new A2(strOptString5, strOptString6, strOptString7, iOptInt8, iOptInt9, jSONObject3.optLong(str49, 10000L), jSONObjectC22.optInt(str15, 2000), 0L, 0L, 0L, true, 0, jSONObject3.optBoolean(str50, false), jSONObject3.optBoolean(str51, false), true, jSONObject3.optInt(str52, 1), false, jSONObject3.optBoolean(str53, true), jSONObjectC22.optBoolean(str32, true));
                } else {
                    str32 = str34;
                    str14 = str11;
                    str15 = str9;
                    str16 = str44;
                    str17 = str2;
                    jSONObject3 = jSONObject;
                    str19 = str10;
                    str20 = str7;
                    a5 = new A2();
                }
                L9 l10 = new L9(iA5, zA3, iA6, r1A3, a5, iA7, zA4, jOptLong3, zOptBoolean10, zOptBoolean11, zOptBoolean12);
                str34 = str32;
                if (jSONArrayOptJSONArray3 != null) {
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                        P9 p9E = e(jSONArrayOptJSONArray3.optJSONObject(i4));
                        if (p9E != null) {
                            l10.a(p9E);
                        }
                    }
                }
                l9 = l10;
            } else {
                jSONObjectC5 = jSONObjectC5;
                str12 = str8;
                str13 = str38;
                str14 = str11;
                str15 = str9;
                jSONObject2 = jSONObject6;
                str16 = str44;
                str17 = str2;
                jSONObject3 = jSONObject;
                str40 = B0;
                str19 = str10;
                str20 = str7;
                str41 = A0;
                l9 = null;
            }
            if (jSONObjectC8 != null) {
                str18 = r8;
                String str54 = str21;
                JSONArray jSONArrayOptJSONArray4 = jSONObjectC8.optJSONArray(str54);
                JSONObject jSONObjectC23 = c(jSONObjectC8, str18);
                JSONObject jSONObjectD3 = d(jSONObjectC8, z0);
                JSONArray jSONArray3 = jSONArrayOptJSONArray4;
                str27 = str54;
                JSONObject jSONObject7 = jSONObject3;
                String str55 = str17;
                String str56 = str16;
                jSONObject4 = jSONObjectC5;
                str24 = str41;
                String str57 = str14;
                str29 = str40;
                str25 = str20;
                str28 = str15;
                long jA = a(jSONObjectC8, jSONObject4, G0, 10000L);
                int iA8 = a(jSONObjectC8, jSONObject4, str13, 3);
                int iOptInt10 = jSONObjectC8.optInt(H0, 60);
                long jOptLong4 = jSONObjectC8.optLong(Z1, 15000L);
                boolean zA5 = a(jSONObjectC8, jSONObject4, str12, false);
                long jOptLong5 = jSONObjectC8.optLong(y0, 3000L);
                boolean zOptBoolean13 = jSONObjectD3.optBoolean(str24, false);
                boolean zOptBoolean14 = jSONObjectD3.optBoolean(str29, false);
                boolean zOptBoolean15 = jSONObjectC8.optBoolean(C0, true);
                R1 r1A4 = a(IronSourceUtils.b(jSONObjectC23, jSONObject2), Boolean.FALSE);
                if (jSONObject7 != null) {
                    jSONObject3 = jSONObject7;
                    JSONObject jSONObjectC24 = c(jSONObject3, "banner");
                    if (jSONObjectC24 != null) {
                        str23 = str56;
                        str22 = str55;
                        String strOptString8 = jSONObject3.optString(str23, str22);
                        String str58 = str42;
                        String strOptString9 = jSONObject3.optString(str58, str22);
                        String str59 = str43;
                        String strOptString10 = jSONObject3.optString(str59, str22);
                        int iOptInt11 = jSONObject3.optInt(str25, 2);
                        str43 = str59;
                        String str60 = str19;
                        int iOptInt12 = jSONObject3.optInt(str60, 15);
                        str19 = str60;
                        str25 = str25;
                        str26 = str57;
                        long jOptLong6 = jSONObject3.optLong(str26, 10000L);
                        String str61 = str39;
                        boolean zOptBoolean16 = jSONObject3.optBoolean(str61, false);
                        str39 = str61;
                        String str62 = str37;
                        boolean zOptBoolean17 = jSONObject3.optBoolean(str62, false);
                        String str63 = str36;
                        int iOptInt13 = jSONObject3.optInt(str63, 1);
                        str37 = str62;
                        String str64 = str35;
                        boolean zOptBoolean18 = jSONObject3.optBoolean(str64, true);
                        str35 = str64;
                        String str65 = str34;
                        boolean zOptBoolean19 = jSONObjectC24.optBoolean(str65, true);
                        str42 = str58;
                        boolean zOptBoolean20 = jSONObjectC24.optBoolean(str4, true);
                        str34 = str65;
                        int iOptInt14 = jSONObjectC24.optInt(str28, 2000);
                        str28 = str28;
                        str36 = str63;
                        a4 = new A2(strOptString8, strOptString9, strOptString10, iOptInt11, iOptInt12, jOptLong6, iOptInt14, jSONObjectC24.optInt(str6, 15000), jSONObjectC24.optInt(str5, 50), 0L, jSONObjectC24.optBoolean(str3, false), 0, zOptBoolean16, zOptBoolean17, zOptBoolean20, iOptInt13, jSONObjectC24.optBoolean(Y1, true), zOptBoolean18, zOptBoolean19);
                    } else {
                        str26 = str57;
                        str23 = str56;
                        str22 = str55;
                        a4 = new A2();
                    }
                } else {
                    jSONObject3 = jSONObject7;
                    str26 = str57;
                    str23 = str56;
                    str22 = str55;
                    a4 = new A2();
                }
                C4663b3 c4663b5 = new C4663b3(1, jA, false, r1A4, iOptInt10, a4, iA8, zA5, jOptLong5, zOptBoolean13, zOptBoolean14, zOptBoolean15, jOptLong4);
                if (jSONArray3 != null) {
                    int i5 = 0;
                    while (i5 < jSONArray3.length()) {
                        JSONArray jSONArray4 = jSONArray3;
                        C4842l3 c4842l3D = d(jSONArray4.optJSONObject(i5));
                        if (c4842l3D != null) {
                            c4663b5.a(c4842l3D);
                        }
                        i5++;
                        jSONArray3 = jSONArray4;
                    }
                }
                c4663b3 = c4663b5;
            } else {
                str18 = r8;
                str22 = str17;
                str23 = str16;
                jSONObject4 = jSONObjectC5;
                str24 = str41;
                str25 = str20;
                str26 = str14;
                str27 = str21;
                str28 = str15;
                str29 = str40;
                c4663b3 = null;
            }
            if (jSONObjectC9 != null) {
                JSONArray jSONArrayOptJSONArray5 = jSONObjectC9.optJSONArray(str27);
                String str66 = str18;
                JSONObject jSONObjectC25 = c(jSONObjectC9, str66);
                JSONObject jSONObjectD4 = d(jSONObjectC9, z0);
                String str67 = str22;
                String str68 = str26;
                jSONObject5 = jSONObject4;
                String str69 = str28;
                String str70 = str34;
                String str71 = str19;
                String str72 = str35;
                String str73 = str36;
                String str74 = str37;
                String str75 = str39;
                String str76 = str25;
                String str77 = str42;
                String str78 = str43;
                str30 = str66;
                c4663b4 = c4663b3;
                long jA2 = a(jSONObjectC9, jSONObject5, G0, 10000L);
                int iA9 = a(jSONObjectC9, jSONObject5, str13, 0);
                long jOptLong7 = jSONObjectC9.optLong(y0, 3000L);
                boolean zOptBoolean21 = jSONObjectD4.optBoolean(str24, false);
                boolean zOptBoolean22 = jSONObjectD4.optBoolean(str29, false);
                boolean zOptBoolean23 = jSONObjectC9.optBoolean(C0, true);
                R1 r1A5 = a(IronSourceUtils.b(jSONObjectC25, jSONObject2), Boolean.FALSE);
                if (jSONObject3 == null || (jSONObjectC2 = c(jSONObject3, "nativeAd")) == null) {
                    str22 = str67;
                    a3 = new A2();
                } else {
                    str22 = str67;
                    a3 = new A2(jSONObject3.optString(str23, str22), jSONObject3.optString(str77, str22), jSONObject3.optString(str78, str22), jSONObject3.optInt(str76, 2), jSONObject3.optInt(str71, 15), jSONObject3.optLong(str68, 10000L), jSONObjectC2.optInt(str69, 2000), 0L, 0L, 0L, true, 0, jSONObject3.optBoolean(str75, false), jSONObject3.optBoolean(str74, false), true, jSONObject3.optInt(str73, 1), false, jSONObject3.optBoolean(str72, true), jSONObjectC2.optBoolean(str70, true));
                }
                wb = new Wb(1, jA2, false, r1A5, a3, iA9, jOptLong7, zOptBoolean21, zOptBoolean22, zOptBoolean23);
                if (jSONArrayOptJSONArray5 != null) {
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray5.length(); i6++) {
                        C4780hc c4780hcF = f(jSONArrayOptJSONArray5.optJSONObject(i6));
                        if (c4780hcF != null) {
                            wb.a(c4780hcF);
                        }
                    }
                }
            } else {
                jSONObject5 = jSONObject4;
                str30 = str18;
                c4663b4 = c4663b3;
                wb = null;
            }
            C4909og c4909og = new C4909og();
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.Ue.r():void");
        }

        private void s() {
            try {
                JSONObject jSONObjectC = c(this.f, "providerOrder");
                JSONArray jSONArrayB = b(jSONObjectC, m());
                JSONArray jSONArrayB2 = b(jSONObjectC, "interstitial");
                JSONArray jSONArrayB3 = b(jSONObjectC, "banner");
                JSONArray jSONArrayB4 = b(jSONObjectC, "nativeAd");
                this.a = new Ld();
                if (jSONArrayB != null && c() != null && c().f() != null) {
                    for (int i = 0; i < jSONArrayB.length(); i++) {
                        String strOptString = jSONArrayB.optString(i);
                        this.a.d(strOptString);
                        NetworkSettings networkSettingsB = Nd.c().b(strOptString);
                        if (networkSettingsB != null) {
                            networkSettingsB.setRewardedVideoPriority(i);
                        }
                    }
                }
                if (jSONArrayB2 != null && c() != null && c().d() != null) {
                    for (int i3 = 0; i3 < jSONArrayB2.length(); i3++) {
                        String strOptString2 = jSONArrayB2.optString(i3);
                        this.a.b(strOptString2);
                        NetworkSettings networkSettingsB2 = Nd.c().b(strOptString2);
                        if (networkSettingsB2 != null) {
                            networkSettingsB2.setInterstitialPriority(i3);
                        }
                    }
                }
                if (jSONArrayB3 != null) {
                    for (int i4 = 0; i4 < jSONArrayB3.length(); i4++) {
                        String strOptString3 = jSONArrayB3.optString(i4);
                        this.a.a(strOptString3);
                        NetworkSettings networkSettingsB3 = Nd.c().b(strOptString3);
                        if (networkSettingsB3 != null) {
                            networkSettingsB3.setBannerPriority(i4);
                        }
                    }
                }
                if (jSONArrayB4 != null) {
                    for (int i5 = 0; i5 < jSONArrayB4.length(); i5++) {
                        String strOptString4 = jSONArrayB4.optString(i5);
                        this.a.c(strOptString4);
                        NetworkSettings networkSettingsB4 = Nd.c().b(strOptString4);
                        if (networkSettingsB4 != null) {
                            networkSettingsB4.setNativeAdPriority(i5);
                        }
                    }
                }
            } catch (Exception e) {
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        private void t() {
            try {
                this.b = Nd.c();
                JSONObject jSONObjectC = c(this.f, "providerSettings");
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                        String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                        String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                        String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                        String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                        String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                        JSONObject jSONObjectC2 = c(jSONObjectOptJSONObject, b());
                        JSONObject jSONObjectC3 = c(jSONObjectOptJSONObject, "application");
                        JSONObject jSONObjectC4 = c(jSONObjectC2, m());
                        JSONObject jSONObjectC5 = c(jSONObjectC2, "interstitial");
                        JSONObject jSONObjectC6 = c(jSONObjectC2, "banner");
                        JSONObject jSONObjectC7 = c(jSONObjectC2, "nativeAd");
                        JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC4, jSONObjectC3);
                        JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectC5, jSONObjectC3);
                        JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectC6, jSONObjectC3);
                        JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectC7, jSONObjectC3);
                        if (this.b.a(next)) {
                            Pb.k0().q().a(new C5(D5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                            NetworkSettings networkSettingsB = this.b.b(next);
                            JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                            JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                            JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                            JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                            networkSettingsB.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, jSONObjectB));
                            networkSettingsB.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, jSONObjectB2));
                            networkSettingsB.setBannerSettings(IronSourceUtils.b(bannerSettings, jSONObjectB3));
                            networkSettingsB.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, jSONObjectB4));
                            networkSettingsB.setIsMultipleInstances(zOptBoolean);
                            networkSettingsB.setSubProviderId(strOptString);
                            networkSettingsB.setAdSourceNameForEvents(strOptString2);
                            networkSettingsB.setProviderNetworkKey(strOptString3);
                        } else {
                            if (b(strOptString4)) {
                                NetworkSettings networkSettingsB2 = this.b.b("Mediation");
                                JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                                JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                                JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                                JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                                NetworkSettings networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(rewardedVideoSettings2.toString()), jSONObjectB), IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(interstitialSettings2.toString()), jSONObjectB2), IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(bannerSettings2.toString()), jSONObjectB3), IronSourceUtils.b(IronSourceNetworkBridge.jsonObjectInit(nativeAdSettings2.toString()), jSONObjectB4));
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                                this.b.a(networkSettings);
                            } else {
                                NetworkSettings networkSettings2 = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4);
                                networkSettings2.setIsMultipleInstances(zOptBoolean);
                                networkSettings2.setSubProviderId(strOptString);
                                networkSettings2.setAdSourceNameForEvents(strOptString2);
                                this.b.a(networkSettings2);
                            }
                            jSONObjectC = jSONObjectC;
                            itKeys = itKeys;
                        }
                    }
                }
                this.b.b();
            } catch (Exception e) {
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        public List<IronSource.a> h() {
            Ld ld;
            Ld ld2;
            Ld ld3;
            Ld ld4;
            if (this.f == null || this.c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (this.c.f() != null && (ld4 = this.a) != null && !ld4.d().isEmpty()) {
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
            if (this.c.d() != null && (ld3 = this.a) != null && !ld3.b().isEmpty()) {
                arrayList.add(IronSource.a.INTERSTITIAL);
            }
            if (this.c.c() != null && (ld2 = this.a) != null && !ld2.a().isEmpty()) {
                arrayList.add(IronSource.a.BANNER);
            }
            if (this.c.e() != null && (ld = this.a) != null && !ld.c().isEmpty()) {
                arrayList.add(IronSource.a.NATIVE_AD);
            }
            return arrayList;
        }

        public a i() {
            return this.h;
        }

        public JSONObject j() {
            return this.f;
        }

        public Ld k() {
            return this.a;
        }

        public Nd l() {
            return this.b;
        }

        public boolean q() {
            JSONObject jSONObject = this.f;
            return (jSONObject == null || jSONObject.has("error") || this.a == null || this.b == null || this.c == null || !n()) ? false : true;
        }

        public Ue(Context context, String str, String str2, String str3) {
            this.h = a.NOT_SET;
            this.j = false;
            this.g = context;
            this.i = Pb.b0().y();
            try {
                if (TextUtils.isEmpty(str3)) {
                    this.f = IronSourceNetworkBridge.jsonObjectInit();
                } else {
                    this.f = IronSourceNetworkBridge.jsonObjectInit(str3);
                }
                this.j = o();
                t();
                r();
                s();
                this.d = TextUtils.isEmpty(str) ? "" : str;
                this.e = TextUtils.isEmpty(str2) ? "" : str2;
                b(this.f);
            } catch (JSONException e) {
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                a();
            }
        }

        public boolean p() {
            return !TextUtils.isEmpty(c().g().b());
        }

        public String toString() {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            try {
                jSONObjectJsonObjectInit.put("appKey", this.d);
                jSONObjectJsonObjectInit.put("userId", this.e);
                jSONObjectJsonObjectInit.put(n, this.f);
            } catch (JSONException e) {
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return jSONObjectJsonObjectInit.toString();
        }

        private String b() {
            return this.j ? "adFormats" : Y0.c;
        }

        private void b(@NotNull JSONObject jSONObject) {
            this.k = new R5(jSONObject.optJSONObject(Be.d));
        }

        private boolean b(String str) {
            return this.b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
        }

        @NotNull
        public static C4909og b(@Nullable Ue ue) {
            if (ue != null && ue.q()) {
                return ue.c().b().k();
            }
            return C4909og.a();
        }

        public S3 c() {
            return this.c;
        }

        @Nullable
        private JSONObject c(JSONObject jSONObject, String str) {
            if (jSONObject != null) {
                return jSONObject.optJSONObject(str);
            }
            return null;
        }

        @NotNull
        private JSONObject d(JSONObject jSONObject, String str) {
            JSONObject jSONObjectC = c(jSONObject, str);
            return jSONObjectC != null ? jSONObjectC : IronSourceNetworkBridge.jsonObjectInit();
        }

        @Nullable
        public String e() {
            JSONObject jSONObject = this.f;
            if (jSONObject == null || !jSONObject.has("error")) {
                return null;
            }
            return this.f.optString("error");
        }

        public R5 f() {
            return this.k;
        }

        private Context d() {
            return this.g;
        }

        public C4741f9 g() {
            return new C4741f9(this.d, this.e);
        }

        public Ue(Ue ue) {
            this.h = a.NOT_SET;
            this.j = false;
            try {
                this.g = ue.d();
                this.f = IronSourceNetworkBridge.jsonObjectInit(ue.f.toString());
                this.d = ue.d;
                this.e = ue.e;
                this.j = ue.j;
                this.a = ue.k();
                this.b = ue.l();
                this.c = ue.c();
                this.h = ue.i();
                this.i = Pb.b0().y();
                b(this.f);
            } catch (Exception e) {
                C4950r4.d().a(e);
                a();
            }
        }

        private C4658ag h(JSONObject jSONObject) {
            C4658ag c4658ag = new C4658ag();
            JSONObject jSONObjectC = c(jSONObject, "testSuite");
            if (jSONObjectC != null) {
                c4658ag.b(jSONObjectC.optString("controllerUrl"));
            }
            return c4658ag;
        }

        public void a(a aVar) {
            this.h = aVar;
        }

        private void a() {
            this.f = IronSourceNetworkBridge.jsonObjectInit();
            this.d = "";
            this.e = "";
            this.a = new Ld();
            this.b = Nd.c();
            this.c = new S3.a().a();
            this.i = Pb.b0().y();
            b(this.f);
        }

        private String a(String str) {
            try {
                JSONObject jSONObjectC = c(c(c(c(this.f, "configurations"), "adFormats"), str), Y0.c);
                if (jSONObjectC == null) {
                    return null;
                }
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectC2 = c(jSONObjectC, next);
                    if (jSONObjectC2 != null && jSONObjectC2.optBoolean(i1)) {
                        return next;
                    }
                }
                return null;
            } catch (Exception e) {
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                return null;
            }
        }

        public static a a(Ue ue) {
            if (ue != null) {
                return ue.i();
            }
            return a.NOT_SET;
        }

        private int[] a(JSONObject jSONObject, String str) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int[] iArr = new int[jSONArrayOptJSONArray.length()];
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                iArr[i] = jSONArrayOptJSONArray.optInt(i);
            }
            return iArr;
        }

        private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z2) {
            if (jSONObject.has(str)) {
                return jSONObject.optBoolean(str, z2);
            }
            return jSONObject2.has(str) ? jSONObject2.optBoolean(str, z2) : z2;
        }

        private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
            int iOptInt = 0;
            if (jSONObject.has(str)) {
                iOptInt = jSONObject.optInt(str, 0);
            } else if (jSONObject2.has(str)) {
                iOptInt = jSONObject2.optInt(str, 0);
            }
            return iOptInt == 0 ? i : iOptInt;
        }

        private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
            long jOptLong;
            if (jSONObject.has(str)) {
                jOptLong = jSONObject.optLong(str, 0L);
            } else {
                jOptLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
            }
            return jOptLong == 0 ? j : jOptLong;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0036 A[PHI: r6
  0x0036: PHI (r6v3 com.ironsource.rd) = (r6v1 com.ironsource.rd), (r6v2 com.ironsource.rd) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
        private C4888nd a(JSONObject jSONObject) {
            EnumC4959rd enumC4959rd = null;
            if (jSONObject == null) {
                return null;
            }
            C4888nd.a aVar = new C4888nd.a();
            aVar.a(jSONObject.optBoolean("delivery", true));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("capping");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString(o1);
                if (!TextUtils.isEmpty(strOptString)) {
                    EnumC4959rd enumC4959rd2 = EnumC4959rd.PER_DAY;
                    if (enumC4959rd2.toString().equals(strOptString)) {
                        enumC4959rd = enumC4959rd2;
                    } else {
                        enumC4959rd2 = EnumC4959rd.PER_HOUR;
                        if (enumC4959rd2.toString().equals(strOptString)) {
                            enumC4959rd = enumC4959rd2;
                        }
                    }
                }
                int iOptInt = jSONObjectOptJSONObject.optInt(m1, 0);
                aVar.a(jSONObjectOptJSONObject.optBoolean("enabled", false) && iOptInt > 0, enumC4959rd, iOptInt);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("pacing");
            if (jSONObjectOptJSONObject2 != null) {
                int iOptInt2 = jSONObjectOptJSONObject2.optInt(n1, 0);
                aVar.a(jSONObjectOptJSONObject2.optBoolean("enabled", false) && iOptInt2 > 0, iOptInt2);
            }
            return aVar.a();
        }
    }
