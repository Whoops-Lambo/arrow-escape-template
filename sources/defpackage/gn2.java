package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gn2 implements xh, sm2 {
    public final int a;
    public final Boolean b;
    public final Boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn2)) {
            return false;
        }
        gn2 gn2Var = (gn2) obj;
        return this.a == gn2Var.a && s71.b(this.b, gn2Var.b) && s71.b(this.c, gn2Var.c);
    }

    @Override // defpackage.sm2
    public final Boolean a() {
        return this.c;
    }

    @Override // defpackage.xh
    public final Boolean getConsent() {
        return this.b;
    }

    @Override // defpackage.xh
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "TCFUserDecisionOnPurpose(id=" + this.a + ", consent=" + this.b + ", legitimateInterestConsent=" + this.c + ")";
    }

    public gn2(int i, Boolean bool, Boolean bool2) {
        this.a = i;
        this.b = bool;
        this.c = bool2;
    }
}
