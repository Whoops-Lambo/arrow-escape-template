package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.ba0;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.hg0;
import defpackage.hh;
import defpackage.n30;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.y80;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z0 {
    public final com.moloco.sdk.internal.ortb.d a;
    public final com.facebook.appevents.n b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, fy fyVar) throws Throwable {
        y0 y0Var;
        if (fyVar instanceof y0) {
            y0Var = (y0) fyVar;
            int i = y0Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0Var.u = i - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, fyVar);
            }
        } else {
            y0Var = new y0(this, fyVar);
        }
        Object objE = y0Var.s;
        int i2 = y0Var.u;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objE);
            y0Var.r = str;
            y0Var.u = 1;
            objE = tb5.E(xc0.a, new hh(this.b, str, dyVar, 11), y0Var);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = y0Var.r;
            wz2.a0(objE);
        }
        String str2 = (String) objE;
        if (str2 == null) {
            return str;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BidLoader", "Found no pre-preprocessor for the current mediation. Returning the original bid response.", null, false, 12, null);
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(String str, String str2, fy fyVar) throws Throwable {
        w0 w0Var;
        String str3;
        Object objA;
        z0 z0Var = this;
        if (fyVar instanceof w0) {
            w0Var = (w0) fyVar;
            int i = w0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0Var.v = i - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(z0Var, fyVar);
            }
        } else {
            w0Var = new w0(z0Var, fyVar);
        }
        Object obj = w0Var.t;
        int i2 = w0Var.v;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(obj);
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BidLoader", n30.y("parse() called with bidResponseJson: ", str2), false, 4, null);
            w0Var.r = z0Var;
            str3 = str;
            w0Var.s = str3;
            w0Var.v = 1;
            objA = z0Var.a(str2, w0Var);
            if (objA != dzVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(obj);
                return obj;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str4 = w0Var.s;
        z0 z0Var2 = w0Var.r;
        wz2.a0(obj);
        str3 = str4;
        z0Var = z0Var2;
        objA = obj;
        String str5 = (String) objA;
        if (str5 == null) {
            return new com.moloco.sdk.internal.n0(com.moloco.sdk.internal.f0.a(str3, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.y.a, hg0.a));
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidLoader", "Processed the bidResponse, proceeding with parsing it.", null, false, 12, null);
        w0Var.r = null;
        w0Var.s = null;
        w0Var.v = 2;
        Object objC = z0Var.c(str5, str3, w0Var);
        return objC == dzVar ? dzVar : objC;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(String str, String str2, fy fyVar) throws Throwable {
        x0 x0Var;
        String str3;
        Object objE;
        com.moloco.sdk.internal.y yVar;
        String strG0;
        Map mapSingletonMap;
        z0 z0Var = this;
        if (fyVar instanceof x0) {
            x0Var = (x0) fyVar;
            int i = x0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0Var.v = i - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(z0Var, fyVar);
            }
        } else {
            x0Var = new x0(z0Var, fyVar);
        }
        Object obj = x0Var.t;
        int i2 = x0Var.v;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(obj);
            x0Var.r = z0Var;
            str3 = str2;
            x0Var.s = str3;
            x0Var.v = 1;
            com.moloco.sdk.internal.ortb.d dVar = z0Var.a;
            dVar.getClass();
            ba0 ba0Var = xc0.a;
            objE = tb5.E(y80.c, new hh(dVar, str, dyVar, 10), x0Var);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = x0Var.s;
            z0 z0Var2 = x0Var.r;
            wz2.a0(obj);
            str3 = str4;
            z0Var = z0Var2;
            objE = obj;
        }
        com.moloco.sdk.internal.p0 p0Var = (com.moloco.sdk.internal.p0) objE;
        if (!(p0Var instanceof com.moloco.sdk.internal.n0)) {
            if (p0Var instanceof com.moloco.sdk.internal.o0) {
                return new com.moloco.sdk.internal.o0(((com.moloco.sdk.internal.ortb.model.j) ((com.moloco.sdk.internal.ortb.model.c0) ((com.moloco.sdk.internal.o0) p0Var).a).a.get(0)).a.get(0));
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }
        Object obj2 = ((com.moloco.sdk.internal.n0) p0Var).a;
        com.moloco.sdk.internal.ortb.c cVar = (com.moloco.sdk.internal.ortb.c) obj2;
        z0Var.getClass();
        if (cVar instanceof com.moloco.sdk.internal.ortb.a) {
            yVar = com.moloco.sdk.internal.y.b;
        } else {
            if (!(cVar instanceof com.moloco.sdk.internal.ortb.b)) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            yVar = com.moloco.sdk.internal.y.c;
        }
        com.moloco.sdk.internal.ortb.a aVar = obj2 instanceof com.moloco.sdk.internal.ortb.a ? (com.moloco.sdk.internal.ortb.a) obj2 : null;
        Exception exc = aVar != null ? aVar.a : null;
        com.moloco.sdk.internal.ortb.b bVar = obj2 instanceof com.moloco.sdk.internal.ortb.b ? (com.moloco.sdk.internal.ortb.b) obj2 : null;
        List list = bVar != null ? bVar.a : null;
        if (list == null) {
            strG0 = "";
        } else {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                strG0 = du.g0(list2, ",", " missingFields=", null, null, 60);
            } else {
                strG0 = "";
            }
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "BidLoader", "parseBidResponse failed to parse BID json string. subType=" + yVar + strG0, exc, false, 8, null);
        MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
        if (list == null) {
            mapSingletonMap = hg0.a;
        } else {
            List list3 = !list.isEmpty() ? list : null;
            if (list3 != null) {
                mapSingletonMap = Collections.singletonMap("missing_fields", du.g0(list3, ",", null, null, null, 62));
                mapSingletonMap.getClass();
            } else {
                mapSingletonMap = hg0.a;
            }
        }
        return new com.moloco.sdk.internal.n0(com.moloco.sdk.internal.f0.a(str3, errorType, yVar, mapSingletonMap));
    }

    public z0(com.moloco.sdk.internal.ortb.d dVar, com.facebook.appevents.n nVar) {
        dVar.getClass();
        this.a = dVar;
        this.b = nVar;
    }
}
