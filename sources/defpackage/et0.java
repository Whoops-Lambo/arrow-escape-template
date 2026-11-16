package defpackage;

import io.p071bidmachine.protobuf.EventTypeExtended;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@z92
public final class et0 implements Comparable<et0> {

    @NotNull
    public static final dt0 Companion = new dt0();
    public static final gd1[] j;
    public final int a;
    public final int b;
    public final int c;
    public final n83 d;
    public final int e;
    public final int f;
    public final go1 g;
    public final int h;
    public final long i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et0)) {
            return false;
        }
        et0 et0Var = (et0) obj;
        return this.a == et0Var.a && this.b == et0Var.b && this.c == et0Var.c && this.d == et0Var.d && this.e == et0Var.e && this.f == et0Var.f && this.g == et0Var.g && this.h == et0Var.h && this.i == et0Var.i;
    }

    static {
        v2 v2Var = new v2(13);
        pd1 pd1Var = pd1.b;
        j = new gd1[]{null, null, null, eu.v(pd1Var, v2Var), null, null, eu.v(pd1Var, new v2(14)), null, null};
        n50.a(0L);
    }

    public /* synthetic */ et0(int i, int i2, int i3, int i4, n83 n83Var, int i5, int i6, go1 go1Var, int i7, long j2) {
        if (511 != (i & EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE)) {
            ep0.J(i, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, ct0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = n83Var;
        this.e = i5;
        this.f = i6;
        this.g = go1Var;
        this.h = i7;
        this.i = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(et0 et0Var) {
        et0 et0Var2 = et0Var;
        et0Var2.getClass();
        return s71.i(this.i, et0Var2.i);
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + jc1.d(this.h, (this.g.hashCode() + jc1.d(this.f, jc1.d(this.e, (this.d.hashCode() + jc1.d(this.c, jc1.d(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GMTDate(seconds=");
        sb.append(this.a);
        sb.append(", minutes=");
        sb.append(this.b);
        sb.append(", hours=");
        sb.append(this.c);
        sb.append(", dayOfWeek=");
        sb.append(this.d);
        sb.append(", dayOfMonth=");
        sb.append(this.e);
        sb.append(", dayOfYear=");
        sb.append(this.f);
        sb.append(", month=");
        sb.append(this.g);
        sb.append(", year=");
        sb.append(this.h);
        sb.append(", timestamp=");
        return n30.o(sb, this.i, ')');
    }

    public et0(int i, int i2, int i3, n83 n83Var, int i4, int i5, go1 go1Var, int i6, long j2) {
        n83Var.getClass();
        go1Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = n83Var;
        this.e = i4;
        this.f = i5;
        this.g = go1Var;
        this.h = i6;
        this.i = j2;
    }
}
