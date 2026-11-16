package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ue extends v00 {
    public final u00 a;
    public final String b;
    public final String c;
    public final long d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v00) {
            ue ueVar = (ue) ((v00) obj);
            if (this.a.equals(ueVar.a) && this.b.equals(ueVar.b) && this.c.equals(ueVar.c) && this.d == ueVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return jc1.m(this.d, "}", sb);
    }

    public ue(ve veVar, String str, String str2, long j) {
        this.a = veVar;
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
