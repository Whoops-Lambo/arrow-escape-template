package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class je extends l00 {
    public final String a;
    public final String b;
    public final List c;
    public final l00 d;
    public final int e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l00) {
            je jeVar = (je) ((l00) obj);
            if (this.a.equals(jeVar.a)) {
                String str = jeVar.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(jeVar.c)) {
                        l00 l00Var = jeVar.d;
                        l00 l00Var2 = this.d;
                        if (l00Var2 != null ? l00Var2.equals(l00Var) : l00Var == null) {
                            if (this.e == jeVar.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        l00 l00Var = this.d;
        return this.e ^ ((iHashCode2 ^ (l00Var != null ? l00Var.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return nj.l(this.e, "}", sb);
    }

    public je(String str, String str2, List list, l00 l00Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = l00Var;
        this.e = i;
    }
}
