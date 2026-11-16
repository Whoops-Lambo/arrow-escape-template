package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ig2 extends kq2 {
    public final short c;
    public final short d;

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }

    @Override // defpackage.kq2
    public final void a(ui uiVar, byte[] bArr) {
        uiVar.b(this.c, this.d);
    }

    public ig2(kq2 kq2Var, int i, int i2) {
        super(kq2Var);
        this.c = (short) i;
        this.d = (short) i2;
    }
}
