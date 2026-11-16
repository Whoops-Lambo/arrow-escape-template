package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uc5 {
    public final int a;
    public final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uc5.class != obj.getClass()) {
            return false;
        }
        uc5 uc5Var = (uc5) obj;
        return this.a == uc5Var.a && this.b == uc5Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }

    public uc5(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
