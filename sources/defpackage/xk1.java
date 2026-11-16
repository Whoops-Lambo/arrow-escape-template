package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xk1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk1)) {
            return false;
        }
        xk1 xk1Var = (xk1) obj;
        return this.a == xk1Var.a && this.b == xk1Var.b && this.c == xk1Var.c && this.d == xk1Var.d && this.e == xk1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + jc1.f(jc1.f(jc1.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediationGranularConsent(eea=");
        sb.append(this.a);
        sb.append(", analyticsStorage=");
        sb.append(this.b);
        sb.append(", adStorage=");
        h50.z(sb, this.c, ", adUserData=", this.d, ", adPersonalization=");
        return h50.n(sb, this.e, ")");
    }

    public xk1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }
}
