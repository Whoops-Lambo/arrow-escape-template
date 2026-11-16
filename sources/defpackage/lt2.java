package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lt2 {

    @NotNull
    public static final kt2 Companion = new kt2();
    public final Integer a;
    public final Integer b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt2)) {
            return false;
        }
        lt2 lt2Var = (lt2) obj;
        return s71.b(this.a, lt2Var.a) && s71.b(this.b, lt2Var.b) && this.c == lt2Var.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UCButtonCustomization(text=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", cornerRadius=");
        return nj.l(this.c, ")", sb);
    }

    public lt2(int i, Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
        this.c = i;
    }
}
