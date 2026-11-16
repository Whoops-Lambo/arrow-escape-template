package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uc0 {
    public final uy a;
    public final uy b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(uc0 uc0Var, zr0 zr0Var, ls lsVar, fy fyVar) throws Throwable {
        tc0 tc0Var;
        if (fyVar instanceof tc0) {
            tc0Var = (tc0) fyVar;
            int i = tc0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                tc0Var.v = i - Integer.MIN_VALUE;
            } else {
                tc0Var = new tc0(uc0Var, fyVar);
            }
        } else {
            tc0Var = new tc0(uc0Var, fyVar);
        }
        Object j52Var = tc0Var.t;
        int i2 = tc0Var.v;
        try {
            if (i2 == 0) {
                wz2.a0(j52Var);
                uc0Var.b.getClass();
                Object wc0Var = new wc0();
                tc0Var.r = uc0Var;
                tc0Var.s = lsVar;
                tc0Var.v = 1;
                j52Var = zr0Var.invoke(wc0Var, tc0Var);
                Object obj = dz.a;
                if (j52Var == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lsVar = tc0Var.s;
                uc0Var = tc0Var.r;
                wz2.a0(j52Var);
            }
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        uc0Var.getClass();
        if (thB instanceof AssertionError) {
            throw thB;
        }
        lsVar.getClass();
        lsVar.b = new k52(j52Var);
        wr0 wr0Var = (wr0) lsVar.c;
        if (wr0Var != null) {
            lsVar.c = null;
            Throwable thB2 = k52.b(j52Var);
            if (thB2 != null) {
                wr0Var.invoke(thB2);
            }
        }
        wr0 wr0Var2 = (wr0) lsVar.d;
        if (wr0Var2 != null) {
            lsVar.d = null;
            if (!(j52Var instanceof j52)) {
                wr0Var2.invoke(j52Var);
            }
        }
        return az2.a;
    }

    public final ls b(zr0 zr0Var) {
        ls lsVar = new ls(11);
        tb5.t(nq2.m(this.b), null, null, new xp(this, zr0Var, lsVar, null, 3), 3);
        return lsVar;
    }

    public final void c(sr0 sr0Var) {
        tb5.t(nq2.m(this.a), null, null, new rc0(sr0Var, null, 0), 3);
    }

    public uc0(uy uyVar, uy uyVar2) {
        uyVar.getClass();
        uyVar2.getClass();
        this.a = uyVar.T(1);
        this.b = uyVar2.T(1);
    }
}
