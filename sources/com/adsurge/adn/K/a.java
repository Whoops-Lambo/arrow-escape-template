package com.adsurge.adn.K;

import com.adsurge.adn.I0.h;
import com.adsurge.adn.N.d;
import com.adsurge.adn.X.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: com.adsurge.adn.K.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0081a {
        public static final a a = new a();
    }

    public static a e() {
        return C0081a.a;
    }

    public Integer b() {
        if (b.a("adsurge_consent")) {
            return null;
        }
        if (!g()) {
            return 1;
        }
        int iD = d();
        if (iD != -1) {
            return iD != 1 ? 2 : 3;
        }
        return 4;
    }

    public String c() {
        return com.adsurge.adn.N.b.a("cmp_url", "https://www.adsurge.com/privacy/consent.html");
    }

    public int f() {
        return com.adsurge.adn.N.b.a("cmp_rvd", 30);
    }

    public boolean g() {
        return com.adsurge.adn.N.b.a("cmp_sw", 0) == 1;
    }

    public final boolean a(long j) {
        int iF = f();
        if (iF <= 0) {
            return false;
        }
        long jA = d.b().a() - j;
        if (jA >= 0 && jA <= ((long) iF) * 86400000) {
            return false;
        }
        return true;
    }

    public int d() {
        long jA = x.a(a(), 0L);
        if (jA == 0) {
            return 0;
        }
        if (jA == -1) {
            return 1;
        }
        if (a(jA)) {
            return 0;
        }
        return -1;
    }

    public static String a(String str) {
        return "cmp_consent_" + h.a(str);
    }

    public void a(boolean z, String str) {
        x.b(a(str), z ? -1L : d.b().a());
    }

    public static String a() {
        return a(e().c());
    }
}
