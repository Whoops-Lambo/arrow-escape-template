package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fx1 {
    public final List a;
    public final ex1 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx1)) {
            return false;
        }
        fx1 fx1Var = (fx1) obj;
        return this.a.equals(fx1Var.a) && this.b.equals(fx1Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedUILanguageSettings(available=" + this.a + ", selected=" + this.b + ")";
    }

    public fx1(List list, ex1 ex1Var) {
        this.a = list;
        this.b = ex1Var;
    }
}
