package com.adsurge.adn.E;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static void a(d dVar, JSONObject jSONObject) {
        Integer num;
        if (dVar == null || jSONObject == null || (num = dVar.a) == null) {
            return;
        }
        dVar.a = Integer.valueOf(jSONObject.optInt("state", num.intValue()));
    }

    public static JSONObject b(d dVar) {
        JSONObject jSONObject = new JSONObject();
        if (dVar != null) {
            try {
                Integer num = dVar.a;
                if (num != null) {
                    jSONObject.put("state", num);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static d a(d dVar) {
        if (dVar == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.a = dVar.a;
        return dVar2;
    }
}
