package defpackage;

import com.usercentrics.sdk.SectionAlignment;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jq2 {
    public final Float a;
    public final SectionAlignment b;
    public final Integer c;

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        SectionAlignment sectionAlignment = this.b;
        int iHashCode2 = (iHashCode + (sectionAlignment == null ? 0 : sectionAlignment.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq2)) {
            return false;
        }
        jq2 jq2Var = (jq2) obj;
        return s71.b(this.a, jq2Var.a) && this.b == jq2Var.b && s71.b(this.c, jq2Var.c);
    }

    public final String toString() {
        return "TitleSettings(font=null, textSizeInSp=" + this.a + ", alignment=" + this.b + ", textColor=" + this.c + ")";
    }

    public jq2(Float f, SectionAlignment sectionAlignment, Integer num) {
        this.a = f;
        this.b = sectionAlignment;
        this.c = num;
    }
}
