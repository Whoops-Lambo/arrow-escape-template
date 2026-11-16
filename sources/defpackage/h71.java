package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class h71 implements Iterable, bc1 {
    public final int a;
    public final int b;
    public final int c;

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i71 iterator() {
        return new i71(this.a, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h71)) {
            return false;
        }
        if (isEmpty() && ((h71) obj).isEmpty()) {
            return true;
        }
        h71 h71Var = (h71) obj;
        return this.a == h71Var.a && this.b == h71Var.b && this.c == h71Var.c;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }

    public h71(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i;
                this.b = vk3.n(i, i2, i3);
                this.c = i3;
                return;
            }
            d.r("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        d.r("Step must be non-zero.");
        throw null;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
