package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p65 {
    public final Class a;
    public final Class b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof p65)) {
            return false;
        }
        p65 p65Var = (p65) obj;
        return p65Var.a.equals(this.a) && p65Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return h50.i(this.a.getSimpleName(), " with primitive type: ", this.b.getSimpleName());
    }

    public p65(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }
}
