package com.bytedance.adsdk.kgy;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    public Object kgy(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 2) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArrayKgy = kgy(objArr[0]);
            if (jSONArrayKgy != null) {
                int i = Integer.parseInt(String.valueOf(objArr[1]));
                for (int i2 = 0; i2 < jSONArrayKgy.length(); i2 += i) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = i2 + i3;
                        if (i4 >= jSONArrayKgy.length()) {
                            break;
                        }
                        jSONArray2.put(jSONArrayKgy.opt(i4));
                    }
                    jSONObject2.put("$chunk", jSONArray2);
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    private JSONArray kgy(Object obj) {
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj != null && obj.getClass().isArray()) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                jSONArray.put(obj2);
            }
            return jSONArray;
        }
        try {
            return new JSONArray(String.valueOf(obj));
        } catch (JSONException unused) {
            return null;
        }
    }
}
