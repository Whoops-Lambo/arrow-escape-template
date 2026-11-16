package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vo0 implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vo0 vo0Var = (vo0) obj;
        int i = this.b;
        int i2 = vo0Var.b;
        return i != i2 ? i - i2 : this.a - vo0Var.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.b);
        sb.append(", index=");
        return h50.l(sb, this.a, '}');
    }
}
