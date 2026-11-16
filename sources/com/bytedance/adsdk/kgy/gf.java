package com.bytedance.adsdk.kgy;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class gf implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public String kgy(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objKgy = com.bytedance.adsdk.kgy.ahm.kgy.kgy(strValueOf2).kgy(jSONObject2);
            if (objKgy != null && !TextUtils.isEmpty(String.valueOf(objKgy))) {
                return String.valueOf(objKgy);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
