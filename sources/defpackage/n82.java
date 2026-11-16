package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n82 {
    public static final g82 a = new g82(new byte[0], 0, 0, null);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;
    public static final AtomicReferenceArray g;

    static {
        int iIntValue;
        int i = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        int i2 = iHighestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        c = i3;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", s71.b(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        property.getClass();
        Integer numM = kk2.M(property);
        if (numM != null && (iIntValue = numM.intValue()) >= 0) {
            i = iIntValue;
        }
        d = i;
        int i4 = i / i3;
        if (i4 < 8192) {
            i4 = 8192;
        }
        e = i4;
        f = new AtomicReferenceArray(iHighestOneBit);
        g = new AtomicReferenceArray(i3);
    }

    public static final void a(g82 g82Var) {
        g82 g82Var2 = a;
        g82Var.getClass();
        if (g82Var.f != null || g82Var.g != null) {
            d.r("Failed requirement.");
            return;
        }
        n32 n32Var = g82Var.d;
        if (n32Var != null && n32Var.a != 0) {
            int iDecrementAndGet = n32.b.decrementAndGet(n32Var);
            if (iDecrementAndGet >= 0) {
                return;
            }
            if (iDecrementAndGet != -1) {
                e32.e(iDecrementAndGet + 1, "Shared copies count is negative: ");
                return;
            }
            n32Var.a = 0;
        }
        AtomicReferenceArray atomicReferenceArray = f;
        int id = (int) ((((long) b) - 1) & Thread.currentThread().getId());
        g82Var.b = 0;
        g82Var.e = true;
        while (true) {
            g82 g82Var3 = (g82) atomicReferenceArray.get(id);
            if (g82Var3 != g82Var2) {
                int i = g82Var3 != null ? g82Var3.c : 0;
                if (i < 65536) {
                    g82Var.f = g82Var3;
                    g82Var.c = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, g82Var3, g82Var)) {
                        if (atomicReferenceArray.get(id) != g82Var3) {
                        }
                    }
                    return;
                }
                if (d <= 0) {
                    return;
                }
                g82Var.b = 0;
                g82Var.e = true;
                int id2 = (int) ((((long) c) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = g;
                int i2 = 0;
                while (true) {
                    g82 g82Var4 = (g82) atomicReferenceArray2.get(id2);
                    if (g82Var4 != g82Var2) {
                        int i3 = (g82Var4 != null ? g82Var4.c : 0) + 8192;
                        if (i3 <= e) {
                            g82Var.f = g82Var4;
                            g82Var.c = i3;
                            while (!atomicReferenceArray2.compareAndSet(id2, g82Var4, g82Var)) {
                                if (atomicReferenceArray2.get(id2) != g82Var4) {
                                }
                            }
                            return;
                        }
                        int i4 = c;
                        if (i2 >= i4) {
                            return;
                        }
                        i2++;
                        id2 = (id2 + 1) & (i4 - 1);
                    }
                }
            }
        }
    }

    public static final g82 b() {
        AtomicReferenceArray atomicReferenceArray;
        g82 g82Var;
        g82 g82Var2;
        int id = (int) ((((long) b) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f;
            g82Var = a;
            g82Var2 = (g82) atomicReferenceArray.getAndSet(id, g82Var);
        } while (s71.b(g82Var2, g82Var));
        if (g82Var2 != null) {
            atomicReferenceArray.set(id, g82Var2.f);
            g82Var2.f = null;
            g82Var2.c = 0;
            return g82Var2;
        }
        atomicReferenceArray.set(id, null);
        if (d <= 0) {
            return new g82();
        }
        int i = c;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = g;
            g82 g82Var3 = (g82) atomicReferenceArray2.getAndSet(id2, g82Var);
            if (!s71.b(g82Var3, g82Var)) {
                if (g82Var3 != null) {
                    atomicReferenceArray2.set(id2, g82Var3.f);
                    g82Var3.f = null;
                    g82Var3.c = 0;
                    return g82Var3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    return new g82();
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }
}
