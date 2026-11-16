package com.adsurge.adn.p044n0;

import com.adsurge.adn.J0.a;
import com.adsurge.adn.p026h0.e;
import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p064w0.b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public final int a;
    public final String b;
    public JSONObject c;
    public final String d;
    public final String e;
    public final JSONObject f;
    public final JSONObject g;
    public final boolean h;
    public final String i;
    public final String j;
    public final Map k;
    public final int l;
    public boolean m;
    public int n;
    public com.adsurge.adn.p026h0.c o;
    public int p;
    public final String q;

    public final void e() {
        this.p = 0;
        this.m = false;
        this.n = 0;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || this.k == null || jSONObject.length() <= 0 || this.k.size() <= 0) {
            return;
        }
        for (Map.Entry entry : this.k.entrySet()) {
            Object objD = (this.m ? (h) entry.getValue() : ((com.adsurge.adn.p035k0.c) entry.getValue()).a()).d(jSONObject);
            if (objD != null) {
                a((String) entry.getKey(), objD);
            }
        }
        this.m = true;
    }

    public int c() {
        return this.n;
    }

    public void d() {
        this.p++;
    }

    public c(e eVar) {
        this.m = false;
        this.n = 0;
        this.a = eVar.a;
        this.b = eVar.b;
        this.d = eVar.c;
        String str = eVar.d;
        this.q = str;
        this.c = new com.adsurge.adn.I0.e(str).a();
        this.k = eVar.e;
        this.e = eVar.f;
        this.f = eVar.g;
        this.g = eVar.h;
        this.h = eVar.i;
        this.i = eVar.j;
        this.j = eVar.k;
        this.l = eVar.l;
        e();
    }

    public void b() {
        e();
        this.c = new com.adsurge.adn.I0.e(this.q).a();
    }

    public c(int i, String str, JSONObject jSONObject) {
        this.m = false;
        this.n = 0;
        this.a = i;
        this.b = str;
        this.d = null;
        this.q = jSONObject.toString();
        this.c = jSONObject;
        this.k = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = null;
        this.l = 0;
        e();
    }

    public c(int i, String str) {
        this(i, str, new JSONObject());
    }

    public void a(String str, Object obj) {
        try {
            this.c.putOpt(str, obj);
        } catch (JSONException e) {
            a.a(e.getMessage(), e);
        }
    }

    public void a(b bVar, i iVar) {
        Map map = this.k;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : this.k.entrySet()) {
            bVar.j().a(iVar, (com.adsurge.adn.p035k0.c) entry.getValue(), this, (String) entry.getKey());
        }
    }

    public void a(int i) {
        this.n = i;
    }

    public boolean a() {
        int i = this.l;
        return i == 0 || i > this.p;
    }

    public void a(com.adsurge.adn.p026h0.c cVar) {
        this.o = cVar;
    }
}
