package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sp0 implements cp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ sp0(Serializable serializable, cp0 cp0Var, int i) {
        this.a = i;
        this.c = serializable;
        this.b = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, dy dyVar) {
        pi2 pi2Var;
        if (dyVar instanceof pi2) {
            pi2Var = (pi2) dyVar;
            int i2 = pi2Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pi2Var.t = i2 - Integer.MIN_VALUE;
            } else {
                pi2Var = new pi2(this, dyVar);
            }
        } else {
            pi2Var = new pi2(this, dyVar);
        }
        Object obj = pi2Var.r;
        int i3 = pi2Var.t;
        az2 az2Var = az2.a;
        if (i3 != 0) {
            if (i3 == 1) {
                wz2.a0(obj);
                return az2Var;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        if (i > 0) {
            h32 h32Var = (h32) this.c;
            if (!h32Var.a) {
                h32Var.a = true;
                pi2Var.t = 1;
                Object objEmit = this.b.emit(gf2.a, pi2Var);
                dz dzVar = dz.a;
                if (objEmit == dzVar) {
                    return dzVar;
                }
            }
        }
        return az2Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        rp0 rp0Var;
        switch (this.a) {
            case 0:
                if (dyVar instanceof rp0) {
                    rp0Var = (rp0) dyVar;
                    int i = rp0Var.t;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rp0Var.t = i - Integer.MIN_VALUE;
                    } else {
                        rp0Var = new rp0(this, dyVar);
                    }
                } else {
                    rp0Var = new rp0(this, dyVar);
                }
                Object obj2 = rp0Var.r;
                int i2 = rp0Var.t;
                az2 az2Var = az2.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        wz2.a0(obj2);
                        return az2Var;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj2);
                k32 k32Var = (k32) this.c;
                int i3 = k32Var.a;
                if (i3 < 1) {
                    k32Var.a = i3 + 1;
                    return az2Var;
                }
                rp0Var.t = 1;
                Object objEmit = this.b.emit(obj, rp0Var);
                dz dzVar = dz.a;
                return objEmit == dzVar ? dzVar : az2Var;
            default:
                return a(((Number) obj).intValue(), dyVar);
        }
    }
}
