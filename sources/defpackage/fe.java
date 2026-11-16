package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fe {
    public p00 a;
    public List b;
    public List c;
    public Boolean d;
    public q00 e;
    public List f;
    public int g;
    public byte h;

    public final ge a() {
        p00 p00Var;
        if (this.h == 1 && (p00Var = this.a) != null) {
            return new ge(p00Var, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        e32.i(nj.p(sb, "Missing required properties:"));
        return null;
    }
}
