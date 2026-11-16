package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yx1 {
    public final String a;
    public final String b;
    public final List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx1)) {
            return false;
        }
        yx1 yx1Var = (yx1) obj;
        return s71.b(this.a, yx1Var.a) && s71.b(this.b, yx1Var.b) && s71.b(this.c, yx1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = pv1.r("PredefinedUIStorageInformationButtonInfo(label=", this.a, ", url=", this.b, ", deviceStorage=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }

    public yx1(ArrayList arrayList, String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }
}
