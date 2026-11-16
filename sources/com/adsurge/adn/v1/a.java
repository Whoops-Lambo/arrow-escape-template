package com.adsurge.adn.v1;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static String a(com.adsurge.adn.p006a1.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = com.adsurge.adn.Z0.a.a().optJSONObject("custom_info");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("dark_mode_info");
        } else {
            jSONObjectOptJSONObject = null;
        }
        if (jSONObjectOptJSONObject == null || aVar == null) {
            return "false";
        }
        return jSONObjectOptJSONObject.optString(aVar.c(), "false");
    }
}
