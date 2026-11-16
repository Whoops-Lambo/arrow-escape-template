package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pf1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(pf1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(pf1.class, "_state$volatile");
    public static final tx g = new tx("REMOVE_FROZEN", 8);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                pf1 pf1Var = this;
                if (f.compareAndSet(pf1Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    pf1 pf1VarC = pf1Var;
                    while ((atomicLongFieldUpdater.get(pf1VarC) & 1152921504606846976L) != 0) {
                        pf1VarC = pf1VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = pf1VarC.d;
                        int i4 = pf1VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof of1) && ((of1) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            pf1VarC = null;
                        }
                        if (pf1VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = pf1Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            pf1 pf1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(pf1Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = pf1Var;
        }
    }

    public final pf1 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        pf1 pf1Var;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                pf1Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            pf1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(pf1Var, j, j2)) {
                j = j2;
                break;
            }
            this = pf1Var;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            pf1 pf1Var2 = (pf1) atomicReferenceFieldUpdater.get(pf1Var);
            if (pf1Var2 != null) {
                return pf1Var2;
            }
            pf1 pf1Var3 = new pf1(pf1Var.a * 2, pf1Var.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = pf1Var.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object of1Var = pf1Var.d.get(i4);
                if (of1Var == null) {
                    of1Var = new of1(i);
                }
                pf1Var3.d.set(pf1Var3.c & i, of1Var);
                i++;
            }
            atomicLongFieldUpdater.set(pf1Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(pf1Var, null, pf1Var3) && atomicReferenceFieldUpdater.get(pf1Var) == null) {
            }
        }
    }

    public final Object d() {
        pf1 pf1VarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(pf1VarC);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = pf1VarC.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = pf1VarC.d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = pf1VarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof of1)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f.compareAndSet(pf1VarC, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    pf1VarC = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(pf1VarC);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                pf1VarC = pf1VarC.c();
                            } else {
                                pf1 pf1Var = pf1VarC;
                                if (f.compareAndSet(pf1Var, j3, (j3 & (-1073741824)) | j2)) {
                                    pf1Var.d.set(i4 & pf1Var.c, null);
                                    pf1VarC = null;
                                } else {
                                    pf1VarC = pf1Var;
                                }
                            }
                            if (pf1VarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public pf1(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            e32.i("Check failed.");
            throw null;
        }
        e32.i("Check failed.");
        throw null;
    }
}
