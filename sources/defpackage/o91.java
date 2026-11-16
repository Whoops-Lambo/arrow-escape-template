package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class o91 implements c91, mr {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(o91.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(o91.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public boolean C() {
        return true;
    }

    public boolean G(Throwable th) {
        return false;
    }

    public void H(lv lvVar) {
        throw lvVar;
    }

    public void R(Object obj) {
    }

    public void S() {
    }

    public void i(Object obj) {
    }

    public static String W(Object obj) {
        if (!(obj instanceof i91)) {
            if (obj instanceof v51) {
                return ((v51) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof kv ? "Cancelled" : "Completed";
        }
        i91 i91Var = (i91) obj;
        if (i91Var.d()) {
            return "Cancelling";
        }
        return i91.b.get(i91Var) == 1 ? "Completing" : "Active";
    }

    public static CancellationException X(o91 o91Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new d91(o91Var.u(), th, o91Var) : cancellationException;
    }

    public final Object A() throws Throwable {
        Object obj = a.get(this);
        if (obj instanceof v51) {
            e32.i("This job has not completed yet");
            return null;
        }
        if (obj instanceof kv) {
            throw ((kv) obj).a;
        }
        return u12.t(obj);
    }

    public final x41 D() {
        os2.j(3, l91.b);
        os2.j(3, m91.b);
        return new x41(this);
    }

    public boolean E() {
        return this instanceof gv;
    }

    public final void I(c91 c91Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        dr1 dr1Var = dr1.a;
        if (c91Var == null) {
            atomicReferenceFieldUpdater.set(this, dr1Var);
            return;
        }
        c91Var.start();
        kr krVarAttachChild = c91Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, krVarAttachChild);
        if (isCompleted()) {
            krVarAttachChild.dispose();
            atomicReferenceFieldUpdater.set(this, dr1Var);
        }
    }

    public final ad0 J(boolean z, f91 f91Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zC;
        f91Var.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof ag0;
            dr1 dr1Var = dr1.a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof v51)) {
                    z2 = false;
                    break;
                }
                v51 v51Var = (v51) obj;
                br1 br1VarB = v51Var.b();
                if (br1VarB == null) {
                    U((f91) obj);
                } else {
                    if (f91Var.i()) {
                        i91 i91Var = v51Var instanceof i91 ? (i91) v51Var : null;
                        Throwable thC = i91Var != null ? i91Var.c() : null;
                        if (thC == null) {
                            zC = br1VarB.c(f91Var, 5);
                        } else if (z) {
                            f91Var.j(thC);
                            return dr1Var;
                        }
                    } else {
                        zC = br1VarB.c(f91Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                ag0 ag0Var = (ag0) obj;
                if (ag0Var.a) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, f91Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    T(ag0Var);
                }
            }
            return dr1Var;
        }
        if (z2) {
            return f91Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            kv kvVar = obj2 instanceof kv ? (kv) obj2 : null;
            f91Var.j(kvVar != null ? kvVar.a : null);
        }
        return dr1Var;
    }

    public boolean L() {
        return this instanceof fj;
    }

    public final boolean M(Object obj) {
        Object objY;
        do {
            objY = Y(a.get(this), obj);
            if (objY == u12.a) {
                return false;
            }
            if (objY == u12.b) {
                return true;
            }
        } while (objY == u12.c);
        i(objY);
        return true;
    }

    public final Object N(Object obj) {
        Object objY;
        do {
            objY = Y(a.get(this), obj);
            if (objY == u12.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                kv kvVar = obj instanceof kv ? (kv) obj : null;
                throw new IllegalStateException(str, kvVar != null ? kvVar.a : null);
            }
        } while (objY == u12.c);
        return objY;
    }

    public final void Q(br1 br1Var, Throwable th) {
        br1Var.c(new se1(4), 4);
        Object obj = mf1.a.get(br1Var);
        obj.getClass();
        lv lvVar = null;
        for (mf1 mf1VarF = (mf1) obj; !mf1VarF.equals(br1Var); mf1VarF = mf1VarF.f()) {
            if ((mf1VarF instanceof f91) && ((f91) mf1VarF).i()) {
                try {
                    ((f91) mf1VarF).j(th);
                } catch (Throwable th2) {
                    if (lvVar != null) {
                        l7.a(lvVar, th2);
                    } else {
                        lvVar = new lv("Exception in completion handler " + mf1VarF + " for " + this, th2);
                    }
                }
            }
        }
        if (lvVar != null) {
            H(lvVar);
        }
        s(th);
    }

    public final void T(ag0 ag0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        br1 br1Var = new br1();
        Object u51Var = br1Var;
        if (!ag0Var.a) {
            u51Var = new u51(br1Var);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, ag0Var, u51Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == ag0Var);
    }

    public final void U(f91 f91Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        br1 br1Var = new br1();
        f91Var.getClass();
        mf1.b.set(br1Var, f91Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mf1.a;
        atomicReferenceFieldUpdater2.set(br1Var, f91Var);
        loop0: while (atomicReferenceFieldUpdater2.get(f91Var) == f91Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(f91Var, f91Var, br1Var)) {
                    br1Var.e(f91Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(f91Var) == f91Var);
        }
        mf1 mf1VarF = f91Var.f();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f91Var, mf1VarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f91Var);
    }

    public final int V(Object obj) {
        boolean z = obj instanceof ag0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((ag0) obj).a) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u12.g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            S();
            return 1;
        }
        if (!(obj instanceof u51)) {
            return 0;
        }
        br1 br1Var = ((u51) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, br1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        S();
        return 1;
    }

    public final Object Y(Object obj, Object obj2) {
        if (!(obj instanceof v51)) {
            return u12.a;
        }
        if (((obj instanceof ag0) || (obj instanceof f91)) && !(obj instanceof lr) && !(obj2 instanceof kv)) {
            v51 v51Var = (v51) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object w51Var = obj2 instanceof v51 ? new w51((v51) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, v51Var, w51Var)) {
                if (atomicReferenceFieldUpdater.get(this) != v51Var) {
                    return u12.c;
                }
            }
            R(obj2);
            w(v51Var, obj2);
            return obj2;
        }
        v51 v51Var2 = (v51) obj;
        br1 br1VarF = F(v51Var2);
        if (br1VarF == null) {
            return u12.c;
        }
        i91 i91Var = v51Var2 instanceof i91 ? (i91) v51Var2 : null;
        if (i91Var == null) {
            i91Var = new i91(br1VarF, null);
        }
        synchronized (i91Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i91.b;
            if (atomicIntegerFieldUpdater.get(i91Var) == 1) {
                return u12.a;
            }
            atomicIntegerFieldUpdater.set(i91Var, 1);
            if (i91Var != v51Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, v51Var2, i91Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != v51Var2) {
                        return u12.c;
                    }
                }
            }
            boolean zD = i91Var.d();
            kv kvVar = obj2 instanceof kv ? (kv) obj2 : null;
            if (kvVar != null) {
                i91Var.a(kvVar.a);
            }
            Throwable thC = zD ? null : i91Var.c();
            if (thC != null) {
                Q(br1VarF, thC);
            }
            lr lrVarP = P(br1VarF);
            if (lrVarP != null && Z(i91Var, lrVarP, obj2)) {
                return u12.b;
            }
            br1VarF.c(new se1(2), 2);
            lr lrVarP2 = P(br1VarF);
            return (lrVarP2 == null || !Z(i91Var, lrVarP2, obj2)) ? z(i91Var, obj2) : u12.b;
        }
    }

    public final boolean Z(i91 i91Var, lr lrVar, Object obj) {
        while (u12.k(lrVar.e, false, new h91(this, i91Var, lrVar, obj)) == dr1.a) {
            lrVar = P(lrVar);
            if (lrVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.c91
    public final kr attachChild(mr mrVar) {
        lr lrVar = new lr(mrVar);
        lrVar.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof ag0) {
                ag0 ag0Var = (ag0) obj;
                if (ag0Var.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lrVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                T(ag0Var);
            } else {
                boolean z = obj instanceof v51;
                dr1 dr1Var = dr1.a;
                Throwable thC = null;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    kv kvVar = obj2 instanceof kv ? (kv) obj2 : null;
                    lrVar.j(kvVar != null ? kvVar.a : null);
                    return dr1Var;
                }
                br1 br1VarB = ((v51) obj).b();
                if (br1VarB != null) {
                    if (br1VarB.c(lrVar, 7)) {
                        break;
                    }
                    boolean zC = br1VarB.c(lrVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof i91) {
                        thC = ((i91) obj3).c();
                    } else {
                        kv kvVar2 = obj3 instanceof kv ? (kv) obj3 : null;
                        if (kvVar2 != null) {
                            thC = kvVar2.a;
                        }
                    }
                    lrVar.j(thC);
                    if (zC) {
                        break;
                    }
                    return dr1Var;
                }
                U((f91) obj);
            }
        }
        return lrVar;
    }

    @Override // defpackage.c91
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new d91(u(), null, this);
        }
        q(cancellationException);
    }

    @Override // defpackage.c91
    public final CancellationException getCancellationException() {
        Object obj = a.get(this);
        if (!(obj instanceof i91)) {
            if (!(obj instanceof v51)) {
                return obj instanceof kv ? X(this, ((kv) obj).a) : new d91(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            wb0.d(this, "Job is still new or active: ");
            return null;
        }
        Throwable thC = ((i91) obj).c();
        if (thC == null) {
            wb0.d(this, "Job is still new or active: ");
            return null;
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new d91(strConcat, thC, this) : cancellationException;
    }

    @Override // defpackage.c91
    public final l92 getChildren() {
        return new p8(new k91(null, this), 3);
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = a.get(this);
        if (obj instanceof v51) {
            e32.i("This job has not completed yet");
            return null;
        }
        kv kvVar = obj instanceof kv ? (kv) obj : null;
        if (kvVar != null) {
            return kvVar.a;
        }
        return null;
    }

    @Override // defpackage.qy
    public final ry getKey() {
        return nl0.i;
    }

    @Override // defpackage.c91
    public final ad0 invokeOnCompletion(boolean z, boolean z2, wr0 wr0Var) {
        return J(z2, z ? new c81(wr0Var) : new bd0(wr0Var, 1));
    }

    @Override // defpackage.c91
    public boolean isActive() {
        Object obj = a.get(this);
        return (obj instanceof v51) && ((v51) obj).isActive();
    }

    @Override // defpackage.c91
    public final boolean isCancelled() {
        Object obj = a.get(this);
        if (obj instanceof kv) {
            return true;
        }
        return (obj instanceof i91) && ((i91) obj).d();
    }

    @Override // defpackage.c91
    public final boolean isCompleted() {
        return !(a.get(this) instanceof v51);
    }

    @Override // defpackage.c91
    public final Object join(dy dyVar) {
        Object obj;
        az2 az2Var;
        do {
            obj = a.get(this);
            boolean z = obj instanceof v51;
            az2Var = az2.a;
            if (!z) {
                u12.h(dyVar.getContext());
                return az2Var;
            }
        } while (V(obj) < 0);
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        qoVar.w(new lo(u12.k(this, true, new jr(qoVar, 1)), 2));
        Object objR = qoVar.r();
        dz dzVar = dz.a;
        if (objR != dzVar) {
            objR = az2Var;
        }
        return objR == dzVar ? objR : az2Var;
    }

    public final Object m(dy dyVar) {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof v51)) {
                if (obj instanceof kv) {
                    throw ((kv) obj).a;
                }
                return u12.t(obj);
            }
        } while (V(obj) < 0);
        g91 g91Var = new g91(kc2.q(dyVar), this);
        g91Var.s();
        int i = 2;
        g91Var.w(new lo(u12.k(this, true, new bd0(g91Var, i)), i));
        return g91Var.r();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:33:0x006d, B:34:0x0071), top: B:78:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0064 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:33:0x006d, B:34:0x0071), top: B:78:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006d A[Catch: all -> 0x0062, TryCatch #0 {, blocks: (B:24:0x004f, B:26:0x005c, B:31:0x0064, B:33:0x006d, B:34:0x0071), top: B:78:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:2: B:53:0x00af->B:95:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean p(Object obj) {
        Throwable thY;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        Throwable thC;
        tx txVar;
        v51 v51Var;
        br1 br1VarF;
        i91 i91Var;
        Object objY;
        Object objY2 = u12.a;
        if (E()) {
            do {
                Object obj3 = a.get(this);
                if (obj3 instanceof v51) {
                    if (obj3 instanceof i91) {
                        if (i91.b.get((i91) obj3) == 1) {
                        }
                    }
                    objY2 = Y(obj3, new kv(y(obj), false));
                }
                objY2 = u12.a;
                break;
            } while (objY2 == u12.c);
            if (objY2 != u12.b) {
                if (objY2 == u12.a) {
                    thY = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = a;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof i91) {
                            synchronized (obj2) {
                                if (i91.d.get((i91) obj2) == u12.e) {
                                    txVar = u12.d;
                                } else {
                                    boolean zD = ((i91) obj2).d();
                                    if (thY == null) {
                                        thY = y(obj);
                                    }
                                    ((i91) obj2).a(thY);
                                    thC = zD ? null : ((i91) obj2).c();
                                    if (thC != null) {
                                        Q(((i91) obj2).a, thC);
                                    }
                                    txVar = u12.a;
                                }
                            }
                        } else if (obj2 instanceof v51) {
                            if (thY == null) {
                                thY = y(obj);
                            }
                            v51Var = (v51) obj2;
                            if (v51Var.isActive()) {
                                br1VarF = F(v51Var);
                                if (br1VarF == null) {
                                    continue;
                                } else {
                                    i91Var = new i91(br1VarF, thY);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, v51Var, i91Var)) {
                                            Q(br1VarF, thY);
                                            txVar = u12.a;
                                        } else if (atomicReferenceFieldUpdater.get(this) != v51Var) {
                                        }
                                    }
                                }
                            } else {
                                objY = Y(obj2, new kv(thY, false));
                                if (objY != u12.a) {
                                    wb0.d(obj2, "Cannot happen in ");
                                    return false;
                                }
                                if (objY != u12.c) {
                                    objY2 = objY;
                                    break;
                                }
                            }
                        } else {
                            txVar = u12.d;
                        }
                        objY2 = txVar;
                        break;
                    }
                }
                if (objY2 != u12.a && objY2 != u12.b) {
                    if (objY2 == u12.d) {
                        return false;
                    }
                    i(objY2);
                    return true;
                }
            }
        } else {
            if (objY2 == u12.a) {
                thY = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = a;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof i91) {
                        synchronized (obj2) {
                            if (i91.d.get((i91) obj2) == u12.e) {
                                txVar = u12.d;
                            } else {
                                boolean zD2 = ((i91) obj2).d();
                                if (thY == null) {
                                    thY = y(obj);
                                }
                                ((i91) obj2).a(thY);
                                if (zD2) {
                                }
                                if (thC != null) {
                                    Q(((i91) obj2).a, thC);
                                }
                                txVar = u12.a;
                            }
                        }
                    } else if (obj2 instanceof v51) {
                        if (thY == null) {
                            thY = y(obj);
                        }
                        v51Var = (v51) obj2;
                        if (v51Var.isActive()) {
                            br1VarF = F(v51Var);
                            if (br1VarF == null) {
                                continue;
                            } else {
                                i91Var = new i91(br1VarF, thY);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, v51Var, i91Var)) {
                                        Q(br1VarF, thY);
                                        txVar = u12.a;
                                    } else if (atomicReferenceFieldUpdater.get(this) != v51Var) {
                                    }
                                }
                            }
                        } else {
                            objY = Y(obj2, new kv(thY, false));
                            if (objY != u12.a) {
                                wb0.d(obj2, "Cannot happen in ");
                                return false;
                            }
                            if (objY != u12.c) {
                                objY2 = objY;
                                break;
                            }
                        }
                    } else {
                        txVar = u12.d;
                    }
                    objY2 = txVar;
                    break;
                }
            }
            if (objY2 != u12.a) {
                if (objY2 == u12.d) {
                    return false;
                }
                i(objY2);
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.c91
    public final boolean start() {
        int iV;
        do {
            iV = V(a.get(this));
            if (iV == 0) {
                return false;
            }
        } while (iV != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(O() + '{' + W(a.get(this)) + '}');
        sb.append('@');
        sb.append(qb5.i(this));
        return sb.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return p(th) && C();
    }

    public final void w(v51 v51Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        kr krVar = (kr) atomicReferenceFieldUpdater.get(this);
        if (krVar != null) {
            krVar.dispose();
            atomicReferenceFieldUpdater.set(this, dr1.a);
        }
        lv lvVar = null;
        kv kvVar = obj instanceof kv ? (kv) obj : null;
        Throwable th = kvVar != null ? kvVar.a : null;
        if (v51Var instanceof f91) {
            try {
                ((f91) v51Var).j(th);
                return;
            } catch (Throwable th2) {
                H(new lv("Exception in completion handler " + v51Var + " for " + this, th2));
                return;
            }
        }
        br1 br1VarB = v51Var.b();
        if (br1VarB != null) {
            br1VarB.c(new se1(1), 1);
            Object obj2 = mf1.a.get(br1VarB);
            obj2.getClass();
            for (mf1 mf1VarF = (mf1) obj2; !mf1VarF.equals(br1VarB); mf1VarF = mf1VarF.f()) {
                if (mf1VarF instanceof f91) {
                    try {
                        ((f91) mf1VarF).j(th);
                    } catch (Throwable th3) {
                        if (lvVar != null) {
                            l7.a(lvVar, th3);
                        } else {
                            lvVar = new lv("Exception in completion handler " + mf1VarF + " for " + this, th3);
                        }
                    }
                }
            }
            if (lvVar != null) {
                H(lvVar);
            }
        }
    }

    public final Throwable y(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        o91 o91Var = (o91) obj;
        Object obj2 = a.get(o91Var);
        if (obj2 instanceof i91) {
            thC = ((i91) obj2).c();
        } else if (obj2 instanceof kv) {
            thC = ((kv) obj2).a;
        } else {
            if (obj2 instanceof v51) {
                wb0.d(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new d91("Parent job is ".concat(W(obj2)), thC, o91Var) : cancellationException;
    }

    public final Object z(i91 i91Var, Object obj) {
        Throwable thB;
        kv kvVar = obj instanceof kv ? (kv) obj : null;
        Throwable th = kvVar != null ? kvVar.a : null;
        synchronized (i91Var) {
            i91Var.d();
            ArrayList arrayListE = i91Var.e(th);
            thB = B(i91Var, arrayListE);
            if (thB != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                int size = arrayListE.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListE.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thB && th2 != thB && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        l7.a(thB, th2);
                    }
                }
            }
        }
        if (thB != null && thB != th) {
            obj = new kv(thB, false);
        }
        if (thB != null && (s(thB) || G(thB))) {
            obj.getClass();
            kv.b.compareAndSet((kv) obj, 0, 1);
        }
        R(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object w51Var = obj instanceof v51 ? new w51((v51) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, i91Var, w51Var) && atomicReferenceFieldUpdater.get(this) == i91Var) {
        }
        w(i91Var, obj);
        return obj;
    }

    public o91(boolean z) {
        ag0 ag0Var;
        if (z) {
            ag0Var = u12.g;
        } else {
            ag0Var = u12.f;
        }
        this._state$volatile = ag0Var;
    }

    public static lr P(mf1 mf1Var) {
        while (mf1Var.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mf1.b;
            mf1 mf1VarD = mf1Var.d();
            if (mf1VarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(mf1Var);
                while (true) {
                    mf1Var = (mf1) obj;
                    if (!mf1Var.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mf1Var);
                }
            } else {
                mf1Var = mf1VarD;
            }
        }
        while (true) {
            mf1Var = mf1Var.f();
            if (!mf1Var.g()) {
                if (mf1Var instanceof lr) {
                    return (lr) mf1Var;
                }
                if (mf1Var instanceof br1) {
                    return null;
                }
            }
        }
    }

    public final Throwable B(i91 i91Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!i91Var.d()) {
                return null;
            }
            return new d91(u(), null, this);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
            } else {
                obj = null;
                break;
            }
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof fq2) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof fq2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final br1 F(v51 v51Var) {
        br1 br1VarB = v51Var.b();
        if (br1VarB == null) {
            if (v51Var instanceof ag0) {
                return new br1();
            }
            if (v51Var instanceof f91) {
                U((f91) v51Var);
                return null;
            }
            wb0.d(v51Var, "State should have list: ");
            return null;
        }
        return br1VarB;
    }

    public String O() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.sy
    public final Object fold(Object obj, zr0 zr0Var) {
        return zr0Var.invoke(obj, this);
    }

    @Override // defpackage.sy
    public final qy get(ry ryVar) {
        return qb5.h(this, ryVar);
    }

    public Object getCompleted() {
        return A();
    }

    public void l(Object obj) {
        i(obj);
    }

    @Override // defpackage.sy
    public final sy minusKey(ry ryVar) {
        return qb5.k(this, ryVar);
    }

    @Override // defpackage.sy
    public final sy plus(sy syVar) {
        return qb5.l(this, syVar);
    }

    public void q(CancellationException cancellationException) {
        p(cancellationException);
    }

    public final boolean s(Throwable th) {
        if (!L()) {
            boolean z = th instanceof CancellationException;
            kr krVar = (kr) b.get(this);
            if (krVar != null && krVar != dr1.a) {
                if (!krVar.a(th) && !z) {
                    return false;
                }
                return true;
            }
            return z;
        }
        return true;
    }

    @Override // defpackage.c91
    public final ad0 invokeOnCompletion(wr0 wr0Var) {
        return J(true, new bd0(wr0Var, 1));
    }
}
