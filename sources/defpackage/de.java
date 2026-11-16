package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class de {
    public long a;
    public String b;
    public r00 c;
    public s00 d;
    public t00 e;
    public w00 f;
    public byte g;

    public final ee a() {
        String str;
        r00 r00Var;
        s00 s00Var;
        if (this.g == 1 && (str = this.b) != null && (r00Var = this.c) != null && (s00Var = this.d) != null) {
            return new ee(this.a, str, r00Var, s00Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        e32.i(nj.p(sb, "Missing required properties:"));
        return null;
    }
}
