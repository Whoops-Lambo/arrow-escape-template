package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z12 implements ly1, Serializable {
    public static final z12 c = new z12(u30.b, t30.b);
    public final w30 a;
    public final w30 b;

    @Override // defpackage.ly1
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.a.f(comparable) && !this.b.f(comparable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z12)) {
            return false;
        }
        z12 z12Var = (z12) obj;
        return this.a.equals(z12Var.a) && this.b.equals(z12Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public Object readResolve() {
        z12 z12Var = c;
        return equals(z12Var) ? z12Var : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.b(sb);
        sb.append("..");
        this.b.c(sb);
        return sb.toString();
    }

    public z12(w30 w30Var, w30 w30Var2) {
        this.a = w30Var;
        this.b = w30Var2;
        if (w30Var.compareTo(w30Var2) <= 0 && w30Var != t30.b && w30Var2 != u30.b) {
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        w30Var.b(sb);
        sb.append("..");
        w30Var2.c(sb);
        d.r("Invalid range: ".concat(sb.toString()));
        throw null;
    }
}
