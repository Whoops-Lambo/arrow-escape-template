package defpackage;

import com.usercentrics.sdk.SectionAlignment;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ol1 {
    public final Float a;
    public final SectionAlignment b;
    public final Integer c;
    public final Integer d;
    public final Boolean e;

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        SectionAlignment sectionAlignment = this.b;
        int iHashCode2 = (iHashCode + (sectionAlignment == null ? 0 : sectionAlignment.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1Var = (ol1) obj;
        return s71.b(this.a, ol1Var.a) && this.b == ol1Var.b && s71.b(this.c, ol1Var.c) && s71.b(this.d, ol1Var.d) && s71.b(this.e, ol1Var.e);
    }

    public final String toString() {
        return "MessageSettings(font=null, textSizeInSp=" + this.a + ", alignment=" + this.b + ", textColor=" + this.c + ", linkTextColor=" + this.d + ", underlineLink=" + this.e + ")";
    }

    public ol1(Float f, SectionAlignment sectionAlignment, Integer num, Integer num2, Boolean bool) {
        this.a = f;
        this.b = sectionAlignment;
        this.c = num;
        this.d = num2;
        this.e = bool;
    }
}
