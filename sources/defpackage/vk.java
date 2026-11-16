package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vk extends sy1 {
    public static final vk c = new vk(gm.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        pk pkVar = (pk) obj;
        pkVar.getClass();
        byte bG = hwVar.g(this.b, i);
        pkVar.b(pkVar.d() + 1);
        byte[] bArr = pkVar.a;
        int i2 = pkVar.b;
        pkVar.b = i2 + 1;
        bArr[i2] = bG;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        pk pkVar = new pk();
        pkVar.a = bArr;
        pkVar.b = bArr.length;
        pkVar.b(10);
        return pkVar;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        iwVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.g(this.b, i2, bArr[i2]);
        }
    }
}
