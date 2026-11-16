package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pp1 extends z82 implements Mutex {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(pp1.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public pp1() {
        super(1);
        this.owner$volatile = eu.a;
    }

    public final boolean d() {
        return Math.max(z82.g.get(this), 0) == 0;
    }

    public final boolean f() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z82.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + qb5.i(this) + "[isLocked=" + d() + ",owner=" + h.get(this) + ']';
    }

    public final Object e(dy dyVar) {
        boolean zF = f();
        az2 az2Var = az2.a;
        if (!zF) {
            qo qoVarL = c71.l(kc2.q(dyVar));
            try {
                op1 op1Var = new op1(this, qoVarL);
                while (true) {
                    int andDecrement = z82.g.getAndDecrement(this);
                    if (andDecrement <= this.a) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                            pp1 pp1Var = op1Var.b;
                            atomicReferenceFieldUpdater.set(pp1Var, null);
                            op1Var.a.C(az2Var, new ej1(pp1Var, op1Var));
                            break;
                        }
                        if (b(op1Var)) {
                            break;
                        }
                    }
                }
                Object objR = qoVarL.r();
                dz dzVar = dz.a;
                if (objR != dzVar) {
                    objR = az2Var;
                }
                if (objR == dzVar) {
                    return objR;
                }
            } catch (Throwable th) {
                qoVarL.B();
                throw th;
            }
        }
        return az2Var;
    }

    public final void g(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            tx txVar = eu.a;
            if (obj2 != txVar) {
                if (obj2 != obj && obj != null) {
                    ak1.k("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, txVar)) {
                        c();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        e32.i("This mutex is not locked");
    }
}
