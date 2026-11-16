package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ti extends kq2 {
    public final short c;
    public final short d;

    @Override // defpackage.kq2
    public final void a(ui uiVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                uiVar.b(31, 5);
                if (s > 62) {
                    uiVar.b(s - 31, 16);
                } else if (i == 0) {
                    uiVar.b(Math.min((int) s, 31), 5);
                } else {
                    uiVar.b(s - 31, 5);
                }
            }
            uiVar.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        short s = this.c;
        sb.append((int) s);
        sb.append("::");
        sb.append((s + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }

    public ti(kq2 kq2Var, int i, int i2) {
        super(kq2Var);
        this.c = (short) i;
        this.d = (short) i2;
    }
}
