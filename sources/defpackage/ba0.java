package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ba0 extends zi0 {
    public static final ba0 d;
    public bz c;

    @Override // defpackage.uy
    public final uy T(int i) {
        uu.g(1);
        return 1 >= po2.c ? this : super.T(1);
    }

    static {
        int i = po2.c;
        int i2 = po2.d;
        long j = po2.e;
        String str = po2.a;
        ba0 ba0Var = new ba0();
        ba0Var.c = new bz(i, i2, str, j);
        d = ba0Var;
    }

    @Override // defpackage.uy
    public final void L(sy syVar, Runnable runnable) {
        bz.k(this.c, runnable, 6);
    }

    @Override // defpackage.uy
    public final void N(sy syVar, Runnable runnable) {
        bz.k(this.c, runnable, 2);
    }

    @Override // defpackage.zi0
    public final Executor U() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.uy
    public final String toString() {
        return "Dispatchers.Default";
    }
}
