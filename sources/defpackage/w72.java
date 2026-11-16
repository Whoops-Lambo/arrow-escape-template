package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w72 {
    public final Boolean a;
    public final Integer b;
    public final List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w72)) {
            return false;
        }
        w72 w72Var = (w72) obj;
        return s71.b(this.a, w72Var.a) && s71.b(this.b, w72Var.b) && s71.b(this.c, w72Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SecondLayerInitialState(ccpaToggleValue=" + this.a + ", tabIndex=" + this.b + ", decisions=" + this.c + ")";
    }

    public w72(Boolean bool, Integer num, ArrayList arrayList) {
        this.a = bool;
        this.b = num;
        this.c = arrayList;
    }
}
