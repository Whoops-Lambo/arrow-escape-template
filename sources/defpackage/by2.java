package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class by2 extends sy1 {
    public static final by2 c = new by2(cy2.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new zx2(new int[0]);
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        return ((zx2) obj).a.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        ay2 ay2Var = (ay2) obj;
        ay2Var.getClass();
        int iS = hwVar.e(this.b, i).s();
        ay2Var.b(ay2Var.d() + 1);
        int[] iArr = ay2Var.a;
        int i2 = ay2Var.b;
        ay2Var.b = i2 + 1;
        iArr[i2] = iS;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        int[] iArr = ((zx2) obj).a;
        ay2 ay2Var = new ay2();
        ay2Var.a = iArr;
        ay2Var.b = iArr.length;
        ay2Var.b(10);
        return ay2Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        int[] iArr = ((zx2) obj).a;
        iwVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.A(this.b, i2).s(iArr[i2]);
        }
    }
}
