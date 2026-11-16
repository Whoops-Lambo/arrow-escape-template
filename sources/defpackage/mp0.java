package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mp0 implements bp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp0 b;
    public final /* synthetic */ zr0 c;

    public mp0(zr0 zr0Var, bp0 bp0Var) {
        this.a = 0;
        this.c = zr0Var;
        this.b = bp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) throws Throwable {
        lp0 lp0Var;
        u62 u62Var;
        mp0 mp0Var;
        bp0 bp0Var;
        int i = this.a;
        bp0 bp0Var2 = this.b;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        zr0 zr0Var = this.c;
        switch (i) {
            case 0:
                if (dyVar instanceof lp0) {
                    lp0Var = (lp0) dyVar;
                    int i2 = lp0Var.s;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        lp0Var.s = i2 - Integer.MIN_VALUE;
                    } else {
                        lp0Var = new lp0(this, dyVar);
                    }
                } else {
                    lp0Var = new lp0(this, dyVar);
                }
                Object obj = lp0Var.r;
                int i3 = lp0Var.s;
                if (i3 == 0) {
                    wz2.a0(obj);
                    u62 u62Var2 = new u62(cp0Var, lp0Var.getContext());
                    try {
                        lp0Var.u = this;
                        lp0Var.v = cp0Var;
                        lp0Var.w = u62Var2;
                        lp0Var.s = 1;
                        if (zr0Var.invoke(u62Var2, lp0Var) != dzVar) {
                            mp0Var = this;
                            u62Var = u62Var2;
                            u62Var.releaseIntercepted();
                            bp0Var = mp0Var.b;
                            lp0Var.u = null;
                            lp0Var.v = null;
                            lp0Var.w = null;
                            lp0Var.s = 2;
                            if (bp0Var.collect(cp0Var, lp0Var) != dzVar) {
                                return az2Var;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        u62Var = u62Var2;
                        u62Var.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            wz2.a0(obj);
                            return az2Var;
                        }
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u62Var = lp0Var.w;
                    cp0Var = lp0Var.v;
                    mp0Var = lp0Var.u;
                    try {
                        wz2.a0(obj);
                        u62Var.releaseIntercepted();
                        bp0Var = mp0Var.b;
                        lp0Var.u = null;
                        lp0Var.v = null;
                        lp0Var.w = null;
                        lp0Var.s = 2;
                        if (bp0Var.collect(cp0Var, lp0Var) != dzVar) {
                            return az2Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        u62Var.releaseIntercepted();
                        throw th;
                    }
                }
                return dzVar;
            case 1:
                Object objCollect = bp0Var2.collect(new up0(new h32(), cp0Var, zr0Var, 0), dyVar);
                return objCollect == dzVar ? objCollect : az2Var;
            default:
                Object objCollect2 = bp0Var2.collect(new aq0(cp0Var, zr0Var), dyVar);
                return objCollect2 == dzVar ? objCollect2 : az2Var;
        }
    }

    public /* synthetic */ mp0(bp0 bp0Var, zr0 zr0Var, int i) {
        this.a = i;
        this.b = bp0Var;
        this.c = zr0Var;
    }
}
