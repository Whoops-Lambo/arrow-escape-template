package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kz1 extends k0 implements lz1, vp {
    public final gk d;

    public kz1(sy syVar, gk gkVar) {
        super(syVar, true);
        this.d = gkVar;
    }

    @Override // defpackage.k0
    public final void a0(Throwable th, boolean z) {
        if (this.d.k(th, false) || z) {
            return;
        }
        c71.m(this.c, th);
    }

    @Override // defpackage.k0
    public final void b0(Object obj) {
        this.d.j(null);
    }

    @Override // defpackage.f92
    public final Object c(Object obj) {
        return this.d.c(obj);
    }

    public final boolean d0(Throwable th) {
        return this.d.k(th, false);
    }

    @Override // defpackage.c32
    public final Object e(nu nuVar) {
        gk gkVar = this.d;
        gkVar.getClass();
        return gk.B(gkVar, nuVar);
    }

    public final void e0(jz1 jz1Var) {
        gk gkVar = this.d;
        gkVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gk.j;
        while (!atomicReferenceFieldUpdater.compareAndSet(gkVar, null, jz1Var)) {
            if (atomicReferenceFieldUpdater.get(gkVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(gkVar);
                    tx txVar = ik.q;
                    if (obj != txVar) {
                        if (obj == ik.r) {
                            e32.i("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            wb0.d(obj, "Another handler is already registered: ");
                            return;
                        }
                    }
                    tx txVar2 = ik.r;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(gkVar, txVar, txVar2)) {
                            jz1Var.invoke(gkVar.p());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(gkVar) == txVar);
                }
            }
        }
    }

    @Override // defpackage.c32
    public final Object f() {
        return this.d.f();
    }

    @Override // defpackage.c32
    public final Object g(ul2 ul2Var) {
        return this.d.g(ul2Var);
    }

    @Override // defpackage.f92
    public final Object h(dy dyVar, Object obj) {
        return this.d.h(dyVar, obj);
    }

    @Override // defpackage.c32
    public final gq iterator() {
        gk gkVar = this.d;
        gkVar.getClass();
        return new dk(gkVar);
    }

    @Override // defpackage.o91, defpackage.c91
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new d91(u(), null, this);
        }
        q(cancellationException);
    }

    @Override // defpackage.o91
    public final void q(CancellationException cancellationException) {
        CancellationException cancellationExceptionX = o91.X(this, cancellationException);
        this.d.k(cancellationExceptionX, true);
        p(cancellationExceptionX);
    }
}
