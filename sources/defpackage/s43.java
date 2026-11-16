package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s43 {
    public final int a;
    public final Pattern b;
    public final Pattern c;
    public final Pattern d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s43)) {
            return false;
        }
        s43 s43Var = (s43) obj;
        return this.a == s43Var.a && s71.b(this.b, s43Var.b) && s71.b(this.c, s43Var.c) && s71.b(this.d, s43Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Pattern pattern = this.b;
        int iHashCode2 = (iHashCode + (pattern == null ? 0 : pattern.hashCode())) * 31;
        Pattern pattern2 = this.c;
        int iHashCode3 = (iHashCode2 + (pattern2 == null ? 0 : pattern2.hashCode())) * 31;
        Pattern pattern3 = this.d;
        return iHashCode3 + (pattern3 != null ? pattern3.hashCode() : 0);
    }

    public final String toString() {
        return "CompiledRule(place=" + this.a + ", keyRegex=" + this.b + ", keyNegativeRegex=" + this.c + ", valueRegex=" + this.d + ')';
    }

    public s43(int i, Pattern pattern, Pattern pattern2, Pattern pattern3) {
        this.a = i;
        this.b = pattern;
        this.c = pattern2;
        this.d = pattern3;
    }
}
