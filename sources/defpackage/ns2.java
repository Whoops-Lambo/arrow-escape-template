package defpackage;

import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ns2 {
    public final vr a;
    public final KType b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns2)) {
            return false;
        }
        KType kType = this.b;
        if (kType == null) {
            ns2 ns2Var = (ns2) obj;
            if (ns2Var.b == null) {
                return this.a.equals(ns2Var.a);
            }
        }
        return s71.b(kType, ((ns2) obj).b);
    }

    public final int hashCode() {
        KType kType = this.b;
        return kType != null ? kType.hashCode() : this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.b;
        if (obj == null) {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public ns2(vr vrVar, ss2 ss2Var) {
        this.a = vrVar;
        this.b = ss2Var;
    }
}
