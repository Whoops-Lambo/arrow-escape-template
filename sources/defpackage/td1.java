package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class td1 {
    public final List a;
    public final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td1)) {
            return false;
        }
        td1 td1Var = (td1) obj;
        return this.a.equals(td1Var.a) && this.b == td1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LegacyConsent(history=" + this.a + ", status=" + this.b + ")";
    }

    public td1(List list, boolean z) {
        this.a = list;
        this.b = z;
    }
}
