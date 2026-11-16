package defpackage;

import com.usercentrics.sdk.PurposeListStyle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qx2 {

    @NotNull
    public static final px2 Companion = new px2();
    public final ju2 a;
    public final vv2 b;
    public final tx2 c;
    public final qt2 d;
    public final int e;
    public final ed1 f;
    public final PurposeListStyle g;
    public final nk h;
    public final boolean i;
    public final boolean j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final boolean n;
    public final Boolean o;
    public final Integer p;
    public final Float q;
    public final Integer r;
    public final Integer s;
    public final boolean t;
    public final Integer u;
    public final Integer v;
    public final Integer w;

    public qx2(ju2 ju2Var, vv2 vv2Var, tx2 tx2Var, qt2 qt2Var, int i, ed1 ed1Var, PurposeListStyle purposeListStyle, nk nkVar, boolean z, boolean z2, Integer num, Integer num2, Integer num3, boolean z3, Boolean bool, Integer num4, Float f, Integer num5, Integer num6, boolean z4, Integer num7, Integer num8, Integer num9) {
        purposeListStyle.getClass();
        this.a = ju2Var;
        this.b = vv2Var;
        this.c = tx2Var;
        this.d = qt2Var;
        this.e = i;
        this.f = ed1Var;
        this.g = purposeListStyle;
        this.h = nkVar;
        this.i = z;
        this.j = z2;
        this.k = num;
        this.l = num2;
        this.m = num3;
        this.n = z3;
        this.o = bool;
        this.p = num4;
        this.q = f;
        this.r = num5;
        this.s = num6;
        this.t = z4;
        this.u = num7;
        this.v = num8;
        this.w = num9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx2)) {
            return false;
        }
        qx2 qx2Var = (qx2) obj;
        return this.a.equals(qx2Var.a) && this.b.equals(qx2Var.b) && s71.b(this.c, qx2Var.c) && this.d.equals(qx2Var.d) && this.e == qx2Var.e && s71.b(this.f, qx2Var.f) && this.g == qx2Var.g && s71.b(this.h, qx2Var.h) && this.i == qx2Var.i && this.j == qx2Var.j && s71.b(this.k, qx2Var.k) && s71.b(this.l, qx2Var.l) && s71.b(this.m, qx2Var.m) && this.n == qx2Var.n && s71.b(this.o, qx2Var.o) && s71.b(this.p, qx2Var.p) && s71.b(this.q, qx2Var.q) && s71.b(this.r, qx2Var.r) && s71.b(this.s, qx2Var.s) && this.t == qx2Var.t && s71.b(this.u, qx2Var.u) && s71.b(this.v, qx2Var.v) && s71.b(this.w, qx2Var.w);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tx2 tx2Var = this.c;
        int iD = jc1.d(this.e, (this.d.hashCode() + ((iHashCode + (tx2Var == null ? 0 : tx2Var.hashCode())) * 31)) * 31, 31);
        ed1 ed1Var = this.f;
        int iHashCode2 = (this.g.hashCode() + ((iD + (ed1Var == null ? 0 : ed1Var.hashCode())) * 31)) * 31;
        nk nkVar = this.h;
        int iF = jc1.f(jc1.f((iHashCode2 + (nkVar == null ? 0 : nkVar.hashCode())) * 31, 31, this.i), 31, this.j);
        Integer num = this.k;
        int iHashCode3 = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.l;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.m;
        int iF2 = jc1.f((iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.n);
        Boolean bool = this.o;
        int iHashCode5 = (iF2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.p;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.q;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num5 = this.r;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.s;
        int iF3 = jc1.f((iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31, 31, this.t);
        Integer num7 = this.u;
        int iHashCode9 = (iF3 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.v;
        int iHashCode10 = (iHashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.w;
        return iHashCode10 + (num9 != null ? num9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UCThemeData(colorPalette=");
        sb.append(this.a);
        sb.append(", fonts=");
        sb.append(this.b);
        sb.append(", toggleTheme=");
        sb.append(this.c);
        sb.append(", buttonTheme=");
        sb.append(this.d);
        sb.append(", bannerCornerRadius=");
        sb.append(this.e);
        sb.append(", contentPadding=");
        sb.append(this.f);
        sb.append(", purposeListStyle=");
        sb.append(this.g);
        sb.append(", buttonBorder=");
        sb.append(this.h);
        sb.append(", stickyHeader=");
        h50.z(sb, this.i, ", hideLanguageSwitcher=", this.j, ", buttonHeightDp=");
        sb.append(this.k);
        sb.append(", buttonHorizontalPaddingDp=");
        sb.append(this.l);
        sb.append(", buttonSpacingDp=");
        sb.append(this.m);
        sb.append(", linkUnderline=");
        sb.append(this.n);
        sb.append(", showSecondLayerCloseButton=");
        sb.append(this.o);
        sb.append(", tabActiveColor=");
        sb.append(this.p);
        sb.append(", tabFontSize=");
        sb.append(this.q);
        sb.append(", denyAllButtonBackground=");
        sb.append(this.r);
        sb.append(", acceptAllButtonBackground=");
        sb.append(this.s);
        sb.append(", titleFontBold=");
        sb.append(this.t);
        sb.append(", headerPaddingTop=");
        sb.append(this.u);
        sb.append(", headerPaddingSides=");
        sb.append(this.v);
        sb.append(", headerPaddingBetweenElements=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }
}
