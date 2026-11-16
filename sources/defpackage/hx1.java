package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 {

    @NotNull
    public static final gx1 Companion = new gx1();
    public final String a;
    public final String b;
    public final ix1 c;
    public final x13 d;

    public final boolean a() {
        if (dk2.Z(this.a)) {
            return true;
        }
        if (this.c != ix1.URL) {
            return false;
        }
        String str = this.b;
        return str == null || dk2.Z(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx1)) {
            return false;
        }
        hx1 hx1Var = (hx1) obj;
        return s71.b(this.a, hx1Var.a) && s71.b(this.b, hx1Var.b) && this.c == hx1Var.c && this.d == hx1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = pv1.r("PredefinedUILink(label=", this.a, ", url=", this.b, ", linkType=");
        sbR.append(this.c);
        sbR.append(", eventType=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }

    public hx1(String str, String str2, ix1 ix1Var, x13 x13Var) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = ix1Var;
        this.d = x13Var;
    }
}
