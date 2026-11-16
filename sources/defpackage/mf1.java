package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class mf1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(mf1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(mf1.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(mf1.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final mf1 d() {
        mf1 mf1Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            mf1 mf1Var2 = (mf1) atomicReferenceFieldUpdater2.get(this);
            mf1Var = mf1Var2;
            while (true) {
                mf1 mf1Var3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = a;
                    obj = atomicReferenceFieldUpdater.get(mf1Var);
                    if (obj == this) {
                        if (mf1Var2 != mf1Var) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, mf1Var2, mf1Var)) {
                                if (atomicReferenceFieldUpdater2.get(this) != mf1Var2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (g()) {
                        return null;
                    }
                    if (!(obj instanceof n42)) {
                        obj.getClass();
                        mf1Var3 = mf1Var;
                        mf1Var = (mf1) obj;
                    } else {
                        if (mf1Var3 != null) {
                            break;
                        }
                        mf1Var = (mf1) atomicReferenceFieldUpdater2.get(mf1Var);
                    }
                }
                mf1 mf1Var4 = ((n42) obj).a;
                while (!atomicReferenceFieldUpdater.compareAndSet(mf1Var3, mf1Var, mf1Var4)) {
                    if (atomicReferenceFieldUpdater.get(mf1Var3) != mf1Var) {
                        break;
                    }
                }
                mf1Var = mf1Var3;
            }
        }
        return mf1Var;
    }

    public final void e(mf1 mf1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            mf1 mf1Var2 = (mf1) atomicReferenceFieldUpdater.get(mf1Var);
            if (a.get(this) != mf1Var) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(mf1Var, mf1Var2, this)) {
                    if (g()) {
                        mf1Var.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(mf1Var) == mf1Var2);
        }
    }

    public final mf1 f() {
        Object obj = a.get(this);
        n42 n42Var = obj instanceof n42 ? (n42) obj : null;
        if (n42Var != null) {
            return n42Var.a;
        }
        obj.getClass();
        return (mf1) obj;
    }

    public boolean g() {
        return a.get(this) instanceof n42;
    }

    public String toString() {
        return new lf1(this, qb5.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + qb5.i(this);
    }

    public final boolean c(mf1 mf1Var, int i) {
        while (true) {
            mf1 mf1VarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (mf1VarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    mf1VarD = (mf1) obj;
                    if (!mf1VarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mf1VarD);
                }
            }
            if (mf1VarD instanceof se1) {
                if ((((se1) mf1VarD).d & i) == 0 && mf1VarD.c(mf1Var, i)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(mf1Var, mf1VarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(mf1Var, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(mf1VarD, this, mf1Var)) {
                    mf1Var.e(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(mf1VarD) == this);
        }
    }
}
