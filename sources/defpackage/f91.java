package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f91 extends mf1 implements ad0, v51 {
    public o91 d;

    @Override // defpackage.v51
    public final br1 b() {
        return null;
    }

    public abstract boolean i();

    @Override // defpackage.v51
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    public final o91 h() {
        o91 o91Var = this.d;
        if (o91Var != null) {
            return o91Var;
        }
        s71.D("job");
        throw null;
    }

    @Override // defpackage.mf1
    public final String toString() {
        return getClass().getSimpleName() + '@' + qb5.i(this) + "[job@" + qb5.i(h()) + ']';
    }

    @Override // defpackage.ad0
    public final void dispose() {
        o91 o91VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o91.a;
            Object obj = atomicReferenceFieldUpdater.get(o91VarH);
            if (obj instanceof f91) {
                if (obj == this) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(o91VarH, obj, u12.g)) {
                        if (atomicReferenceFieldUpdater.get(o91VarH) != obj) {
                        }
                    }
                    return;
                }
                return;
            }
            if (!(obj instanceof v51) || ((v51) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = mf1.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (!(obj2 instanceof n42)) {
                    if (obj2 == this) {
                        return;
                    }
                    obj2.getClass();
                    mf1 mf1Var = (mf1) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = mf1.c;
                    n42 n42Var = (n42) atomicReferenceFieldUpdater3.get(mf1Var);
                    if (n42Var == null) {
                        n42Var = new n42(mf1Var);
                        atomicReferenceFieldUpdater3.set(mf1Var, n42Var);
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, n42Var)) {
                            mf1Var.d();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == obj2);
                } else {
                    return;
                }
            }
        }
    }

    public c91 getParent() {
        return h();
    }
}
