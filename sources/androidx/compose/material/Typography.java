package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/Typography;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Typography {
    public final TextStyle a;
    public final TextStyle b;
    public final TextStyle c;
    public final TextStyle d;
    public final TextStyle e;
    public final TextStyle f;
    public final TextStyle g;
    public final TextStyle h;
    public final TextStyle i;
    public final TextStyle j;
    public final TextStyle k;
    public final TextStyle l;
    public final TextStyle m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return s71.b(this.a, typography.a) && s71.b(this.b, typography.b) && s71.b(this.c, typography.c) && s71.b(this.d, typography.d) && s71.b(this.e, typography.e) && s71.b(this.f, typography.f) && s71.b(this.g, typography.g) && s71.b(this.h, typography.h) && s71.b(this.i, typography.i) && s71.b(this.j, typography.j) && s71.b(this.k, typography.k) && s71.b(this.l, typography.l) && s71.b(this.m, typography.m);
    }

    public Typography(int i, TextStyle textStyle) {
        TextStyle textStyle2;
        TextStyle textStyle3;
        FontWeight fontWeight = FontWeight.e;
        TextStyle textStyle4 = new TextStyle(0L, TextUnitKt.c(96), fontWeight, null, null, TextUnitKt.b(-1.5d), null, null, 0L, 262009);
        TextStyle textStyle5 = new TextStyle(0L, TextUnitKt.c(60), fontWeight, null, null, TextUnitKt.b(-0.5d), null, null, 0L, 262009);
        FontWeight fontWeight2 = FontWeight.f;
        TextStyle textStyle6 = new TextStyle(0L, TextUnitKt.c(48), fontWeight2, null, null, TextUnitKt.c(0), null, null, 0L, 262009);
        TextStyle textStyle7 = new TextStyle(0L, TextUnitKt.c(34), fontWeight2, null, null, TextUnitKt.b(0.25d), null, null, 0L, 262009);
        TextStyle textStyle8 = new TextStyle(0L, TextUnitKt.c(24), fontWeight2, null, null, TextUnitKt.c(0), null, null, 0L, 262009);
        FontWeight fontWeight3 = FontWeight.g;
        TextStyle textStyle9 = new TextStyle(0L, TextUnitKt.c(20), fontWeight3, null, null, TextUnitKt.b(0.15d), null, null, 0L, 262009);
        TextStyle textStyle10 = new TextStyle(0L, TextUnitKt.c(16), fontWeight2, null, null, TextUnitKt.b(0.15d), null, null, 0L, 262009);
        TextStyle textStyle11 = new TextStyle(0L, TextUnitKt.c(14), fontWeight3, null, null, TextUnitKt.b(0.1d), null, null, 0L, 262009);
        if ((i & 512) != 0) {
            textStyle2 = textStyle10;
            textStyle3 = new TextStyle(0L, TextUnitKt.c(16), fontWeight2, null, null, TextUnitKt.b(0.5d), null, null, 0L, 262009);
        } else {
            textStyle2 = textStyle10;
            textStyle3 = textStyle;
        }
        TextStyle textStyle12 = textStyle3;
        TextStyle textStyle13 = new TextStyle(0L, TextUnitKt.c(14), fontWeight2, null, null, TextUnitKt.b(0.25d), null, null, 0L, 262009);
        TextStyle textStyle14 = new TextStyle(0L, TextUnitKt.c(14), fontWeight3, null, null, TextUnitKt.b(1.25d), null, null, 0L, 262009);
        TextStyle textStyle15 = new TextStyle(0L, TextUnitKt.c(12), fontWeight2, null, null, TextUnitKt.b(0.4d), null, null, 0L, 262009);
        TextStyle textStyle16 = new TextStyle(0L, TextUnitKt.c(10), fontWeight2, null, null, TextUnitKt.b(1.5d), null, null, 0L, 262009);
        DefaultFontFamily defaultFontFamily = FontFamily.a;
        TextStyle textStyleA = TypographyKt.a(textStyle4, defaultFontFamily);
        TextStyle textStyleA2 = TypographyKt.a(textStyle5, defaultFontFamily);
        TextStyle textStyleA3 = TypographyKt.a(textStyle6, defaultFontFamily);
        TextStyle textStyleA4 = TypographyKt.a(textStyle7, defaultFontFamily);
        TextStyle textStyleA5 = TypographyKt.a(textStyle8, defaultFontFamily);
        TextStyle textStyleA6 = TypographyKt.a(textStyle9, defaultFontFamily);
        TextStyle textStyleA7 = TypographyKt.a(textStyle2, defaultFontFamily);
        TextStyle textStyleA8 = TypographyKt.a(textStyle11, defaultFontFamily);
        TextStyle textStyleA9 = TypographyKt.a(textStyle12, defaultFontFamily);
        TextStyle textStyleA10 = TypographyKt.a(textStyle13, defaultFontFamily);
        TextStyle textStyleA11 = TypographyKt.a(textStyle14, defaultFontFamily);
        TextStyle textStyleA12 = TypographyKt.a(textStyle15, defaultFontFamily);
        TextStyle textStyleA13 = TypographyKt.a(textStyle16, defaultFontFamily);
        this.a = textStyleA;
        this.b = textStyleA2;
        this.c = textStyleA3;
        this.d = textStyleA4;
        this.e = textStyleA5;
        this.f = textStyleA6;
        this.g = textStyleA7;
        this.h = textStyleA8;
        this.i = textStyleA9;
        this.j = textStyleA10;
        this.k = textStyleA11;
        this.l = textStyleA12;
        this.m = textStyleA13;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", subtitle1=" + this.g + ", subtitle2=" + this.h + ", body1=" + this.i + ", body2=" + this.j + ", button=" + this.k + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}
