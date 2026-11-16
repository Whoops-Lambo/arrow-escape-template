package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class z82 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(z82.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(z82.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(z82.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(z82.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(z82.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final po b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public final Object a(fy fyVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        az2 az2Var = az2.a;
        if (andDecrement <= 0) {
            qo qoVarL = c71.l(kc2.q(fyVar));
            try {
                if (!b(qoVarL)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                qoVarL.x(az2Var, this.b);
                                break;
                            }
                            if (b(qoVarL)) {
                                break;
                            }
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

    public final boolean b(q73 q73Var) {
        Object objI;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        c92 c92Var = (c92) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        x82 x82Var = x82.b;
        long j = andIncrement / ((long) b92.f);
        loop0: while (true) {
            objI = h00.i(c92Var, j, x82Var);
            if (!ak.q(objI)) {
                f82 f82VarJ = ak.j(objI);
                while (true) {
                    f82 f82Var = (f82) atomicReferenceFieldUpdater.get(this);
                    if (f82Var.c >= f82VarJ.c) {
                        break loop0;
                    }
                    if (!f82VarJ.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, f82Var, f82VarJ)) {
                            if (!f82Var.f()) {
                                break loop0;
                            }
                            f82Var.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == f82Var);
                    if (f82VarJ.f()) {
                        f82VarJ.e();
                    }
                }
            } else {
                break;
            }
        }
        c92 c92Var2 = (c92) ak.j(objI);
        AtomicReferenceArray atomicReferenceArray = c92Var2.e;
        int i = (int) (andIncrement % ((long) b92.f));
        while (!atomicReferenceArray.compareAndSet(i, null, q73Var)) {
            if (atomicReferenceArray.get(i) != null) {
                tx txVar = b92.b;
                tx txVar2 = b92.c;
                while (!atomicReferenceArray.compareAndSet(i, txVar, txVar2)) {
                    if (atomicReferenceArray.get(i) != txVar) {
                        return false;
                    }
                }
                ((oo) q73Var).x(az2.a, this.b);
                return true;
            }
        }
        q73Var.c(c92Var2, i);
        return true;
    }

    public final void c() {
        int i;
        Object objI;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            c92 c92Var = (c92) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / ((long) b92.f);
            y82 y82Var = y82.b;
            while (true) {
                objI = h00.i(c92Var, j, y82Var);
                if (!ak.q(objI)) {
                    f82 f82VarJ = ak.j(objI);
                    while (true) {
                        f82 f82Var = (f82) atomicReferenceFieldUpdater.get(this);
                        if (f82Var.c >= f82VarJ.c) {
                            break;
                        }
                        if (!f82VarJ.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, f82Var, f82VarJ)) {
                                if (!f82Var.f()) {
                                    break;
                                }
                                f82Var.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == f82Var);
                        if (f82VarJ.f()) {
                            f82VarJ.e();
                        }
                    }
                } else {
                    break;
                }
            }
            c92 c92Var2 = (c92) ak.j(objI);
            AtomicReferenceArray atomicReferenceArray = c92Var2.e;
            c92Var2.b();
            z = false;
            if (c92Var2.c <= j) {
                int i3 = (int) (andIncrement2 % ((long) b92.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, b92.b);
                if (andSet == null) {
                    int i4 = b92.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            tx txVar = b92.b;
                            tx txVar2 = b92.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, txVar, txVar2)) {
                                    z = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == txVar);
                            z = !z;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == b92.c) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                } else if (andSet != b92.e) {
                    boolean z2 = andSet instanceof oo;
                    az2 az2Var = az2.a;
                    if (z2) {
                        oo ooVar = (oo) andSet;
                        tx txVarJ = ooVar.j(az2Var, this.b);
                        if (txVarJ != null) {
                            ooVar.n(txVarJ);
                            z = true;
                            break;
                            break;
                        }
                    } else if (!(andSet instanceof s82)) {
                        wb0.d(andSet, "unexpected: ");
                        return;
                    } else if (((s82) andSet).g(this, az2Var) == 0) {
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }

    public z82(int i) {
        this.a = i;
        if (i > 0) {
            if (i >= 0) {
                c92 c92Var = new c92(0L, null, 2);
                this.head$volatile = c92Var;
                this.tail$volatile = c92Var;
                this._availablePermits$volatile = i;
                this.b = new po(this, 2);
                return;
            }
            ak1.n(pv1.k(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        ak1.n(pv1.k(i, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }
}
