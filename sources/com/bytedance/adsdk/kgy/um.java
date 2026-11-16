package com.bytedance.adsdk.kgy;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class um implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public Integer kgy(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr != null && objArr.length != 0 && (obj = objArr[0]) != null) {
            if (obj instanceof String) {
                return Integer.valueOf(((String) obj).length());
            }
            if (obj instanceof Set) {
                return Integer.valueOf(((Set) obj).size());
            }
            if (obj instanceof List) {
                return Integer.valueOf(((List) obj).size());
            }
            if (obj instanceof Map) {
                return Integer.valueOf(((Map) obj).size());
            }
            if (obj.getClass().isArray()) {
                return Integer.valueOf(Array.getLength(obj));
            }
            if (obj instanceof Number) {
                return Integer.valueOf(obj.toString().length());
            }
            if (obj instanceof JSONObject) {
                return Integer.valueOf(((JSONObject) obj).length());
            }
            if (obj instanceof JSONArray) {
                return Integer.valueOf(((JSONArray) obj).length());
            }
        }
        return 0;
    }
}
