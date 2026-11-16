package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dd0 implements cp0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cp0 b;
    public final /* synthetic */ m32 c;

    public dd0(ed0 ed0Var, m32 m32Var, cp0 cp0Var) {
        this.c = m32Var;
        this.b = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        cd0 cd0Var;
        qp0 qp0Var;
        int i = this.a;
        Object obj2 = az2.a;
        cp0 cp0Var = this.b;
        dz dzVar = dz.a;
        switch (i) {
            case 0:
                if (dyVar instanceof cd0) {
                    cd0Var = (cd0) dyVar;
                    int i2 = cd0Var.t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        cd0Var.t = i2 - Integer.MIN_VALUE;
                    } else {
                        cd0Var = new cd0(this, dyVar);
                    }
                } else {
                    cd0Var = new cd0(this, dyVar);
                }
                Object obj3 = cd0Var.r;
                int i3 = cd0Var.t;
                if (i3 != 0) {
                    if (i3 == 1) {
                        wz2.a0(obj3);
                        return obj2;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj3);
                m32 m32Var = this.c;
                Object obj4 = m32Var.a;
                if (obj4 != nd4.a && s71.b(obj4, obj)) {
                    return obj2;
                }
                m32Var.a = obj;
                cd0Var.t = 1;
                return cp0Var.emit(obj, cd0Var) == dzVar ? dzVar : obj2;
            default:
                if (dyVar instanceof qp0) {
                    qp0Var = (qp0) dyVar;
                    int i4 = qp0Var.u;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qp0Var.u = i4 - Integer.MIN_VALUE;
                    } else {
                        qp0Var = new qp0(this, dyVar);
                    }
                } else {
                    qp0Var = new qp0(this, dyVar);
                }
                Object obj5 = qp0Var.s;
                int i5 = qp0Var.u;
                try {
                    if (i5 == 0) {
                        wz2.a0(obj5);
                        qp0Var.r = this;
                        qp0Var.u = 1;
                        Object objEmit = cp0Var.emit(obj, qp0Var);
                        this = objEmit;
                        if (objEmit == dzVar) {
                            obj2 = dzVar;
                            this = objEmit;
                        }
                    } else {
                        if (i5 != 1) {
                            e32.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dd0 dd0Var = qp0Var.r;
                        wz2.a0(obj5);
                        this = dd0Var;
                    }
                    return obj2;
                } catch (Throwable th) {
                    this.c.a = th;
                    throw th;
                }
        }
    }

    public dd0(cp0 cp0Var, m32 m32Var) {
        this.b = cp0Var;
        this.c = m32Var;
    }
}
