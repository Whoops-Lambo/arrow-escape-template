package com.adsurge.adn.p036k1;

import com.adsurge.adn.N.b;
import com.adsurge.adn.Q.g;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.s1.a;
import com.adsurge.adn.u1.c;
import defpackage.h50;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l {
    public static Random a;

    public static boolean d(c cVar) {
        if (cVar != null && cVar.i() != null) {
            if (b.a("tdsc_" + cVar.i().d(), 0, cVar) == 1) {
                return true;
            }
        }
        return false;
    }

    public static int a(c cVar, g gVar) {
        int iP;
        int iA = b.a(a(cVar, "skscprc"), 0, cVar);
        if (iA <= 0) {
            if (gVar == null || (iP = gVar.p()) < 0) {
                return -1;
            }
            return iP;
        }
        if (a == null) {
            a = new Random();
        }
        if (iA < 100 && a.nextInt(100) > iA) {
            a(cVar, iA, false);
            return 0;
        }
        if (gVar == null) {
            a(cVar, iA, true);
            return 1;
        }
        int iP2 = gVar.p();
        if (iP2 > 0) {
            a(cVar, iA, true);
            return iP2;
        }
        a(cVar, iA, true);
        return 1;
    }

    public static int b(c cVar) {
        return b.a(a(cVar, "skscacct"), 0, cVar);
    }

    public static int c(c cVar) {
        return a(cVar, "dlctd", 8);
    }

    public static int a(c cVar) {
        return a(cVar, "dlcte", 0);
    }

    public static int a(c cVar, String str, int i) {
        int iA = a.b().c().a(a(cVar, str), cVar.l(), -1);
        return iA >= 0 ? iA : a.b().c().a(str, cVar.l(), i);
    }

    public static String a(c cVar, String str) {
        StringBuilder sbQ = h50.q(str, "_");
        sbQ.append(cVar.i().d());
        return sbQ.toString();
    }

    public static void a(c cVar, int i, boolean z) {
        e eVar = new e(9760000);
        eVar.a(com.adsurge.adn.Y0.c.a(cVar));
        eVar.d(i);
        if (z) {
            eVar.e(1);
        }
        com.adsurge.adn.w1.b.a(eVar);
    }

    public static void a(c cVar, int i, int i2) {
        e eVar = new e(9760001);
        eVar.a(com.adsurge.adn.Y0.c.a(cVar));
        eVar.d(i);
        eVar.e(i2);
        com.adsurge.adn.w1.b.a(eVar);
    }
}
