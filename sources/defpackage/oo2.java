package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class oo2 extends no2 {
    public final Runnable c;

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(qb5.i(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return jc1.q(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }

    public oo2(long j, Runnable runnable, boolean z) {
        super(j, z);
        this.c = runnable;
    }
}
