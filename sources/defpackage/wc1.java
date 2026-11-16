package defpackage;

import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wc1 {
    public final dd1 a;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, String str3, boolean z, fy fyVar) {
        vc1 vc1Var;
        if (fyVar instanceof vc1) {
            vc1Var = (vc1) fyVar;
            int i = vc1Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                vc1Var.u = i - Integer.MIN_VALUE;
            } else {
                vc1Var = new vc1(this, fyVar);
            }
        } else {
            vc1Var = new vc1(this, fyVar);
        }
        vc1 vc1Var2 = vc1Var;
        Object obj = vc1Var2.s;
        int i2 = vc1Var2.u;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                dd1 dd1Var = this.a;
                vc1Var2.r = this;
                vc1Var2.u = 1;
                Object objA = dd1Var.a(str, str2, str3, z, vc1Var2);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = vc1Var2.r;
                wz2.a0(obj);
            }
            dd1 dd1Var2 = this.a;
            String str4 = dd1Var2.d;
            str4.getClass();
            UsercentricsLocation usercentricsLocation = dd1Var2.e;
            usercentricsLocation.getClass();
            return new hf1(str4, usercentricsLocation, dd1Var2.f);
        } catch (Exception e) {
            return new j52(e);
        }
    }

    public wc1(dd1 dd1Var) {
        dd1Var.getClass();
        this.a = dd1Var;
    }
}
