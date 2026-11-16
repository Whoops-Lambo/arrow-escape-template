package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class oc1 implements Comparable {
    public static final oc1 b = new oc1();
    public final int a = 131840;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        oc1 oc1Var = obj instanceof oc1 ? (oc1) obj : null;
        return oc1Var != null && this.a == oc1Var.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oc1 oc1Var = (oc1) obj;
        oc1Var.getClass();
        return this.a - oc1Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.3.0";
    }
}
