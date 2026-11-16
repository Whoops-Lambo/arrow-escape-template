package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class dt1 implements Serializable {
    public final Object a;
    public final Object b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt1)) {
            return false;
        }
        dt1 dt1Var = (dt1) obj;
        return s71.b(this.a, dt1Var.a) && s71.b(this.b, dt1Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final Object d() {
        return this.a;
    }

    public final Object f() {
        return this.b;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }

    public dt1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
