package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s82 implements mo, q73 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(s82.class, Object.class, "state$volatile");
    public final sy a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = l7.c;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = l7.f;

    @Override // defpackage.mo
    public final void a(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == l7.d) {
                return;
            }
            tx txVar = l7.e;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, txVar)) {
                    ArrayList arrayList = this.b;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        ((q82) obj2).a();
                    }
                    this.e = l7.f;
                    this.b = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final Object b(fy fyVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        obj.getClass();
        q82 q82Var = (q82) obj;
        Object obj2 = this.e;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                q82 q82Var2 = (q82) obj3;
                if (q82Var2 != q82Var) {
                    q82Var2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, l7.d);
            this.e = l7.f;
            this.b = null;
        }
        m91.b.invoke(q82Var.a, null, obj2);
        return ((zr0) q82Var.b).invoke(obj2, fyVar);
    }

    @Override // defpackage.q73
    public final void c(f82 f82Var, int i) {
        this.c = f82Var;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(fy fyVar) {
        r82 r82Var;
        Object obj;
        if (fyVar instanceof r82) {
            r82Var = (r82) fyVar;
            int i = r82Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                r82Var.u = i - Integer.MIN_VALUE;
            } else {
                r82Var = new r82(this, fyVar);
            }
        } else {
            r82Var = new r82(this, fyVar);
        }
        Object obj2 = r82Var.s;
        int i2 = r82Var.u;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(obj2);
            r82Var.r = this;
            r82Var.u = 1;
            qo qoVar = new qo(1, kc2.q(r82Var));
            qoVar.s();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                tx txVar = l7.c;
                obj = az2.a;
                if (obj3 == txVar) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, qoVar)) {
                            qoVar.w(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    if (!(obj3 instanceof List)) {
                        if (obj3 instanceof q82) {
                            qoVar.x(obj, null);
                            break;
                        }
                        wb0.d(obj3, "unexpected state: ");
                        return null;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, txVar)) {
                            Iterator it = ((Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                q82 q82VarE = e(it.next());
                                q82VarE.getClass();
                                q82VarE.c = null;
                                q82VarE.d = -1;
                                f(q82VarE, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            Object objR = qoVar.r();
            if (objR == dzVar) {
                obj = objR;
            }
            if (obj != dzVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(obj2);
                return obj2;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = r82Var.r;
        wz2.a0(obj2);
        r82Var.r = null;
        r82Var.u = 2;
        Object objB = this.b(r82Var);
        return objB == dzVar ? dzVar : objB;
    }

    public final q82 e(Object obj) {
        Object obj2;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
        } while (((q82) obj2).a != obj);
        q82 q82Var = (q82) obj2;
        if (q82Var != null) {
            return q82Var;
        }
        e32.g(obj, " is not found", "Clause with object ");
        return null;
    }

    public final void f(q82 q82Var, boolean z) {
        o91 o91Var = q82Var.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (atomicReferenceFieldUpdater.get(this) instanceof q82) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((q82) obj).a == o91Var) {
                        e32.h(o91Var, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        l91.b.invoke(o91Var, this, null);
        if (this.e != l7.f) {
            atomicReferenceFieldUpdater.set(this, q82Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(q82Var);
        }
        q82Var.c = this.c;
        q82Var.d = this.d;
        this.c = null;
        this.d = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof oo)) {
                if (s71.b(obj3, l7.d) || (obj3 instanceof q82)) {
                    return 3;
                }
                if (s71.b(obj3, l7.e)) {
                    return 2;
                }
                if (s71.b(obj3, l7.c)) {
                    List listY = eu.y(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listY)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    wb0.d(obj3, "Unexpected state: ");
                    return 0;
                }
                ArrayList arrayListP0 = du.p0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListP0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            q82 q82VarE = e(obj);
            if (q82VarE == null) {
                continue;
            } else {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, q82VarE)) {
                        oo ooVar = (oo) obj3;
                        this.e = obj2;
                        tx txVarJ = ooVar.j(az2.a, null);
                        if (txVarJ == null) {
                            this.e = l7.f;
                            return 2;
                        }
                        ooVar.n(txVarJ);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            }
        }
    }

    public s82(sy syVar) {
        this.a = syVar;
    }
}
