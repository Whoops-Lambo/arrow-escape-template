package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kp0 implements bp0 {
    public final /* synthetic */ bp0 a;
    public final /* synthetic */ as0 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) throws Throwable {
        jp0 jp0Var;
        u62 u62Var;
        u62 u62Var2;
        if (dyVar instanceof jp0) {
            jp0Var = (jp0) dyVar;
            int i = jp0Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                jp0Var.s = i - Integer.MIN_VALUE;
            } else {
                jp0Var = new jp0(this, dyVar);
            }
        } else {
            jp0Var = new jp0(this, dyVar);
        }
        Object obj = jp0Var.r;
        int i2 = jp0Var.s;
        dz dzVar = dz.a;
        try {
            try {
                if (i2 == 0) {
                    wz2.a0(obj);
                    bp0 bp0Var = this.a;
                    jp0Var.u = this;
                    jp0Var.v = cp0Var;
                    jp0Var.s = 1;
                    if (bp0Var.collect(cp0Var, jp0Var) != dzVar) {
                    }
                    return dzVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) jp0Var.u;
                        wz2.a0(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u62Var2 = (u62) jp0Var.u;
                    try {
                        wz2.a0(obj);
                        u62Var2.releaseIntercepted();
                        return az2.a;
                    } catch (Throwable th2) {
                        th = th2;
                        u62Var2.releaseIntercepted();
                        throw th;
                    }
                }
                cp0Var = jp0Var.v;
                this = (kp0) jp0Var.u;
                wz2.a0(obj);
                as0 as0Var = this.b;
                jp0Var.u = u62Var;
                jp0Var.v = null;
                jp0Var.s = 3;
                if (as0Var.invoke(u62Var, null, jp0Var) != dzVar) {
                    u62Var2 = u62Var;
                    u62Var2.releaseIntercepted();
                    return az2.a;
                }
                return dzVar;
            } catch (Throwable th3) {
                th = th3;
                u62Var2 = u62Var;
                u62Var2.releaseIntercepted();
                throw th;
            }
            u62Var = new u62(cp0Var, jp0Var.getContext());
        } catch (Throwable th4) {
            kp0 kp0Var = this;
            qp2 qp2Var = new qp2(th4);
            as0 as0Var2 = kp0Var.b;
            jp0Var.u = th4;
            jp0Var.v = null;
            jp0Var.s = 2;
            if (c71.b(qp2Var, as0Var2, th4, jp0Var) != dzVar) {
                throw th4;
            }
        }
    }

    public kp0(bp0 bp0Var, as0 as0Var) {
        this.a = bp0Var;
        this.b = as0Var;
    }
}
