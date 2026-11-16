package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 {
    public final String a;
    public final List b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return s71.b(this.a, d4Var.a) && s71.b(this.b, d4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalConsentModeData(acString=" + this.a + ", adTechProviders=" + this.b + ")";
    }

    public d4(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }
}
