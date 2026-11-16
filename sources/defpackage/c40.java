package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c40 {
    public final l12 a;
    public final boolean b;

    public final boolean equals(Object obj) {
        if (obj instanceof c40) {
            c40 c40Var = (c40) obj;
            if (c40Var.a.equals(this.a) && c40Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public c40(l12 l12Var, boolean z) {
        this.a = l12Var;
        this.b = z;
    }
}
