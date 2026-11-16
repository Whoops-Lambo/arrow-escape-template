package defpackage;

import android.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class tx2 {

    @NotNull
    public static final sx2 Companion = new sx2();
    public static final int[] g = {-16842910, -16842912};
    public static final int[] h = {-16842910, R.attr.state_checked};
    public static final int[] i = {R.attr.state_enabled, R.attr.state_checked};
    public static final int[] j = {R.attr.state_enabled, -16842912};
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx2)) {
            return false;
        }
        tx2 tx2Var = (tx2) obj;
        return this.a == tx2Var.a && this.b == tx2Var.b && this.c == tx2Var.c && this.d == tx2Var.d && this.e == tx2Var.e && this.f == tx2Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + jc1.d(this.e, jc1.d(this.d, jc1.d(this.c, jc1.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = jc1.t("UCToggleTheme(activeBackground=", this.a, ", inactiveBackground=", this.b, ", disabledBackground=");
        h50.s(this.c, this.d, ", activeIcon=", ", inactiveIcon=", sbT);
        sbT.append(this.e);
        sbT.append(", disabledIcon=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }

    public tx2(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
    }
}
