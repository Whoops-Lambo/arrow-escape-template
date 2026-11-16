package com.adsurge.adn.x1;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class s {
    public static boolean b(com.adsurge.adn.u1.c cVar) {
        return com.adsurge.adn.N.b.a("sksbve", 0, cVar) == 1;
    }

    public static void a(com.adsurge.adn.u1.c cVar, int i) {
        cVar.l();
        String strD0 = cVar.D0();
        if (i == 1) {
            cVar.a((com.adsurge.adn.Q.j) null);
            cVar.b(false);
            return;
        }
        com.adsurge.adn.Q.j jVarL0 = cVar.l0();
        if (jVarL0 == null) {
            boolean zA = com.adsurge.adn.D1.e.a(strD0);
            cVar.a((com.adsurge.adn.Q.j) null);
            cVar.b(zA);
            return;
        }
        jVarL0.c();
        jVarL0.a();
        String strC = jVarL0.c();
        if (com.adsurge.adn.N.b.a("pbebo", 1, cVar) != 1) {
            boolean zA2 = com.adsurge.adn.D1.e.a(strC);
            cVar.a((com.adsurge.adn.Q.j) null);
            cVar.b(zA2);
            return;
        }
        for (com.adsurge.adn.Q.j jVar : cVar.d0()) {
            String strC2 = jVar.c();
            boolean zA3 = com.adsurge.adn.D1.e.a(strC2);
            jVar.a();
            if (zA3) {
                cVar.a(jVar);
                cVar.b(true);
                return;
            } else {
                if (TextUtils.equals(strC2, strC)) {
                    cVar.a(jVar);
                    cVar.b(false);
                    return;
                }
            }
        }
        boolean zA4 = com.adsurge.adn.D1.e.a(strC);
        cVar.a((com.adsurge.adn.Q.j) null);
        cVar.b(zA4);
    }

    public static void c(com.adsurge.adn.u1.c cVar) {
        e(cVar);
        d(cVar);
    }

    public static void d(com.adsurge.adn.u1.c cVar) {
        com.adsurge.adn.Q.j[] jVarArrD0;
        com.adsurge.adn.Q.j jVarL0 = cVar.l0();
        if (jVarL0 != null) {
            jVarL0.c();
            jVarL0.a();
            int iA = com.adsurge.adn.N.b.a("pddur", 10, cVar);
            if (iA > 0 && (jVarArrD0 = cVar.d0()) != null && jVarArrD0.length != 0) {
                String strC = jVarL0.c();
                for (com.adsurge.adn.Q.j jVar : jVarArrD0) {
                    String strC2 = jVar.c();
                    jVar.a();
                    if (!com.adsurge.adn.D1.e.a(strC2)) {
                        if (TextUtils.equals(strC2, strC)) {
                            com.adsurge.adn.D1.e.a(strC2, (((long) (jVar.a() * iA)) * 1000) / 8, jVar.a(), new com.adsurge.adn.D1.h(jVar.a(), cVar));
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void e(com.adsurge.adn.u1.c cVar) {
        com.adsurge.adn.Q.j[] jVarArrD0;
        if (b(cVar) && (jVarArrD0 = cVar.d0()) != null && jVarArrD0.length != 0) {
            if (!a(cVar)) {
                cVar.b(jVarArrD0[jVarArrD0.length - 1]);
                return;
            }
            long jV0 = cVar.v0();
            if (jV0 <= 0) {
                cVar.b(jVarArrD0[jVarArrD0.length - 1]);
                return;
            }
            for (com.adsurge.adn.Q.j jVar : jVarArrD0) {
                if (a(jV0, jVar.a())) {
                    cVar.b(jVar);
                    jVar.a();
                    return;
                }
            }
            cVar.b(jVarArrD0[jVarArrD0.length - 1]);
        }
    }

    public static boolean a(long j, long j2) {
        return j > j2;
    }

    public static boolean a(com.adsurge.adn.u1.c cVar) {
        return com.adsurge.adn.N.b.a("skbve", 0, cVar) == 1;
    }

    public static long a(long j, double d) {
        if (d > 0.0d && j > 0) {
            return (long) ((j * 8) / d);
        }
        return 0L;
    }
}
