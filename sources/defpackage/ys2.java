package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ys2 extends sy1 {
    public static final ys2 c = new ys2(zs2.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new ws2(new byte[0]);
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        return ((ws2) obj).a.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        xs2 xs2Var = (xs2) obj;
        xs2Var.getClass();
        byte bE = hwVar.e(this.b, i).E();
        xs2Var.b(xs2Var.d() + 1);
        byte[] bArr = xs2Var.a;
        int i2 = xs2Var.b;
        xs2Var.b = i2 + 1;
        bArr[i2] = bE;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        byte[] bArr = ((ws2) obj).a;
        xs2 xs2Var = new xs2();
        xs2Var.a = bArr;
        xs2Var.b = bArr.length;
        xs2Var.b(10);
        return xs2Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        byte[] bArr = ((ws2) obj).a;
        iwVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.A(this.b, i2).f(bArr[i2]);
        }
    }
}
