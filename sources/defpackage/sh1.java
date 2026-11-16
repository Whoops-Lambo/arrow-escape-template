package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sh1 {
    public final String a;
    public final j71 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh1)) {
            return false;
        }
        sh1 sh1Var = (sh1) obj;
        return this.a.equals(sh1Var.a) && this.b.equals(sh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }

    public sh1(String str, j71 j71Var) {
        this.a = str;
        this.b = j71Var;
    }
}
