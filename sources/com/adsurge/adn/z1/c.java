package com.adsurge.adn.z1;

import com.adsurge.adn.x1.p;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public AtomicBoolean a = new AtomicBoolean(false);
    public AtomicInteger b = new AtomicInteger(0);
    public int e = 1;
    public boolean c = p.a("sphdv", true);
    public int d = p.a("hdrefver", 0);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public static c a = new c();
    }

    public int b() {
        return this.e;
    }

    public boolean c() {
        this.b.get();
        return this.b.get() > 0;
    }

    public void d() {
        this.a.set(true);
    }

    public void a(int i) {
        com.adsurge.adn.w1.b.c(1130024, null, Integer.valueOf(i));
        int iIncrementAndGet = this.b.incrementAndGet();
        this.a.get();
        if (iIncrementAndGet == 3) {
            this.c = false;
            if (this.a.get()) {
                com.adsurge.adn.w1.b.c(1130026, null, Integer.valueOf(i));
            } else {
                com.adsurge.adn.w1.b.c(1130025, null, Integer.valueOf(i));
                p.b("sphdv", false);
            }
        }
    }

    public static c a() {
        return a.a;
    }
}
