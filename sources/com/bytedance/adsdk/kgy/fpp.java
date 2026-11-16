package com.bytedance.adsdk.kgy;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fpp implements dg {
    private JSONArray ahm(Object obj, Object[] objArr) {
        int iKgy;
        int iKgy2;
        JSONArray jSONArray = (JSONArray) obj;
        Object obj2 = objArr.length >= 2 ? objArr[1] : null;
        Object obj3 = objArr.length >= 3 ? objArr[2] : null;
        int length = jSONArray.length();
        if (obj2 == null || (iKgy = kgy(obj2, 0)) < 0) {
            iKgy = 0;
        } else if (iKgy > length) {
            iKgy = length;
        }
        if (obj3 != null && (iKgy2 = kgy(obj3, 0)) >= 0 && iKgy2 <= length) {
            length = iKgy2;
        }
        if (iKgy > length) {
            iKgy = length;
        }
        JSONArray jSONArray2 = new JSONArray();
        while (iKgy < length) {
            jSONArray2.put(jSONArray.opt(iKgy));
            iKgy++;
        }
        return jSONArray2;
    }

    private String kgy(Object obj, Object[] objArr) {
        String string;
        int iKgy;
        int iKgy2;
        if (obj instanceof String) {
            string = (String) obj;
        } else {
            string = obj instanceof Number ? obj.toString() : "";
        }
        Object obj2 = objArr.length >= 2 ? objArr[1] : null;
        Object obj3 = objArr.length >= 3 ? objArr[2] : null;
        int length = string.length();
        if (obj2 == null || (iKgy = kgy(obj2, 0)) < 0) {
            iKgy = 0;
        } else if (iKgy > length) {
            iKgy = length;
        }
        if (obj3 != null && (iKgy2 = kgy(obj3, 0)) >= 0 && iKgy2 <= length) {
            length = iKgy2;
        }
        if (iKgy > length) {
            iKgy = length;
        }
        return string.substring(iKgy, length);
    }

    @Override // com.bytedance.adsdk.kgy.dg
    public Object kgy(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String) && !(obj instanceof Number)) {
            if (obj instanceof JSONArray) {
                return ahm(obj, objArr);
            }
            return null;
        }
        return kgy(obj, objArr);
    }

    private int kgy(Object obj, int i) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return (int) Double.parseDouble((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }
}
