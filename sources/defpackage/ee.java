package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ee extends x00 {
    public final long a;
    public final String b;
    public final r00 c;
    public final s00 d;
    public final t00 e;
    public final w00 f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x00) {
            ee eeVar = (ee) ((x00) obj);
            if (this.a == eeVar.a && this.b.equals(eeVar.b) && this.c.equals(eeVar.c) && this.d.equals(eeVar.d)) {
                t00 t00Var = eeVar.e;
                t00 t00Var2 = this.e;
                if (t00Var2 != null ? t00Var2.equals(t00Var) : t00Var == null) {
                    w00 w00Var = eeVar.f;
                    w00 w00Var2 = this.f;
                    if (w00Var2 != null ? w00Var2.equals(w00Var) : w00Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final de a() {
        de deVar = new de();
        deVar.a = this.a;
        deVar.b = this.b;
        deVar.c = this.c;
        deVar.d = this.d;
        deVar.e = this.e;
        deVar.f = this.f;
        deVar.g = (byte) 1;
        return deVar;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        t00 t00Var = this.e;
        int iHashCode2 = (iHashCode ^ (t00Var == null ? 0 : t00Var.hashCode())) * 1000003;
        w00 w00Var = this.f;
        return iHashCode2 ^ (w00Var != null ? w00Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }

    public ee(long j, String str, r00 r00Var, s00 s00Var, t00 t00Var, w00 w00Var) {
        this.a = j;
        this.b = str;
        this.c = r00Var;
        this.d = s00Var;
        this.e = t00Var;
        this.f = w00Var;
    }
}
