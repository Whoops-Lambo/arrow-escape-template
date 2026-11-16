package io.p071bidmachine.media3.exoplayer.source;

import android.os.Handler;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.exoplayer.analytics.j;
import io.p071bidmachine.media3.exoplayer.drm.d;
import io.p071bidmachine.media3.exoplayer.upstream.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public e j;

    public abstract d0 t(Object obj, d0 d0Var);

    public long u(Object obj, long j) {
        return j;
    }

    public int v(Object obj, int i) {
        return i;
    }

    public abstract void w(Object obj, a aVar, r0 r0Var);

    @Override // io.p071bidmachine.media3.exoplayer.source.a
    public final void d() {
        for (k kVar : this.h.values()) {
            kVar.a.c(kVar.b);
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.a
    public final void f() {
        for (k kVar : this.h.values()) {
            kVar.a.e(kVar.b);
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.a
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).a.j();
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.a
    public void p() {
        HashMap map = this.h;
        for (k kVar : map.values()) {
            a aVar = kVar.a;
            j jVar = kVar.c;
            aVar.o(kVar.b);
            aVar.r(jVar);
            aVar.q(jVar);
        }
        map.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.bidmachine.media3.exoplayer.source.e0, io.bidmachine.media3.exoplayer.source.i] */
    public final void x(final Object obj, a aVar) {
        HashMap map = this.h;
        a.c(!map.containsKey(obj));
        ?? r1 = new e0() { // from class: io.bidmachine.media3.exoplayer.source.i
            @Override // io.p071bidmachine.media3.exoplayer.source.e0
            public final void a(a aVar2, r0 r0Var) {
                this.a.w(obj, aVar2, r0Var);
            }
        };
        j jVar = new j(this, obj);
        map.put(obj, new k(aVar, r1, jVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        io.p071bidmachine.media3.exoplayer.drm.e eVar = aVar.c;
        eVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.c;
        g0 g0Var = new g0();
        g0Var.a = handler;
        g0Var.b = jVar;
        copyOnWriteArrayList.add(g0Var);
        this.i.getClass();
        io.p071bidmachine.media3.exoplayer.drm.e eVar2 = aVar.d;
        eVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = eVar2.c;
        d dVar = new d();
        dVar.a = jVar;
        copyOnWriteArrayList2.add(dVar);
        e eVar3 = this.j;
        j jVar2 = this.g;
        a.j(jVar2);
        aVar.k(r1, eVar3, jVar2);
        if (this.b.isEmpty()) {
            aVar.c(r1);
        }
    }
}
