package com.adsurge.adn.Q;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class f extends e {
    public JSONObject a;
    public String b;
    public int c;
    public c d;

    @Override // com.adsurge.adn.Q.e
    public c a() {
        return this.d;
    }

    @Override // com.adsurge.adn.Q.e
    public int b() {
        return this.c;
    }

    @Override // com.adsurge.adn.Q.e
    public String c() {
        return this.b;
    }

    @Override // com.adsurge.adn.Q.e
    public JSONObject d() {
        return this.a;
    }

    public f(JSONObject jSONObject) {
        this.a = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.b = jSONObject.optString("freq_key", "");
        this.c = jSONObject.optInt("freq_count", 0);
        this.d = new d(new com.adsurge.adn.I0.e(jSONObject.optString("ext")).a());
    }

    @Override // com.adsurge.adn.Q.e
    public void a(c cVar) {
        this.d = cVar;
    }
}
