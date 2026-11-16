package com.bytedance.adsdk.kgy;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class vs implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    public Object kgy(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        int i = 0;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (obj == null || !(obj2 instanceof String)) {
            return null;
        }
        String str = (String) obj2;
        StringBuilder sb = new StringBuilder();
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            while (i < jSONArray.length()) {
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(String.valueOf(jSONArray.opt(i)));
                i++;
            }
        } else {
            if (!obj.getClass().isArray()) {
                return String.valueOf(obj);
            }
            Object[] objArr2 = (Object[]) obj;
            while (i < objArr2.length) {
                if (i > 0) {
                    sb.append(str);
                }
                sb.append(String.valueOf(objArr2[i]));
                i++;
            }
        }
        return sb.toString();
    }
}
