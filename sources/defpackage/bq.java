package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class bq extends aq {
    public bq(bp0 bp0Var, sy syVar, int i, ck ckVar, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? ck.a : ckVar, (i2 & 2) != 0 ? cg0.a : syVar, bp0Var);
    }

    @Override // defpackage.yp
    public final yp e(sy syVar, int i, ck ckVar) {
        return new bq(i, ckVar, syVar, this.d);
    }

    @Override // defpackage.yp
    public final bp0 g() {
        return this.d;
    }

    @Override // defpackage.aq
    public final Object i(cp0 cp0Var, dy dyVar) {
        Object objCollect = this.d.collect(cp0Var, dyVar);
        return objCollect == dz.a ? objCollect : az2.a;
    }
}
