package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class he extends p00 {
    public final List a;
    public final l00 b;
    public final b00 c;
    public final g00 d;
    public final ke e;
    public final List f;

    public final int hashCode() {
        List list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        l00 l00Var = this.b;
        int iHashCode2 = (iHashCode ^ (l00Var == null ? 0 : l00Var.hashCode())) * 1000003;
        b00 b00Var = this.c;
        int iHashCode3 = (iHashCode2 ^ (b00Var == null ? 0 : b00Var.hashCode())) * 1000003;
        g00 g00Var = this.d;
        return this.f.hashCode() ^ (((((g00Var != null ? g00Var.hashCode() : 0) ^ iHashCode3) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p00)) {
            return false;
        }
        p00 p00Var = (p00) obj;
        List list = this.a;
        if (list == null) {
            if (((he) p00Var).a != null) {
                return false;
            }
        } else if (!list.equals(((he) p00Var).a)) {
            return false;
        }
        l00 l00Var = this.b;
        if (l00Var == null) {
            if (((he) p00Var).b != null) {
                return false;
            }
        } else if (!l00Var.equals(((he) p00Var).b)) {
            return false;
        }
        b00 b00Var = this.c;
        if (b00Var == null) {
            if (((he) p00Var).c != null) {
                return false;
            }
        } else if (!b00Var.equals(((he) p00Var).c)) {
            return false;
        }
        g00 g00Var = this.d;
        if (g00Var == null) {
            if (((he) p00Var).d != null) {
                return false;
            }
        } else if (!g00Var.equals(((he) p00Var).d)) {
            return false;
        }
        he heVar = (he) p00Var;
        return this.e.equals(heVar.e) && this.f.equals(heVar.f);
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", profilingManagerInfo=" + this.d + ", signal=" + this.e + ", binaries=" + this.f + "}";
    }

    public he(List list, l00 l00Var, b00 b00Var, g00 g00Var, ke keVar, List list2) {
        this.a = list;
        this.b = l00Var;
        this.c = b00Var;
        this.d = g00Var;
        this.e = keVar;
        this.f = list2;
    }
}
