package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class yd extends a10 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final i00 g;
    public final z00 h;
    public final y00 i;
    public final j00 j;
    public final List k;
    public final int l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a10) {
            yd ydVar = (yd) ((a10) obj);
            if (this.a.equals(ydVar.a) && this.b.equals(ydVar.b)) {
                String str = ydVar.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == ydVar.d) {
                        Long l = ydVar.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == ydVar.f && this.g.equals(ydVar.g)) {
                                z00 z00Var = ydVar.h;
                                z00 z00Var2 = this.h;
                                if (z00Var2 != null ? z00Var2.equals(z00Var) : z00Var == null) {
                                    y00 y00Var = ydVar.i;
                                    y00 y00Var2 = this.i;
                                    if (y00Var2 != null ? y00Var2.equals(y00Var) : y00Var == null) {
                                        j00 j00Var = ydVar.j;
                                        j00 j00Var2 = this.j;
                                        if (j00Var2 != null ? j00Var2.equals(j00Var) : j00Var == null) {
                                            List list = ydVar.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == ydVar.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.a10
    public final xd a() {
        xd xdVar = new xd();
        xdVar.a = this.a;
        xdVar.b = this.b;
        xdVar.c = this.c;
        xdVar.d = this.d;
        xdVar.e = this.e;
        xdVar.f = this.f;
        xdVar.g = this.g;
        xdVar.h = this.h;
        xdVar.i = this.i;
        xdVar.j = this.j;
        xdVar.k = this.k;
        xdVar.l = this.l;
        xdVar.m = (byte) 7;
        return xdVar;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        z00 z00Var = this.h;
        int iHashCode4 = (iHashCode3 ^ (z00Var == null ? 0 : z00Var.hashCode())) * 1000003;
        y00 y00Var = this.i;
        int iHashCode5 = (iHashCode4 ^ (y00Var == null ? 0 : y00Var.hashCode())) * 1000003;
        j00 j00Var = this.j;
        int iHashCode6 = (iHashCode5 ^ (j00Var == null ? 0 : j00Var.hashCode())) * 1000003;
        List list = this.k;
        return this.l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return nj.l(this.l, "}", sb);
    }

    public yd(String str, String str2, String str3, long j, Long l, boolean z, i00 i00Var, z00 z00Var, y00 y00Var, j00 j00Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = i00Var;
        this.h = z00Var;
        this.i = y00Var;
        this.j = j00Var;
        this.k = list;
        this.l = i;
    }
}
