package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k72 extends by0 {
    public final byte[] f;
    public final boolean g;

    @Override // defpackage.by0
    public final boolean b() {
        return this.g;
    }

    @Override // defpackage.by0
    public final Object e() {
        return wz2.F(this.f);
    }

    public k72(zx0 zx0Var, kz0 kz0Var, d01 d01Var, byte[] bArr) {
        super(zx0Var);
        this.f = bArr;
        this.b = new l72(this, kz0Var);
        this.c = new x80(this, bArr, d01Var);
        wz2.I(uu.l(d01Var), bArr.length, kz0Var.getMethod());
        this.g = true;
    }
}
