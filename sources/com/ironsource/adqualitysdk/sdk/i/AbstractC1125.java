package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ⅼ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1125 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final String f3265 = StringFog.decrypt("XxVMMKiic0tm\n", "FUYDfv3WGic=\n");

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static LinkedHashMap m830(JSONObject jSONObject, C0857 c0857) {
        AbstractC1090 abstractC1090M856;
        if (jSONObject == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c0857.getClass();
            try {
                String strOptString = jSONObject.optString(next);
                if (jSONObject.opt(next) instanceof String) {
                    strOptString = StringFog.decrypt("pQ==\n", "h0CuNpMNi4A=\n") + strOptString + StringFog.decrypt("pA==\n", "hmyjLfk4mg8=\n");
                }
                abstractC1090M856 = new C1154().m856(AbstractC0823.m625(c0857.f2268.f2261, strOptString, strOptString));
            } catch (Throwable th) {
                String str = c0857.f2268.f2261;
                StringBuilder sbM577 = AbstractC0688.m577("WJrOsvZZIihvm9Wz41k=\n", "Hei83YR5Ukk=\n", new StringBuilder(), next);
                sbM577.append(StringFog.decrypt("qRCpw6weyTY=\n", "iXPGrd9q8xY=\n"));
                sbM577.append(jSONObject.optString(next));
                AbstractC0914.m680(str, sbM577.toString(), th, null);
                abstractC1090M856 = null;
            }
            linkedHashMap.put(next, abstractC1090M856);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m835(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z) {
            jSONObject.remove(AbstractC1219.f3710);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List m831(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt != null) {
                arrayList.add(objOpt);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m834(JSONObject jSONObject, int i, HashMap map) {
        try {
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                    String strOptString = jSONArrayNames.optString(i2);
                    Object obj = null;
                    Integer num = map != null ? (Integer) map.get(strOptString) : null;
                    String strM829 = m829(jSONObject.opt(strOptString), num != null ? num.intValue() : i);
                    if (strM829 != null) {
                        if (!strM829.equals("")) {
                            obj = strM829;
                        }
                        jSONObject.put(strOptString, obj);
                    }
                }
            }
        } catch (JSONException e) {
            String str = f3265;
            AbstractC0509.m497(str, str, StringFog.decrypt("vTy/sykDrOyUJ6m9L0q06tgkvrM1\n", "+E7N3Fsj2o0=\n"), e, null, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m829(Object obj, int i) throws JSONException {
        if (obj instanceof JSONObject) {
            m834((JSONObject) obj, i, (HashMap) null);
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String strM829 = m829(jSONArray.opt(i2), i);
                    if (strM829 != null) {
                        jSONArray.put(i2, strM829);
                    }
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() <= i) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, i));
                return AbstractC1156.m868("XS1qGN4Ts94QYjBVzkg=\n", "cwNEMKphxrA=\n", sb);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m833(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.toString());
                if (z) {
                    jSONObjectJsonObjectInit.remove(AbstractC1219.f3710);
                }
                return jSONObjectJsonObjectInit;
            } catch (JSONException unused) {
            }
        }
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m832(int i, int i2, long j, long j2) {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            if (j > -1) {
                jSONObjectJsonObjectInit.put(StringFog.decrypt("rg==\n", "1tbCjpYGNRQ=\n"), i);
                jSONObjectJsonObjectInit.put(StringFog.decrypt("tw==\n", "zpI+vK6TTyQ=\n"), i2);
                jSONObjectJsonObjectInit.put(StringFog.decrypt("wA==\n", "tLQG2Fgb/UI=\n"), j);
                jSONObjectJsonObjectInit.put(StringFog.decrypt("Rg==\n", "M2aN0C1fiiU=\n"), j2);
                return jSONObjectJsonObjectInit;
            }
            jSONObjectJsonObjectInit.put(StringFog.decrypt("KQ==\n", "UUAHHGql/lw=\n"), -1);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("kw==\n", "6kegDbDBmQg=\n"), -1);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("Rg==\n", "MvjT1EyrmiU=\n"), -1);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("hA==\n", "8YXl33XjcaE=\n"), -1);
            return jSONObjectJsonObjectInit;
        } catch (JSONException e) {
            String str = f3265;
            AbstractC0509.m497(str, str, StringFog.decrypt("LlyxGFBRFkAOT7ceTBZVXgpdtyNNBBZaS0SwGEw=\n", "ay7DdyJxdTI=\n"), e, null, false);
            return jSONObjectJsonObjectInit;
        }
    }
}
