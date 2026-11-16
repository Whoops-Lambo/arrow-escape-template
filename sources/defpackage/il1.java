package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class il1 {
    public final ArrayList a;
    public final vd1 b;
    public final ArrayList c;
    public final ArrayList d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il1)) {
            return false;
        }
        il1 il1Var = (il1) obj;
        return this.a.equals(il1Var.a) && this.b.equals(il1Var.b) && this.c.equals(il1Var.c) && this.d.equals(il1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MergedServicesSettings(mergedServices=" + this.a + ", mergedSettings=" + this.b + ", updatedEssentialServices=" + this.c + ", updatedNonEssentialServices=" + this.d + ")";
    }

    public il1(ArrayList arrayList, vd1 vd1Var, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = vd1Var;
        this.c = arrayList2;
        this.d = arrayList3;
    }
}
