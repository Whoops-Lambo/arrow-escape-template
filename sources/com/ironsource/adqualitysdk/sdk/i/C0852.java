package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᓖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0852 {

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static final String f2248;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static final String f2249;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static final String f2250;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static final String f2251;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2252;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public LinkedHashMap f2253;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public C0890 f2254;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public S0 f2255;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public String f2256;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String f2257;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String f2258;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String f2259;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String f2260;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f2261;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0890 f2262;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject f2263;

    static {
        StringFog.decrypt("WwOKiAaWrsxqL4uIBZy9\n", "GGzk5mP12qM=\n");
        StringFog.decrypt("FnXgTQ==\n", "eBSNKDZbRPM=\n");
        StringFog.decrypt("UalU5C4LaFdUrUI=\n", "NcAnlEJqERk=\n");
        StringFog.decrypt("VW4vXZT6tw==\n", "IwtdLv2V2SI=\n");
        StringFog.decrypt("YFE+wnAY\n", "DThQkRRz0Ns=\n");
        StringFog.decrypt("OglZU0KW\n", "V2ghACb9xA8=\n");
        f2252 = StringFog.decrypt("bA4oddZBikZxHhVEy3OETHEZ\n", "H2pDIbkA7SM=\n");
        f2251 = StringFog.decrypt("85tnKREdnUH3\n", "hP4Ff3h46gs=\n");
        f2250 = StringFog.decrypt("/LJ2mQUy\n", "n90Y6nFBaN8=\n");
        StringFog.decrypt("EZD1cf/PKY4Yj+5g\n", "dvyaE56jauE=\n");
        f2249 = StringFog.decrypt("F142qP7t1g==\n", "ejtbypufpXc=\n");
        f2248 = StringFog.decrypt("kCCFZx7nW4yP\n", "/En2E3uJPv4=\n");
        StringFog.decrypt("RH/F47MycjQ=\n", "JRuDitZeFkc=\n");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final LinkedHashMap m631() {
        LinkedHashMap linkedHashMap;
        String str = f2248;
        if (this.f2253 == null) {
            JSONObject jSONObjectOptJSONObject = this.f2263.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, new C0774(this.f2261, next, jSONObjectOptJSONObject.optJSONObject(next)));
                }
            } else {
                linkedHashMap = null;
            }
            this.f2253 = linkedHashMap;
        }
        return this.f2253;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0890 m632() {
        ArrayList arrayList;
        if (this.f2254 == null) {
            C0890 c0890 = new C0890(AbstractC1125.m830(this.f2263.optJSONObject(f2250), new C0857(this)), this.f2262, true);
            this.f2254 = c0890;
            JSONArray jSONArrayOptJSONArray = this.f2263.optJSONArray(f2249);
            int i = 0;
            if (jSONArrayOptJSONArray != null) {
                arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    String strM485 = AbstractC0475.m485(jSONArrayOptJSONArray.optString(i2));
                    if (strM485 != null) {
                        arrayList.add(strM485);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    c0890.f2388.put((String) obj, null);
                }
            }
        }
        return this.f2254;
    }

    public C0852(String str, C0890 c0890) {
        this.f2263 = IronSourceNetworkBridge.jsonObjectInit();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            this.f2263 = jSONObjectJsonObjectInit;
            this.f2262 = c0890;
            this.f2261 = jSONObjectJsonObjectInit.optString(StringFog.decrypt("XK3lJg==\n", "MsyIQ3M0Cac=\n"));
            this.f2260 = jSONObjectJsonObjectInit.optString(StringFog.decrypt("k8HrnLVgpJiWxf0=\n", "96iY7NkB3dY=\n"));
            this.f2259 = jSONObjectJsonObjectInit.optString(StringFog.decrypt("TR9IvmdMNQ==\n", "O3o6zQ4jW9A=\n"));
            this.f2258 = jSONObjectJsonObjectInit.optString(StringFog.decrypt("qwSRkRKA\n", "xm3/wnbrdEg=\n"));
            this.f2257 = jSONObjectJsonObjectInit.optString(StringFog.decrypt("xybglRB8\n", "qkeYxnQXRFY=\n"));
            if (jSONObjectJsonObjectInit.has(StringFog.decrypt("YNF+5K2vi0NpzmX1\n", "B70RhszDyCw=\n"))) {
                JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject(StringFog.decrypt("N5aaTvpfHG4+iYFf\n", "UPr1LJszXwE=\n"));
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.f2262.m646(next, jSONObjectOptJSONObject.opt(next));
                }
            }
        } catch (Throwable th) {
            AbstractC0914.m680(this.f2261, StringFog.decrypt("3RjGGu8uPfj9C8Ac82l+6fcE2hD+ejH4uAnbG/tnOQ==\n", "mGq0dZ0OXoo=\n"), th, null);
        }
    }
}
