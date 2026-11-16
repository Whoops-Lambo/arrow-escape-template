package com.adsurge.adn.E;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static void a(a aVar, JSONObject jSONObject) {
        if (aVar == null || jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("actionResult");
        if (jSONObjectOptJSONObject != null) {
            if (aVar.a == null) {
                aVar.a = new JSONObject();
            }
            a(aVar.a, jSONObjectOptJSONObject);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("custom");
        if (aVar.b != null && jSONObjectOptJSONObject2 != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObjectOptJSONObject2.opt(next);
                if (objOpt instanceof String) {
                    aVar.b.put(next, (String) objOpt);
                }
            }
        }
        Long l = aVar.c;
        if (l != null) {
            aVar.c = Long.valueOf(jSONObject.optLong("playBeginTs", l.longValue()));
        }
        Long l2 = aVar.d;
        if (l2 != null) {
            aVar.d = Long.valueOf(jSONObject.optLong("clickTs", l2.longValue()));
        }
        Long l3 = aVar.e;
        if (l3 != null) {
            aVar.e = Long.valueOf(jSONObject.optLong("videoPlayDur", l3.longValue()));
        }
    }

    public static JSONObject b(a aVar) {
        JSONObject jSONObject = new JSONObject();
        if (aVar != null) {
            try {
                JSONObject jSONObject2 = aVar.a;
                if (jSONObject2 != null) {
                    jSONObject.put("actionResult", a(jSONObject2));
                }
                if (aVar.b != null) {
                    jSONObject.put("custom", new JSONObject(aVar.b));
                }
                Long l = aVar.c;
                if (l != null) {
                    jSONObject.put("playBeginTs", l);
                }
                Long l2 = aVar.d;
                if (l2 != null) {
                    jSONObject.put("clickTs", l2);
                }
                Long l3 = aVar.e;
                if (l3 != null) {
                    jSONObject.put("videoPlayDur", l3);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static a a(a aVar) {
        if (aVar == null) {
            return null;
        }
        a aVar2 = new a();
        aVar2.a = a(aVar.a);
        aVar2.b = aVar.b != null ? new HashMap(aVar.b) : null;
        aVar2.c = aVar.c;
        aVar2.d = aVar.d;
        aVar2.e = aVar.e;
        return aVar2;
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, a(jSONObject.opt(next)));
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public static JSONArray a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(a(jSONArray.opt(i)));
        }
        return jSONArray2;
    }

    public static Object a(Object obj) {
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject2.opt(next);
                Object objOpt2 = jSONObject.opt(next);
                if ((objOpt2 instanceof JSONObject) && (objOpt instanceof JSONObject)) {
                    a((JSONObject) objOpt2, (JSONObject) objOpt);
                } else {
                    jSONObject.put(next, a(objOpt));
                }
            }
        } catch (JSONException unused) {
        }
    }
}
