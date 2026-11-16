package com.adsurge.adn.r1;

import android.os.SystemClock;
import com.adsurge.adn.V.e;
import com.adsurge.adn.V.f;
import com.adsurge.adn.X.l;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.lib.dysi.IGDTBiz;
import com.adsurge.adn.w1.b;
import com.adsurge.adn.x1.h;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class a implements l.g {
    public static long c;
    public static String d;
    public static c e;
    public static int f;
    public static int n;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static long g = 0;
    public static long h = 0;
    public static long i = 0;
    public static long j = 0;
    public static long k = 0;
    public static h l = new h();
    public static final a m = new a();

    public static void d() {
        l.b();
        f = 0;
        k = 0L;
        g = 0L;
        h = 0L;
        i = 0L;
        j = 0L;
        d = null;
        e = null;
    }

    public static void e() {
        if (f != 3) {
            return;
        }
        l.a();
        i = SystemClock.elapsedRealtime();
    }

    public static void f() {
        if (f != 3) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h = jElapsedRealtime;
        if (jElapsedRealtime - g <= 500) {
            l.a();
            j();
            i();
        } else {
            IGDTBiz iGDTBiz = (IGDTBiz) b.get(d);
            if (iGDTBiz != null) {
                iGDTBiz.onAdClickReturn(0);
            }
            j();
        }
        d();
    }

    public static void g() {
        if (f != 3) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g = jElapsedRealtime;
        k = (jElapsedRealtime - j) + k;
    }

    public static void h() {
        if (f != 3) {
            return;
        }
        j = SystemClock.elapsedRealtime();
    }

    public static void i() {
        d dVar = new d();
        dVar.a("error_msg", "inline open may fail");
        b.a(6000325, e, dVar);
    }

    public static void j() {
        b.a(6000303, (c) a.get(d), Integer.valueOf(n), new com.adsurge.adn.V.b().a((h - i) - k));
    }

    public static void c() {
        l.b().a(m);
    }

    @Override // com.adsurge.adn.X.l.g
    public boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - c;
        int i2 = f;
        if (i2 == 2) {
            b.a(6000306, (c) a.get(d), new e().a(jElapsedRealtime));
            IGDTBiz iGDTBiz = (IGDTBiz) b.get(d);
            if (iGDTBiz != null) {
                iGDTBiz.onAdClickReturn(1);
            }
            f = 0;
            d = null;
            return false;
        }
        if (i2 == 1) {
            b.a(6000303, (c) a.get(d), Integer.valueOf(n), new com.adsurge.adn.V.b().a(jElapsedRealtime));
            IGDTBiz iGDTBiz2 = (IGDTBiz) b.get(d);
            if (iGDTBiz2 != null) {
                iGDTBiz2.onAdClickReturn(0);
            }
            f = 0;
            d = null;
            return false;
        }
        if (i2 == 4) {
            b.a(6000322, (c) a.get(d), new f().a(jElapsedRealtime));
            IGDTBiz iGDTBiz3 = (IGDTBiz) b.get(d);
            if (iGDTBiz3 != null) {
                iGDTBiz3.onAdClickReturn(1);
            }
            f = 0;
            d = null;
            return false;
        }
        for (Map.Entry entry : a.entrySet()) {
            b.a(6000501, (c) entry.getValue(), new com.adsurge.adn.V.c().a(jElapsedRealtime));
        }
        return false;
    }

    @Override // com.adsurge.adn.X.l.g
    public boolean b() {
        c = SystemClock.elapsedRealtime();
        if (f != 0) {
            return false;
        }
        Iterator it = a.entrySet().iterator();
        while (it.hasNext()) {
            b.a(6000500, (c) ((Map.Entry) it.next()).getValue());
        }
        return false;
    }

    public static void c(String str) {
        d = str;
        f = 4;
        a(str, 1);
    }

    public static void d(String str) {
        if (str != null) {
            b.remove(str);
        }
    }

    public static void b(String str) {
        d = str;
        f = 2;
        a(str, 1);
    }

    public static void a(c cVar, int i2) {
        if (i2 == 1) {
            e = cVar;
            f = 3;
        } else {
            f = 1;
        }
        n = i2;
        String strB = cVar.b();
        d = strB;
        a(strB, 0);
    }

    public static void a(String str, int i2) {
        IGDTBiz iGDTBiz = (IGDTBiz) b.get(str);
        if (iGDTBiz != null) {
            iGDTBiz.onAdClickOpen(i2);
        }
    }

    public static void a(c cVar) {
        a.put(cVar.b(), cVar);
    }

    public static void a(String str) {
        a.remove(str);
    }

    public static void a(String str, IGDTBiz iGDTBiz) {
        if (str == null || iGDTBiz == null) {
            return;
        }
        b.put(str, iGDTBiz);
    }

    public static void a(String str, long j2) {
        IGDTBiz iGDTBiz = (IGDTBiz) b.get(str);
        if (iGDTBiz != null) {
            iGDTBiz.onAdClickPlayable(j2);
        }
    }
}
