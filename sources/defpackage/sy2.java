package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class sy2 extends sy1 {
    public static final sy2 c = new sy2(ty2.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new qy2(new short[0]);
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        return ((qy2) obj).a.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        ry2 ry2Var = (ry2) obj;
        ry2Var.getClass();
        short sK = hwVar.e(this.b, i).k();
        ry2Var.b(ry2Var.d() + 1);
        short[] sArr = ry2Var.a;
        int i2 = ry2Var.b;
        ry2Var.b = i2 + 1;
        sArr[i2] = sK;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        short[] sArr = ((qy2) obj).a;
        ry2 ry2Var = new ry2();
        ry2Var.a = sArr;
        ry2Var.b = sArr.length;
        ry2Var.b(10);
        return ry2Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        short[] sArr = ((qy2) obj).a;
        iwVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.A(this.b, i2).l(sArr[i2]);
        }
    }
}
