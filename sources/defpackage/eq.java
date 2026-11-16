package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class eq implements cp0 {
    public final /* synthetic */ m32 a;
    public final /* synthetic */ cz b;
    public final /* synthetic */ fq c;
    public final /* synthetic */ cp0 d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        dq dqVar;
        if (dyVar instanceof dq) {
            dqVar = (dq) dyVar;
            int i = dqVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqVar.v = i - Integer.MIN_VALUE;
            } else {
                dqVar = new dq(this, dyVar);
            }
        } else {
            dqVar = new dq(this, dyVar);
        }
        Object obj2 = dqVar.t;
        int i2 = dqVar.v;
        if (i2 == 0) {
            wz2.a0(obj2);
            c91 c91Var = (c91) this.a.a;
            if (c91Var != null) {
                c91Var.cancel(new ir());
                dqVar.r = this;
                dqVar.s = obj;
                dqVar.v = 1;
                Object objJoin = c91Var.join(dqVar);
                dz dzVar = dz.a;
                if (objJoin == dzVar) {
                    return dzVar;
                }
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = dqVar.s;
            this = dqVar.r;
            wz2.a0(obj2);
        }
        this.a.a = tb5.t(this.b, null, fz.d, new cq(this.c, this.d, obj, null), 1);
        return az2.a;
    }

    public eq(m32 m32Var, cz czVar, fq fqVar, cp0 cp0Var) {
        this.a = m32Var;
        this.b = czVar;
        this.c = fqVar;
        this.d = cp0Var;
    }
}
