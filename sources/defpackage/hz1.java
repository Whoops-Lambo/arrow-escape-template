package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hz1 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz1)) {
            return false;
        }
        hz1 hz1Var = (hz1) obj;
        return this.a.equals(hz1Var.a) && this.b == hz1Var.b && this.c == hz1Var.c && this.d == hz1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + jc1.d(this.c, jc1.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return h50.m(sb, this.d, ')');
    }

    public hz1(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
