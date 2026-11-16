package defpackage;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pq1 extends wh0 {
    public final qq1 c;

    public final c01 g(c01 c01Var) throws r23 {
        Object next;
        String str;
        String strD;
        String str2;
        Integer numM;
        int i = c01Var.c;
        Map map = c01Var.a;
        if (i == 200) {
            String str3 = (String) map.get("cache-control");
            vh1 vh1VarB = str3 != null ? w32.b(c01.d, str3) : null;
            int iIntValue = (vh1VarB == null || (str2 = (String) ((th1) vh1VarB.a()).get(1)) == null || (numM = kk2.M(str2)) == null) ? 0 : numM.intValue();
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s71.b(((Map.Entry) next).getKey(), DownloadModel.ETAG));
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (str = (String) entry.getValue()) == null) {
                str = "";
            }
            String str4 = str;
            String str5 = f() ? (String) map.get("x-client-geo-location") : null;
            th0 th0Var = this.b;
            if (i == 304) {
                this.a.b("Valid ETAG cache: key=".concat(a()), null);
                if (c() == 0) {
                    th0Var.d(new uh0(a(), iIntValue, str4, c01Var.b, str5));
                }
                strD = d();
            } else {
                if (dk2.Z(str4) || iIntValue == 0) {
                    str4 = "xxx";
                }
                th0Var.d(new uh0(a(), iIntValue, str4, c01Var.b, str5));
                strD = c01Var.b;
            }
        } else {
            if (i != 304) {
                throw new r23("Invalid Network Response", null, 2, null);
            }
            strD = d();
        }
        return new c01(i, strD, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(boolean z, wr0 wr0Var, fy fyVar) {
        nq1 nq1Var;
        Map mapSingletonMap;
        if (fyVar instanceof nq1) {
            nq1Var = (nq1) fyVar;
            int i = nq1Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq1Var.u = i - Integer.MIN_VALUE;
            } else {
                nq1Var = new nq1(this, fyVar);
            }
        } else {
            nq1Var = new nq1(this, fyVar);
        }
        Object obj = nq1Var.s;
        int i2 = nq1Var.u;
        if (i2 != 0) {
            if (i2 == 1) {
                this = nq1Var.r;
                wz2.a0(obj);
                return this.g((c01) obj);
            }
            if (i2 != 2) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = nq1Var.r;
            wz2.a0(obj);
            return this.g((c01) obj);
        }
        wz2.a0(obj);
        Object obj2 = dz.a;
        if (z) {
            nq1Var.r = this;
            nq1Var.u = 1;
            Object objInvoke = wr0Var.invoke(nq1Var);
            if (objInvoke != obj2) {
                obj = objInvoke;
                return this.g((c01) obj);
            }
        } else {
            if (this.c.a || c() > new q50().c()) {
                String str = f() ? (String) du.d0(2, dk2.n0(dk2.i0(e()), new String[]{"@#$"}, 0, 6)) : null;
                if (str != null) {
                    mapSingletonMap = Collections.singletonMap("x-client-geo-location", str);
                    mapSingletonMap.getClass();
                } else {
                    mapSingletonMap = hg0.a;
                }
                return new c01(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, d(), mapSingletonMap);
            }
            nq1Var.r = this;
            nq1Var.u = 2;
            Object objInvoke2 = wr0Var.invoke(nq1Var);
            if (objInvoke2 != obj2) {
                obj = objInvoke2;
                return this.g((c01) obj);
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(boolean z, wr0 wr0Var, fy fyVar) {
        oq1 oq1Var;
        if (fyVar instanceof oq1) {
            oq1Var = (oq1) fyVar;
            int i = oq1Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                oq1Var.t = i - Integer.MIN_VALUE;
            } else {
                oq1Var = new oq1(this, fyVar);
            }
        } else {
            oq1Var = new oq1(this, fyVar);
        }
        Object objH = oq1Var.r;
        int i2 = oq1Var.t;
        if (i2 == 0) {
            wz2.a0(objH);
            oq1Var.t = 1;
            objH = h(z, wr0Var, oq1Var);
            Object obj = dz.a;
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objH);
        }
        return ((c01) objH).b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq1(a33 a33Var, th0 th0Var, qq1 qq1Var) {
        super(a33Var, th0Var);
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.c = qq1Var;
    }
}
