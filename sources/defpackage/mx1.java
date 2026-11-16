package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mx1 extends ns1 {
    public final vx1 f;
    public final nx1 g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mx1) {
            mx1 mx1Var = (mx1) obj;
            if (this.f == mx1Var.f && this.g.equals(mx1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedUIPurposeCardContent(examples=" + this.f + ", vendors=" + this.g + ")";
    }

    public mx1(vx1 vx1Var, nx1 nx1Var) {
        this.f = vx1Var;
        this.g = nx1Var;
    }
}
