package io.p071bidmachine.rendering.internal.state;

import defpackage.n30;
import io.p071bidmachine.media3.exoplayer.offline.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class d {
    public final b a;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final LinkedHashSet q;

    public final boolean g() {
        boolean zCompareAndSet = this.e.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(5);
        }
        return zCompareAndSet;
    }

    public final boolean h() {
        boolean zCompareAndSet = this.i.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(7);
        }
        return zCompareAndSet;
    }

    public final void a(int i) {
        synchronized (this.q) {
            Iterator it = this.q.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(this, i);
            }
        }
    }

    public final boolean b() {
        boolean zCompareAndSet = this.c.compareAndSet(false, true);
        if (zCompareAndSet) {
            a(1);
        }
        return zCompareAndSet;
    }

    public final boolean c(boolean z) {
        boolean z2 = false;
        this.c.set(false);
        this.b.set(z);
        if (this.g.compareAndSet(false, true) && !this.f.get()) {
            z2 = true;
        }
        if (z2) {
            a(z ? 2 : 3);
        }
        return z2;
    }

    public final boolean d(boolean z) {
        boolean zCompareAndSet = this.m.compareAndSet(!z, z);
        if (zCompareAndSet) {
            a(z ? 10 : 11);
        }
        return zCompareAndSet;
    }

    public final boolean e() {
        return this.b.get() && !this.f.get();
    }

    public final void f() {
        this.f.set(true);
        this.b.set(false);
        this.c.set(false);
        this.d.set(false);
        this.e.set(false);
        this.g.set(false);
        this.h.set(false);
        this.i.set(false);
        this.j.set(false);
        this.k.set(false);
        this.l.set(false);
        this.m.set(false);
        this.n.set(false);
        this.o.set(false);
        this.p.set(false);
        a(16);
        synchronized (this.q) {
            this.q.clear();
        }
    }

    public d(String str) {
        str.getClass();
        this.a = new b(n30.g(')', "AdStateImpl (", str));
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f = atomicBoolean;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.q = linkedHashSet;
        c cVar = new c(this);
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (linkedHashSet) {
            linkedHashSet.add(cVar);
        }
    }
}
