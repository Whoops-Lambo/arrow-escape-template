package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class qo extends qc0 implements oo, ez, q73 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(qo.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(qo.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(qo.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final dy d;
    public final sy e;

    public static Object F(gr1 gr1Var, Object obj, int i, as0 as0Var) {
        if (obj instanceof kv) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (as0Var != null || (gr1Var instanceof mo)) {
            return new iv(obj, gr1Var instanceof mo ? (mo) gr1Var : null, as0Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        dy dyVar = this.d;
        Throwable th = null;
        oc0 oc0Var = dyVar instanceof oc0 ? (oc0) dyVar : null;
        if (oc0Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oc0.h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(oc0Var);
                tx txVar = l41.b;
                if (obj != txVar) {
                    if (!(obj instanceof Throwable)) {
                        wb0.d(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(oc0Var, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(oc0Var) != obj) {
                            d.r("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(oc0Var, txVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(oc0Var) == txVar);
            }
            if (th == null) {
                return;
            }
            o();
            a(th);
        }
    }

    public final void C(Object obj, wr0 wr0Var) {
        D(obj, this.c, new po(wr0Var, 0));
    }

    public final void D(Object obj, int i, as0 as0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof gr1)) {
                if (obj2 instanceof uo) {
                    uo uoVar = (uo) obj2;
                    if (uo.c.compareAndSet(uoVar, 0, 1)) {
                        if (as0Var != null) {
                            l(as0Var, uoVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                wb0.d(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((gr1) obj2, obj, i, as0Var);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (!y()) {
                        o();
                    }
                    p(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void E(uy uyVar) {
        dy dyVar = this.d;
        oc0 oc0Var = dyVar instanceof oc0 ? (oc0) dyVar : null;
        D(az2.a, (oc0Var != null ? oc0Var.d : null) == uyVar ? 4 : this.c, null);
    }

    public final tx G(Object obj, as0 as0Var) {
        tx txVar = l7.b;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof gr1)) {
                return null;
            }
            Object objF = F((gr1) obj2, obj, this.c, as0Var);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (!y()) {
                        o();
                    }
                    return txVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // defpackage.oo
    public final boolean a(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof gr1)) {
                return false;
            }
            boolean z = (obj instanceof mo) || (obj instanceof f82);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            uo uoVar = new uo(cancellationException, z);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, uoVar)) {
                    gr1 gr1Var = (gr1) obj;
                    if (gr1Var instanceof mo) {
                        k((mo) obj, th);
                    } else if (gr1Var instanceof f82) {
                        m((f82) obj, th);
                    }
                    if (!y()) {
                        o();
                    }
                    p(this.c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // defpackage.q73
    public final void c(f82 f82Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                e32.i("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        w(f82Var);
    }

    @Override // defpackage.qc0
    public final void d(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof gr1) {
                e32.i("Not completed");
                return;
            }
            if (obj instanceof kv) {
                return;
            }
            if (!(obj instanceof iv)) {
                cancellationException2 = cancellationException;
                iv ivVar = new iv(obj, (mo) null, (as0) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ivVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            iv ivVar2 = (iv) obj;
            if (ivVar2.e != null) {
                e32.i("Must be called at most once");
                return;
            }
            iv ivVarA = iv.a(ivVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, ivVarA)) {
                    mo moVar = ivVar2.b;
                    if (moVar != null) {
                        k(moVar, cancellationException);
                    }
                    as0 as0Var = ivVar2.c;
                    if (as0Var != null) {
                        l(as0Var, cancellationException, ivVar2.a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.qc0
    public final dy e() {
        return this.d;
    }

    @Override // defpackage.qc0
    public final Object g(Object obj) {
        return obj instanceof iv ? ((iv) obj).a : obj;
    }

    @Override // defpackage.ez
    public final ez getCallerFrame() {
        dy dyVar = this.d;
        if (dyVar instanceof ez) {
            return (ez) dyVar;
        }
        return null;
    }

    @Override // defpackage.dy
    public final sy getContext() {
        return this.e;
    }

    @Override // defpackage.qc0
    public final Object i() {
        return g.get(this);
    }

    @Override // defpackage.oo
    public final boolean isActive() {
        return g.get(this) instanceof gr1;
    }

    public final void l(as0 as0Var, Throwable th, Object obj) {
        sy syVar = this.e;
        try {
            as0Var.invoke(th, obj, syVar);
        } catch (Throwable th2) {
            c71.m(syVar, new lv("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(f82 f82Var, Throwable th) {
        sy syVar = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            e32.i("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            f82Var.h(i, syVar);
        } catch (Throwable th2) {
            c71.m(syVar, new lv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.oo
    public final void n(Object obj) {
        p(this.c);
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        ad0 ad0Var = (ad0) atomicReferenceFieldUpdater.get(this);
        if (ad0Var == null) {
            return;
        }
        ad0Var.dispose();
        atomicReferenceFieldUpdater.set(this, dr1.a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    e32.i("Already resumed");
                    return;
                }
                boolean z = i == 4;
                dy dyVar = this.d;
                if (!z && (dyVar instanceof oc0)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        oc0 oc0Var = (oc0) dyVar;
                        uy uyVar = oc0Var.d;
                        sy context = oc0Var.e.getContext();
                        if (l41.r(uyVar, context)) {
                            l41.q(uyVar, context, this);
                            return;
                        }
                        fi0 fi0VarA = lp2.a();
                        if (fi0VarA.c >= 4294967296L) {
                            fi0VarA.V(this);
                            return;
                        }
                        fi0VarA.W(true);
                        try {
                            uj2.l(this, dyVar, true);
                            do {
                            } while (fi0VarA.Y());
                        } catch (Throwable th) {
                            try {
                                h(th);
                            } finally {
                                fi0VarA.U(true);
                            }
                        }
                        return;
                    }
                }
                uj2.l(this, dyVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(qb5.q(this.d));
        sb.append("){");
        Object obj = g.get(this);
        if (obj instanceof gr1) {
            str = "Active";
        } else {
            str = obj instanceof uo ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(qb5.i(this));
        return sb.toString();
    }

    public final ad0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c91 c91Var = (c91) this.e.get(nl0.i);
        if (c91Var == null) {
            return null;
        }
        ad0 ad0VarK = u12.k(c91Var, true, new jr(this, 0));
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, ad0VarK)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return ad0VarK;
    }

    public final void v(wr0 wr0Var) {
        w(new lo(wr0Var, 1));
    }

    public final void w(gr1 gr1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g3) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gr1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof mo) || (obj instanceof f82)) {
                z(gr1Var, obj);
                throw null;
            }
            if (obj instanceof kv) {
                kv kvVar = (kv) obj;
                if (!kv.b.compareAndSet(kvVar, 0, 1)) {
                    z(gr1Var, obj);
                    throw null;
                }
                if (obj instanceof uo) {
                    Throwable th = kvVar.a;
                    if (gr1Var instanceof mo) {
                        k((mo) gr1Var, th);
                        return;
                    } else {
                        gr1Var.getClass();
                        m((f82) gr1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof iv)) {
                if (gr1Var instanceof f82) {
                    return;
                }
                gr1Var.getClass();
                iv ivVar = new iv(obj, (mo) gr1Var, (as0) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ivVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            iv ivVar2 = (iv) obj;
            if (ivVar2.b != null) {
                z(gr1Var, obj);
                throw null;
            }
            if (gr1Var instanceof f82) {
                return;
            }
            gr1Var.getClass();
            mo moVar = (mo) gr1Var;
            Throwable th2 = ivVar2.e;
            if (th2 != null) {
                k(moVar, th2);
                return;
            }
            iv ivVarA = iv.a(ivVar2, moVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ivVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    @Override // defpackage.oo
    public final void x(Object obj, as0 as0Var) {
        D(obj, this.c, as0Var);
    }

    public final boolean y() {
        if (this.c == 2) {
            return oc0.h.get((oc0) this.d) != null;
        }
        return false;
    }

    public qo(int i, dy dyVar) {
        super(i);
        this.d = dyVar;
        this.e = dyVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = g3.a;
    }

    @Override // defpackage.qc0
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.oo
    public final tx j(Object obj, as0 as0Var) {
        return G(obj, as0Var);
    }

    public final void k(mo moVar, Throwable th) {
        try {
            moVar.a(th);
        } catch (Throwable th2) {
            c71.m(this.e, new lv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public Throwable q(o91 o91Var) {
        return o91Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        c91 c91Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (zY) {
                        B();
                    }
                    Object obj = g.get(this);
                    if (!(obj instanceof kv)) {
                        int i3 = this.c;
                        if ((i3 == 1 || i3 == 2) && (c91Var = (c91) this.e.get(nl0.i)) != null && !c91Var.isActive()) {
                            CancellationException cancellationException = c91Var.getCancellationException();
                            d(cancellationException);
                            throw cancellationException;
                        }
                        return g(obj);
                    }
                    throw ((kv) obj).a;
                }
                e32.i("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((ad0) h.get(this)) == null) {
            u();
        }
        if (zY) {
            B();
        }
        return dz.a;
    }

    @Override // defpackage.dy
    public final void resumeWith(Object obj) {
        Throwable thB = k52.b(obj);
        if (thB != null) {
            obj = new kv(thB, false);
        }
        D(obj, this.c, null);
    }

    public final void s() {
        ad0 ad0VarU = u();
        if (ad0VarU != null && !(g.get(this) instanceof gr1)) {
            ad0VarU.dispose();
            h.set(this, dr1.a);
        }
    }
}
