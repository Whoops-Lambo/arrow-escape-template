package defpackage;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rw1 {

    @NotNull
    public static final qw1 Companion = new qw1();
    public final String a;
    public final Map b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw1)) {
            return false;
        }
        rw1 rw1Var = (rw1) obj;
        return s71.b(this.a, rw1Var.a) && this.b.equals(rw1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedUIDecision(serviceId=" + this.a + ", values=" + this.b + ")";
    }

    public rw1(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }
}
