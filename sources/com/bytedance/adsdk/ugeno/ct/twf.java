package com.bytedance.adsdk.ugeno.ct;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class twf {
    public static yo.kgy kgy(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        yo.kgy kgyVar = new yo.kgy();
        String strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(str, jSONObject);
        if (strKgy.contains("#")) {
            strKgy = strKgy.replace("#", "%23");
        }
        Uri uri = Uri.parse(strKgy);
        if (uri == null) {
            return null;
        }
        kgyVar.rz(strKgy);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            kgyVar.kgy(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        kgyVar.ahm(authority);
        kgyVar.uq(kgyVar.kgy() + "://" + kgyVar.ahm());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.uq.ahm.kgy(uri.getQueryParameter(str2), jSONObject));
            }
        }
        kgyVar.kgy(map);
        return kgyVar;
    }

    public static yo.kgy kgy(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        yo.kgy kgyVar = new yo.kgy();
        String strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("protocol"), jSONObject2);
        kgyVar.ahm(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("name"), jSONObject2));
        if (TextUtils.isEmpty(strKgy)) {
            kgyVar.kgy("global");
        } else {
            kgyVar.kgy(strKgy);
        }
        kgyVar.uq(kgyVar.kgy() + "://" + kgyVar.ahm());
        kgyVar.rz(String.valueOf(jSONObject.hashCode()));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("args");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObjectOptJSONObject.opt(next), jSONObject2));
            }
        }
        kgyVar.kgy(map);
        return kgyVar;
    }
}
