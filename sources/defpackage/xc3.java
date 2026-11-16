package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class xc3 {
    public final int a;
    public final long b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xc3)) {
            return false;
        }
        xc3 xc3Var = (xc3) obj;
        return this.a == xc3Var.a && this.b == xc3Var.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.a);
        sb.append(", eventTimestamp=");
        return jc1.m(this.b, "}", sb);
    }

    public xc3(int i, long j) {
        this.a = i;
        this.b = j;
    }
}
