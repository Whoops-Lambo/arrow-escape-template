package com.mbridge.msdk.setting;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import defpackage.h50;
import defpackage.mc3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class i {
    public static final String a = "i";
    private static volatile i b;
    private static volatile g c;
    private static volatile String d;
    private static HashMap<String, m> e = new HashMap<>();
    private static AtomicBoolean f = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void j(String str) {
        try {
            String strA = com.mbridge.msdk.config.component.common.util.c.a(str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(strA);
            if (jSONObjectJsonObjectInit.has("b")) {
                jSONObjectJsonObjectInit.remove("b");
            }
            if (jSONObjectJsonObjectInit.has("c")) {
                jSONObjectJsonObjectInit.remove("c");
            }
            h.a(jSONObjectJsonObjectInit);
            d = jSONObjectJsonObjectInit.toString();
            c = g.F(d);
            if (c != null) {
                c.R0();
            }
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
    }

    public g f(String str) {
        if (c == null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    b(str);
                }
            } catch (Exception e2) {
                q0.b(a, e2.getMessage());
            }
        }
        return c;
    }

    private i() {
    }

    public static void a(Context context, String str) {
        FastKV fastKVBuild;
        Map<String, Object> all = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                fastKVBuild = null;
            }
        } else {
            fastKVBuild = null;
        }
        if (fastKVBuild != null) {
            try {
                all = fastKVBuild.getAll();
            } catch (Exception unused2) {
            }
            if (all != null) {
                try {
                    for (String str2 : all.keySet()) {
                        if (str2.startsWith(str + "_")) {
                            e.put(str2, m.k((String) all.get(str2)));
                        }
                    }
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            return;
        }
        try {
            Map<String, ?> all2 = context.getSharedPreferences("mbridge", 0).getAll();
            for (String str3 : all2.keySet()) {
                if (str3.startsWith(str + "_")) {
                    e.put(str3, m.k((String) all2.get(str3)));
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private m b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
        }
        String strI = h50.i(str, "_", str2);
        if (e.containsKey(strI)) {
            return e.get(strI);
        }
        m mVarK = null;
        try {
            mVarK = m.k(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strI));
            e.put(strI, mVarK);
            return mVarK;
        } catch (Exception e2) {
            e2.printStackTrace();
            return mVarK;
        }
    }

    public g d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return a();
            }
            g gVarF = f(str);
            if (gVarF == null) {
                return a();
            }
            return gVarF;
        } catch (Exception unused) {
            return a();
        }
    }

    public String e(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str);
    }

    public boolean g(String str, String str2) {
        g gVarF = f(str2);
        if (i(str2) && a(str2, 1, str)) {
            new k().b(com.mbridge.msdk.foundation.controller.c.n().d(), str2, com.mbridge.msdk.foundation.controller.c.n().c());
        }
        m mVarE = e(str2, str);
        if (gVarF != null && mVarE != null) {
            long jX0 = gVarF.x0() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jO = mVarE.o() + jX0;
            if (jO > jCurrentTimeMillis) {
                String str3 = a;
                StringBuilder sbO = h50.o(jO, "unit setting  nexttime is not ready  [settingNextRequestTime= ", " currentTime = ");
                sbO.append(jCurrentTimeMillis);
                sbO.append(C4664b4.j.e);
                q0.c(str3, sbO.toString());
                return false;
            }
        }
        q0.c(a, "unit setting timeout or not exists");
        return true;
    }

    public void h(String str, String str2) {
        String strA = h.a(str2);
        d = strA;
        c = g.F(strA);
        if (c != null) {
            c.R0();
        }
        com.mbridge.msdk.config.manager.a.c().a(str, strA);
        j.a(c);
        g0.a().a(c.S());
    }

    public boolean i(String str) {
        g gVarF = f(str);
        if (gVarF != null) {
            long jC = gVarF.C() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jX = gVarF.x() + jC;
            if (jX > jCurrentTimeMillis) {
                String str2 = a;
                StringBuilder sbO = h50.o(jX, "app setting nexttime is not ready  [settingNextRequestTime= ", " currentTime = ");
                sbO.append(jCurrentTimeMillis);
                sbO.append(C4664b4.j.e);
                q0.c(str2, sbO.toString());
                return false;
            }
        }
        q0.c(a, "app setting timeout or not exists");
        return true;
    }

    public void j(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + "_" + str2);
            if (!TextUtils.isEmpty(strA)) {
                JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(strA);
                jSONObjectJsonObjectInit.put("current_time", System.currentTimeMillis());
                a(str, str2, jSONObjectJsonObjectInit.toString());
            }
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
    }

    public void k(String str) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().c("ivreward_" + str);
    }

    public void l(String str) {
        try {
            String strG = g(str);
            if (!TextUtils.isEmpty(strG)) {
                JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(strG);
                jSONObjectJsonObjectInit.put("current_time", System.currentTimeMillis());
                h(str, jSONObjectJsonObjectInit.toString());
            }
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
    }

    public m e(String str, String str2) {
        m mVarB = b(str, str2);
        if (mVarB != null && mVarB.L() == 0) {
            mVarB.d(1);
        }
        return mVarB;
    }

    public String f(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(h50.i(str, "_", str2));
    }

    public m d(String str, String str2) {
        m mVarE = e(str, str2);
        return mVarE == null ? m.N() : mVarE;
    }

    public String h(String str) {
        g gVarF = f(str);
        if (gVarF == null) {
            return "0";
        }
        int iF0 = gVarF.f0();
        String strE0 = gVarF.e0();
        return (iF0 <= 0 || !(!TextUtils.isEmpty(strE0) && !strE0.equalsIgnoreCase("null"))) ? "0" : "1";
    }

    public static i b() {
        if (b == null) {
            synchronized (i.class) {
                try {
                    if (b == null) {
                        b = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void i(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str, str2);
    }

    public void b(String str) {
        if (f.get()) {
            return;
        }
        try {
            f.compareAndSet(false, true);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new mc3(12, this, str));
            } else {
                j(str);
            }
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
    }

    public m c(String str, String str2) {
        m mVarA = a(str, str2);
        return mVarA == null ? m.N() : mVarA;
    }

    public g c() {
        if (c != null) {
            return c;
        }
        return a();
    }

    public String g(String str) {
        if (str == null) {
            return "";
        }
        try {
            return TextUtils.isEmpty(d) ? "" : d;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return "";
        }
    }

    public void a(String str) {
        j.a(str, this);
    }

    public g a() {
        return j.a();
    }

    public m a(String str, String str2) {
        return b(str, str2);
    }

    public boolean a(String str, int i, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String str3 = str + "_" + i + "_" + str2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long jLongValue = ((Long) y0.a(contextD, str3, 0L)).longValue();
            g gVarF = f(str);
            if (gVarF == null) {
                gVarF = b().a();
            } else {
                j = jLongValue;
            }
            if ((gVarF.r0() * 1000) + j > jCurrentTimeMillis) {
                return false;
            }
            y0.b(contextD, str3, Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        String strI = h50.i(str, "_", str2);
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strI, str3);
        e.put(strI, m.k(str3));
    }
}
