package com.adsurge.adn.Y0;

import android.text.TextUtils;
import com.ironsource.Ba;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class c {
    public final JSONObject a = new JSONObject();
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public int h;
    public String i;
    public String j;
    public int k;
    public g l;

    public static c a(g gVar) {
        c cVar = new c();
        if (gVar != null) {
            cVar.l = gVar;
            cVar.e(gVar.l());
            cVar.a(gVar.m());
            cVar.b(gVar.d());
            cVar.b(gVar);
            cVar.b(gVar.k());
            cVar.a(gVar.i());
            cVar.a(gVar.g() || gVar.a() > 0);
            String strF = gVar.f();
            if (!TextUtils.isEmpty(strF)) {
                cVar.f(strF);
            }
            if (gVar.b() != Integer.MIN_VALUE) {
                cVar.c(gVar.b());
            }
            if (!TextUtils.isEmpty(gVar.c())) {
                cVar.d(gVar.c());
            }
            cVar.c(gVar.j());
        }
        return cVar;
    }

    public c b(g gVar) {
        if (com.adsurge.adn.K.b.a("traceid")) {
            return this;
        }
        if (TextUtils.isEmpty(gVar.e())) {
            g(gVar.h());
            return this;
        }
        g(gVar.e());
        return this;
    }

    public c c(String str) {
        if (com.adsurge.adn.K.b.a("crtid")) {
            return this;
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.j = str;
        a("crtid", str);
        return this;
    }

    public c d(String str) {
        if (com.adsurge.adn.K.b.a("inex")) {
            return this;
        }
        a("inex", str);
        return this;
    }

    public c e(String str) {
        if (com.adsurge.adn.K.b.a("pid")) {
            return this;
        }
        this.b = str;
        a("pid", str);
        return this;
    }

    public c f(String str) {
        if (com.adsurge.adn.K.b.a("tid")) {
            return this;
        }
        if (str != null && str.length() <= 0) {
            str = null;
        }
        this.i = str;
        a("tid", str);
        return this;
    }

    public c g(String str) {
        if (com.adsurge.adn.K.b.a("traceid")) {
            return this;
        }
        this.e = str;
        a("traceid", str);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }

    public c c(int i) {
        if (com.adsurge.adn.K.b.a("rt")) {
            return this;
        }
        this.k = i;
        a("rt", Integer.valueOf(i));
        return this;
    }

    public JSONObject c() {
        if (this.a.length() > 0) {
            return this.a;
        }
        return null;
    }

    public c b(String str) {
        if (com.adsurge.adn.K.b.a("cid")) {
            return this;
        }
        this.d = str;
        a("cid", str);
        return this;
    }

    public String b() {
        return this.e;
    }

    public c b(int i) {
        if (com.adsurge.adn.K.b.a("pt")) {
            return this;
        }
        this.f = i;
        a("pt", Integer.valueOf(i));
        return this;
    }

    public c a(String str) {
        if (com.adsurge.adn.K.b.a(Ba.b)) {
            return this;
        }
        this.c = str;
        a(Ba.b, str);
        return this;
    }

    public c a(f fVar) {
        if (!com.adsurge.adn.K.b.a("adt") && fVar != null) {
            int iA = fVar.a();
            this.g = iA;
            a("adt", Integer.valueOf(iA));
        }
        return this;
    }

    public c a(int i) {
        if (com.adsurge.adn.K.b.a("adt")) {
            return this;
        }
        this.g = i;
        a("adt", Integer.valueOf(i));
        return this;
    }

    public c a(boolean z) {
        if (com.adsurge.adn.K.b.a("vdo")) {
            return this;
        }
        int i = z ? 2 : 1;
        this.h = i;
        a("vdo", Integer.valueOf(i));
        return this;
    }

    public String a() {
        return this.i;
    }

    public void a(String str, Object obj) {
        if (com.adsurge.adn.K.b.a(str)) {
            return;
        }
        try {
            this.a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
