package defpackage;

import android.graphics.Typeface;
import com.usercentrics.sdk.SectionAlignment;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kv2 {
    public final String a;
    public final Typeface b;
    public final Float c;
    public final Integer d;
    public final SectionAlignment e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv2)) {
            return false;
        }
        kv2 kv2Var = (kv2) obj;
        return s71.b(this.a, kv2Var.a) && s71.b(this.b, kv2Var.b) && s71.b(this.c, kv2Var.c) && s71.b(this.d, kv2Var.d) && this.e == kv2Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Typeface typeface = this.b;
        int iHashCode2 = (iHashCode + (typeface == null ? 0 : typeface.hashCode())) * 31;
        Float f = this.c;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        SectionAlignment sectionAlignment = this.e;
        return iHashCode4 + (sectionAlignment != null ? sectionAlignment.hashCode() : 0);
    }

    public final String toString() {
        return "UCFirstLayerTitle(text=" + this.a + ", customFont=" + this.b + ", customTextSizeInSp=" + this.c + ", customTextColor=" + this.d + ", customAlignment=" + this.e + ")";
    }

    public kv2(String str, Typeface typeface, Float f, Integer num, SectionAlignment sectionAlignment) {
        str.getClass();
        this.a = str;
        this.b = typeface;
        this.c = f;
        this.d = num;
        this.e = sectionAlignment;
    }
}
