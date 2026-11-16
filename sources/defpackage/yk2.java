package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yk2 implements cp0 {
    public final cp0 a;
    public final zr0 b;

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) throws Throwable {
        xk2 xk2Var;
        Throwable th;
        u62 u62Var;
        yk2 yk2Var;
        cp0 cp0Var;
        if (fyVar instanceof xk2) {
            xk2Var = (xk2) fyVar;
            int i = xk2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk2Var.v = i - Integer.MIN_VALUE;
            } else {
                xk2Var = new xk2(this, fyVar);
            }
        } else {
            xk2Var = new xk2(this, fyVar);
        }
        Object obj = xk2Var.t;
        int i2 = xk2Var.v;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    wz2.a0(obj);
                    return az2Var;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u62Var = xk2Var.s;
            yk2Var = xk2Var.r;
            try {
                wz2.a0(obj);
                u62Var.releaseIntercepted();
                cp0Var = yk2Var.a;
                if (cp0Var instanceof yk2) {
                    xk2Var.r = null;
                    xk2Var.s = null;
                    xk2Var.v = 2;
                    if (((yk2) cp0Var).a(xk2Var) == dzVar) {
                    }
                }
                return az2Var;
            } catch (Throwable th2) {
                th = th2;
                u62Var.releaseIntercepted();
                throw th;
            }
        }
        wz2.a0(obj);
        u62 u62Var2 = new u62(this.a, xk2Var.getContext());
        try {
            zr0 zr0Var = this.b;
            xk2Var.r = this;
            xk2Var.s = u62Var2;
            xk2Var.v = 1;
            if (zr0Var.invoke(u62Var2, xk2Var) != dzVar) {
                yk2Var = this;
                u62Var = u62Var2;
                u62Var.releaseIntercepted();
                cp0Var = yk2Var.a;
                if (cp0Var instanceof yk2) {
                    xk2Var.r = null;
                    xk2Var.s = null;
                    xk2Var.v = 2;
                    if (((yk2) cp0Var).a(xk2Var) == dzVar) {
                    }
                }
                return az2Var;
            }
        } catch (Throwable th3) {
            th = th3;
            u62Var = u62Var2;
            u62Var.releaseIntercepted();
            throw th;
        }
        return dzVar;
    }

    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        return this.a.emit(obj, dyVar);
    }

    public yk2(cp0 cp0Var, zr0 zr0Var) {
        this.a = cp0Var;
        this.b = zr0Var;
    }
}
