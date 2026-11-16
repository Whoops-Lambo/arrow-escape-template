package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class op0 implements bp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp0 b;
    public final /* synthetic */ xr0 c;

    public /* synthetic */ op0(bp0 bp0Var, xr0 xr0Var, int i) {
        this.a = i;
        this.b = bp0Var;
        this.c = xr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) throws Throwable {
        np0 np0Var;
        yp0 yp0Var;
        aq0 aq0Var;
        int i = this.a;
        az2 az2Var = az2.a;
        bp0 bp0Var = this.b;
        Object obj = dz.a;
        switch (i) {
            case 0:
                if (dyVar instanceof np0) {
                    np0Var = (np0) dyVar;
                    int i2 = np0Var.s;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        np0Var.s = i2 - Integer.MIN_VALUE;
                    } else {
                        np0Var = new np0(this, dyVar);
                    }
                } else {
                    np0Var = new np0(this, dyVar);
                }
                Object objF = np0Var.r;
                int i3 = np0Var.s;
                if (i3 == 0) {
                    wz2.a0(objF);
                    np0Var.u = this;
                    np0Var.v = cp0Var;
                    np0Var.s = 1;
                    objF = ep0.f(bp0Var, cp0Var, np0Var);
                    if (objF != obj) {
                    }
                    return obj;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        wz2.a0(objF);
                        return az2Var;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cp0Var = np0Var.v;
                this = np0Var.u;
                wz2.a0(objF);
                Throwable th = (Throwable) objF;
                if (th == null) {
                    return az2Var;
                }
                as0 as0Var = (as0) this.c;
                np0Var.u = null;
                np0Var.v = null;
                np0Var.s = 2;
                if (as0Var.invoke(cp0Var, th, np0Var) != obj) {
                    return az2Var;
                }
                return obj;
            default:
                if (dyVar instanceof yp0) {
                    yp0Var = (yp0) dyVar;
                    int i4 = yp0Var.s;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        yp0Var.s = i4 - Integer.MIN_VALUE;
                    } else {
                        yp0Var = new yp0(this, dyVar);
                    }
                } else {
                    yp0Var = new yp0(this, dyVar);
                }
                Object obj2 = yp0Var.r;
                int i5 = yp0Var.s;
                if (i5 == 0) {
                    wz2.a0(obj2);
                    mp0 mp0Var = (mp0) bp0Var;
                    aq0 aq0Var2 = new aq0((zr0) this.c, cp0Var);
                    try {
                        yp0Var.u = aq0Var2;
                        yp0Var.s = 1;
                        return mp0Var.collect(aq0Var2, yp0Var) == obj ? obj : az2Var;
                    } catch (b0 e) {
                        e = e;
                        aq0Var = aq0Var2;
                    }
                } else {
                    if (i5 != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aq0Var = yp0Var.u;
                    try {
                        wz2.a0(obj2);
                        return az2Var;
                    } catch (b0 e2) {
                        e = e2;
                    }
                }
                if (e.owner != aq0Var) {
                    throw e;
                }
                u12.h(yp0Var.getContext());
                return az2Var;
        }
    }
}
