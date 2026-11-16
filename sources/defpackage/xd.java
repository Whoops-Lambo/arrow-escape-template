package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class xd {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public i00 g;
    public z00 h;
    public y00 i;
    public j00 j;
    public List k;
    public int l;
    public byte m;

    public final yd a() {
        String str;
        String str2;
        i00 i00Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (i00Var = this.g) != null) {
            return new yd(str, str2, this.c, this.d, this.e, this.f, i00Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        e32.i(nj.p(sb, "Missing required properties:"));
        return null;
    }
}
