package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pw4 {
    public final Class a;
    public final Class b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof pw4)) {
            return false;
        }
        pw4 pw4Var = (pw4) obj;
        return pw4Var.a.equals(this.a) && pw4Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String simpleName2 = this.b.getSimpleName();
        return jc1.o(simpleName, " with primitive type: ", new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName2);
    }

    public /* synthetic */ pw4(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }
}
