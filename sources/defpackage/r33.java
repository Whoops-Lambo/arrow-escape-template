package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r33 {
    public final String a;
    public final Map b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r33)) {
            return false;
        }
        r33 r33Var = (r33) obj;
        return s71.b(this.a, r33Var.a) && this.b.equals(r33Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UsercentricsServiceDecision(serviceId=" + this.a + ", consentTypeValues=" + this.b + ")";
    }

    public r33(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }
}
