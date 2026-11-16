package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class su0 {
    public final String a;
    public final List b;
    public final Map c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su0)) {
            return false;
        }
        su0 su0Var = (su0) obj;
        return this.a.equals(su0Var.a) && this.b.equals(su0Var.b) && this.c.equals(su0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pv1.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "GppData(gppString=" + this.a + ", applicableSections=" + this.b + ", sections=" + this.c + ")";
    }

    public su0(String str, List list, Map map) {
        this.a = str;
        this.b = list;
        this.c = map;
    }
}
