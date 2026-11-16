package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t43 {
    public final List a;
    public final Set b;
    public final Set c;
    public final boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t43)) {
            return false;
        }
        t43 t43Var = (t43) obj;
        return this.a.equals(t43Var.a) && s71.b(this.b, t43Var.b) && s71.b(this.c, t43Var.c) && this.d == t43Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Set set = this.c;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode2 + r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VVPConfig(rules=");
        sb.append(this.a);
        sb.append(", standardParams=");
        sb.append(this.b);
        sb.append(", inScopeEventNames=");
        sb.append(this.c);
        sb.append(", isShadowEnabled=");
        return h50.m(sb, this.d, ')');
    }

    public t43(List list, Set set, HashSet hashSet, boolean z) {
        set.getClass();
        this.a = list;
        this.b = set;
        this.c = hashSet;
        this.d = z;
    }
}
