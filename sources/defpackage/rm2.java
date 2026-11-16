package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rm2 {
    public final Boolean a;
    public final Boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm2)) {
            return false;
        }
        rm2 rm2Var = (rm2) obj;
        return s71.b(this.a, rm2Var.a) && s71.b(this.b, rm2Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "TCFConsentValue(consent=" + this.a + ", legitimateInterest=" + this.b + ")";
    }

    public rm2(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }
}
