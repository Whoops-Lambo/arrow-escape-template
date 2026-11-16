package defpackage;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class kl implements rl, om {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(kl.class, Object.class, "suspensionSlot");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(kl.class, Object.class, "_closedCause");
    private volatile int flushBufferSize;
    public final bk b = new bk();
    public final Object c = new Object();

    @NotNull
    volatile /* synthetic */ Object suspensionSlot = al.b;
    public final bk d = new bk();
    public final bk e = new bk();

    @NotNull
    volatile /* synthetic */ Object _closedCause = null;

    @Override // defpackage.rl
    public final void a(Throwable th) {
        if (this._closedCause != null) {
            return;
        }
        ts tsVar = new ts(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tsVar) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        i(tsVar.a(ss.b));
    }

    @Override // defpackage.rl
    public final Throwable b() {
        ts tsVar = (ts) this._closedCause;
        if (tsVar != null) {
            return tsVar.a(ss.b);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.om
    public final Object c(dy dyVar) {
        hl hlVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        az2 az2Var;
        if (dyVar instanceof hl) {
            hlVar = (hl) dyVar;
            int i = hlVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                hlVar.t = i - Integer.MIN_VALUE;
            } else {
                hlVar = new hl(this, dyVar);
            }
        } else {
            hlVar = new hl(this, dyVar);
        }
        Object obj = hlVar.r;
        int i2 = hlVar.t;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                hlVar.t = 1;
                Object objD = d(hlVar);
                Object obj2 = dz.a;
                if (objD == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
        } catch (Throwable unused) {
        }
        ts tsVar = at.c;
        do {
            atomicReferenceFieldUpdater = g;
            boolean zCompareAndSet = atomicReferenceFieldUpdater.compareAndSet(this, null, tsVar);
            az2Var = az2.a;
            if (zCompareAndSet) {
                i(null);
                return az2Var;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return az2Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.om
    public final Object d(fy fyVar) throws Throwable {
        gl glVar;
        kl klVar;
        el elVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        al alVar = al.b;
        az2 az2Var = az2.a;
        if (fyVar instanceof gl) {
            glVar = (gl) fyVar;
            int i = glVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                glVar.u = i - Integer.MIN_VALUE;
            } else {
                glVar = new gl(this, fyVar);
            }
        } else {
            glVar = new gl(this, fyVar);
        }
        Object obj = glVar.s;
        dz dzVar = dz.a;
        int i2 = glVar.u;
        if (i2 == 0) {
            wz2.a0(obj);
            Throwable thB = b();
            if (thB != null) {
                throw thB;
            }
            j();
            if (this.flushBufferSize >= 1048576) {
                klVar = this;
            }
            return az2Var;
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        klVar = glVar.r;
        wz2.a0(obj);
        while (this.flushBufferSize >= 1048576 && this._closedCause == null) {
            glVar.r = klVar;
            glVar.u = 1;
            qo qoVar = new qo(1, kc2.q(glVar));
            qoVar.s();
            dl dlVar = new dl(qoVar);
            el elVar2 = (el) klVar.suspensionSlot;
            boolean z = elVar2 instanceof zk;
            if (z) {
                if (elVar2 instanceof dl) {
                    cl clVar = (cl) elVar2;
                    clVar.a(new rw("write", clVar.b()));
                } else if (elVar2 instanceof cl) {
                    ((cl) elVar2).resume();
                } else if (z) {
                    dlVar.a(((zk) elVar2).b);
                } else if (!s71.b(elVar2, alVar)) {
                    e.b();
                    return null;
                }
                if (this.flushBufferSize >= 1048576) {
                    elVar = (el) klVar.suspensionSlot;
                    if (elVar instanceof dl) {
                        atomicReferenceFieldUpdater = f;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(klVar, elVar, alVar)) {
                                ((cl) elVar).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(klVar) == elVar);
                    }
                } else {
                    elVar = (el) klVar.suspensionSlot;
                    if (elVar instanceof dl) {
                        atomicReferenceFieldUpdater = f;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(klVar, elVar, alVar)) {
                                ((cl) elVar).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(klVar) == elVar);
                    }
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(klVar, elVar2, dlVar)) {
                        if (elVar2 instanceof dl) {
                            cl clVar2 = (cl) elVar2;
                            clVar2.a(new rw("write", clVar2.b()));
                        } else if (elVar2 instanceof cl) {
                            ((cl) elVar2).resume();
                        } else if (z) {
                            dlVar.a(((zk) elVar2).b);
                        } else if (!s71.b(elVar2, alVar)) {
                            e.b();
                            return null;
                        }
                        if (this.flushBufferSize >= 1048576 || this._closedCause != null) {
                            elVar = (el) klVar.suspensionSlot;
                            if (elVar instanceof dl) {
                                atomicReferenceFieldUpdater = f;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(klVar, elVar, alVar)) {
                                        ((cl) elVar).resume();
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(klVar) == elVar);
                            }
                        }
                    } else if (atomicReferenceFieldUpdater2.get(klVar) != elVar2) {
                        dlVar.resume();
                    }
                }
            }
            if (qoVar.r() == dzVar) {
                return dzVar;
            }
        }
        return az2Var;
    }

    @Override // defpackage.om
    public final bk e() throws Throwable {
        Throwable thA;
        if (this._closedCause == null) {
            return this.e;
        }
        ts tsVar = (ts) this._closedCause;
        if (tsVar == null || (thA = tsVar.a(jl.b)) == null) {
            throw new zs(null, 1, null);
        }
        throw thA;
    }

    @Override // defpackage.rl
    public final bk f() throws Throwable {
        Throwable thA;
        ts tsVar = (ts) this._closedCause;
        if (tsVar != null && (thA = tsVar.a(il.b)) != null) {
            throw thA;
        }
        if (this.d.exhausted()) {
            k();
        }
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd A[SYNTHETIC] */
    @Override // defpackage.rl
    public final Object g(int i, fy fyVar) throws Throwable {
        fl flVar;
        kl klVar;
        qo qoVar;
        el elVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        al alVar = al.b;
        if (fyVar instanceof fl) {
            flVar = (fl) fyVar;
            int i2 = flVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flVar.v = i2 - Integer.MIN_VALUE;
            } else {
                flVar = new fl(this, fyVar);
            }
        } else {
            flVar = new fl(this, fyVar);
        }
        Object obj = flVar.t;
        dz dzVar = dz.a;
        int i3 = flVar.v;
        if (i3 == 0) {
            wz2.a0(obj);
            Throwable thB = b();
            if (thB != null) {
                throw thB;
            }
            if (this.d.c >= i) {
                return Boolean.TRUE;
            }
            klVar = this;
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = flVar.r;
            klVar = flVar.s;
            wz2.a0(obj);
        }
        do {
            long j = i;
            if (((long) this.flushBufferSize) + this.d.c >= j || this._closedCause != null) {
                if (this.d.c < 1048576) {
                    k();
                }
                return Boolean.valueOf(this.d.c >= j);
            }
            flVar.s = klVar;
            flVar.r = i;
            flVar.v = 1;
            qoVar = new qo(1, kc2.q(flVar));
            qoVar.s();
            bl blVar = new bl(qoVar);
            el elVar2 = (el) klVar.suspensionSlot;
            boolean z = elVar2 instanceof zk;
            if (z) {
                if (elVar2 instanceof bl) {
                    cl clVar = (cl) elVar2;
                    clVar.a(new rw("read", clVar.b()));
                } else if (elVar2 instanceof cl) {
                    ((cl) elVar2).resume();
                } else if (z) {
                    blVar.a(((zk) elVar2).b);
                } else if (!s71.b(elVar2, alVar)) {
                    e.b();
                    return null;
                }
                if (((long) this.flushBufferSize) + this.d.c < j) {
                    elVar = (el) klVar.suspensionSlot;
                    if (elVar instanceof bl) {
                        atomicReferenceFieldUpdater = f;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(klVar, elVar, alVar)) {
                                ((cl) elVar).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(klVar) == elVar);
                    }
                } else {
                    elVar = (el) klVar.suspensionSlot;
                    if (elVar instanceof bl) {
                        atomicReferenceFieldUpdater = f;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(klVar, elVar, alVar)) {
                                ((cl) elVar).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(klVar) == elVar);
                    }
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(klVar, elVar2, blVar)) {
                        if (elVar2 instanceof bl) {
                            cl clVar2 = (cl) elVar2;
                            clVar2.a(new rw("read", clVar2.b()));
                        } else if (elVar2 instanceof cl) {
                            ((cl) elVar2).resume();
                        } else if (z) {
                            blVar.a(((zk) elVar2).b);
                        } else if (!s71.b(elVar2, alVar)) {
                            e.b();
                            return null;
                        }
                        if (((long) this.flushBufferSize) + this.d.c < j || this._closedCause != null) {
                            elVar = (el) klVar.suspensionSlot;
                            if (elVar instanceof bl) {
                                atomicReferenceFieldUpdater = f;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(klVar, elVar, alVar)) {
                                        ((cl) elVar).resume();
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(klVar) == elVar);
                            }
                        }
                    } else if (atomicReferenceFieldUpdater2.get(klVar) != elVar2) {
                        blVar.resume();
                    }
                }
            }
        } while (qoVar.r() != dzVar);
        return dzVar;
    }

    public final void i(Throwable th) {
        zk zkVar;
        if (th != null) {
            zkVar = new zk(th);
        } else {
            el.a.getClass();
            zkVar = ng1.g;
        }
        el elVar = (el) f.getAndSet(this, zkVar);
        if (elVar instanceof cl) {
            ((cl) elVar).a(th);
        }
    }

    public final void j() {
        if (this.e.exhausted()) {
            return;
        }
        synchronized (this.c) {
            bk bkVar = this.e;
            int i = (int) bkVar.c;
            this.b.o(bkVar);
            this.flushBufferSize += i;
        }
        el elVar = (el) this.suspensionSlot;
        if (elVar instanceof bl) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            al alVar = al.b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, elVar, alVar)) {
                if (atomicReferenceFieldUpdater.get(this) != elVar) {
                    return;
                }
            }
            ((cl) elVar).resume();
        }
    }

    public final void k() {
        synchronized (this.c) {
            this.b.q(this.d);
            this.flushBufferSize = 0;
        }
        el elVar = (el) this.suspensionSlot;
        if (elVar instanceof dl) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            al alVar = al.b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, elVar, alVar)) {
                if (atomicReferenceFieldUpdater.get(this) != elVar) {
                    return;
                }
            }
            ((cl) elVar).resume();
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    @Override // defpackage.rl
    public final boolean h() {
        if (b() == null) {
            if (this._closedCause == null || this.flushBufferSize != 0 || !this.d.exhausted()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
