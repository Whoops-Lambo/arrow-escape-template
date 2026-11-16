package com.adsurge.adn.E;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static c.C0071c a(c.C0071c c0071c) {
        if (c0071c == null) {
            return null;
        }
        c.C0071c c0071c2 = new c.C0071c();
        c0071c2.a = c0071c.a;
        a aVar = c0071c.b;
        c0071c2.b = aVar != null ? b.a(aVar) : null;
        return c0071c2;
    }

    public static JSONObject b(c.C0071c c0071c) {
        JSONObject jSONObject = new JSONObject();
        if (c0071c != null) {
            try {
                String str = c0071c.a;
                if (str != null) {
                    jSONObject.put("traceId", str);
                }
                a aVar = c0071c.b;
                if (aVar != null) {
                    JSONObject jSONObjectB = b.b(aVar);
                    if (jSONObjectB.length() > 0) {
                        jSONObject.put("adContext", jSONObjectB);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
