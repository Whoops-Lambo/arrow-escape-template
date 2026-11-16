package defpackage;

import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u31 {
    public final String a;
    public final double b;
    public final Currency c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u31)) {
            return false;
        }
        u31 u31Var = (u31) obj;
        return s71.b(this.a, u31Var.a) && Double.compare(this.b, u31Var.b) == 0 && this.c.equals(u31Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Double.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InAppPurchase(eventName=" + this.a + ", amount=" + this.b + ", currency=" + this.c + ')';
    }

    public u31(String str, double d, Currency currency) {
        str.getClass();
        this.a = str;
        this.b = d;
        this.c = currency;
    }
}
