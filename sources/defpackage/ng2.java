package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ng2 {
    public static final ng2 c;
    public final u12 a;
    public final u12 b;

    static {
        ec0 ec0Var = ec0.s;
        c = new ng2(ec0Var, ec0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng2)) {
            return false;
        }
        ng2 ng2Var = (ng2) obj;
        return this.a.equals(ng2Var.a) && this.b.equals(ng2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }

    public ng2(u12 u12Var, u12 u12Var2) {
        this.a = u12Var;
        this.b = u12Var2;
    }
}
