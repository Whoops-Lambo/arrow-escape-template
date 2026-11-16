package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ez0 {
    public static final ez0 d = new ez0("HTTP", 1, 1);
    public final String a;
    public final int b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez0)) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        return this.a.equals(ez0Var.a) && this.b == ez0Var.b && this.c == ez0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + jc1.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }

    public ez0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
