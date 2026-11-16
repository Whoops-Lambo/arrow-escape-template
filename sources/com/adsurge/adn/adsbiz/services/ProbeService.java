package com.adsurge.adn.adsbiz.services;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.adsurge.adn.J0.a;
import com.adsurge.adn.N.b;
import com.adsurge.adn.X.AbstractC1630c;
import com.adsurge.adn.Y.e;
import com.adsurge.adn.Y0.v;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ProbeService {
    public static Boolean a;
    public static volatile boolean c;
    public static final boolean e;
    public static final boolean b = i();
    public static volatile boolean d = false;

    public static String b() {
        JSONObject jSONObjectA = a(3, new Object[0]);
        a.a("Probe to get app name: %s", jSONObjectA);
        return jSONObjectA != null ? jSONObjectA.optString("data", "") : "";
    }

    public static String c() {
        JSONObject jSONObjectA = a(4, new Object[0]);
        a.a("Probe to get app sign: %s", jSONObjectA);
        String strOptString = jSONObjectA != null ? jSONObjectA.optString("data", "") : "";
        String strA = AbstractC1630c.a(com.adsurge.adn.s1.a.b().a());
        if (!TextUtils.equals(strOptString, strA) && k()) {
            String strA2 = e.a();
            if (!TextUtils.isEmpty(strA2) && TextUtils.equals(strA, strA2)) {
                if (!d) {
                    v.a(9130085, null, null, null, null);
                    d = true;
                }
                return strA2;
            }
            v.a(9130084, null, 2, null, null);
        }
        return strOptString;
    }

    public static long d() {
        JSONObject jSONObjectA = a(5, new Object[0]);
        a.a("Probe to get app size: %s", jSONObjectA);
        if (jSONObjectA != null) {
            return jSONObjectA.optLong("data", 0L);
        }
        return 0L;
    }

    public static int e() {
        JSONObject jSONObjectA = a(7, new Object[0]);
        a.a("Probe to check double open app: %s", jSONObjectA);
        if (jSONObjectA != null) {
            return jSONObjectA.optInt("data", 0);
        }
        return 0;
    }

    public static int g() {
        JSONObject jSONObjectA = a(1, new Object[0]);
        a.a("Probe to get simulator check: %s", jSONObjectA);
        if (jSONObjectA != null) {
            return jSONObjectA.optInt("data", 0);
        }
        return 0;
    }

    private static native JSONObject nativeGetProbeValue(int i, Object... objArr);

    private static native void nativeInit(Context context);

    public static boolean a() {
        if (!b) {
            return false;
        }
        if (c) {
            return true;
        }
        synchronized (ProbeService.class) {
            try {
                if (c) {
                    return true;
                }
                Context contextA = com.adsurge.adn.s1.a.b().a();
                if (contextA == null) {
                    return false;
                }
                Context applicationContext = contextA.getApplicationContext();
                if (applicationContext != null) {
                    contextA = applicationContext;
                }
                try {
                    nativeInit(contextA);
                    c = true;
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f() {
        if (e) {
            return j();
        }
        JSONObject jSONObjectA = a(6, new Object[0]);
        a.a("Probe to check icon: %s", jSONObjectA);
        if (jSONObjectA != null) {
            return jSONObjectA.optInt("data", 0);
        }
        return 0;
    }

    public static boolean h() {
        return b;
    }

    public static boolean i() {
        try {
            System.loadLibrary("adsurge_probe");
            return true;
        } catch (Throwable th) {
            a.a("Probe native library load failed: %s", th.toString());
            return false;
        }
    }

    public static int j() {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(com.adsurge.adn.s1.a.b().a().getPackageName());
            return com.adsurge.adn.s1.a.b().a().getPackageManager().resolveActivity(intent, 0) != null ? 0 : 1;
        } catch (Exception e2) {
            e2.getMessage();
            return 1;
        }
    }

    public static boolean k() {
        if (a == null) {
            a = Boolean.valueOf(b.a("ascv3", 1, (AdSurgeAdFormat) null, (String) null) > 0);
        }
        return a.booleanValue();
    }

    static {
        boolean z = false;
        if (b.a("ascais", 1, (AdSurgeAdFormat) null, (String) null) == 1) {
            z = true;
        }
        e = z;
    }

    public static JSONObject a(int i, Object... objArr) {
        if (!a()) {
            return new JSONObject();
        }
        return nativeGetProbeValue(i, objArr);
    }
}
