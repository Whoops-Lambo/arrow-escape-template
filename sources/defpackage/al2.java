package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class al2 implements ue2 {
    public final ue2 a;
    public final zr0 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) {
        zk2 zk2Var;
        if (dyVar instanceof zk2) {
            zk2Var = (zk2) dyVar;
            int i = zk2Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                zk2Var.t = i - Integer.MIN_VALUE;
            } else {
                zk2Var = new zk2(this, dyVar);
            }
        } else {
            zk2Var = new zk2(this, dyVar);
        }
        Object obj = zk2Var.r;
        int i2 = zk2Var.t;
        if (i2 == 0) {
            wz2.a0(obj);
            yk2 yk2Var = new yk2(cp0Var, this.b);
            zk2Var.t = 1;
            Object objCollect = this.a.collect(yk2Var, zk2Var);
            dz dzVar = dz.a;
            if (objCollect == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        throw new mc1();
    }

    public al2(ue2 ue2Var, zr0 zr0Var) {
        this.a = ue2Var;
        this.b = zr0Var;
    }
}
