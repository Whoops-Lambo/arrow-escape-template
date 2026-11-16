package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v30 extends w30 {
    @Override // defpackage.w30
    public final void b(StringBuilder sb) {
        sb.append('[');
        sb.append(this.a);
    }

    @Override // defpackage.w30
    public final void c(StringBuilder sb) {
        sb.append(this.a);
        sb.append(')');
    }

    @Override // defpackage.w30
    public final boolean f(Comparable comparable) {
        z12 z12Var = z12.c;
        return this.a.compareTo(comparable) <= 0;
    }

    @Override // defpackage.w30
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\\" + this.a + "/";
    }
}
