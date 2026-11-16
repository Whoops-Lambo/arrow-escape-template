package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y80 extends zi0 implements Executor {
    public static final y80 c = new y80();
    public static final uy d;

    @Override // defpackage.uy
    public final uy T(int i) {
        return c03.c.T(1);
    }

    @Override // defpackage.zi0
    public final Executor U() {
        return this;
    }

    static {
        c03 c03Var = c03.c;
        int i = fm2.a;
        if (64 >= i) {
            i = 64;
        }
        d = c03Var.T(wz2.Z(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.uy
    public final void L(sy syVar, Runnable runnable) {
        d.L(syVar, runnable);
    }

    @Override // defpackage.uy
    public final void N(sy syVar, Runnable runnable) {
        d.N(syVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        L(cg0.a, runnable);
    }

    @Override // defpackage.uy
    public final String toString() {
        return "Dispatchers.IO";
    }
}
