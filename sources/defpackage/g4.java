package defpackage;

import com.usercentrics.sdk.AdTechProvider;
import com.usercentrics.sdk.acm.data.AdditionalConsentModeListResponse;
import com.usercentrics.sdk.services.api.NewServiceTemplates;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import com.usercentrics.tcf.core.model.gvl.Declarations;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g4 extends pq1 {
    public final /* synthetic */ int d = 0;
    public final Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(c4 c4Var, cb1 cb1Var, a33 a33Var, th0 th0Var, qq1 qq1Var, byte b) {
        super(a33Var, th0Var, qq1Var);
        cb1Var.getClass();
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.e = c4Var;
        this.f = "en";
    }

    @Override // defpackage.wh0
    public final String a() {
        switch (this.d) {
            case 0:
                return "acp";
            case 1:
                return n30.y("aggregator-", (String) this.f);
            case 2:
                return n30.y("tcf-declarations-", (String) this.f);
            default:
                return n30.y("translations-", (String) this.f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, fy fyVar) {
        um2 um2Var;
        if (fyVar instanceof um2) {
            um2Var = (um2) fyVar;
            int i = um2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                um2Var.u = i - Integer.MIN_VALUE;
            } else {
                um2Var = new um2(this, fyVar);
            }
        } else {
            um2Var = new um2(this, fyVar);
        }
        Object objI = um2Var.s;
        int i2 = um2Var.u;
        dy dyVar = null;
        int i3 = 1;
        if (i2 == 0) {
            wz2.a0(objI);
            this.f = str;
            h62 h62Var = new h62(this, str, dyVar, i3);
            um2Var.r = this;
            um2Var.u = 1;
            objI = i(false, h62Var, um2Var);
            dz dzVar = dz.a;
            if (objI == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = um2Var.r;
            wz2.a0(objI);
        }
        this.getClass();
        sa1 sa1Var = db1.a;
        return (Declarations) sa1Var.a((String) objI, ep0.A(sa1Var.b, p32.d(Declarations.class)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, List list, boolean z, fy fyVar) {
        a5 a5Var;
        g4 g4Var;
        if (fyVar instanceof a5) {
            a5Var = (a5) fyVar;
            int i = a5Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5Var.u = i - Integer.MIN_VALUE;
            } else {
                a5Var = new a5(this, fyVar);
            }
        } else {
            a5Var = new a5(this, fyVar);
        }
        Object objI = a5Var.s;
        int i2 = a5Var.u;
        if (i2 == 0) {
            wz2.a0(objI);
            this.f = str;
            b5 b5Var = new b5(this, str, list, null, 0);
            a5Var.r = this;
            a5Var.u = 1;
            objI = i(z, b5Var, a5Var);
            dz dzVar = dz.a;
            if (objI == dzVar) {
                return dzVar;
            }
            g4Var = this;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g4Var = a5Var.r;
            wz2.a0(objI);
        }
        g4Var.getClass();
        sa1 sa1Var = db1.a;
        return ((NewServiceTemplates) sa1Var.a((String) objI, ep0.A(sa1Var.b, p32.d(NewServiceTemplates.class)))).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(String str, boolean z, fy fyVar) {
        br2 br2Var;
        if (fyVar instanceof br2) {
            br2Var = (br2) fyVar;
            int i = br2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                br2Var.u = i - Integer.MIN_VALUE;
            } else {
                br2Var = new br2(this, fyVar);
            }
        } else {
            br2Var = new br2(this, fyVar);
        }
        Object objI = br2Var.s;
        int i2 = br2Var.u;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objI);
            this.f = str;
            h62 h62Var = new h62(this, str, dyVar, 2);
            br2Var.r = this;
            br2Var.u = 1;
            objI = i(z, h62Var, br2Var);
            dz dzVar = dz.a;
            if (objI == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = br2Var.r;
            wz2.a0(objI);
        }
        this.getClass();
        sa1 sa1Var = db1.a;
        return (LegalBasisLocalization) sa1Var.a((String) objI, ep0.A(sa1Var.b, p32.d(LegalBasisLocalization.class)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable m(List list, List list2, fy fyVar) {
        e4 e4Var;
        if (fyVar instanceof e4) {
            e4Var = (e4) fyVar;
            int i = e4Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4Var.w = i - Integer.MIN_VALUE;
            } else {
                e4Var = new e4(this, fyVar);
            }
        } else {
            e4Var = new e4(this, fyVar);
        }
        Object objH = e4Var.u;
        int i2 = e4Var.w;
        int i3 = 0;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objH);
            f4 f4Var = new f4(this, dyVar, i3);
            e4Var.r = this;
            e4Var.s = list;
            e4Var.t = list2;
            e4Var.w = 1;
            objH = h(false, f4Var, e4Var);
            dz dzVar = dz.a;
            if (objH == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = (List) e4Var.t;
            list = e4Var.s;
            this = e4Var.r;
            wz2.a0(objH);
        }
        Object obj = this.f;
        String str = ((c01) objH).b;
        sa1 sa1Var = db1.a;
        Map map = ((AdditionalConsentModeListResponse) sa1Var.a(str, ep0.A(sa1Var.b, p32.d(AdditionalConsentModeListResponse.class)))).a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Integer numM = kk2.M((String) entry.getKey());
            AdTechProvider adTechProvider = (numM == null || !list.contains(numM)) ? null : new AdTechProvider(numM.intValue(), (String) ((List) entry.getValue()).get(0), list2.contains(numM), (String) ((List) entry.getValue()).get(1));
            if (adTechProvider != null) {
                arrayList.add(adTechProvider);
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(c4 c4Var, cb1 cb1Var, a33 a33Var, th0 th0Var, qq1 qq1Var) {
        super(a33Var, th0Var, qq1Var);
        cb1Var.getClass();
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.e = c4Var;
        this.f = cb1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(c4 c4Var, cb1 cb1Var, a33 a33Var, th0 th0Var, qq1 qq1Var, char c) {
        super(a33Var, th0Var, qq1Var);
        cb1Var.getClass();
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.e = c4Var;
        this.f = "en";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(z4 z4Var, cb1 cb1Var, a33 a33Var, th0 th0Var, qq1 qq1Var) {
        super(a33Var, th0Var, qq1Var);
        cb1Var.getClass();
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.e = z4Var;
        this.f = "en";
    }
}
