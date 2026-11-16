package com.adsurge.adn.Q;

import com.ironsource.R6;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class d extends c {
    public JSONObject a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;

    @Override // com.adsurge.adn.Q.c
    public boolean a() {
        return this.p;
    }

    @Override // com.adsurge.adn.Q.c
    public boolean b() {
        return this.f;
    }

    @Override // com.adsurge.adn.Q.c
    public String c() {
        return this.i;
    }

    @Override // com.adsurge.adn.Q.c
    public JSONObject d() {
        return this.a;
    }

    @Override // com.adsurge.adn.Q.c
    public String e() {
        return this.j;
    }

    @Override // com.adsurge.adn.Q.c
    public int f() {
        return this.h;
    }

    @Override // com.adsurge.adn.Q.c
    public String g() {
        return this.k;
    }

    @Override // com.adsurge.adn.Q.c
    public int h() {
        return this.n;
    }

    @Override // com.adsurge.adn.Q.c
    public boolean i() {
        return this.g;
    }

    @Override // com.adsurge.adn.Q.c
    public boolean j() {
        return this.l;
    }

    @Override // com.adsurge.adn.Q.c
    public boolean k() {
        return this.m;
    }

    @Override // com.adsurge.adn.Q.c
    public boolean l() {
        return this.o;
    }

    public d(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.a = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.b = jSONObject.optInt("end_card_type", 0);
        this.c = jSONObject.optInt("end_card_showtime", -1);
        if (jSONObject.optInt("clp") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        if (jSONObject.optInt("multi_reward") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.e = z2;
        if (jSONObject.optInt(R6.u1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f = z3;
        if (jSONObject.optInt("sppl") == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.g = z4;
        this.h = jSONObject.optInt("dlcte", -1);
        this.i = jSONObject.optString("fb", "");
        this.j = jSONObject.optString("nfb", "");
        this.k = jSONObject.optString("rat", "");
        if (jSONObject.optInt("wf") == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.l = z5;
        if (jSONObject.optInt("sewr") == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.m = z6;
        this.n = jSONObject.optInt("trt", 0);
        if (jSONObject.optInt("snf") == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.o = z7;
        this.p = jSONObject.optInt("etr") == 1;
    }
}
