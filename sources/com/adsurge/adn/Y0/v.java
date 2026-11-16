package com.adsurge.adn.Y0;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v {
    public static final Queue a = new ConcurrentLinkedQueue();
    public static final Queue b = new ConcurrentLinkedQueue();
    public static final AtomicReference c = new AtomicReference(null);

    public static void a(e eVar, boolean z) {
        if ((eVar == null || !com.adsurge.adn.K.b.a(eVar.a())) && eVar != null) {
            Boolean bool = (Boolean) c.get();
            if (bool == null) {
                a.add(eVar);
                return;
            }
            if (bool != Boolean.FALSE && j.a(eVar.a())) {
                boolean zA = j.a(z, eVar.a());
                h.b bVarB = j.f().b();
                bVarB.a(eVar);
                eVar.a(com.adsurge.adn.D0.a.c().d().b());
                a((b) eVar);
                t.c().a(m.a(eVar), zA);
                bVarB.b(eVar);
            }
        }
    }

    public static void a(e eVar) {
        a(eVar, false);
    }

    public static void a(int i, c cVar, Integer num, Integer num2, d dVar) {
        a(i, cVar, num, num2, dVar, false);
    }

    public static void a(int i, c cVar, Integer num, Integer num2, d dVar, boolean z) {
        e eVar = new e(i);
        if (num != null) {
            eVar.d(num.intValue());
        }
        eVar.a(cVar);
        eVar.a(dVar);
        if (num2 != null) {
            eVar.e(num2.intValue());
        }
        a(eVar, z);
    }

    public static void a(int i, c cVar, Integer num) {
        a(i, cVar, num, null);
    }

    public static void a(int i, c cVar, Integer num, d dVar) {
        a(i, cVar, null, num, dVar);
    }

    public static void a(b bVar) {
        if (com.adsurge.adn.J0.a.a) {
            com.adsurge.adn.J0.a.a("gdt_tag_event", bVar.toString());
        }
    }

    public static void a(i iVar) {
        if (iVar == null) {
            return;
        }
        Boolean bool = (Boolean) c.get();
        if (bool == null) {
            b.add(iVar);
            return;
        }
        if (bool != Boolean.FALSE && j.b(iVar.a())) {
            a((b) iVar);
            h.b bVarB = j.f().b();
            bVarB.b(iVar);
            iVar.a(com.adsurge.adn.D0.a.c().d().b());
            t.c().a(q.a(iVar));
            bVarB.a(iVar);
        }
    }

    public static void a(boolean z, h hVar) {
        if (hVar == null) {
            return;
        }
        if (z) {
            j.a(hVar);
        }
        AtomicReference atomicReference = c;
        Boolean bool = z ? Boolean.TRUE : Boolean.FALSE;
        while (!atomicReference.compareAndSet(null, bool)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        if (!z) {
            a.clear();
            b.clear();
            return;
        }
        while (true) {
            e eVar = (e) a.poll();
            if (eVar == null) {
                break;
            } else {
                a(eVar, false);
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
}
