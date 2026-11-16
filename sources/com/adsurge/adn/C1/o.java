package com.adsurge.adn.C1;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {
    public static i a(Context context, k kVar, com.adsurge.adn.p006a1.a aVar) {
        boolean z;
        if (b()) {
            if (!aVar.j() && !aVar.g() && !aVar.e()) {
                z = false;
            } else {
                z = true;
            }
            i iVarA = com.adsurge.adn.D1.e.a(context, kVar, z);
            if (iVarA != null) {
                com.adsurge.adn.D1.a.c();
                return iVarA;
            }
            com.adsurge.adn.D1.a.e();
        } else {
            com.adsurge.adn.D1.a.e();
        }
        a(com.adsurge.adn.D1.a.e());
        return new j(context, kVar);
    }

    public static boolean b() {
        return com.adsurge.adn.D1.a.g();
    }

    public static boolean a() {
        return false;
    }

    public static void a(com.adsurge.adn.D1.a.EnumC0069a enumC0069a) {
        int iB;
        if (enumC0069a == null) {
            iB = 0;
        } else {
            try {
                iB = enumC0069a.b();
            } catch (Throwable unused) {
                return;
            }
        }
        com.adsurge.adn.w1.b.b(6000908, null, Integer.valueOf(iB));
    }
}
