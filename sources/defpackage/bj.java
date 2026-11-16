package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class bj {
    public final n21 a;
    public final qs1 b;
    public final w82 c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(fy fyVar) throws Throwable {
        aj ajVar;
        w82 w82Var;
        Object obj;
        Throwable th;
        Object obj2;
        if (fyVar instanceof aj) {
            ajVar = (aj) fyVar;
            int i = ajVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ajVar.v = i - Integer.MIN_VALUE;
            } else {
                ajVar = new aj(this, fyVar);
            }
        } else {
            ajVar = new aj(this, fyVar);
        }
        Object obj3 = ajVar.t;
        int i2 = ajVar.v;
        int i3 = 2;
        dy dyVar = null;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj3);
                ajVar.r = this;
                w82Var = this.c;
                ajVar.s = w82Var;
                ajVar.v = 1;
                if (((z82) w82Var).a(ajVar) != dzVar) {
                }
                obj = w82Var;
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = (w82) ajVar.r;
                try {
                    wz2.a0(obj3);
                    obj2 = obj2;
                    x50 x50Var = (x50) obj3;
                    ((z82) obj2).c();
                    return x50Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((z82) obj2).c();
                    throw th;
                }
            }
            Object obj4 = ajVar.s;
            bj bjVar = (bj) ajVar.r;
            wz2.a0(obj3);
            obj = obj4;
            this = bjVar;
            obj = w82Var;
            r6 r6Var = new r6(this, i3);
            ajVar.r = obj;
            ajVar.s = null;
            ajVar.v = 2;
            Object objE = tb5.E(cg0.a, new hh(r6Var, dyVar, 3), ajVar);
            if (objE != dzVar) {
                Object obj5 = obj;
                obj3 = objE;
                obj2 = obj5;
                x50 x50Var2 = (x50) obj3;
                ((z82) obj2).c();
                return x50Var2;
            }
            obj = w82Var;
            return dzVar;
        } catch (Throwable th3) {
            Object obj6 = obj;
            th = th3;
            obj2 = obj6;
            ((z82) obj2).c();
            throw th;
        }
    }

    public bj(n21 n21Var, qs1 qs1Var, w82 w82Var) {
        this.a = n21Var;
        this.b = qs1Var;
        this.c = w82Var;
    }
}
