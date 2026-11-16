package io.p071bidmachine.media3.exoplayer.source;

import android.os.Looper;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.y;
import io.p071bidmachine.media3.exoplayer.analytics.j;
import io.p071bidmachine.media3.exoplayer.drm.d;
import io.p071bidmachine.media3.exoplayer.drm.e;
import io.p071bidmachine.media3.exoplayer.drm.f;
import io.p071bidmachine.media3.exoplayer.upstream.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final e c;
    public final e d;
    public Looper e;
    public r0 f;
    public j g;

    public abstract b0 b(d0 d0Var, c cVar, long j);

    public void d() {
    }

    public void f() {
    }

    public r0 g() {
        return null;
    }

    public abstract y h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public abstract void l(io.p071bidmachine.media3.exoplayer.upstream.e eVar);

    public abstract void n(b0 b0Var);

    public abstract void p();

    public abstract void s(y yVar);

    public final e a(d0 d0Var) {
        return new e(this.c.c, 0, d0Var);
    }

    public final void c(e0 e0Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(e0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(e0 e0Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(e0Var);
        if (zIsEmpty) {
            f();
        }
    }

    public final void m(r0 r0Var) {
        this.f = r0Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((e0) obj).a(this, r0Var);
        }
    }

    public final void o(e0 e0Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(e0Var);
        if (!arrayList.isEmpty()) {
            c(e0Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
    }

    public final void q(f fVar) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList = this.d.c;
        for (d dVar : copyOnWriteArrayList) {
            if (dVar.a == fVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void r(h0 h0Var) {
        CopyOnWriteArrayList<g0> copyOnWriteArrayList = this.c.c;
        for (g0 g0Var : copyOnWriteArrayList) {
            if (g0Var.b == h0Var) {
                copyOnWriteArrayList.remove(g0Var);
            }
        }
    }

    public a() {
        int i = 0;
        d0 d0Var = null;
        this.c = new e(new CopyOnWriteArrayList(), i, d0Var);
        this.d = new e(new CopyOnWriteArrayList(), i, d0Var);
    }

    public final void k(e0 e0Var, io.p071bidmachine.media3.exoplayer.upstream.e eVar, j jVar) {
        boolean z;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        } else {
            z = true;
        }
        io.p071bidmachine.media3.common.util.a.c(z);
        this.g = jVar;
        r0 r0Var = this.f;
        this.a.add(e0Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(e0Var);
            l(eVar);
        } else if (r0Var != null) {
            e(e0Var);
            e0Var.a(this, r0Var);
        }
    }
}
