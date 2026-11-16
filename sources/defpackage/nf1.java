package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class nf1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(nf1.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new pf1(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            pf1 pf1Var = (pf1) atomicReferenceFieldUpdater.get(this);
            int iA = pf1Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                pf1 pf1VarC = pf1Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, pf1Var, pf1VarC) && atomicReferenceFieldUpdater.get(this) == pf1Var) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            pf1 pf1Var = (pf1) atomicReferenceFieldUpdater.get(this);
            if (pf1Var.b()) {
                return;
            }
            pf1 pf1VarC = pf1Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pf1Var, pf1VarC) && atomicReferenceFieldUpdater.get(this) == pf1Var) {
            }
        }
    }

    public final int c() {
        pf1 pf1Var = (pf1) a.get(this);
        pf1Var.getClass();
        long j = pf1.f.get(pf1Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            pf1 pf1Var = (pf1) atomicReferenceFieldUpdater.get(this);
            Object objD = pf1Var.d();
            if (objD != pf1.g) {
                return objD;
            }
            pf1 pf1VarC = pf1Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pf1Var, pf1VarC) && atomicReferenceFieldUpdater.get(this) == pf1Var) {
            }
        }
    }
}
