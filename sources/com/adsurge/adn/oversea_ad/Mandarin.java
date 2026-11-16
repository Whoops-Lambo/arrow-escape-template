package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Mandarin {
    public static void a(Cprivate cprivate) {
        int i = cprivate.b;
        if (i == 2 || i == 3) {
            Avocado avocado = Mango.b;
            synchronized (avocado) {
                avocado.a(cprivate);
            }
            return;
        }
        k kVar = cprivate.c;
        if (kVar != null) {
            long jAbs = Math.abs(kVar.a - Mango.d);
            Mango.d = System.currentTimeMillis();
            if (jAbs < 1000) {
                return;
            }
            Avocado avocado2 = Mango.a;
            synchronized (avocado2) {
                avocado2.a(cprivate);
            }
        }
    }
}
