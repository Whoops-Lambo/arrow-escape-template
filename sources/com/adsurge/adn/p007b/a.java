package com.adsurge.adn.p007b;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.adsurge.adn.N.b;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p013d.c;
import com.adsurge.adn.p013d.e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static volatile a b = null;
    public static int c = -999;
    public static int d = -999;
    public static long e;
    public static final int f = b.a("gasi", 999, (AdSurgeAdFormat) null, (String) null);
    public final Map a = new ConcurrentHashMap();

    public String c(View view) {
        return b(view, 1);
    }

    public static void a() {
        int i = f;
        if (i == -1) {
            return;
        }
        if (i == 999) {
            if (c >= 0 && d >= 0) {
                return;
            }
        } else if (i > 0 && System.currentTimeMillis() - e < ((long) i) * 60000) {
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.adsurge.adn.s1.a.b().a().getSystemService("accessibility");
        e = System.currentTimeMillis();
        if (accessibilityManager == null) {
            c = -999;
            d = -999;
            return;
        }
        try {
            List<AccessibilityServiceInfo> installedAccessibilityServiceList = accessibilityManager.getInstalledAccessibilityServiceList();
            if (installedAccessibilityServiceList == null) {
                c = 0;
            } else {
                int i2 = 0;
                for (AccessibilityServiceInfo accessibilityServiceInfo : installedAccessibilityServiceList) {
                    if (accessibilityServiceInfo != null) {
                        String[] strArr = accessibilityServiceInfo.packageNames;
                        if (strArr == null) {
                            i2++;
                        } else {
                            for (String str : strArr) {
                                if (TextUtils.equals(null, str)) {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                c = i2;
            }
        } catch (Throwable unused) {
            c = -999;
        }
        try {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            if (enabledAccessibilityServiceList == null) {
                d = 0;
            } else {
                d = enabledAccessibilityServiceList.size();
            }
        } catch (Throwable unused2) {
            d = -999;
        }
    }

    public static a d() {
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void b(View view) {
        if (view != null) {
            int iE = e(view);
            if (((com.adsurge.adn.p010c.a) this.a.get(Integer.valueOf(iE))) != null) {
                this.a.remove(Integer.valueOf(iE));
            }
        }
    }

    public static int e(View view) {
        return System.identityHashCode(view);
    }

    public static int c() {
        a();
        return c;
    }

    public com.adsurge.adn.p010c.a d(View view) {
        if (view == null) {
            return null;
        }
        return (com.adsurge.adn.p010c.a) this.a.get(Integer.valueOf(e(view)));
    }

    public final String b(View view, int i) {
        String strA;
        SystemClock.elapsedRealtime();
        e eVarA = a(view, i);
        if (eVarA != null) {
            strA = eVarA.a(i);
        } else {
            strA = "";
        }
        SystemClock.elapsedRealtime();
        return strA;
    }

    public static int b() {
        a();
        return d;
    }

    public String a(View view) {
        return b(view, 2);
    }

    public final e a(View view, int i) {
        if ((i != 1 && i != 2) || view == null) {
            return null;
        }
        com.adsurge.adn.p010c.a aVar = (com.adsurge.adn.p010c.a) this.a.get(Integer.valueOf(e(view)));
        if (aVar != null) {
            return new c(aVar, view);
        }
        return null;
    }

    public static JSONObject a(String str) {
        String strA;
        JSONObject jSONObject = new JSONObject();
        try {
            strA = com.adsurge.adn.A.a.a(str, com.adsurge.adn.A.b.b());
        } catch (Throwable unused) {
            strA = "";
        }
        try {
            jSONObject.put("s", strA);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public a a(View view, com.adsurge.adn.u1.c cVar) {
        if (view != null && cVar != null) {
            int iE = e(view);
            this.a.put(Integer.valueOf(iE), new com.adsurge.adn.p010c.a(iE, view, cVar));
        }
        return this;
    }
}
