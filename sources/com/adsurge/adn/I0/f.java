package com.adsurge.adn.I0;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) throws JSONException {
        if (jSONObject != jSONObject2) {
            if (b(jSONObject)) {
                return jSONObject2;
            }
            if (!b(jSONObject2)) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    Object objOpt2 = jSONObject2.opt(next);
                    if (objOpt == null) {
                        jSONObject.put(next, objOpt2);
                    } else if ((objOpt instanceof JSONObject) && (objOpt2 instanceof JSONObject)) {
                        a((JSONObject) objOpt, (JSONObject) objOpt2, z);
                    } else if ((objOpt instanceof JSONArray) && (objOpt2 instanceof JSONArray)) {
                        a((JSONArray) objOpt, (JSONArray) objOpt2);
                    } else if (z && (objOpt2 instanceof Number) && (objOpt instanceof Number)) {
                        jSONObject.put(next, objOpt2);
                    } else if (z && objOpt.getClass().isInstance(objOpt2)) {
                        jSONObject.put(next, objOpt2);
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() <= 0;
    }

    public static boolean b(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() <= 0;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        return a(jSONObject, jSONObject2, true);
    }

    public static JSONArray a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray != jSONArray2) {
            if (b(jSONArray)) {
                return jSONArray2;
            }
            if (!b(jSONArray2)) {
                for (int i = 0; i < jSONArray2.length(); i++) {
                    jSONArray.put(jSONArray2.get(i));
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        e eVar = new e();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                objOpt = a((JSONObject) objOpt);
            } else if (objOpt instanceof JSONArray) {
                objOpt = a((JSONArray) objOpt);
            }
            eVar.a(next, objOpt);
        }
        return eVar.a();
    }

    public static JSONArray a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                objOpt = a((JSONObject) objOpt);
            } else if (objOpt instanceof JSONArray) {
                objOpt = a((JSONArray) objOpt);
            }
            jSONArray2.put(objOpt);
        }
        return jSONArray2;
    }
}
