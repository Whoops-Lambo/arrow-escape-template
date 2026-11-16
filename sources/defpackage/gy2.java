package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gy2 extends sy1 {
    public static final gy2 c = new gy2(hy2.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new ey2(new long[0]);
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        return ((ey2) obj).a.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        fy2 fy2Var = (fy2) obj;
        fy2Var.getClass();
        long jI = hwVar.e(this.b, i).i();
        fy2Var.b(fy2Var.d() + 1);
        long[] jArr = fy2Var.a;
        int i2 = fy2Var.b;
        fy2Var.b = i2 + 1;
        jArr[i2] = jI;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        long[] jArr = ((ey2) obj).a;
        fy2 fy2Var = new fy2();
        fy2Var.a = jArr;
        fy2Var.b = jArr.length;
        fy2Var.b(10);
        return fy2Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        long[] jArr = ((ey2) obj).a;
        iwVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.A(this.b, i2).z(jArr[i2]);
        }
    }
}
