package defpackage;

import com.usercentrics.sdk.UsercentricsDomains;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class z4 {
    public final a33 a;
    public final yg1 b;
    public final a01 c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, Map map, fy fyVar) throws r23 {
        f62 f62Var;
        if (fyVar instanceof f62) {
            f62Var = (f62) fyVar;
            int i = f62Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                f62Var.v = i - Integer.MIN_VALUE;
            } else {
                f62Var = new f62(this, fyVar);
            }
        } else {
            f62Var = new f62(this, fyVar);
        }
        Object objC = f62Var.t;
        int i2 = f62Var.v;
        try {
            if (i2 == 0) {
                wz2.a0(objC);
                String str2 = this.b.a() + "/ruleSet/" + str + ".json";
                a01 a01Var = this.c;
                f62Var.r = this;
                f62Var.s = str;
                f62Var.v = 1;
                objC = a01Var.c(str2, map, f62Var);
                dz dzVar = dz.a;
                if (objC == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = f62Var.s;
                this = f62Var.r;
                wz2.a0(objC);
            }
            int i3 = ((c01) objC).c;
            if (i3 == 403 || i3 == 404) {
                throw new r23("Unable to initialise due to wrong configuration, please make sure your settingsID/ruleSetID is correct.", null, 2, null);
            }
            return objC;
        } catch (Exception e) {
            this.a.error("Failed while fetching ruleSet using id: " + str, e);
            r23 r23Var = e instanceof r23 ? (r23) e : null;
            if (r23Var != null) {
                throw r23Var;
            }
            throw new r23("Unable to initialise due to poor or no network connection while fetching the rule Set.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, List list, Map map, fy fyVar) throws r23 {
        y4 y4Var;
        String str2;
        if (fyVar instanceof y4) {
            y4Var = (y4) fyVar;
            int i = y4Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                y4Var.u = i - Integer.MIN_VALUE;
            } else {
                y4Var = new y4(this, fyVar);
            }
        } else {
            y4Var = new y4(this, fyVar);
        }
        Object obj = y4Var.s;
        int i2 = y4Var.u;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z4 z4Var = y4Var.r;
                wz2.a0(obj);
                return obj;
            }
            wz2.a0(obj);
            String strG0 = du.g0(list, ",", null, null, x4.j, 30);
            yg1 yg1Var = this.b;
            UsercentricsDomains usercentricsDomains = yg1Var.b;
            if (usercentricsDomains.a()) {
                str2 = usercentricsDomains.a;
            } else {
                int iOrdinal = yg1Var.a.ordinal();
                if (iOrdinal == 0) {
                    str2 = "https://aggregator.service.usercentrics.eu";
                } else {
                    if (iOrdinal != 1) {
                        e.b();
                        return null;
                    }
                    str2 = "https://aggregator.eu.usercentrics.eu";
                }
            }
            String str3 = str2 + "/aggregate/" + str + "?templates=" + strG0;
            a01 a01Var = this.c;
            y4Var.r = this;
            y4Var.u = 1;
            Object objC = a01Var.c(str3, map, y4Var);
            dz dzVar = dz.a;
            return objC == dzVar ? dzVar : objC;
        } catch (Exception e) {
            this.a.error("Failed while fetching services", e);
            throw new r23("Unable to initialise due to poor or no network connection while fetching the processing services.", e);
        }
    }

    public z4(a33 a33Var, yg1 yg1Var, a01 a01Var, int i) {
        a33Var.getClass();
        yg1Var.getClass();
        a01Var.getClass();
        switch (i) {
            case 1:
                this.a = a33Var;
                this.b = yg1Var;
                this.c = a01Var;
                break;
            default:
                this.a = a33Var;
                this.b = yg1Var;
                this.c = a01Var;
                break;
        }
    }
}
