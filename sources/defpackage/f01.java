package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f01 {
    public final ns2 a;
    public final Object b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f01)) {
            return false;
        }
        f01 f01Var = (f01) obj;
        return s71.b(this.a, f01Var.a) && s71.b(this.b, f01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.a + ", response=" + this.b + ')';
    }

    public f01(ns2 ns2Var, Object obj) {
        ns2Var.getClass();
        obj.getClass();
        this.a = ns2Var;
        this.b = obj;
    }
}
