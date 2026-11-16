package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ze2 extends n2 {
    public long a;
    public qo b;

    @Override // defpackage.n2
    public final boolean a(m2 m2Var) {
        ye2 ye2Var = (ye2) m2Var;
        if (this.a >= 0) {
            return false;
        }
        long j = ye2Var.i;
        if (j < ye2Var.j) {
            ye2Var.j = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.n2
    public final dy[] b(m2 m2Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((ye2) m2Var).u(j);
    }
}
