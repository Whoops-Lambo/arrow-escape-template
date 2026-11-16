package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class hn2 implements xh {
    public int a;
    public Boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn2)) {
            return false;
        }
        hn2 hn2Var = (hn2) obj;
        return this.a == hn2Var.a && s71.b(this.b, hn2Var.b);
    }

    @Override // defpackage.xh
    public final Boolean getConsent() {
        throw null;
    }

    @Override // defpackage.xh
    public final int getId() {
        throw null;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "TCFUserDecisionOnSpecialFeature(id=" + this.a + ", consent=" + this.b + ")";
    }
}
