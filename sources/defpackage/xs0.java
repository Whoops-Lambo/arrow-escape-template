package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xs0 {
    public final boolean a;
    public final Integer b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs0)) {
            return false;
        }
        xs0 xs0Var = (xs0) obj;
        return this.a == xs0Var.a && s71.b(this.b, xs0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "GDPROptions(displayCmpOnlyToEUUsers=" + this.a + ", reshowCmpInMonths=" + this.b + ")";
    }

    public xs0(boolean z, Integer num) {
        this.a = z;
        this.b = num;
    }
}
