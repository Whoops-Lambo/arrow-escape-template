package defpackage;

import com.usercentrics.sdk.v2.language.data.LanguageData;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ad1 extends pq1 {
    public final c4 d;
    public String e;
    public String f;

    @Override // defpackage.wh0
    public final String a() {
        return pv1.o("languages-", this.e, "-", this.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, String str2, boolean z, fy fyVar) {
        zc1 zc1Var;
        ad1 ad1Var;
        if (fyVar instanceof zc1) {
            zc1Var = (zc1) fyVar;
            int i = zc1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                zc1Var.v = i - Integer.MIN_VALUE;
            } else {
                zc1Var = new zc1(this, fyVar);
            }
        } else {
            zc1Var = new zc1(this, fyVar);
        }
        Object objH = zc1Var.t;
        int i2 = zc1Var.v;
        boolean z2 = true;
        if (i2 == 0) {
            wz2.a0(objH);
            this.e = str;
            this.f = str2;
            b5 b5Var = new b5(this, str, str2, null, 1);
            zc1Var.r = this;
            zc1Var.s = z;
            zc1Var.v = 1;
            objH = h(z, b5Var, zc1Var);
            dz dzVar = dz.a;
            if (objH == dzVar) {
                return dzVar;
            }
            ad1Var = this;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = zc1Var.s;
            ad1Var = zc1Var.r;
            wz2.a0(objH);
        }
        c01 c01Var = (c01) objH;
        String str3 = c01Var.b;
        ad1Var.getClass();
        sa1 sa1Var = db1.a;
        List list = ((LanguageData) sa1Var.a(str3, ep0.A(sa1Var.b, p32.d(LanguageData.class)))).a;
        UsercentricsLocation usercentricsLocationA = c01Var.a();
        if (!z && c01Var.c != 200) {
            z2 = false;
        }
        return new hf1(list, usercentricsLocationA, z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad1(c4 c4Var, cb1 cb1Var, a33 a33Var, th0 th0Var, qq1 qq1Var) {
        super(a33Var, th0Var, qq1Var);
        cb1Var.getClass();
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.d = c4Var;
        this.e = "";
        this.f = "";
    }
}
