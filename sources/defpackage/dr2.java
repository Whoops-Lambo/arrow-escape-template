package defpackage;

import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dr2 {
    public final g4 a;
    public LegalBasisLocalization b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, boolean z, fy fyVar) {
        cr2 cr2Var;
        if (fyVar instanceof cr2) {
            cr2Var = (cr2) fyVar;
            int i = cr2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                cr2Var.u = i - Integer.MIN_VALUE;
            } else {
                cr2Var = new cr2(this, fyVar);
            }
        } else {
            cr2Var = new cr2(this, fyVar);
        }
        Object objL = cr2Var.s;
        int i2 = cr2Var.u;
        if (i2 == 0) {
            wz2.a0(objL);
            cr2Var.r = this;
            cr2Var.u = 1;
            objL = this.a.l(str, z, cr2Var);
            dz dzVar = dz.a;
            if (objL == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = cr2Var.r;
            wz2.a0(objL);
        }
        this.b = (LegalBasisLocalization) objL;
        return az2.a;
    }

    public dr2(g4 g4Var) {
        this.a = g4Var;
    }
}
