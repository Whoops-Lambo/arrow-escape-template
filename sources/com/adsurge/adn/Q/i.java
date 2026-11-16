package com.adsurge.adn.Q;

import com.ironsource.C4664b4;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class i extends g {
    public JSONObject g;
    public int h;
    public String i;
    public String j;
    public int k;
    public e l;

    @Override // com.adsurge.adn.Q.g
    public void a(e eVar) {
        this.l = this.l;
    }

    public void b(int i) {
        this.h = i;
    }

    @Override // com.adsurge.adn.Q.g
    public e d() {
        return this.l;
    }

    @Override // com.adsurge.adn.Q.g
    public String e() {
        return this.j;
    }

    @Override // com.adsurge.adn.Q.g
    public String j() {
        return this.i;
    }

    @Override // com.adsurge.adn.Q.g
    public JSONObject k() {
        return this.g;
    }

    @Override // com.adsurge.adn.Q.g
    public int n() {
        return this.k;
    }

    @Override // com.adsurge.adn.Q.g
    public int s() {
        return this.h;
    }

    public i(JSONObject jSONObject) {
        this.g = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.h = jSONObject.optInt("ver", 0);
        this.i = jSONObject.optString("id", "");
        this.j = jSONObject.optString("data", "");
        this.k = jSONObject.optInt(C4664b4.i.n, 0);
        this.l = new f(new com.adsurge.adn.I0.e(jSONObject.optString("dsl_pro")).a());
        t();
    }

    public void b(String str) {
        this.i = str;
    }

    @Override // com.adsurge.adn.Q.g
    public void a(String str) {
        this.j = str;
    }

    @Override // com.adsurge.adn.Q.g
    public void a(int i) {
        this.k = i;
    }

    @Override // com.adsurge.adn.Q.g
    public void a(JSONObject jSONObject) {
        this.g = jSONObject;
    }
}
