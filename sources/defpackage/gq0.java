package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gq0 implements cp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zr0 b;
    public final /* synthetic */ m32 c;

    public /* synthetic */ gq0(zr0 zr0Var, m32 m32Var, int i) {
        this.a = i;
        this.b = zr0Var;
        this.c = m32Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        fq0 fq0Var;
        jq0 jq0Var;
        int i = this.a;
        az2 az2Var = az2.a;
        zr0 zr0Var = this.b;
        dz dzVar = dz.a;
        switch (i) {
            case 0:
                if (dyVar instanceof fq0) {
                    fq0Var = (fq0) dyVar;
                    int i2 = fq0Var.t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        fq0Var.t = i2 - Integer.MIN_VALUE;
                    } else {
                        fq0Var = new fq0(this, dyVar);
                    }
                } else {
                    fq0Var = new fq0(this, dyVar);
                }
                Object objInvoke = fq0Var.s;
                int i3 = fq0Var.t;
                if (i3 == 0) {
                    wz2.a0(objInvoke);
                    fq0Var.r = this;
                    fq0Var.v = obj;
                    fq0Var.t = 1;
                    objInvoke = zr0Var.invoke(obj, fq0Var);
                    if (objInvoke == dzVar) {
                        return dzVar;
                    }
                } else {
                    if (i3 != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = fq0Var.v;
                    this = fq0Var.r;
                    wz2.a0(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return az2Var;
                }
                this.c.a = obj;
                throw new b0(this);
            default:
                if (dyVar instanceof jq0) {
                    jq0Var = (jq0) dyVar;
                    int i4 = jq0Var.t;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jq0Var.t = i4 - Integer.MIN_VALUE;
                    } else {
                        jq0Var = new jq0(this, dyVar);
                    }
                } else {
                    jq0Var = new jq0(this, dyVar);
                }
                Object objInvoke2 = jq0Var.s;
                int i5 = jq0Var.t;
                if (i5 == 0) {
                    wz2.a0(objInvoke2);
                    jq0Var.r = this;
                    jq0Var.v = obj;
                    jq0Var.t = 1;
                    objInvoke2 = zr0Var.invoke(obj, jq0Var);
                    if (objInvoke2 == dzVar) {
                        return dzVar;
                    }
                } else {
                    if (i5 != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = jq0Var.v;
                    this = jq0Var.r;
                    wz2.a0(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return az2Var;
                }
                this.c.a = obj;
                throw new b0(this);
        }
    }
}
