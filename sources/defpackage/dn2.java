package defpackage;

import com.usercentrics.tcf.core.model.gvl.Declarations;
import com.usercentrics.tcf.core.model.gvl.VendorList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dn2 {
    public final i62 a;
    public final g4 b;
    public VendorList c;
    public Declarations d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, fy fyVar) {
        bn2 bn2Var;
        if (fyVar instanceof bn2) {
            bn2Var = (bn2) fyVar;
            int i = bn2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                bn2Var.u = i - Integer.MIN_VALUE;
            } else {
                bn2Var = new bn2(this, fyVar);
            }
        } else {
            bn2Var = new bn2(this, fyVar);
        }
        Object objJ = bn2Var.s;
        int i2 = bn2Var.u;
        if (i2 == 0) {
            wz2.a0(objJ);
            bn2Var.r = this;
            bn2Var.u = 1;
            objJ = this.b.j(str, bn2Var);
            dz dzVar = dz.a;
            if (objJ == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = bn2Var.r;
            wz2.a0(objJ);
        }
        this.d = (Declarations) objJ;
        return az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fy fyVar) {
        cn2 cn2Var;
        if (fyVar instanceof cn2) {
            cn2Var = (cn2) fyVar;
            int i = cn2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn2Var.u = i - Integer.MIN_VALUE;
            } else {
                cn2Var = new cn2(this, fyVar);
            }
        } else {
            cn2Var = new cn2(this, fyVar);
        }
        Object objK = cn2Var.s;
        int i2 = cn2Var.u;
        if (i2 == 0) {
            wz2.a0(objK);
            cn2Var.r = this;
            cn2Var.u = 1;
            objK = this.a.k(cn2Var);
            dz dzVar = dz.a;
            if (objK == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = cn2Var.r;
            wz2.a0(objK);
        }
        this.c = (VendorList) objK;
        return az2.a;
    }

    public dn2(i62 i62Var, g4 g4Var) {
        this.a = i62Var;
        this.b = g4Var;
    }
}
