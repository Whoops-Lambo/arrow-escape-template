package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class t0 {
    public volatile boolean a;
    public final f0 b;
    public final h c;
    public p0 d;
    public l e;
    public volatile i1 f;
    public final String g;
    public final com.fyber.inneractive.sdk.config.global.r h;
    public long i;
    public long j;
    public int k;
    public boolean l;
    public boolean m;
    public final Object n;
    public boolean o;
    public HashMap p;

    public abstract o0 a(l lVar, Map map, int i);

    public byte[] f() {
        return null;
    }

    public abstract int g();

    public String h() {
        return null;
    }

    public a i() {
        return null;
    }

    public Map l() {
        return null;
    }

    public abstract m0 m();

    public abstract g1 o();

    public abstract String r();

    public abstract boolean u();

    public final com.fyber.inneractive.sdk.response.e a(int i, o oVar, com.fyber.inneractive.sdk.response.j jVar) throws n0 {
        try {
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(i);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.a;
            com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) fVar.a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar != null ? eVar.b() : null;
            if (bVarB == null) {
                IAlog.f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i));
                if (fVar.a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new n0("Could not find parser for ad type " + i);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i), bVarB);
            if (jVar != null) {
                bVarB.c = jVar;
            }
            bVarB.a = bVarB.a();
            if (oVar != null) {
                bVarB.c = new com.fyber.inneractive.sdk.response.k(oVar);
            }
            com.fyber.inneractive.sdk.response.e eVarA = bVarB.a(null);
            eVarA.H = j();
            p0 p0Var = this.d;
            if (p0Var != null) {
                p0Var.a("sdkParsedResponse");
            }
            return eVarA;
        } catch (Exception e) {
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e.getMessage());
            throw new n0(e);
        }
    }

    public void b(long j) {
        synchronized (this.n) {
            try {
                if (this.m) {
                    this.k = (int) ((j - this.i) + ((long) this.k));
                    this.m = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(long j) {
        synchronized (this.n) {
            try {
                if (!this.l) {
                    this.l = true;
                    this.j = j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        boolean z;
        synchronized (this.n) {
            z = this.l;
        }
        if (z) {
            a(System.currentTimeMillis());
        } else if (t()) {
            b(System.currentTimeMillis());
        }
    }

    public void e() {
        try {
            l lVar = this.e;
            if (lVar != null) {
                lVar.a();
            }
            this.c.getClass();
        } catch (Exception unused) {
        }
    }

    public int j() {
        return this.k;
    }

    public com.fyber.inneractive.sdk.config.global.r k() {
        return this.h;
    }

    public String n() {
        return "application/json; charset=utf-8";
    }

    public l1 p() {
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        return new l1(iAConfigManager.u.b.a("connect_timeout", 5000, 1), iAConfigManager.u.b.a("read_timeout", 5000, 1));
    }

    public int q() {
        int i;
        synchronized (this.n) {
            i = this.k;
        }
        return i;
    }

    public int s() {
        Integer numA;
        com.fyber.inneractive.sdk.config.global.r rVar = this.h;
        if (rVar == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.l) rVar.a(com.fyber.inneractive.sdk.config.global.features.l.class)).a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return numA.intValue();
    }

    public final boolean t() {
        boolean z;
        synchronized (this.n) {
            z = this.m;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final boolean v() {
        boolean z;
        if (this.o) {
            com.fyber.inneractive.sdk.config.global.features.l lVar = (com.fyber.inneractive.sdk.config.global.features.l) IAConfigManager.Q.N.a(com.fyber.inneractive.sdk.config.global.features.l.class);
            Boolean boolC = lVar.c("should_add_request_watchdog");
            if (boolC != null ? boolC.booleanValue() : false) {
                z = true;
            } else {
                Boolean boolC2 = lVar.c("should_report_request_watchdog");
                if (boolC2 != null ? boolC2.booleanValue() : false) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public t0(t0 t0Var) {
        this.a = false;
        this.f = i1.INITIAL;
        this.i = 0L;
        this.j = 0L;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.n = new Object();
        this.o = false;
        this.b = t0Var.b;
        this.c = t0Var.c;
        this.g = UUID.randomUUID().toString();
        this.h = t0Var.h;
        this.k = t0Var.k;
        this.i = t0Var.i;
        this.j = t0Var.j;
    }

    public void c() {
        this.a = true;
    }

    public void d(long j) {
        synchronized (this.n) {
            try {
                if (!this.m) {
                    this.m = true;
                    this.i = j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public t0(f0 f0Var, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.a = false;
        this.f = i1.INITIAL;
        this.i = 0L;
        this.j = 0L;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.n = new Object();
        this.o = false;
        this.b = f0Var;
        this.c = hVar;
        this.g = UUID.randomUUID().toString();
        this.h = rVar;
    }

    public void a(o0 o0Var, String str, String str2) {
    }

    public l a(String str) throws Exception {
        try {
            p0 p0Var = this.d;
            if (p0Var != null) {
                p0Var.a("sdkInitNetworkRequest");
            }
            this.e = this.c.a(this, com.fyber.inneractive.sdk.util.o.e(), str);
            p0 p0Var2 = this.d;
            if (p0Var2 != null) {
                p0Var2.a("sdkGotServerResponse");
            }
            return this.e;
        } catch (b e) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e.getMessage());
            throw e;
        } catch (q1 e2) {
            IAlog.a("failed read network response for url: %s msg: %s", r(), e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e3.getMessage());
            throw e3;
        }
    }

    public void a(Object obj, Exception exc, boolean z, HashMap map) {
        p0 p0Var;
        if (!z) {
            i1 i1Var = i1.RESOLVED;
            this.f = i1Var;
            if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var = this.d) != null) {
                p0Var.a("sdkRequestEndedButWillBeRetried");
            }
        }
        com.fyber.inneractive.sdk.util.r.b.post(new s0(this, obj, exc, z));
    }

    public static int a(Map map) {
        List list = map != null ? (List) map.get("Content-Length") : null;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return com.fyber.inneractive.sdk.util.v.a((String) list.get(0), -1);
    }

    public void a(long j) {
        synchronized (this.n) {
            try {
                if (this.l) {
                    this.k = (int) ((j - this.j) + ((long) this.k));
                    this.l = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
