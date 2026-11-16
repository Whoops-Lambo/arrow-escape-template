package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ju2 {

    @NotNull
    public static final iu2 Companion = new iu2();
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final int j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju2)) {
            return false;
        }
        ju2 ju2Var = (ju2) obj;
        return s71.b(this.a, ju2Var.a) && s71.b(this.b, ju2Var.b) && s71.b(this.c, ju2Var.c) && s71.b(this.d, ju2Var.d) && s71.b(this.e, ju2Var.e) && s71.b(this.f, ju2Var.f) && s71.b(this.g, ju2Var.g) && s71.b(this.h, ju2Var.h) && s71.b(this.i, ju2Var.i) && this.j == ju2Var.j;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.h;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.i;
        return Integer.hashCode(this.j) + ((iHashCode8 + (num9 != null ? num9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UCColorPalette(text100=" + this.a + ", text80=" + this.b + ", text16=" + this.c + ", text2=" + this.d + ", layerBackgroundColor=" + this.e + ", layerBackgroundSecondaryColor=" + this.f + ", selectedTabColor=" + this.g + ", linkColor=" + this.h + ", overlayColor=" + this.i + ", tabsBorderColor=" + this.j + ")";
    }

    public ju2(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
        this.g = num7;
        this.h = num8;
        this.i = num9;
        this.j = i;
    }
}
