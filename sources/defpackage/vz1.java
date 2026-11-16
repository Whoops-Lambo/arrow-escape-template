package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vz1 {
    public final int a;
    public final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vz1.class != obj.getClass()) {
            return false;
        }
        vz1 vz1Var = (vz1) obj;
        return this.a == vz1Var.a && this.b == vz1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }

    public vz1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
