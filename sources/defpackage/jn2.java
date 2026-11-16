package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jn2 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn2)) {
            return false;
        }
        jn2 jn2Var = (jn2) obj;
        return this.a.equals(jn2Var.a) && this.b.equals(jn2Var.b) && this.c.equals(jn2Var.c) && s71.b(this.d, jn2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pv1.e(pv1.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "TCFUserDecisions(purposes=" + this.a + ", specialFeatures=" + this.b + ", vendors=" + this.c + ", adTechProviders=" + this.d + ")";
    }

    public jn2(List list, List list2, List list3, List list4) {
        list4.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }
}
