package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sw1 {
    public final String a;
    public final ay1 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw1)) {
            return false;
        }
        sw1 sw1Var = (sw1) obj;
        return s71.b(this.a, sw1Var.a) && this.b.equals(sw1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedUIDependantSwitchSettings(id=" + this.a + ", switchSettings=" + this.b + ")";
    }

    public sw1(String str, ay1 ay1Var) {
        str.getClass();
        this.a = str;
        this.b = ay1Var;
    }
}
