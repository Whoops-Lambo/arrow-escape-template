package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class oe {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final pe a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new pe(this.b, this.c, str, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        e32.i(nj.p(sb, "Missing required properties:"));
        return null;
    }
}
