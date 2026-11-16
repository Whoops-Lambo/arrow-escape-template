package com.adsurge.adn.D1;

import com.adsurge.adn.ads.AdSurgeAdFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static Integer a;

    public static int a() {
        if (a == null) {
            a = Integer.valueOf(com.adsurge.adn.N.b.a("odcepos", 0, (AdSurgeAdFormat) null, (String) null));
        }
        return a.intValue();
    }

    public static boolean b() {
        if ((a() & 8) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if ((a() & 4) != 0) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if ((a() & 1) != 0) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if ((a() & 2) != 0) {
            return true;
        }
        return false;
    }
}
