package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ge extends r00 {
    public final p00 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final q00 e;
    public final List f;
    public final int g;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r00) {
            ge geVar = (ge) ((r00) obj);
            if (this.a.equals(geVar.a)) {
                List list = geVar.b;
                List list2 = this.b;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = geVar.c;
                    List list4 = this.c;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        Boolean bool = geVar.d;
                        Boolean bool2 = this.d;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            q00 q00Var = geVar.e;
                            q00 q00Var2 = this.e;
                            if (q00Var2 != null ? q00Var2.equals(q00Var) : q00Var == null) {
                                List list5 = geVar.f;
                                List list6 = this.f;
                                if (list6 != null ? list6.equals(list5) : list5 == null) {
                                    if (this.g == geVar.g) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.r00
    public final fe a() {
        fe feVar = new fe();
        feVar.a = this.a;
        feVar.b = this.b;
        feVar.c = this.c;
        feVar.d = this.d;
        feVar.e = this.e;
        feVar.f = this.f;
        feVar.g = this.g;
        feVar.h = (byte) 1;
        return feVar;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        q00 q00Var = this.e;
        int iHashCode5 = (iHashCode4 ^ (q00Var == null ? 0 : q00Var.hashCode())) * 1000003;
        List list3 = this.f;
        return this.g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return nj.l(this.g, "}", sb);
    }

    public ge(p00 p00Var, List list, List list2, Boolean bool, q00 q00Var, List list3, int i) {
        this.a = p00Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = q00Var;
        this.f = list3;
        this.g = i;
    }
}
