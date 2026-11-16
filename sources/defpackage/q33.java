package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q33 {
    public final List a;
    public final Boolean b;
    public final Integer c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q33)) {
            return false;
        }
        q33 q33Var = (q33) obj;
        return this.a.equals(q33Var.a) && s71.b(this.b, q33Var.b) && s71.b(this.c, q33Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "UsercentricsSecondLayerState(serviceDecisions=" + this.a + ", ccpaOptOutToggleValue=" + this.b + ", activeTabIndex=" + this.c + ")";
    }

    public q33(List list, Boolean bool, Integer num) {
        this.a = list;
        this.b = bool;
        this.c = num;
    }
}
