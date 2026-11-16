package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z21 extends e1 {
    public final d31 c;

    @Override // defpackage.e1
    public final Object a(int i) {
        return this.c.get(i);
    }

    public z21(int i, d31 d31Var) {
        super(d31Var.size(), i);
        this.c = d31Var;
    }
}
