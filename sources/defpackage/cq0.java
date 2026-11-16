package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cq0 implements cp0 {
    public final /* synthetic */ as0 a;
    public final /* synthetic */ cp0 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        bq0 bq0Var;
        if (dyVar instanceof bq0) {
            bq0Var = (bq0) dyVar;
            int i = bq0Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                bq0Var.t = i - Integer.MIN_VALUE;
            } else {
                bq0Var = new bq0(this, dyVar);
            }
        } else {
            bq0Var = new bq0(this, dyVar);
        }
        Object objInvoke = bq0Var.s;
        int i2 = bq0Var.t;
        if (i2 == 0) {
            wz2.a0(objInvoke);
            bq0Var.r = this;
            bq0Var.t = 1;
            objInvoke = this.a.invoke(this.b, obj, bq0Var);
            dz dzVar = dz.a;
            if (objInvoke == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = bq0Var.r;
            wz2.a0(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return az2.a;
        }
        throw new b0(this);
    }

    public cq0(as0 as0Var, cp0 cp0Var) {
        this.a = as0Var;
        this.b = cp0Var;
    }
}
