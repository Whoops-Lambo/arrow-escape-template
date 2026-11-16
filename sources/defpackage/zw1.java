package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zw1 {
    public final jy1 a;
    public final ls b;
    public final x41 c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zw1) {
            zw1 zw1Var = (zw1) obj;
            return s71.b(this.a, zw1Var.a) && this.b == zw1Var.b && this.c == zw1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PredefinedUIHolder(data=" + this.a + ", consentManager=" + this.b + ", viewHandlers=" + this.c + ")";
    }

    public zw1(jy1 jy1Var, ls lsVar, x41 x41Var) {
        jy1Var.getClass();
        this.a = jy1Var;
        this.b = lsVar;
        this.c = x41Var;
    }
}
