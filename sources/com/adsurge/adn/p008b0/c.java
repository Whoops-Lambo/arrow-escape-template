package com.adsurge.adn.p008b0;

import com.adsurge.adn.Z.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static void a(Thread thread, Throwable th) {
        b bVar = new b(thread, th);
        d[] dVarArr = {new a(), new h(), new j()};
        for (int i = 0; i < 3 && !dVarArr[i].a(bVar); i++) {
        }
    }

    public static void a() {
        com.adsurge.adn.Z.c.a().postDelayed(new k(), a.c());
    }
}
