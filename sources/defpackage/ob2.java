package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ob2 {
    public final vb2 a;
    public final z7 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob2)) {
            return false;
        }
        ob2 ob2Var = (ob2) obj;
        return this.a.equals(ob2Var.a) && this.b.equals(ob2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (ri0.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + ri0.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }

    public ob2(vb2 vb2Var, z7 z7Var) {
        this.a = vb2Var;
        this.b = z7Var;
    }
}
