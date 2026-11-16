package defpackage;

import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ay1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay1)) {
            return false;
        }
        ay1 ay1Var = (ay1) obj;
        return s71.b(this.a, ay1Var.a) && s71.b(this.b, ay1Var.b) && this.c == ay1Var.c && this.d == ay1Var.d && this.e == ay1Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + jc1.f(jc1.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = pv1.r("PredefinedUISwitchSettingsUI(id=", this.a, ", label=", this.b, ", disabled=");
        h50.z(sbR, this.c, ", currentValue=", this.d, ", isExempt=");
        return h50.n(sbR, this.e, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ay1(wd1 wd1Var) {
        boolean zBooleanValue;
        wd1Var.getClass();
        boolean z = wd1Var.q;
        boolean z2 = wd1Var.p.b;
        Boolean bool = wd1Var.A;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this(C4664b4.j.b0, null, z, z2, zBooleanValue, 2);
    }

    public ay1(String str, String str2, boolean z, boolean z2, boolean z3, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        z3 = (i & 16) != 0 ? false : z3;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
