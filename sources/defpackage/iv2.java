package defpackage;

import android.graphics.Typeface;
import com.usercentrics.sdk.SectionAlignment;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class iv2 {
    public final String a;
    public final Typeface b;
    public final Float c;
    public final SectionAlignment d;
    public final Integer e;
    public final Integer f;
    public final Boolean g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv2)) {
            return false;
        }
        iv2 iv2Var = (iv2) obj;
        return s71.b(this.a, iv2Var.a) && s71.b(this.b, iv2Var.b) && s71.b(this.c, iv2Var.c) && this.d == iv2Var.d && s71.b(this.e, iv2Var.e) && s71.b(this.f, iv2Var.f) && s71.b(this.g, iv2Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Typeface typeface = this.b;
        int iHashCode2 = (iHashCode + (typeface == null ? 0 : typeface.hashCode())) * 31;
        Float f = this.c;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        SectionAlignment sectionAlignment = this.d;
        int iHashCode4 = (iHashCode3 + (sectionAlignment == null ? 0 : sectionAlignment.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "UCFirstLayerMessage(text=" + this.a + ", customFont=" + this.b + ", customTextSizeInSp=" + this.c + ", customAlignment=" + this.d + ", customTextColor=" + this.e + ", customLinkTextColor=" + this.f + ", customUnderlineLink=" + this.g + ")";
    }

    public iv2(String str, Typeface typeface, Float f, SectionAlignment sectionAlignment, Integer num, Integer num2, Boolean bool) {
        str.getClass();
        this.a = str;
        this.b = typeface;
        this.c = f;
        this.d = sectionAlignment;
        this.e = num;
        this.f = num2;
        this.g = bool;
    }
}
