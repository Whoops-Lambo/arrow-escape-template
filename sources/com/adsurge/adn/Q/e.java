package com.adsurge.adn.Q;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public abstract c a();

    public abstract void a(c cVar);

    public abstract int b();

    public abstract String c();

    public abstract JSONObject d();

    public JSONObject e() {
        JSONObject jSONObjectD = d();
        if (jSONObjectD == null) {
            jSONObjectD = new JSONObject();
        }
        c cVarA = a();
        if (cVarA != null && cVarA.d() != null) {
            try {
                jSONObjectD.put("ext", cVarA.d().toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObjectD;
    }
}
