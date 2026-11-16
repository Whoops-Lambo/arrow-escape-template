package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class IAConfigManager {
    public static long R;
    public final com.fyber.inneractive.sdk.util.y0 A;
    public g B;
    public m C;
    public com.fyber.inneractive.sdk.network.v0 D;
    public h E;
    public final com.fyber.inneractive.sdk.ignite.h F;
    public final com.fyber.inneractive.sdk.cache.l G;
    public final com.fyber.inneractive.sdk.network.f H;
    public final HashMap I;
    public final com.fyber.inneractive.sdk.serverapi.extradata.d J;
    public final AtomicBoolean K;
    public com.fyber.inneractive.sdk.measurement.e L;
    public WebView M;
    public final com.fyber.inneractive.sdk.config.global.r N;
    public com.fyber.inneractive.sdk.config.cellular.a O;
    public final AtomicBoolean P;
    public HashMap a = new HashMap();
    public HashMap b = new HashMap();
    public String c;
    public String d;
    public String e;
    public volatile Integer f;
    public Context g;
    public final CopyOnWriteArrayList h;
    public boolean i;
    public final p0 j;
    public InneractiveUserConfig k;
    public boolean l;
    public String m;
    public InneractiveMediationName n;
    public String o;
    public String p;
    public ArrayList q;
    public boolean r;
    public final com.fyber.inneractive.sdk.network.l0 s;
    public String t;
    public v u;
    public j v;
    public w w;
    public final c1 x;
    public t1 y;
    public com.fyber.inneractive.sdk.config.global.a z;
    public static final IAConfigManager Q = new IAConfigManager();
    public static final k0 S = new k0();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        Q.h.add(onConfigurationReadyAndValidListener);
    }

    public static JSONArray b() {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = Q.J;
        dVar.getClass();
        JSONArray jSONArray = (JSONArray) dVar.a(new JSONArray(), new com.fyber.inneractive.sdk.serverapi.extradata.b());
        if (jSONArray == null) {
            IAlog.a("%sExtra data JSON is empty", "UserExtraDataManager");
            return null;
        }
        IAlog.a("%sReturning extra data JSON objects", "UserExtraDataManager");
        return jSONArray;
    }

    public static boolean c() {
        h hVar = Q.E;
        if (hVar == null) {
            return false;
        }
        return hVar.i();
    }

    public static boolean d() {
        IAConfigManager iAConfigManager = Q;
        boolean z = iAConfigManager.e != null;
        int i = n.a;
        boolean zBooleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z && System.currentTimeMillis() - R > 3600000) || zBooleanValue) {
            if (zBooleanValue) {
                v vVar = iAConfigManager.u;
                vVar.d = false;
                com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.util.l(vVar.e));
            }
            a();
            com.fyber.inneractive.sdk.web.b1 b1Var = com.fyber.inneractive.sdk.web.b1.c;
            b1Var.getClass();
            com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.web.a1(b1Var));
        }
        return z;
    }

    public static void e() {
        Integer numG;
        Integer numF;
        IAConfigManager iAConfigManager = Q;
        iAConfigManager.K.set(true);
        if (iAConfigManager.P.compareAndSet(false, true)) {
            h hVar = iAConfigManager.E;
            if (hVar != null) {
                numF = hVar.f();
                numG = hVar.g();
            } else {
                numG = null;
                numF = null;
            }
            new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED).a("cmp_id", numF, "cmp_version", numG).a((String) null);
        }
    }

    public static void f() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static boolean g() {
        IAConfigManager iAConfigManager = Q;
        Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.N.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c(com.ironsource.mediationsdk.metadata.a.k);
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        IAlog.a("OMSDK AB %s", String.valueOf(zBooleanValue));
        if (zBooleanValue) {
            com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.L;
            return eVar == null || !eVar.a;
        }
        IAlog.a("OM SDK disabled", new Object[0]);
        IAlog.d("OM SDK disabled", new Object[0]);
        return false;
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        Q.h.remove(onConfigurationReadyAndValidListener);
    }

    public final void a(boolean z, Exception exc) {
        for (OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener : this.h) {
            if (onConfigurationReadyAndValidListener != null) {
                IAlog.e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z, !z ? exc : null);
            }
        }
    }

    public IAConfigManager() {
        new HashSet();
        this.i = false;
        this.j = new p0();
        this.l = false;
        this.r = false;
        this.s = new com.fyber.inneractive.sdk.network.l0();
        this.t = "";
        this.x = new c1();
        this.A = new com.fyber.inneractive.sdk.util.y0();
        this.F = new com.fyber.inneractive.sdk.ignite.h();
        this.G = new com.fyber.inneractive.sdk.cache.l();
        this.H = new com.fyber.inneractive.sdk.network.f();
        this.I = new HashMap();
        new AtomicBoolean();
        this.K = new AtomicBoolean(false);
        this.N = com.fyber.inneractive.sdk.config.global.r.a();
        this.P = new AtomicBoolean(false);
        this.h = new CopyOnWriteArrayList();
        this.J = new com.fyber.inneractive.sdk.serverapi.extradata.d();
    }

    public static void a() {
        IAConfigManager iAConfigManager = Q;
        g gVar = iAConfigManager.B;
        if (gVar != null) {
            iAConfigManager.s.a(gVar);
        }
        v vVar = iAConfigManager.u;
        if (vVar.d) {
            return;
        }
        iAConfigManager.s.a(new com.fyber.inneractive.sdk.network.v0(new s(vVar), vVar.a, vVar.e));
    }
}
