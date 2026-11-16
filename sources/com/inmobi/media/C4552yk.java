package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.aj3;
import defpackage.az2;
import defpackage.eu;
import defpackage.f02;
import defpackage.n30;
import defpackage.p32;
import defpackage.rd1;
import defpackage.s71;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.inmobi.media.yk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4552yk {
    public static final C4552yk a;
    public static final /* synthetic */ KProperty[] b;
    public static final String c;
    public static String d;
    public static boolean e;
    public static long f;
    public static final List g;
    public static final AtomicBoolean h;
    public static final defpackage.vp i;
    public static final AtomicBoolean j;
    public static long k;
    public static long l;
    public static long m;
    public static long n;
    public static final Db o;
    public static final C3897b2 p;
    public static final C3897b2 q;

    public static void f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicBoolean atomicBoolean = j;
        boolean z = atomicBoolean.get();
        az2 az2Var = az2.a;
        if (!z) {
            a(true);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            k = jCurrentTimeMillis2;
            l = jCurrentTimeMillis2;
            m = 0L;
            n = 0L;
            Collections.fill(g, 0);
            atomicBoolean.set(true);
            i.c(az2Var);
            g();
            c.getClass();
            return;
        }
        long j2 = m;
        if (j2 == 0) {
            return;
        }
        if (jCurrentTimeMillis - j2 < b().getTimeoutMillis()) {
            l = jCurrentTimeMillis;
            m = 0L;
            c.getClass();
            return;
        }
        a();
        a(true);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        k = jCurrentTimeMillis3;
        l = jCurrentTimeMillis3;
        m = 0L;
        n = 0L;
        Collections.fill(g, 0);
        atomicBoolean.set(true);
        i.c(az2Var);
        g();
        c.getClass();
    }

    static {
        f02 f02Var = new f02(C4552yk.class, "sessionCnt", "getSessionCnt()I", 0);
        p32.a.getClass();
        b = new KProperty[]{f02Var, new f02(C4552yk.class, "userRetention", "getUserRetention()I", 0)};
        a = new C4552yk();
        c = "yk";
        g = eu.C(0, 0, 0, 0);
        h = new AtomicBoolean(false);
        int i2 = -1;
        Db dbA = null;
        i = rd1.a(-1, 6, null);
        j = new AtomicBoolean(false);
        Context context = AbstractC4221mk.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            dbA = Cb.a(context, "session_pref_file");
        }
        o = dbA;
        int i3 = 12;
        p = new C3897b2(i2, new aj3(3), i3);
        q = new C3897b2(i2, new aj3(4), i3);
    }

    public static SignalsConfig.SessionConfig b() {
        return ((SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class)).getSession();
    }

    public static final int c() {
        a.getClass();
        Db db = o;
        if (db == null) {
            return 0;
        }
        return db.a.getInt(com.safedk.android.analytics.brandsafety.m.R, 0);
    }

    public static final int d() {
        a.getClass();
        Db db = o;
        if (db == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return Integer.min((int) ((jCurrentTimeMillis - db.a.getLong("u-ret", jCurrentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void a(String str, Boolean bool) {
        str.getClass();
        if (str.equals("banner") && b().getSigControlList().contains(1)) {
            List list = g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (str.equals(com.safedk.android.analytics.brandsafety.m.w) && !s71.b(bool, Boolean.TRUE) && b().getSigControlList().contains(2)) {
            List list2 = g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (str.equals("native") && b().getSigControlList().contains(4)) {
            List list3 = g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (s71.b(bool, Boolean.TRUE) && b().getSigControlList().contains(3)) {
            List list4 = g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }

    public static void e() {
        if (!b().isForegroundBackgroundModelEnabled() || !j.get() || m > 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        n = (jCurrentTimeMillis - l) + n;
        m = jCurrentTimeMillis;
        c.getClass();
        b().getTimeoutSeconds();
    }

    public static void g() {
        if (b().getSigControlList().contains(5)) {
            Db db = o;
            if (db != null) {
                db.a(com.safedk.android.analytics.brandsafety.m.R, Integer.min(db.a.getInt(com.safedk.android.analytics.brandsafety.m.R, 0) + 1, Integer.MAX_VALUE), false);
            }
            p.a();
        }
        if (b().getSigControlList().contains(6)) {
            Db db2 = o;
            if (db2 != null && !db2.a.contains("u-ret")) {
                db2.a("u-ret", System.currentTimeMillis(), false);
            }
            q.a();
        }
    }

    public static void a() {
        j.set(false);
        c.getClass();
    }

    public static void a(boolean z) {
        if (Jk.a().getSessionEnabled()) {
            d = n30.f();
            c.getClass();
        }
    }
}
