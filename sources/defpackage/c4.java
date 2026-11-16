package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 {
    public final a01 a;
    public final yg1 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, String str2, Map map, fy fyVar) throws r23 {
        uc1 uc1Var;
        if (fyVar instanceof uc1) {
            uc1Var = (uc1) fyVar;
            int i = uc1Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                uc1Var.t = i - Integer.MIN_VALUE;
            } else {
                uc1Var = new uc1(this, fyVar);
            }
        } else {
            uc1Var = new uc1(this, fyVar);
        }
        Object objC = uc1Var.r;
        int i2 = uc1Var.t;
        if (i2 == 0) {
            wz2.a0(objC);
            String str3 = this.b.a() + "/settings/" + str + "/" + str2 + "/languages.json";
            uc1Var.t = 1;
            objC = this.a.c(str3, map, uc1Var);
            dz dzVar = dz.a;
            if (objC == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objC);
        }
        int i3 = ((c01) objC).c;
        if (i3 == 403 || i3 == 404) {
            throw new r23("Unable to initialise due to wrong configuration, please make sure your settingsID correct.", null, 2, null);
        }
        return objC;
    }

    public c4(a01 a01Var, yg1 yg1Var, int i) {
        a01Var.getClass();
        yg1Var.getClass();
        switch (i) {
            case 1:
                this.a = a01Var;
                this.b = yg1Var;
                break;
            case 2:
                this.a = a01Var;
                this.b = yg1Var;
                break;
            case 3:
                this.a = a01Var;
                this.b = yg1Var;
                break;
            case 4:
                this.a = a01Var;
                this.b = yg1Var;
                break;
            case 5:
                this.a = a01Var;
                this.b = yg1Var;
                break;
            default:
                this.a = a01Var;
                this.b = yg1Var;
                break;
        }
    }
}
