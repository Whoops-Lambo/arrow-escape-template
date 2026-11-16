package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b71 extends sy1 {
    public static final b71 c = new b71(k71.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        a71 a71Var = (a71) obj;
        a71Var.getClass();
        int iH = hwVar.h(this.b, i);
        a71Var.b(a71Var.d() + 1);
        int[] iArr = a71Var.a;
        int i2 = a71Var.b;
        a71Var.b = i2 + 1;
        iArr[i2] = iH;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        a71 a71Var = new a71();
        a71Var.a = iArr;
        a71Var.b = iArr.length;
        a71Var.b(10);
        return a71Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        iwVar.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.E(i2, iArr[i2], this.b);
        }
    }
}
