package defpackage;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.ironsource.C4664b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class gk implements vp {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(gk.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(gk.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(gk.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(gk.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(gk.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(gk.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(gk.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(gk.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(gk.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public final boolean j(Throwable th) {
        return k(th, false);
    }

    public boolean x() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object B(gk gkVar, fy fyVar) {
        ek ekVar;
        kq kqVar;
        if (fyVar instanceof ek) {
            ekVar = (ek) fyVar;
            int i2 = ekVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ekVar.t = i2 - Integer.MIN_VALUE;
            } else {
                ekVar = new ek(gkVar, fyVar);
            }
        } else {
            ekVar = new ek(gkVar, fyVar);
        }
        ek ekVar2 = ekVar;
        Object obj = ekVar2.r;
        int i3 = ekVar2.t;
        if (i3 != 0) {
            if (i3 == 1) {
                wz2.a0(obj);
                return ((jq) obj).a;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        kq kqVar2 = (kq) g.get(gkVar);
        while (!gkVar.v()) {
            long andIncrement = c.getAndIncrement(gkVar);
            long j2 = ik.b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (kqVar2.c != j3) {
                kq kqVarO = gkVar.o(j3, kqVar2);
                if (kqVarO == null) {
                    continue;
                } else {
                    kqVar = kqVarO;
                }
            } else {
                kqVar = kqVar2;
            }
            gk gkVar2 = gkVar;
            Object objG = gkVar2.G(kqVar, i4, andIncrement, null);
            if (objG == ik.m) {
                e32.i("unexpected");
                return null;
            }
            if (objG != ik.o) {
                if (objG != ik.n) {
                    kqVar.b();
                    return objG;
                }
                ekVar2.t = 1;
                Object objC = gkVar2.C(kqVar, i4, andIncrement, ekVar2);
                dz dzVar = dz.a;
                return objC == dzVar ? dzVar : objC;
            }
            if (andIncrement < gkVar2.s()) {
                kqVar.b();
            }
            gkVar = gkVar2;
            kqVar2 = kqVar;
        }
        return new hq(gkVar.p());
    }

    public static final kq a(gk gkVar, long j2, kq kqVar) {
        Object objI;
        gk gkVar2;
        kq kqVar2 = ik.a;
        hk hkVar = hk.b;
        loop0: while (true) {
            objI = h00.i(kqVar, j2, hkVar);
            if (!ak.q(objI)) {
                f82 f82VarJ = ak.j(objI);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    f82 f82Var = (f82) atomicReferenceFieldUpdater.get(gkVar);
                    if (f82Var.c >= f82VarJ.c) {
                        break loop0;
                    }
                    if (!f82VarJ.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(gkVar, f82Var, f82VarJ)) {
                            if (!f82Var.f()) {
                                break loop0;
                            }
                            f82Var.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(gkVar) == f82Var);
                    if (f82VarJ.f()) {
                        f82VarJ.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zQ = ak.q(objI);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (zQ) {
            gkVar.w();
            if (kqVar.c * ((long) ik.b) < atomicLongFieldUpdater.get(gkVar)) {
                kqVar.b();
                return null;
            }
        } else {
            kq kqVar3 = (kq) ak.j(objI);
            long j3 = kqVar3.c;
            if (j3 <= j2) {
                return kqVar3;
            }
            long j4 = ((long) ik.b) * j3;
            while (true) {
                long j5 = b.get(gkVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    gkVar2 = gkVar;
                    break;
                }
                gkVar2 = gkVar;
                if (b.compareAndSet(gkVar2, j5, (((long) ((int) (j5 >> 60))) << 60) + j6)) {
                    break;
                }
                gkVar = gkVar2;
            }
            if (j3 * ((long) ik.b) < atomicLongFieldUpdater.get(gkVar2)) {
                kqVar3.b();
            }
        }
        return null;
    }

    public static void t(gk gkVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(gkVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(gkVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(dy dyVar, Object obj) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        qoVar.resumeWith(new j52(r()));
        Object objR = qoVar.r();
        return objR == dz.a ? objR : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(kq kqVar, int i2, long j2, fy fyVar) {
        fk fkVar;
        jq jqVar;
        kq kqVar2;
        if (fyVar instanceof fk) {
            fkVar = (fk) fyVar;
            int i3 = fkVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fkVar.t = i3 - Integer.MIN_VALUE;
            } else {
                fkVar = new fk(this, fyVar);
            }
        } else {
            fkVar = new fk(this, fyVar);
        }
        Object objR = fkVar.r;
        int i4 = fkVar.t;
        if (i4 == 0) {
            wz2.a0(objR);
            fkVar.t = 1;
            qo qoVarL = c71.l(kc2.q(fkVar));
            try {
                b32 b32Var = new b32(qoVarL);
                Object objG = G(kqVar, i2, j2, b32Var);
                if (objG != ik.m) {
                    if (objG == ik.o) {
                        if (j2 < s()) {
                            kqVar.b();
                        }
                        kq kqVar3 = (kq) g.get(this);
                        while (true) {
                            if (v()) {
                                qoVarL.resumeWith(new jq(new hq(p())));
                                break;
                            }
                            long andIncrement = c.getAndIncrement(this);
                            long j3 = ik.b;
                            long j4 = andIncrement / j3;
                            int i5 = (int) (andIncrement % j3);
                            if (kqVar3.c != j4) {
                                kq kqVarO = o(j4, kqVar3);
                                if (kqVarO != null) {
                                    kqVar2 = kqVarO;
                                }
                            } else {
                                kqVar2 = kqVar3;
                            }
                            Object objG2 = G(kqVar2, i5, andIncrement, b32Var);
                            kq kqVar4 = kqVar2;
                            if (objG2 == ik.m) {
                                b32Var.c(kqVar4, i5);
                                break;
                            }
                            if (objG2 == ik.o) {
                                if (andIncrement < s()) {
                                    kqVar4.b();
                                }
                                kqVar3 = kqVar4;
                            } else {
                                if (objG2 == ik.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kqVar4.b();
                                jqVar = new jq(objG2);
                            }
                        }
                    } else {
                        kqVar.b();
                        jqVar = new jq(objG);
                    }
                    qoVarL.x(jqVar, null);
                    break;
                }
                b32Var.c(kqVar, i2);
                objR = qoVarL.r();
                dz dzVar = dz.a;
                if (objR == dzVar) {
                    return dzVar;
                }
            } catch (Throwable th) {
                qoVarL.B();
                throw th;
            }
        } else {
            if (i4 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objR);
        }
        return ((jq) objR).a;
    }

    public final void D(q73 q73Var, boolean z) {
        if (q73Var instanceof oo) {
            ((dy) q73Var).resumeWith(new j52(z ? q() : r()));
            return;
        }
        if (q73Var instanceof b32) {
            ((b32) q73Var).a.resumeWith(new jq(new hq(p())));
            return;
        }
        if (!(q73Var instanceof dk)) {
            if (q73Var instanceof s82) {
                ((s82) q73Var).g(this, ik.l);
                return;
            } else {
                wb0.d(q73Var, "Unexpected waiter: ");
                return;
            }
        }
        dk dkVar = (dk) q73Var;
        qo qoVar = dkVar.b;
        qoVar.getClass();
        dkVar.b = null;
        dkVar.a = ik.l;
        Throwable thP = dkVar.c.p();
        if (thP == null) {
            qoVar.resumeWith(Boolean.FALSE);
        } else {
            qoVar.resumeWith(new j52(thP));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof s82) {
            return ((s82) obj).g(this, obj2) == 0;
        }
        if (obj instanceof b32) {
            return ik.a(((b32) obj).a, new jq(obj2), null);
        }
        if (!(obj instanceof dk)) {
            if (obj instanceof oo) {
                return ik.a((oo) obj, obj2, null);
            }
            wb0.d(obj, "Unexpected receiver type: ");
            return false;
        }
        dk dkVar = (dk) obj;
        qo qoVar = dkVar.b;
        qoVar.getClass();
        dkVar.b = null;
        dkVar.a = obj2;
        Boolean bool = Boolean.TRUE;
        dkVar.c.getClass();
        return ik.a(qoVar, bool, null);
    }

    public final boolean F(Object obj, kq kqVar, int i2) {
        sr2 sr2Var;
        boolean z = obj instanceof oo;
        az2 az2Var = az2.a;
        if (z) {
            return ik.a((oo) obj, az2Var, null);
        }
        if (!(obj instanceof s82)) {
            wb0.d(obj, "Unexpected waiter: ");
            return false;
        }
        int iG = ((s82) obj).g(this, az2Var);
        sr2 sr2Var2 = sr2.a;
        sr2 sr2Var3 = sr2.b;
        if (iG == 0) {
            sr2Var = sr2Var2;
        } else if (iG == 1) {
            sr2Var = sr2Var3;
        } else if (iG == 2) {
            sr2Var = sr2.c;
        } else {
            if (iG != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iG).toString());
            }
            sr2Var = sr2.d;
        }
        if (sr2Var == sr2Var3) {
            kqVar.n(i2, null);
        }
        return sr2Var == sr2Var2;
    }

    public final void I(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        gk gkVar = this;
        if (gkVar.y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(gkVar) > j2) {
                break;
            } else {
                gkVar = this;
            }
        }
        int i2 = ik.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(gkVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(gkVar)) && j3 == atomicLongFieldUpdater.get(gkVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(gkVar);
                    if (atomicLongFieldUpdater2.compareAndSet(gkVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        gkVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(gkVar);
                    long j6 = atomicLongFieldUpdater2.get(gkVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(gkVar)) {
                        break;
                    }
                    if (z) {
                        gkVar = this;
                    } else {
                        gkVar = this;
                        atomicLongFieldUpdater2.compareAndSet(gkVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(gkVar);
                    if (atomicLongFieldUpdater2.compareAndSet(gkVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        gkVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x007e A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x006b, please report this as an issue */
    @Override // defpackage.f92
    public Object c(Object obj) {
        int iD;
        az2 az2Var;
        q73 q73Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j3 = 1152921504606846975L;
        boolean z2 = u(j2, false) ? false : !i(j2 & 1152921504606846975L);
        iq iqVar = jq.b;
        if (z2) {
            return iqVar;
        }
        RemoteCall remoteCall = ik.j;
        kq kqVar = (kq) f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean zU = u(andIncrement, z);
            int i2 = ik.b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i3 = (int) (j4 % j5);
            if (kqVar.c == j6) {
                iD = d(this, kqVar, i3, obj, j4, remoteCall, zU);
                az2Var = az2.a;
                if (iD != 0) {
                    kqVar.b();
                    return az2Var;
                }
                if (iD != 1) {
                    return az2Var;
                }
                if (iD != 2) {
                    if (zU) {
                        kqVar.i();
                        return new hq(r());
                    }
                    q73Var = remoteCall instanceof q73 ? (q73) remoteCall : null;
                    if (q73Var != null) {
                        q73Var.c(kqVar, i3 + i2);
                    }
                    kqVar.i();
                    return iqVar;
                }
                if (iD != 3) {
                    e32.i("unexpected");
                    return null;
                }
                if (iD != 4) {
                    if (j4 < c.get(this)) {
                        kqVar.b();
                    }
                    return new hq(r());
                }
                if (iD == 5) {
                    kqVar.b();
                }
                z = false;
            } else {
                kq kqVarA = a(this, j6, kqVar);
                if (kqVarA != null) {
                    kqVar = kqVarA;
                    iD = d(this, kqVar, i3, obj, j4, remoteCall, zU);
                    az2Var = az2.a;
                    if (iD != 0) {
                        kqVar.b();
                        return az2Var;
                    }
                    if (iD != 1) {
                        return az2Var;
                    }
                    if (iD != 2) {
                        if (zU) {
                            kqVar.i();
                            return new hq(r());
                        }
                        if (remoteCall instanceof q73) {
                        }
                        if (q73Var != null) {
                            q73Var.c(kqVar, i3 + i2);
                        }
                        kqVar.i();
                        return iqVar;
                    }
                    if (iD != 3) {
                        e32.i("unexpected");
                        return null;
                    }
                    if (iD != 4) {
                        if (j4 < c.get(this)) {
                            kqVar.b();
                        }
                        return new hq(r());
                    }
                    if (iD == 5) {
                        kqVar.b();
                    }
                    z = false;
                } else {
                    if (zU) {
                        return new hq(r());
                    }
                    z = false;
                }
            }
            j3 = 1152921504606846975L;
        }
    }

    @Override // defpackage.c32
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    @Override // defpackage.c32
    public final Object f() {
        kq kqVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = b.get(this);
        if (u(j3, true)) {
            return new hq(p());
        }
        long j4 = j3 & 1152921504606846975L;
        iq iqVar = jq.b;
        if (j2 >= j4) {
            return iqVar;
        }
        Object obj = ik.k;
        kq kqVar2 = (kq) g.get(this);
        while (!this.v()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = ik.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (kqVar2.c != j6) {
                kq kqVarO = this.o(j6, kqVar2);
                if (kqVarO == null) {
                    continue;
                } else {
                    kqVar = kqVarO;
                }
            } else {
                kqVar = kqVar2;
            }
            gk gkVar = this;
            Object objG = gkVar.G(kqVar, i2, andIncrement, obj);
            kqVar2 = kqVar;
            if (objG == ik.m) {
                q73 q73Var = obj instanceof q73 ? (q73) obj : null;
                if (q73Var != null) {
                    q73Var.c(kqVar2, i2);
                }
                gkVar.I(andIncrement);
                kqVar2.i();
                return iqVar;
            }
            if (objG != ik.o) {
                if (objG != ik.n) {
                    kqVar2.b();
                    return objG;
                }
                e32.i("unexpected");
                return null;
            }
            if (andIncrement < gkVar.s()) {
                kqVar2.b();
            }
            this = gkVar;
        }
        return new hq(this.p());
    }

    @Override // defpackage.c32
    public final Object g(ul2 ul2Var) throws Throwable {
        kq kqVar;
        Throwable th;
        kq kqVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        kq kqVar3 = (kq) atomicReferenceFieldUpdater.get(this);
        while (!this.v()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = ik.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (kqVar3.c != j3) {
                kq kqVarO = this.o(j3, kqVar3);
                if (kqVarO == null) {
                    continue;
                } else {
                    kqVar = kqVarO;
                }
            } else {
                kqVar = kqVar3;
            }
            gk gkVar = this;
            Object objG = gkVar.G(kqVar, i2, andIncrement, null);
            tx txVar = ik.m;
            if (objG == txVar) {
                e32.i("unexpected");
                return null;
            }
            tx txVar2 = ik.o;
            if (objG == txVar2) {
                if (andIncrement < gkVar.s()) {
                    kqVar.b();
                }
                this = gkVar;
                kqVar3 = kqVar;
            } else {
                if (objG != ik.n) {
                    kqVar.b();
                    return objG;
                }
                qo qoVarL = c71.l(kc2.q(ul2Var));
                try {
                    Object objG2 = gkVar.G(kqVar, i2, andIncrement, qoVarL);
                    if (objG2 != txVar) {
                        if (objG2 == txVar2) {
                            if (andIncrement < gkVar.s()) {
                                kqVar.b();
                            }
                            kq kqVar4 = (kq) atomicReferenceFieldUpdater.get(gkVar);
                            while (true) {
                                if (gkVar.v()) {
                                    qoVarL.resumeWith(new j52(gkVar.q()));
                                    break;
                                }
                                qo qoVar = qoVarL;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(gkVar);
                                    long j4 = ik.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (kqVar4.c != j5) {
                                        try {
                                            kq kqVarO2 = gkVar.o(j5, kqVar4);
                                            if (kqVarO2 == null) {
                                                qoVarL = qoVar;
                                            } else {
                                                kqVar2 = kqVarO2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            qoVarL = qoVar;
                                            qoVarL.B();
                                            throw th;
                                        }
                                    } else {
                                        kqVar2 = kqVar4;
                                    }
                                    gk gkVar2 = gkVar;
                                    objG2 = gkVar2.G(kqVar2, i3, andIncrement2, qoVar);
                                    gkVar = gkVar2;
                                    kq kqVar5 = kqVar2;
                                    qoVarL = qoVar;
                                    if (objG2 == ik.m) {
                                        qoVarL.c(kqVar5, i3);
                                        break;
                                    }
                                    if (objG2 == ik.o) {
                                        if (andIncrement2 < gkVar.s()) {
                                            kqVar5.b();
                                        }
                                        kqVar4 = kqVar5;
                                    } else {
                                        if (objG2 == ik.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kqVar5.b();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    qoVarL = qoVar;
                                    th = th;
                                    qoVarL.B();
                                    throw th;
                                }
                            }
                        } else {
                            kqVar.b();
                        }
                        qoVarL.x(objG2, null);
                        break;
                    }
                    qoVarL.c(kqVar, i2);
                    return qoVarL.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thQ = this.q();
        int i4 = ii2.a;
        throw thQ;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0144 A[RETURN] */
    @Override // defpackage.f92
    public Object h(dy dyVar, Object obj) {
        az2 az2Var;
        Object objR;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        kq kqVar = (kq) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zU = u(andIncrement, false);
            int i2 = ik.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = kqVar.c;
            dz dzVar = dz.a;
            az2Var = az2.a;
            if (j5 != j4) {
                kq kqVarA = a(this, j4, kqVar);
                if (kqVarA != null) {
                    kqVar = kqVarA;
                } else if (zU) {
                    Object objA = A(dyVar, obj);
                    if (objA == dzVar) {
                        return objA;
                    }
                }
            }
            int iD = d(this, kqVar, i3, obj, j2, null, zU);
            if (iD == 0) {
                kqVar.b();
                return az2Var;
            }
            if (iD != 1) {
                if (iD == 2) {
                    if (!zU) {
                        break;
                    }
                    kqVar.i();
                    Object objA2 = A(dyVar, obj);
                    if (objA2 == dzVar) {
                        return objA2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
                    if (iD == 3) {
                        qo qoVarL = c71.l(kc2.q(dyVar));
                        try {
                            int iD2 = d(this, kqVar, i3, obj, j2, qoVarL, false);
                            if (iD2 != 0) {
                                if (iD2 != 1) {
                                    if (iD2 != 2) {
                                        if (iD2 != 4) {
                                            String str = "unexpected";
                                            if (iD2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            kqVar.b();
                                            kq kqVar2 = (kq) atomicReferenceFieldUpdater.get(this);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                long j6 = andIncrement2 & 1152921504606846975L;
                                                boolean zU2 = u(andIncrement2, false);
                                                int i4 = ik.b;
                                                long j7 = i4;
                                                str = str;
                                                long j8 = j6 / j7;
                                                int i5 = (int) (j6 % j7);
                                                if (kqVar2.c != j8) {
                                                    kq kqVarA2 = a(this, j8, kqVar2);
                                                    if (kqVarA2 != null) {
                                                        kqVar2 = kqVarA2;
                                                    } else if (zU2) {
                                                    }
                                                }
                                                int iD3 = d(this, kqVar2, i5, obj, j6, qoVarL, zU2);
                                                if (iD3 == 0) {
                                                    kqVar2.b();
                                                } else if (iD3 != 1) {
                                                    if (iD3 == 2) {
                                                        if (!zU2) {
                                                            qoVarL.c(kqVar2, i5 + i4);
                                                            break;
                                                        }
                                                        kqVar2.i();
                                                    } else {
                                                        if (iD3 == 3) {
                                                            throw new IllegalStateException(str);
                                                        }
                                                        if (iD3 != 4) {
                                                            if (iD3 == 5) {
                                                                kqVar2.b();
                                                            }
                                                        } else if (j6 < atomicLongFieldUpdater2.get(this)) {
                                                            kqVar2.b();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            kqVar.b();
                                        }
                                        b(this, obj, qoVarL);
                                        break;
                                    } else {
                                        qoVarL.c(kqVar, i3 + i2);
                                    }
                                }
                                objR = qoVarL.r();
                                if (objR != dzVar) {
                                    objR = az2Var;
                                }
                                if (objR == dzVar) {
                                    return objR;
                                }
                            } else {
                                kqVar.b();
                            }
                            qoVarL.resumeWith(az2Var);
                            objR = qoVarL.r();
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
                    } else if (iD == 4) {
                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                            kqVar.b();
                        }
                        Object objA3 = A(dyVar, obj);
                        if (objA3 == dzVar) {
                            return objA3;
                        }
                    } else if (iD == 5) {
                        kqVar.b();
                    }
                }
            } else {
                break;
            }
        }
        return az2Var;
    }

    public final boolean i(long j2) {
        return j2 < d.get(this) || j2 < c.get(this) + ((long) this.a);
    }

    @Override // defpackage.c32
    public final gq iterator() {
        return new dk(this);
    }

    public final boolean k(Throwable th, boolean z) {
        gk gkVar;
        boolean z2;
        long j2;
        long j3;
        Object obj;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (!z) {
            gkVar = this;
            break;
        }
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                gkVar = this;
                break;
            }
            kq kqVar = ik.a;
            gkVar = this;
            if (atomicLongFieldUpdater.compareAndSet(gkVar, j5, (j5 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = gkVar;
        }
        tx txVar = ik.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(gkVar, txVar, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(gkVar) != txVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(gkVar);
            } while (!atomicLongFieldUpdater.compareAndSet(gkVar, j4, 3458764513820540928L + (j4 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(gkVar);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = (j2 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (j2 & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(gkVar, j2, j3));
        }
        gkVar.w();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                obj = atomicReferenceFieldUpdater2.get(gkVar);
                tx txVar2 = obj == null ? ik.q : ik.r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(gkVar, obj, txVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(gkVar) == obj);
            }
            if (obj != null) {
                os2.j(1, obj);
                ((wr0) obj).invoke(gkVar.p());
                return z2;
            }
        }
        return z2;
    }

    public final kq l(long j2) {
        Object objM;
        long j3;
        Object obj = h.get(this);
        kq kqVar = (kq) f.get(this);
        if (kqVar.c > ((kq) obj).c) {
            obj = kqVar;
        }
        kq kqVar2 = (kq) g.get(this);
        if (kqVar2.c > ((kq) obj).c) {
            obj = kqVar2;
        }
        tw twVar = (tw) obj;
        loop0: while (true) {
            twVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tw.a;
            Object obj2 = atomicReferenceFieldUpdater.get(twVar);
            tx txVar = h00.b;
            objM = null;
            if (obj2 == txVar) {
                break;
            }
            tw twVar2 = (tw) obj2;
            if (twVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(twVar, null, txVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(twVar) == null);
            } else {
                twVar = twVar2;
            }
        }
        kq kqVar3 = (kq) twVar;
        if (x()) {
            kq kqVar4 = kqVar3;
            loop2: while (true) {
                int i2 = ik.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j3 = (kqVar4.c * ((long) ik.b)) + ((long) i2);
                        if (j3 >= c.get(this)) {
                            while (true) {
                                Object objL = kqVar4.l(i2);
                                if (objL != null && objL != ik.e) {
                                    if (objL != ik.d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (kqVar4.k(i2, objL, ik.l)) {
                                    kqVar4.i();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        kqVar4 = (kq) ((tw) tw.b.get(kqVar4));
                        if (kqVar4 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                m(j3);
            }
        }
        loop5: for (kq kqVar5 = kqVar3; kqVar5 != null; kqVar5 = (kq) ((tw) tw.b.get(kqVar5))) {
            for (int i3 = ik.b - 1; -1 < i3; i3--) {
                if ((kqVar5.c * ((long) ik.b)) + ((long) i3) < j2) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = kqVar5.l(i3);
                    if (objL2 != null && objL2 != ik.e) {
                        if (!(objL2 instanceof r73)) {
                            if (!(objL2 instanceof q73)) {
                                break;
                            }
                            if (kqVar5.k(i3, objL2, ik.l)) {
                                objM = qb5.m(objM, objL2);
                                kqVar5.m(i3, true);
                                break;
                            }
                        } else {
                            if (kqVar5.k(i3, objL2, ik.l)) {
                                objM = qb5.m(objM, ((r73) objL2).a);
                                kqVar5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kqVar5.k(i3, objL2, ik.l)) {
                            kqVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objM != null) {
            if (!(objM instanceof ArrayList)) {
                D((q73) objM, true);
                return kqVar3;
            }
            ArrayList arrayList = (ArrayList) objM;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                D((q73) arrayList.get(size), true);
            }
        }
        return kqVar3;
    }

    public final void m(long j2) {
        kq kqVar = (kq) g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.a) + j3, d.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = ik.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kqVar.c != j5) {
                    kq kqVarO = this.o(j5, kqVar);
                    if (kqVarO != null) {
                        kqVar = kqVarO;
                    }
                }
                kq kqVar2 = kqVar;
                if (this.G(kqVar2, i2, j3, null) != ik.o || j3 < this.s()) {
                    kqVar2.b();
                }
                kqVar = kqVar2;
            }
        }
    }

    public final kq o(long j2, kq kqVar) {
        Object objI;
        gk gkVar;
        kq kqVar2 = ik.a;
        hk hkVar = hk.b;
        loop0: while (true) {
            objI = h00.i(kqVar, j2, hkVar);
            if (!ak.q(objI)) {
                f82 f82VarJ = ak.j(objI);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
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
        if (ak.q(objI)) {
            w();
            if (kqVar.c * ((long) ik.b) < s()) {
                kqVar.b();
                return null;
            }
        } else {
            kq kqVar3 = (kq) ak.j(objI);
            long j3 = kqVar3.c;
            if (!y() && j2 <= d.get(this) / ((long) ik.b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    f82 f82Var2 = (f82) atomicReferenceFieldUpdater2.get(this);
                    if (f82Var2.c >= j3 || !kqVar3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, f82Var2, kqVar3)) {
                            if (!f82Var2.f()) {
                                break loop3;
                            }
                            f82Var2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == f82Var2);
                    if (kqVar3.f()) {
                        kqVar3.e();
                    }
                }
            }
            if (j3 <= j2) {
                return kqVar3;
            }
            long j4 = j3 * ((long) ik.b);
            while (true) {
                long j5 = c.get(this);
                if (j5 >= j4) {
                    gkVar = this;
                    break;
                }
                gkVar = this;
                if (c.compareAndSet(gkVar, j5, j4)) {
                    break;
                }
                this = gkVar;
            }
            if (j3 * ((long) ik.b) < gkVar.s()) {
                kqVar3.b();
            }
        }
        return null;
    }

    public final Throwable p() {
        return (Throwable) i.get(this);
    }

    public final long s() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (b.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i3 = 0;
        List listZ = eu.z(g.get(this), f.get(this), h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (((kq) obj) != ik.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            d.v();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((kq) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((kq) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        kq kqVar = (kq) next;
        long j4 = c.get(this);
        long jS = s();
        loop2: while (true) {
            int i4 = ik.b;
            for (int i5 = i3; i5 < i4; i5++) {
                long j5 = (kqVar.c * ((long) ik.b)) + ((long) i5);
                if (j5 >= jS && j5 >= j4) {
                    str = null;
                    break loop2;
                }
                Object objL = kqVar.l(i5);
                Object obj2 = kqVar.f.get(i5 * 2);
                if (objL instanceof oo) {
                    string = (j5 >= j4 || j5 < jS) ? (j5 >= jS || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objL instanceof s82) {
                    string = (j5 >= j4 || j5 < jS) ? (j5 >= jS || j5 < j4) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof b32) {
                    string = "receiveCatching";
                } else if (objL instanceof r73) {
                    string = "EB(" + objL + ')';
                } else if (s71.b(objL, ik.f) || s71.b(objL, ik.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(ik.e) && !objL.equals(ik.i) && !objL.equals(ik.h) && !objL.equals(ik.k) && !objL.equals(ik.j) && !objL.equals(ik.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            str = null;
            kqVar = (kq) kqVar.c();
            if (kqVar == null) {
                break;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            vq2.s("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public final boolean u(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            if (i2 == 2) {
                l(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                        kq kqVarO = (kq) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (s() <= j3) {
                            break;
                        }
                        long j4 = ik.b;
                        long j5 = j3 / j4;
                        if (kqVarO.c != j5 && (kqVarO = o(j5, kqVarO)) == null) {
                            if (((kq) atomicReferenceFieldUpdater.get(this)).c < j5) {
                                break;
                            }
                        } else {
                            kqVarO.b();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object objL = kqVarO.l(i3);
                                if (objL != null && objL != ik.e) {
                                    if (objL != ik.d && (objL == ik.j || objL == ik.l || objL == ik.i || objL == ik.h || (objL != ik.g && (objL == ik.f || j3 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (kqVarO.k(i3, objL, ik.h)) {
                                    n();
                                    break;
                                }
                            }
                            c.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    ak1.b(pv1.k(i2, "unexpected close status: "));
                    return false;
                }
                kq kqVarL = l(1152921504606846975L & j2);
                Object objM = null;
                loop0: do {
                    for (int i4 = ik.b - 1; -1 < i4; i4--) {
                        long j6 = (kqVarL.c * ((long) ik.b)) + ((long) i4);
                        while (true) {
                            Object objL2 = kqVarL.l(i4);
                            if (objL2 == ik.i) {
                                break loop0;
                            }
                            if (objL2 != ik.d) {
                                if (objL2 != ik.e && objL2 != null) {
                                    if (!(objL2 instanceof q73) && !(objL2 instanceof r73)) {
                                        tx txVar = ik.g;
                                        if (objL2 == txVar || objL2 == ik.f) {
                                            break loop0;
                                        }
                                        if (objL2 != txVar) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        q73 q73Var = objL2 instanceof r73 ? ((r73) objL2).a : (q73) objL2;
                                        if (kqVarL.k(i4, objL2, ik.l)) {
                                            objM = qb5.m(objM, q73Var);
                                            kqVarL.n(i4, null);
                                            kqVarL.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (kqVarL.k(i4, objL2, ik.l)) {
                                        kqVarL.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (kqVarL.k(i4, objL2, ik.l)) {
                                    kqVarL.n(i4, null);
                                    kqVarL.i();
                                    break;
                                }
                            }
                        }
                    }
                    kqVarL = (kq) ((tw) tw.b.get(kqVarL));
                } while (kqVarL != null);
                if (objM != null) {
                    if (objM instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            D((q73) arrayList.get(size), false);
                        }
                    } else {
                        D((q73) objM, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean v() {
        return u(b.get(this), true);
    }

    public final boolean w() {
        return u(b.get(this), false);
    }

    public final boolean y() {
        long j2 = d.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    public final void z(long j2, kq kqVar) {
        kq kqVar2;
        kq kqVar3;
        while (kqVar.c < j2 && (kqVar3 = (kq) kqVar.c()) != null) {
            kqVar = kqVar3;
        }
        while (true) {
            if (!kqVar.d() || (kqVar2 = (kq) kqVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    f82 f82Var = (f82) atomicReferenceFieldUpdater.get(this);
                    if (f82Var.c >= kqVar.c) {
                        return;
                    }
                    if (!kqVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, f82Var, kqVar)) {
                            if (f82Var.f()) {
                                f82Var.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == f82Var);
                    if (kqVar.f()) {
                        kqVar.e();
                    }
                }
            } else {
                kqVar = kqVar2;
            }
        }
    }

    public gk(int i2) {
        long j2;
        this.a = i2;
        if (i2 >= 0) {
            kq kqVar = ik.a;
            if (i2 != 0) {
                if (i2 != Integer.MAX_VALUE) {
                    j2 = i2;
                } else {
                    j2 = Long.MAX_VALUE;
                }
            } else {
                j2 = 0;
            }
            this.bufferEnd$volatile = j2;
            this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
            kq kqVar2 = new kq(0L, null, this, 3);
            this.sendSegment$volatile = kqVar2;
            this.receiveSegment$volatile = kqVar2;
            if (y()) {
                kqVar2 = ik.a;
                kqVar2.getClass();
            }
            this.bufferEndSegment$volatile = kqVar2;
            this._closeCause$volatile = ik.s;
            return;
        }
        ak1.n(jc1.k(i2, "Invalid channel capacity: ", ", should be >=0"));
        throw null;
    }

    public static final void b(gk gkVar, Object obj, qo qoVar) {
        qoVar.resumeWith(new j52(gkVar.r()));
    }

    public static final int d(gk gkVar, kq kqVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        kqVar.n(i2, obj);
        if (z) {
            return gkVar.H(kqVar, i2, obj, j2, obj2, z);
        }
        Object objL = kqVar.l(i2);
        if (objL == null) {
            if (gkVar.i(j2)) {
                if (kqVar.k(i2, null, ik.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kqVar.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof q73) {
            kqVar.n(i2, null);
            if (gkVar.E(objL, obj)) {
                kqVar.o(i2, ik.i);
                return 0;
            }
            tx txVar = ik.k;
            if (kqVar.f.getAndSet((i2 * 2) + 1, txVar) != txVar) {
                kqVar.m(i2, true);
                return 5;
            }
            return 5;
        }
        return gkVar.H(kqVar, i2, obj, j2, obj2, z);
    }

    public final Object G(kq kqVar, int i2, long j2, Object obj) {
        Object objL = kqVar.l(i2);
        AtomicReferenceArray atomicReferenceArray = kqVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (objL == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return ik.n;
                }
                if (kqVar.k(i2, objL, obj)) {
                    n();
                    return ik.m;
                }
            }
        } else if (objL == ik.d && kqVar.k(i2, objL, ik.i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            kqVar.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = kqVar.l(i2);
            if (objL2 != null && objL2 != ik.e) {
                if (objL2 == ik.d) {
                    if (kqVar.k(i2, objL2, ik.i)) {
                        n();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        kqVar.n(i2, null);
                        return obj3;
                    }
                } else {
                    tx txVar = ik.j;
                    if (objL2 == txVar) {
                        return ik.o;
                    }
                    if (objL2 == ik.h) {
                        return ik.o;
                    }
                    if (objL2 == ik.l) {
                        n();
                        return ik.o;
                    }
                    if (objL2 != ik.g && kqVar.k(i2, objL2, ik.f)) {
                        boolean z = objL2 instanceof r73;
                        if (z) {
                            objL2 = ((r73) objL2).a;
                        }
                        if (F(objL2, kqVar, i2)) {
                            kqVar.o(i2, ik.i);
                            n();
                            Object obj4 = atomicReferenceArray.get(i2 * 2);
                            kqVar.n(i2, null);
                            return obj4;
                        }
                        kqVar.o(i2, txVar);
                        kqVar.i();
                        if (z) {
                            n();
                        }
                        return ik.o;
                    }
                }
            } else if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kqVar.k(i2, objL2, ik.h)) {
                    n();
                    return ik.o;
                }
            } else {
                if (obj == null) {
                    return ik.n;
                }
                if (kqVar.k(i2, objL2, obj)) {
                    n();
                    return ik.m;
                }
            }
        }
    }

    public final int H(kq kqVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objL = kqVar.l(i2);
            if (objL == null) {
                if (i(j2) && !z) {
                    if (kqVar.k(i2, null, ik.d)) {
                        break;
                    }
                } else if (z) {
                    if (kqVar.k(i2, null, ik.j)) {
                        kqVar.i();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (kqVar.k(i2, null, obj2)) {
                        return 2;
                    }
                }
            } else if (objL == ik.e) {
                if (kqVar.k(i2, objL, ik.d)) {
                    break;
                }
            } else {
                tx txVar = ik.k;
                if (objL == txVar) {
                    kqVar.n(i2, null);
                    return 5;
                }
                if (objL == ik.h) {
                    kqVar.n(i2, null);
                    return 5;
                }
                if (objL == ik.l) {
                    kqVar.n(i2, null);
                    w();
                    return 4;
                }
                kqVar.n(i2, null);
                if (objL instanceof r73) {
                    objL = ((r73) objL).a;
                }
                if (E(objL, obj)) {
                    kqVar.o(i2, ik.i);
                    return 0;
                }
                if (kqVar.f.getAndSet((i2 * 2) + 1, txVar) != txVar) {
                    kqVar.m(i2, true);
                }
                return 5;
            }
        }
        return 1;
    }

    @Override // defpackage.c32
    public final Object e(nu nuVar) {
        return B(this, nuVar);
    }

    public final void n() {
        Object objI;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        kq kqVar = (kq) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement / ((long) ik.b);
            if (s() <= andIncrement) {
                if (kqVar.c < j2 && kqVar.c() != null) {
                    z(j2, kqVar);
                }
                t(this);
                return;
            }
            if (kqVar.c != j2) {
                hk hkVar = hk.b;
                while (true) {
                    objI = h00.i(kqVar, j2, hkVar);
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
                kq kqVar2 = null;
                if (ak.q(objI)) {
                    w();
                    z(j2, kqVar);
                    t(this);
                } else {
                    kq kqVar3 = (kq) ak.j(objI);
                    long j3 = kqVar3.c;
                    if (j3 > j2) {
                        long j4 = j3 * ((long) ik.b);
                        if (d.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
                        }
                    } else {
                        kqVar2 = kqVar3;
                    }
                }
                if (kqVar2 == null) {
                    continue;
                } else {
                    kqVar = kqVar2;
                }
            }
            int i2 = (int) (andIncrement % ((long) ik.b));
            Object objL = kqVar.l(i2);
            boolean z = objL instanceof q73;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
            if (z && andIncrement >= atomicLongFieldUpdater2.get(this) && kqVar.k(i2, objL, ik.g)) {
                if (F(objL, kqVar, i2)) {
                    kqVar.o(i2, ik.d);
                    t(this);
                    return;
                } else {
                    kqVar.o(i2, ik.j);
                    kqVar.i();
                    t(this);
                }
            } else {
                while (true) {
                    Object objL2 = kqVar.l(i2);
                    if (objL2 instanceof q73) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (kqVar.k(i2, objL2, new r73((q73) objL2))) {
                                t(this);
                                return;
                            }
                        } else if (kqVar.k(i2, objL2, ik.g)) {
                            if (F(objL2, kqVar, i2)) {
                                kqVar.o(i2, ik.d);
                                t(this);
                                return;
                            } else {
                                kqVar.o(i2, ik.j);
                                kqVar.i();
                                break;
                            }
                        }
                    } else {
                        if (objL2 == ik.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (kqVar.k(i2, objL2, ik.e)) {
                                t(this);
                                return;
                            }
                        } else if (objL2 != ik.d && objL2 != ik.h && objL2 != ik.i && objL2 != ik.k && objL2 != ik.l) {
                            if (objL2 != ik.f) {
                                wb0.d(objL2, "Unexpected cell state: ");
                                return;
                            }
                        } else {
                            t(this);
                            return;
                        }
                    }
                }
                t(this);
            }
        }
    }

    public final Throwable q() {
        Throwable thP = p();
        if (thP == null) {
            return new xs("Channel was closed");
        }
        return thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        if (thP == null) {
            return new ys("Channel was closed");
        }
        return thP;
    }
}
