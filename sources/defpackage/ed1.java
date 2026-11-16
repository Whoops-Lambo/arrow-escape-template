package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ed1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed1)) {
            return false;
        }
        ed1 ed1Var = (ed1) obj;
        return this.a == ed1Var.a && this.b == ed1Var.b && this.c == ed1Var.c && this.d == ed1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + jc1.d(this.c, jc1.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = jc1.t("LayerContentPadding(top=", this.a, ", bottom=", this.b, ", start=");
        sbT.append(this.c);
        sbT.append(", end=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }

    public ed1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
