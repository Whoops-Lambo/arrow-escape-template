package com.adsurge.adn.y1;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static Integer a;
    public static int b = new Random(System.currentTimeMillis()).nextInt(100);
    public static final Map c = new ConcurrentHashMap();

    public static int a(String str) {
        int iA = com.adsurge.adn.s1.a.b().c().a(str, 0);
        Integer numValueOf = Integer.valueOf(iA);
        a = numValueOf;
        if (iA < 10000) {
            return numValueOf.intValue();
        }
        int iA2 = com.adsurge.adn.p1.a.a().a(String.valueOf(a), 0);
        a = Integer.valueOf(iA2);
        return iA2;
    }
}
