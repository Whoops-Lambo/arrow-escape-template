package com.adsurge.adn.Y0;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j {
    public static final com.adsurge.adn.F0.b a;
    public static final int b;
    public static final boolean c;
    public static final boolean d;
    public static final int e;
    public static final boolean f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final HashSet l;
    public static final HashSet m;
    public static final HashSet n;
    public static volatile h o;

    public static HashSet a(String str) {
        String[] strArrSplit;
        HashSet hashSet = new HashSet();
        String strA = com.adsurge.adn.F0.b.b().a(str, "");
        if (!TextUtils.isEmpty(strA) && (strArrSplit = strA.split(",")) != null && strArrSplit.length > 0) {
            try {
                for (String str2 : strArrSplit) {
                    if (!TextUtils.isEmpty(str2)) {
                        hashSet.add(Integer.valueOf(Integer.parseInt(str2)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    public static boolean b(int i2) {
        if (com.adsurge.adn.J0.a.a) {
            return true;
        }
        if (i2 == 0 || !c) {
            return false;
        }
        HashSet hashSet = n;
        return hashSet.size() == 0 || !hashSet.contains(Integer.valueOf(i2));
    }

    public static int c() {
        return e;
    }

    public static int d() {
        return i;
    }

    public static int e() {
        return g;
    }

    public static h f() {
        return o;
    }

    public static HashSet g() {
        HashSet hashSetA = a("ntrpe");
        hashSetA.addAll(a("sprpe"));
        return hashSetA;
    }

    public static HashSet h() {
        return a("skrrd");
    }

    public static boolean i() {
        return f;
    }

    static {
        boolean z;
        boolean z2;
        com.adsurge.adn.F0.b bVarB = com.adsurge.adn.F0.b.b();
        a = bVarB;
        int iNextInt = new Random(System.currentTimeMillis()).nextInt(10000);
        b = iNextInt;
        boolean z3 = false;
        if (iNextInt < bVarB.a("perfRate", 10000)) {
            z = true;
        } else {
            z = false;
        }
        c = z;
        if (iNextInt < bVarB.a("eventRate", 10000)) {
            z2 = true;
        } else {
            z2 = false;
        }
        d = z2;
        e = bVarB.a("maxCount", 30);
        if (bVarB.a("perfInstant", 0) == 1) {
            z3 = true;
        }
        f = z3;
        g = bVarB.a("perfPeriod", 600);
        h = bVarB.a("eventPeriod", 600);
        i = bVarB.a("perfBatchCount", 30);
        j = bVarB.a("eventBatchCount", 30);
        k = bVarB.a("perfNetPer", 30);
        l = h();
        m = g();
        n = a("ntrpf");
    }

    public static boolean j() {
        com.adsurge.adn.E0.c cVarB = com.adsurge.adn.D0.a.c().d().b();
        if ((cVarB.d() & k) > 0) {
            return true;
        }
        return false;
    }

    public static int b() {
        return h;
    }

    public static void a(h hVar) {
        if (o == null) {
            o = hVar;
        }
    }

    public static boolean a(boolean z, int i2) {
        if (z) {
            return true;
        }
        HashSet hashSet = l;
        return hashSet.size() > 0 && hashSet.contains(Integer.valueOf(i2));
    }

    public static boolean a(int i2) {
        if (i2 == 0 || !d) {
            return false;
        }
        HashSet hashSet = m;
        return hashSet.size() == 0 || !hashSet.contains(Integer.valueOf(i2));
    }

    public static int a() {
        return j;
    }
}
