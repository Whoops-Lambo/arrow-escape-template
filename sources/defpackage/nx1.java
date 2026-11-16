package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class nx1 {
    public final String a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx1)) {
            return false;
        }
        nx1 nx1Var = (nx1) obj;
        return s71.b(this.a, nx1Var.a) && this.b.equals(nx1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n30.n("PredefinedUIPurposeVendorDetails(title=", this.a, ", value=", this.b, ")");
    }

    public nx1(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }
}
