package com.adsurge.adn.Q;

import android.text.TextUtils;
import com.adsurge.adn.x1.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g {
    public c a;
    public volatile String b;
    public String c;
    public int d;
    public volatile int e = -1;
    public boolean f = false;

    public abstract void a(int i);

    public abstract void a(e eVar);

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    public abstract e d();

    public abstract String e();

    public abstract String j();

    public abstract JSONObject k();

    public abstract int n();

    public abstract int s();

    public void a(c cVar) {
        this.a = cVar;
        e eVarD = d();
        if (eVarD == null) {
            eVarD = new f(new JSONObject());
            a(eVarD);
        }
        eVarD.a(cVar);
    }

    public c f() {
        return this.a;
    }

    public final int l() {
        return this.d;
    }

    public String o() {
        if (TextUtils.isEmpty(this.c)) {
            if (k() == null) {
                com.adsurge.adn.I0.e eVar = new com.adsurge.adn.I0.e();
                eVar.a("id", j());
                if (!TextUtils.isEmpty(e())) {
                    eVar.a("data", e());
                }
                a(eVar.a());
            }
            this.c = z().toString();
        }
        return this.c;
    }

    public final String r() {
        if (this.b == null && !TextUtils.isEmpty(e())) {
            synchronized (this) {
                try {
                    if (this.b == null && !TextUtils.isEmpty(e())) {
                        com.adsurge.adn.j0.e.a aVarB = com.adsurge.adn.p032j0.e.b();
                        try {
                            this.b = o.a(e());
                            if (TextUtils.isEmpty(this.b)) {
                                this.e = 7;
                                a();
                            } else {
                                this.b = new JSONObject(this.b).optString("origin_data");
                            }
                        } catch (Exception e) {
                            this.e = e instanceof JSONException ? 9 : 8;
                            a();
                        }
                        com.adsurge.adn.Y0.c cVar = new com.adsurge.adn.Y0.c();
                        cVar.f(j());
                        com.adsurge.adn.p032j0.e.b(2230100, aVarB, cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public boolean b() {
        return f().a();
    }

    public boolean c() {
        return f().b();
    }

    public String g() {
        return f().c();
    }

    public int h() {
        return d().b();
    }

    public String i() {
        return d().c();
    }

    public String m() {
        return f().e();
    }

    public int p() {
        return f().f();
    }

    public int q() {
        return f().h();
    }

    public void t() {
        int i;
        if (TextUtils.isEmpty(e())) {
            i = 4;
        } else {
            i = 1;
        }
        this.d = i;
        if (n() == 3) {
            a(0);
        }
        if (d() != null) {
            a(d().a());
        }
    }

    public boolean u() {
        if (!TextUtils.isEmpty(d().c()) && d().b() > 0) {
            return false;
        }
        return true;
    }

    public boolean v() {
        return f().i();
    }

    public boolean w() {
        return f().j();
    }

    public boolean x() {
        return f().k();
    }

    public boolean y() {
        return f().l();
    }

    public JSONObject z() {
        JSONObject jSONObjectK = k();
        if (jSONObjectK == null) {
            jSONObjectK = new JSONObject();
        }
        e eVarD = d();
        if (eVarD != null) {
            try {
                jSONObjectK.put("dsl_pro", eVarD.e().toString());
            } catch (Exception unused) {
            }
        }
        return jSONObjectK;
    }

    public final void a() {
        this.b = null;
        a((String) null);
    }
}
