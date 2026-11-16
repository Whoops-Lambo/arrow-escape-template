package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class tq extends sy1 {
    public static final tq c = new tq(ar.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        mq mqVar = (mq) obj;
        mqVar.getClass();
        char cQ = hwVar.q(this.b, i);
        mqVar.b(mqVar.d() + 1);
        char[] cArr = mqVar.a;
        int i2 = mqVar.b;
        mqVar.b = i2 + 1;
        cArr[i2] = cQ;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        mq mqVar = new mq();
        mqVar.a = cArr;
        mqVar.b = cArr.length;
        mqVar.b(10);
        return mqVar;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        iwVar.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.G(this.b, i2, cArr[i2]);
        }
    }
}
