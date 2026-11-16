package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lf2 extends sy1 {
    public static final lf2 c = new lf2(mf2.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        kf2 kf2Var = (kf2) obj;
        kf2Var.getClass();
        short sN = hwVar.n(this.b, i);
        kf2Var.b(kf2Var.d() + 1);
        short[] sArr = kf2Var.a;
        int i2 = kf2Var.b;
        kf2Var.b = i2 + 1;
        sArr[i2] = sN;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        kf2 kf2Var = new kf2();
        kf2Var.a = sArr;
        kf2Var.b = sArr.length;
        kf2Var.b(10);
        return kf2Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        iwVar.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.x(this.b, i2, sArr[i2]);
        }
    }
}
