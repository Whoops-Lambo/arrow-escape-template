package defpackage;

import com.usercentrics.sdk.v2.ruleset.data.RuleSet;
import com.usercentrics.tcf.core.model.gvl.VendorList;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i62 extends pq1 {
    public final /* synthetic */ int d = 1;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i62(c4 c4Var, cb1 cb1Var, a33 a33Var, th0 th0Var, qq1 qq1Var) {
        super(a33Var, th0Var, qq1Var);
        cb1Var.getClass();
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.e = c4Var;
    }

    @Override // defpackage.wh0
    public final String a() {
        switch (this.d) {
            case 0:
                return "ruleSet";
            default:
                return "tcf-vendorlist";
        }
    }

    @Override // defpackage.wh0
    public boolean f() {
        switch (this.d) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable j(String str, boolean z, fy fyVar) {
        g62 g62Var;
        if (fyVar instanceof g62) {
            g62Var = (g62) fyVar;
            int i = g62Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                g62Var.u = i - Integer.MIN_VALUE;
            } else {
                g62Var = new g62(this, fyVar);
            }
        } else {
            g62Var = new g62(this, fyVar);
        }
        Object objH = g62Var.s;
        int i2 = g62Var.u;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objH);
            h62 h62Var = new h62(this, str, dyVar, 0);
            g62Var.r = this;
            g62Var.u = 1;
            objH = h(z, h62Var, g62Var);
            dz dzVar = dz.a;
            if (objH == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = g62Var.r;
            wz2.a0(objH);
        }
        c01 c01Var = (c01) objH;
        this.getClass();
        String str2 = c01Var.b;
        sa1 sa1Var = db1.a;
        return new dt1((RuleSet) sa1Var.a(str2, ep0.A(sa1Var.b, p32.d(RuleSet.class))), c01Var.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(fy fyVar) {
        kn2 kn2Var;
        if (fyVar instanceof kn2) {
            kn2Var = (kn2) fyVar;
            int i = kn2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                kn2Var.u = i - Integer.MIN_VALUE;
            } else {
                kn2Var = new kn2(this, fyVar);
            }
        } else {
            kn2Var = new kn2(this, fyVar);
        }
        Object objI = kn2Var.s;
        int i2 = kn2Var.u;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objI);
            f4 f4Var = new f4(this, dyVar, 2);
            kn2Var.r = this;
            kn2Var.u = 1;
            objI = i(false, f4Var, kn2Var);
            dz dzVar = dz.a;
            if (objI == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = kn2Var.r;
            wz2.a0(objI);
        }
        this.getClass();
        sa1 sa1Var = db1.a;
        return (VendorList) sa1Var.a((String) objI, ep0.A(sa1Var.b, p32.d(VendorList.class)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i62(z4 z4Var, cb1 cb1Var, a33 a33Var, th0 th0Var, qq1 qq1Var) {
        super(a33Var, th0Var, qq1Var);
        cb1Var.getClass();
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.e = z4Var;
    }
}
