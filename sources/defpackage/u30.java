package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u30 extends w30 {
    public static final u30 b = new u30("");

    @Override // defpackage.w30
    public final boolean f(Comparable comparable) {
        return true;
    }

    private Object readResolve() {
        return b;
    }

    @Override // defpackage.w30
    /* JADX INFO: renamed from: a */
    public final int compareTo(w30 w30Var) {
        return w30Var == this ? 0 : -1;
    }

    @Override // defpackage.w30
    public final void b(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // defpackage.w30
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.w30, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((w30) obj) == this ? 0 : -1;
    }

    @Override // defpackage.w30
    public final Comparable d() {
        throw new IllegalStateException("range unbounded on this side");
    }

    public final String toString() {
        return "-∞";
    }

    @Override // defpackage.w30
    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
