package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class qg4 {
    public final Object a;
    public final int b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof qg4)) {
            return false;
        }
        qg4 qg4Var = (qg4) obj;
        return this.a == qg4Var.a && this.b == qg4Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public qg4(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }
}
