package com.adsurge.adn.w1;

import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.Y0.h;
import com.adsurge.adn.Y0.i;
import com.adsurge.adn.Y0.v;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final Queue a = new ConcurrentLinkedQueue();
    public static final Queue b = new ConcurrentLinkedQueue();
    public static final AtomicReference c = new AtomicReference(null);

    public static void c(int i, c cVar, Integer num) {
        b(i, cVar, num, (d) null);
    }

    public static void a(boolean z) {
        AtomicReference atomicReference = c;
        Boolean bool = z ? Boolean.TRUE : Boolean.FALSE;
        while (!atomicReference.compareAndSet(null, bool)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        if (!z) {
            v.a(false, (h) new com.adsurge.adn.U.a());
            a.clear();
            b.clear();
            return;
        }
        v.a(true, (h) new com.adsurge.adn.U.a());
        while (true) {
            e eVar = (e) a.poll();
            if (eVar == null) {
                break;
            } else {
                b(eVar, false);
            }
        }
        while (true) {
            i iVar = (i) b.poll();
            if (iVar == null) {
                return;
            } else {
                a(iVar);
            }
        }
    }

    public static void b(e eVar, boolean z) {
        if (eVar == null || com.adsurge.adn.K.b.a(eVar.a())) {
            return;
        }
        Boolean bool = (Boolean) c.get();
        if (bool == null) {
            a.add(eVar);
        } else if (bool != Boolean.FALSE && a.a(eVar.a())) {
            a(eVar, z);
        }
    }

    public static void b(int i, c cVar, Integer num) {
        a(i, cVar, num, (d) null);
    }

    public static void b(int i, c cVar, Integer num, d dVar) {
        a(i, cVar, (Integer) null, num, dVar);
    }

    public static void b(int i, c cVar, Integer num, Integer num2, d dVar) {
        a(i, cVar, num, num2, dVar);
    }

    public static void b(int i, c cVar, Integer num, Integer num2) {
        a(i, cVar, num, num2, (d) null);
    }

    public static void a(e eVar) {
        b(eVar, false);
    }

    public static void a(e eVar, boolean z) {
        v.a(eVar, z);
    }

    public static void a(int i, c cVar) {
        a(i, cVar, (Integer) null, (Integer) null, (d) null);
    }

    public static void a(int i, c cVar, d dVar) {
        a(i, cVar, (Integer) null, (Integer) null, dVar);
    }

    public static void a(int i, c cVar, Integer num, Integer num2, d dVar) {
        a(i, cVar, num, num2, dVar, false);
    }

    public static void a(int i, c cVar, Integer num, Integer num2, d dVar, boolean z) {
        a(i, cVar, num, num2, dVar, z, null, null);
    }

    public static void a(int i, c cVar, Integer num, Integer num2, d dVar, boolean z, Integer num3, Integer num4) {
        e eVar = new e(i);
        if (num != null) {
            eVar.d(num.intValue());
        }
        eVar.a(cVar);
        eVar.a(dVar);
        if (num2 != null) {
            eVar.e(num2.intValue());
        }
        if (num3 != null) {
            eVar.b(num3.intValue());
        }
        if (num4 != null) {
            eVar.c(num4.intValue());
        }
        b(eVar, z);
    }

    public static void a(int i, c cVar, Integer num, d dVar) {
        a(i, cVar, num, (Integer) null, dVar);
    }

    public static void a(int i, c cVar, Integer num) {
        a(i, cVar, null, null, null, false, num, null);
    }

    public static void a(int i, c cVar, Integer num, Integer num2) {
        a(i, cVar, null, null, null, false, num, num2);
    }

    public static void a(int i, c cVar, Integer num, Integer num2, Integer num3) {
        a(i, cVar, num, null, null, false, num2, num3);
    }

    public static void a(i iVar) {
    }
}
