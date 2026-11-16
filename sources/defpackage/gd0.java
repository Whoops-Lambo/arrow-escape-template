package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gd0 extends sy1 {
    public static final gd0 c = new gd0(od0.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        fd0 fd0Var = (fd0) obj;
        fd0Var.getClass();
        double dC = hwVar.C(this.b, i);
        fd0Var.b(fd0Var.d() + 1);
        double[] dArr = fd0Var.a;
        int i2 = fd0Var.b;
        fd0Var.b = i2 + 1;
        dArr[i2] = dC;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        fd0 fd0Var = new fd0();
        fd0Var.a = dArr;
        fd0Var.b = dArr.length;
        fd0Var.b(10);
        return fd0Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        iwVar.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.H(this.b, i2, dArr[i2]);
        }
    }
}
