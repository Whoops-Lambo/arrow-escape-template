package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j71 extends h71 {
    public static final j71 d = new j71(1, 0, 1);

    public final boolean d(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.h71
    public final boolean equals(Object obj) {
        if (!(obj instanceof j71)) {
            return false;
        }
        if (isEmpty() && ((j71) obj).isEmpty()) {
            return true;
        }
        j71 j71Var = (j71) obj;
        return this.a == j71Var.a && this.b == j71Var.b;
    }

    @Override // defpackage.h71
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.h71
    public final String toString() {
        return this.a + ".." + this.b;
    }

    @Override // defpackage.h71
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }
}
