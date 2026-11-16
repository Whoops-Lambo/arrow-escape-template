package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l90 implements ur1 {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(l90.class, "top");
    public final int a;
    public final int b;
    public final AtomicReferenceArray c;
    public final int[] d;

    @NotNull
    private volatile /* synthetic */ long top;

    public Object b(Object obj) {
        return obj;
    }

    public abstract Object d();

    public final Object k() {
        int i;
        l90 l90Var;
        while (true) {
            long j = this.top;
            if (j != 0) {
                long j2 = ((j >> 32) & 4294967295L) + 1;
                i = (int) (4294967295L & j);
                if (i != 0) {
                    l90Var = this;
                    if (e.compareAndSet(l90Var, j, (j2 << 32) | ((long) this.d[i]))) {
                        break;
                    }
                    this = l90Var;
                }
            }
            i = 0;
            l90Var = this;
            break;
        }
        if (i == 0) {
            return null;
        }
        return l90Var.c.getAndSet(i, null);
    }

    public l90(int i) {
        if (i > 0) {
            if (i <= 536870911) {
                this.top = 0L;
                int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
                this.a = iHighestOneBit;
                this.b = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
                int i2 = iHighestOneBit + 1;
                this.c = new AtomicReferenceArray(i2);
                this.d = new int[i2];
                return;
            }
            ak1.n(pv1.k(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        ak1.n(pv1.k(i, "capacity should be positive but it is "));
        throw null;
    }

    @Override // defpackage.ur1
    public final void E(Object obj) {
        l90 l90Var;
        obj.getClass();
        o(obj);
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.b) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.c;
            while (true) {
                if (atomicReferenceArray.compareAndSet(iIdentityHashCode, null, obj)) {
                    if (iIdentityHashCode <= 0) {
                        d.r("index should be positive");
                        return;
                    }
                    while (true) {
                        long j = this.top;
                        long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                        this.d[iIdentityHashCode] = (int) (4294967295L & j);
                        l90 l90Var2 = this;
                        if (!e.compareAndSet(l90Var2, j, j2)) {
                            this = l90Var2;
                        } else {
                            return;
                        }
                    }
                } else {
                    l90Var = this;
                    if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                        break;
                    } else {
                        this = l90Var;
                    }
                }
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = l90Var.a;
            }
            i++;
            this = l90Var;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (k() != null) {
        }
    }

    @Override // defpackage.ur1
    public final Object e0() {
        Object objK = k();
        if (objK != null) {
            return b(objK);
        }
        return d();
    }

    public void o(Object obj) {
        obj.getClass();
    }
}
