package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class te {
    public ve a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final ue a() {
        ve veVar;
        String str;
        String str2;
        if (this.e == 1 && (veVar = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new ue(veVar, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        e32.i(nj.p(sb, "Missing required properties:"));
        return null;
    }
}
