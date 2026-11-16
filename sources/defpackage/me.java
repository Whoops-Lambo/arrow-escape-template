package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class me {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final ne a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new ne(this.e, this.a, this.d, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        e32.i(nj.p(sb, "Missing required properties:"));
        return null;
    }
}
