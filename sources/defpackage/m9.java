package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class m9 implements bp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp0 b;

    public /* synthetic */ m9(bp0 bp0Var, int i) {
        this.a = i;
        this.b = bp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) {
        wp0 wp0Var;
        Object obj;
        b0 e;
        int i = this.a;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        bp0 bp0Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = bp0Var.collect(new l9(cp0Var, 0), dyVar);
                return objCollect == dzVar ? objCollect : az2Var;
            case 1:
                Object objCollect2 = bp0Var.collect(new l9(cp0Var, 2), dyVar);
                return objCollect2 == dzVar ? objCollect2 : az2Var;
            case 2:
                Object objCollect3 = bp0Var.collect(new sp0(new k32(), cp0Var, 0), dyVar);
                return objCollect3 == dzVar ? objCollect3 : az2Var;
            case 3:
                if (dyVar instanceof wp0) {
                    wp0Var = (wp0) dyVar;
                    int i2 = wp0Var.s;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        wp0Var.s = i2 - Integer.MIN_VALUE;
                    } else {
                        wp0Var = new wp0(this, dyVar);
                    }
                } else {
                    wp0Var = new wp0(this, dyVar);
                }
                Object obj2 = wp0Var.r;
                int i3 = wp0Var.s;
                int i4 = 1;
                if (i3 == 0) {
                    wz2.a0(obj2);
                    Object obj3 = new Object();
                    try {
                        up0 up0Var = new up0(new k32(), cp0Var, obj3, i4);
                        wp0Var.u = obj3;
                        wp0Var.s = 1;
                        return bp0Var.collect(up0Var, wp0Var) == dzVar ? dzVar : az2Var;
                    } catch (b0 e2) {
                        obj = obj3;
                        e = e2;
                    }
                } else {
                    if (i3 != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = wp0Var.u;
                    try {
                        wz2.a0(obj2);
                        return az2Var;
                    } catch (b0 e3) {
                        e = e3;
                    }
                }
                if (e.owner == obj) {
                    return az2Var;
                }
                throw e;
            default:
                Object objCollect4 = bp0Var.collect(new l9(cp0Var, 3), dyVar);
                return objCollect4 == dzVar ? objCollect4 : az2Var;
        }
    }
}
