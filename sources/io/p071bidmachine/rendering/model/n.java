package io.p071bidmachine.rendering.model;

import defpackage.s71;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class n {
    public final double a;
    public final int b;
    public final String c;
    public final long d;
    public final List e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        n nVar = (n) obj;
        return this.a == nVar.a && this.b == nVar.b && s71.b(this.c, nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((Double.hashCode(this.a) * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("isBroken - ");
        double d = this.a;
        sb.append(d);
        sb.append(" (");
        sb.append(d == 1.0d);
        sb.append("), adPhaseSequence - ");
        sb.append(this.b);
        sb.append(", adElementName - ");
        sb.append(this.c);
        sb.append(", durationMs - ");
        sb.append(this.d);
        return sb.toString();
    }

    public n(double d, int i, String str, long j, List list) {
        str.getClass();
        list.getClass();
        this.a = d;
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = list;
    }
}
