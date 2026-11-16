package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bg1 extends sy1 {
    public static final bg1 c = new bg1(jg1.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        ag1 ag1Var = (ag1) obj;
        ag1Var.getClass();
        long jF = hwVar.f(this.b, i);
        ag1Var.b(ag1Var.d() + 1);
        long[] jArr = ag1Var.a;
        int i2 = ag1Var.b;
        ag1Var.b = i2 + 1;
        jArr[i2] = jF;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ag1 ag1Var = new ag1();
        ag1Var.a = jArr;
        ag1Var.b = jArr.length;
        ag1Var.b(10);
        return ag1Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        iwVar.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.u(this.b, i2, jArr[i2]);
        }
    }
}
