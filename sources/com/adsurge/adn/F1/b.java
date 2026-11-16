package com.adsurge.adn.F1;

import defpackage.nj;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class b {
    public String a;
    public JSONObject b;

    public String a() {
        StringBuilder sb = new StringBuilder("try {bridge.dispatch({'type':'");
        sb.append(this.a);
        sb.append("','param':");
        JSONObject jSONObject = this.b;
        return nj.q(sb, jSONObject == null ? "null" : JSONObject.quote(jSONObject.toString()), "})} catch(e) { console.log(e) }");
    }

    public b(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }
}
