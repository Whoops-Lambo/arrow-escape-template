package com.adsurge.adn.K;

import com.adsurge.adn.X.q;
import com.adsurge.adn.ads.AdSurgePrivacyConfiguration;
import com.adsurge.adn.managers.OnStartListener;
import com.adsurge.adn.p059u.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b {
    public static volatile Set b;
    public static volatile Set c;
    public static volatile Boolean d;
    public final c a = c.c();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a.i();
            b.this.j();
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.K.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0082b {
        public static final b a = new b();
    }

    static {
        Set set = Collections.EMPTY_SET;
        b = set;
        c = set;
        d = Boolean.TRUE;
    }

    public static void b(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objOpt = jSONArray.opt(i);
                if (objOpt instanceof String) {
                    String str = (String) objOpt;
                    if (!str.isEmpty()) {
                        hashSet.add(str);
                        if ("screen_width".equals(str) || "screen_height".equals(str)) {
                            hashSet.add("screen_width");
                            hashSet.add("screen_height");
                        }
                    }
                }
            }
        }
        b = hashSet;
    }

    public static b f() {
        return C0082b.a;
    }

    public static boolean g() {
        return Boolean.TRUE.equals(d);
    }

    public Integer c() {
        if (a("manual_config")) {
            return null;
        }
        return Integer.valueOf(AdSurgePrivacyConfiguration.getManualConfig());
    }

    public Integer d() {
        if (a("manual_config_setting")) {
            return null;
        }
        return Integer.valueOf(AdSurgePrivacyConfiguration.getManualConfigSetting());
    }

    public boolean i() {
        return !this.a.g() && AdSurgePrivacyConfiguration.isDoNotSell();
    }

    public void j() {
        q.f.schedule(new a(), 30L, TimeUnit.MINUTES);
    }

    public final com.adsurge.adn.p059u.b a() {
        if (AdSurgePrivacyConfiguration.isAgeRestrictedUser()) {
            return i.a(6000, null);
        }
        if (!this.a.g()) {
            return null;
        }
        if (!this.a.h()) {
            return i.a(6001, null);
        }
        if (this.a.f()) {
            return null;
        }
        return i.a(6002, null);
    }

    public com.adsurge.adn.p059u.b e() {
        if (com.adsurge.adn.N.a.b().c()) {
            return a();
        }
        return i.a(4000);
    }

    public boolean h() {
        if (!AdSurgePrivacyConfiguration.isUserConsentConfigured() && !this.a.g()) {
            return false;
        }
        return true;
    }

    public void a(OnStartListener onStartListener) {
        this.a.e();
        j();
        onStartListener.onStartComplete();
    }

    public static void a(Boolean bool) {
        d = bool;
    }

    public static boolean a(String str) {
        return b.contains(str);
    }

    public static boolean a(int i) {
        return c.contains(Integer.valueOf(i));
    }

    public static void a(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objOpt = jSONArray.opt(i);
                if (objOpt instanceof Integer) {
                    hashSet.add((Integer) objOpt);
                }
            }
        }
        c = hashSet;
    }

    public boolean b() {
        if (this.a.g()) {
            return this.a.h() && this.a.f();
        }
        return true;
    }
}
