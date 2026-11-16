package defpackage;

import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vv2 {

    @NotNull
    public static final uv2 Companion = new uv2();
    public final Typeface a;
    public final Typeface b;
    public final tv2 c;
    public final Float d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv2)) {
            return false;
        }
        vv2 vv2Var = (vv2) obj;
        return this.a.equals(vv2Var.a) && this.b.equals(vv2Var.b) && this.c.equals(vv2Var.c) && s71.b(this.d, vv2Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Float f = this.d;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "UCFontTheme(font=" + this.a + ", fontBold=" + this.b + ", sizes=" + this.c + ", lineSpacingMultiplier=" + this.d + ")";
    }

    public vv2(Typeface typeface, Typeface typeface2, tv2 tv2Var, Float f) {
        this.a = typeface;
        this.b = typeface2;
        this.c = tv2Var;
        this.d = f;
    }
}
