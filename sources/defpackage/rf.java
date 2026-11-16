package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class rf extends kq1 {
    public final jq1 a;
    public final iq1 b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq1) {
            kq1 kq1Var = (kq1) obj;
            jq1 jq1Var = this.a;
            if (jq1Var != null ? jq1Var.equals(((rf) kq1Var).a) : ((rf) kq1Var).a == null) {
                iq1 iq1Var = this.b;
                if (iq1Var != null ? iq1Var.equals(((rf) kq1Var).b) : ((rf) kq1Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        jq1 jq1Var = this.a;
        int iHashCode = ((jq1Var == null ? 0 : jq1Var.hashCode()) ^ 1000003) * 1000003;
        iq1 iq1Var = this.b;
        return iHashCode ^ (iq1Var != null ? iq1Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }

    public rf(jq1 jq1Var, iq1 iq1Var) {
        this.a = jq1Var;
        this.b = iq1Var;
    }
}
