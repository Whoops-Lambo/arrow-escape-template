package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ku {

    @NotNull
    public static final ju Companion = new ju();
    public final int a;
    public final int b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj;
        return this.a == kuVar.a && this.b == kuVar.b && this.c == kuVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + jc1.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return nj.l(this.c, ")", jc1.t("Color(red=", this.a, ", green=", this.b, ", blue="));
    }

    public ku(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
