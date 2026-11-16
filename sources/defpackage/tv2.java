package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class tv2 {

    @NotNull
    public static final sv2 Companion = new sv2();
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv2)) {
            return false;
        }
        tv2 tv2Var = (tv2) obj;
        return Float.compare(this.a, tv2Var.a) == 0 && Float.compare(this.b, tv2Var.b) == 0 && Float.compare(this.c, tv2Var.c) == 0 && Float.compare(this.d, tv2Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + n30.b(this.c, n30.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "UCFontSize(title=" + this.a + ", body=" + this.b + ", small=" + this.c + ", tiny=" + this.d + ")";
    }

    public tv2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }
}
