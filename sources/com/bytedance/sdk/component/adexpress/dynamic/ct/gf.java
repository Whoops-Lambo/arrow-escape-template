package com.bytedance.sdk.component.adexpress.dynamic.ct;

import defpackage.h50;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class gf {
    private static void kgy(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61aveBWMRYniS0IVf9", "TuAkmg2WesiO", 65);
                }
            }
        }
    }

    public static String ahm(String str, String str2) {
        if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
            if (str.indexOf(46) < 0) {
                str = str.concat(".png");
            }
            return h50.i(str2, "static/images/", str);
        }
        return kgy.kgy(str);
    }

    public static JSONObject kgy(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectKo = com.bytedance.sdk.component.adexpress.ahm.ko(str);
        if (jSONObjectKo == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return kgy(jSONObject2, jSONObjectKo.optJSONObject("themeValues"), jSONObject);
    }

    public static void kgy(String str, JSONObject jSONObject) {
        JSONObject jSONObjectKo = com.bytedance.sdk.component.adexpress.ahm.ko(str);
        if (jSONObjectKo == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectKo.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        kgy(jSONObjectOptJSONObject, jSONObject);
    }

    public static JSONObject kgy(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61aveBWMRYniS0IVf9", "TuAkmg0=", 84);
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String kgy(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectKo = com.bytedance.sdk.component.adexpress.ahm.ko(str);
        if (jSONObjectKo == null || (jSONObjectOptJSONObject = jSONObjectKo.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String kgy(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectKo = com.bytedance.sdk.component.adexpress.ahm.ko(str);
        if (jSONObjectKo == null || (jSONObjectOptJSONObject = jSONObjectKo.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject kgy(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
