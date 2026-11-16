package com.bytedance.adsdk.kgy;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kus implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public Boolean kgy(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj == null) {
                return Boolean.TRUE;
            }
            if (obj instanceof String) {
                return Boolean.valueOf(TextUtils.isEmpty((String) obj));
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return Boolean.FALSE;
            }
            if (obj instanceof JSONArray) {
                return Boolean.valueOf(((JSONArray) obj).length() == 0);
            }
        }
        return Boolean.TRUE;
    }
}
