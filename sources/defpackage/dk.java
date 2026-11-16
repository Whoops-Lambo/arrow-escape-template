package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dk implements gq, q73 {
    public Object a = ik.p;
    public qo b;
    public final /* synthetic */ gk c;

    public final Object a(fy fyVar) throws Throwable {
        kq kqVarO;
        Object obj = this.a;
        boolean z = true;
        if (obj == ik.p || obj == ik.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gk.g;
            gk gkVar = this.c;
            kq kqVar = (kq) atomicReferenceFieldUpdater.get(gkVar);
            while (!gkVar.v()) {
                long andIncrement = gk.c.getAndIncrement(gkVar);
                long j = ik.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (kqVar.c != j2) {
                    kqVarO = gkVar.o(j2, kqVar);
                    if (kqVarO == null) {
                        continue;
                    }
                } else {
                    kqVarO = kqVar;
                }
                Object objG = gkVar.G(kqVarO, i, andIncrement, null);
                tx txVar = ik.m;
                if (objG == txVar) {
                    e32.i("unreachable");
                    return null;
                }
                tx txVar2 = ik.o;
                if (objG == txVar2) {
                    if (andIncrement < gkVar.s()) {
                        kqVarO.b();
                    }
                    kqVar = kqVarO;
                } else {
                    if (objG == ik.n) {
                        gk gkVar2 = this.c;
                        qo qoVarL = c71.l(kc2.q(fyVar));
                        try {
                            this.b = qoVarL;
                            Object objG2 = gkVar2.G(kqVarO, i, andIncrement, this);
                            if (objG2 != txVar) {
                                if (objG2 == txVar2) {
                                    if (andIncrement < gkVar2.s()) {
                                        kqVarO.b();
                                    }
                                    kq kqVar2 = (kq) gk.g.get(gkVar2);
                                    while (true) {
                                        if (gkVar2.v()) {
                                            qo qoVar = this.b;
                                            qoVar.getClass();
                                            this.b = null;
                                            this.a = ik.l;
                                            Throwable thP = gkVar.p();
                                            if (thP != null) {
                                                qoVar.resumeWith(new j52(thP));
                                                break;
                                            }
                                            qoVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = gk.c.getAndIncrement(gkVar2);
                                        long j3 = ik.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (kqVar2.c != j4) {
                                            kq kqVarO2 = gkVar2.o(j4, kqVar2);
                                            if (kqVarO2 != null) {
                                                kqVar2 = kqVarO2;
                                            }
                                        }
                                        Object objG3 = gkVar2.G(kqVar2, i2, andIncrement2, this);
                                        if (objG3 == ik.m) {
                                            c(kqVar2, i2);
                                            break;
                                        }
                                        if (objG3 == ik.o) {
                                            if (andIncrement2 < gkVar2.s()) {
                                                kqVar2.b();
                                            }
                                        } else {
                                            if (objG3 == ik.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            kqVar2.b();
                                            this.a = objG3;
                                            this.b = null;
                                        }
                                    }
                                } else {
                                    kqVarO.b();
                                    this.a = objG2;
                                    this.b = null;
                                }
                                qoVarL.x(Boolean.TRUE, null);
                                break;
                            }
                            c(kqVarO, i);
                            return qoVarL.r();
                        } catch (Throwable th) {
                            qoVarL.B();
                            throw th;
                        }
                    }
                    kqVarO.b();
                    this.a = objG;
                }
            }
            this.a = ik.l;
            Throwable thP2 = gkVar.p();
            if (thP2 != null) {
                int i3 = ii2.a;
                throw thP2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object b() throws Throwable {
        Object obj = this.a;
        tx txVar = ik.p;
        if (obj == txVar) {
            e32.i("`hasNext()` has not been invoked");
            return null;
        }
        this.a = txVar;
        if (obj != ik.l) {
            return obj;
        }
        Throwable thQ = this.c.q();
        int i = ii2.a;
        throw thQ;
    }

    @Override // defpackage.q73
    public final void c(f82 f82Var, int i) {
        qo qoVar = this.b;
        if (qoVar != null) {
            qoVar.c(f82Var, i);
        }
    }

    public dk(gk gkVar) {
        this.c = gkVar;
    }
}
