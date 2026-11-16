package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kp2 implements jp2 {
    public final Integer a;
    public final ThreadLocal b;
    public final mp2 c;

    @Override // defpackage.jp2
    public final Object K(sy syVar) {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    @Override // defpackage.sy
    public final qy get(ry ryVar) {
        if (this.c.equals(ryVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.qy
    public final ry getKey() {
        return this.c;
    }

    @Override // defpackage.sy
    public final sy minusKey(ry ryVar) {
        return this.c.equals(ryVar) ? cg0.a : this;
    }

    @Override // defpackage.jp2
    public final void o(sy syVar, Object obj) {
        this.b.set(obj);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }

    public kp2(Integer num, ThreadLocal threadLocal) {
        this.a = num;
        this.b = threadLocal;
        this.c = new mp2(threadLocal);
    }

    @Override // defpackage.sy
    public final Object fold(Object obj, zr0 zr0Var) {
        return zr0Var.invoke(obj, this);
    }

    @Override // defpackage.sy
    public final sy plus(sy syVar) {
        return qb5.l(this, syVar);
    }
}
