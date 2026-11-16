package com.bytedance.adsdk.kgy;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ioy implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    public Object kgy(JSONObject jSONObject, Object[] objArr) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[2]);
        String strValueOf2 = String.valueOf(objArr[1]);
        String strValueOf3 = String.valueOf(objArr[0]);
        if (!TextUtils.isEmpty(strValueOf3) && jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("i18n")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strValueOf2)) != null) {
            String strOptString = jSONObjectOptJSONObject2.optString(strValueOf3);
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
        }
        return strValueOf;
    }
}
