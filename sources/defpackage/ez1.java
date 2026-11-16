package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@z92
public final class ez1 {

    @NotNull
    public static final dz1 Companion = new dz1();
    public final int a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        return this.a == ez1Var.a && s71.b(this.b, ez1Var.b);
    }

    public /* synthetic */ ez1(int i, int i2, String str) {
        if (3 != (i & 3)) {
            ep0.J(i, 3, cz1.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return jc1.q(sb, this.b, ')');
    }

    public ez1(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
