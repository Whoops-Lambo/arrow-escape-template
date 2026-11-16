package com.adsurge.adn.F1;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class e {
    public String a;
    public String b;
    public a c;
    public int d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        OK,
        ERROR,
        HANDLER_NOT_FOUND_EXCEPTION,
        JSON_PARSE_EXCEPTION
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("callbackid", this.a);
            jSONObject.put("status", this.c.ordinal());
            jSONObject.put("data", this.b);
            jSONObject.put("keep", this.d);
        } catch (JSONException unused) {
        }
        return "bridge.callback(" + jSONObject.toString() + ");";
    }

    public e(d dVar, a aVar, String str) {
        this.d = 0;
        this.a = dVar.b();
        this.c = aVar;
        this.b = str;
    }

    public e(d dVar, a aVar, String str, int i) {
        this(dVar, aVar, str);
        this.d = i;
    }
}
