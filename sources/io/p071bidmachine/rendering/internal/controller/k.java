package io.p071bidmachine.rendering.internal.controller;

import io.p071bidmachine.rendering.internal.adform.a;
import io.p071bidmachine.t1;
import io.p071bidmachine.util.e;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class k {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ a0 b;

    public abstract void f(a aVar);

    public void a(a aVar) {
        t1.l(this.b.b, "AdElement (" + aVar + ") - onAdFormShown", false, new Object[0]);
    }

    public final void d(a aVar, e eVar) {
        t1.l(this.b.b, "AdElement (" + aVar + ") - onAdFormFailToShow - " + eVar, true, new Object[0]);
    }

    public void e(a aVar, e eVar) {
        t1.l(this.b.b, "AdElement (" + aVar + ") - onAdFormExpired - " + eVar, true, new Object[0]);
        g(aVar);
    }

    public k(a0 a0Var) {
        this.b = a0Var;
    }

    public void b(a aVar, e eVar) {
        aVar.getClass();
        eVar.getClass();
        a0 a0Var = this.b;
        t1.l(a0Var.b, "AdElement (" + aVar + ") - onAdFormFailToLoad - " + eVar, true, new Object[0]);
        a0Var.l.remove(aVar);
        if (aVar.l.get() && a0Var.c.g()) {
            a0Var.d.a(a0Var, eVar);
        }
        g(aVar);
    }

    public final void c(a aVar) {
        aVar.getClass();
        if (!this.a.compareAndSet(false, true)) {
            return;
        }
        a0 a0Var = this.b;
        t1.l(a0Var.b, "AdElement (" + aVar + ") - onAdFormLoaded", false, new Object[0]);
        a0Var.l.remove(aVar);
        f(aVar);
    }

    public final void g(a aVar) {
        aVar.getClass();
        a0 a0Var = this.b;
        a0Var.m.remove(aVar);
        if (!a0Var.m.isEmpty() || !a0Var.c.g()) {
            return;
        }
        a0Var.d.c(a0Var);
    }
}
