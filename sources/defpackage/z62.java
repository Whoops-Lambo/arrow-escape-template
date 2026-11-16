package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z62 implements bp0, ro {
    public final zr0 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) {
        m0 m0Var;
        u62 u62Var;
        if (dyVar instanceof m0) {
            m0Var = (m0) dyVar;
            int i = m0Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0Var.u = i - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, dyVar);
            }
        } else {
            m0Var = new m0(this, dyVar);
        }
        Object obj = m0Var.s;
        int i2 = m0Var.u;
        az2 az2Var = az2.a;
        if (i2 != 0) {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u62Var = m0Var.r;
            try {
                wz2.a0(obj);
                u62Var.releaseIntercepted();
                return az2Var;
            } catch (Throwable th) {
                th = th;
                u62Var.releaseIntercepted();
                throw th;
            }
        }
        wz2.a0(obj);
        u62 u62Var2 = new u62(cp0Var, m0Var.getContext());
        try {
            m0Var.r = u62Var2;
            m0Var.u = 1;
            try {
                Object objInvoke = this.a.invoke(u62Var2, m0Var);
                dz dzVar = dz.a;
                if (objInvoke != dzVar) {
                    objInvoke = az2Var;
                }
                if (objInvoke == dzVar) {
                    return dzVar;
                }
                u62Var = u62Var2;
                u62Var.releaseIntercepted();
                return az2Var;
            } catch (Throwable th2) {
                th = th2;
                u62Var = u62Var2;
                u62Var.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public z62(zr0 zr0Var) {
        this.a = zr0Var;
    }
}
