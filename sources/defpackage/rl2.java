package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rl2 implements ol2, Serializable {
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof rl2) {
            return uu.p(this.a, ((rl2) obj).a);
        }
        return false;
    }

    @Override // defpackage.ol2
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return jc1.p(new StringBuilder("Suppliers.ofInstance("), this.a, ")");
    }

    public rl2(Object obj) {
        this.a = obj;
    }
}
