package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o01 implements h92 {
    public final zx0 a;
    public int b;
    public by0 c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.h92
    public final Object a(lz0 lz0Var, fy fyVar) {
        n01 n01Var;
        if (fyVar instanceof n01) {
            n01Var = (n01) fyVar;
            int i = n01Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                n01Var.t = i - Integer.MIN_VALUE;
            } else {
                n01Var = new n01(this, fyVar);
            }
        } else {
            n01Var = new n01(this, fyVar);
        }
        Object objA = n01Var.r;
        int i2 = n01Var.t;
        if (i2 == 0) {
            wz2.a0(objA);
            by0 by0Var = this.c;
            if (by0Var != null) {
                kc2.g(by0Var, null);
            }
            int i3 = this.b;
            if (i3 >= 20) {
                throw new g92("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.");
            }
            this.b = i3 + 1;
            fz0 fz0Var = this.a.g;
            Object obj = lz0Var.d;
            n01Var.t = 1;
            objA = fz0Var.a(lz0Var, obj, n01Var);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        by0 by0Var2 = objA instanceof by0 ? (by0) objA : null;
        if (by0Var2 != null) {
            this.c = by0Var2;
            return by0Var2;
        }
        wb0.d(objA, "Failed to execute send pipeline. Expected [HttpClientCall], but received ");
        return null;
    }

    public o01(zx0 zx0Var) {
        zx0Var.getClass();
        this.a = zx0Var;
    }
}
