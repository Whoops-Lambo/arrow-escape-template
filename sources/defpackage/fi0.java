package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class fi0 extends uy {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public g8 e;

    @Override // defpackage.uy
    public final uy T(int i) {
        uu.g(1);
        return this;
    }

    public abstract long X();

    public abstract void shutdown();

    public final void U(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void V(qc0 qc0Var) {
        g8 g8Var = this.e;
        if (g8Var == null) {
            g8Var = new g8();
            this.e = g8Var;
        }
        g8Var.addLast(qc0Var);
    }

    public final void W(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public final boolean Y() {
        g8 g8Var = this.e;
        if (g8Var == null) {
            return false;
        }
        qc0 qc0Var = (qc0) (g8Var.isEmpty() ? null : g8Var.removeFirst());
        if (qc0Var == null) {
            return false;
        }
        qc0Var.run();
        return true;
    }
}
