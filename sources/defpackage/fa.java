package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fa {
    public final String a;
    public final ns2 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return this.a.equals(faVar.a) && this.b.equals(faVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.a);
    }

    public fa(String str, ns2 ns2Var) {
        this.a = str;
        this.b = ns2Var;
        if (!dk2.Z(str)) {
            return;
        }
        d.r("Name can't be blank");
        throw null;
    }
}
