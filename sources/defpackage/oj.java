package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class oj extends sy1 {
    public static final oj c = new oj(rj.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new boolean[0];
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        mj mjVar = (mj) obj;
        mjVar.getClass();
        boolean zY = hwVar.y(this.b, i);
        mjVar.b(mjVar.d() + 1);
        boolean[] zArr = mjVar.a;
        int i2 = mjVar.b;
        mjVar.b = i2 + 1;
        zArr[i2] = zY;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        mj mjVar = new mj();
        mjVar.a = zArr;
        mjVar.b = zArr.length;
        mjVar.b(10);
        return mjVar;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        iwVar.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.p(this.b, i2, zArr[i2]);
        }
    }
}
