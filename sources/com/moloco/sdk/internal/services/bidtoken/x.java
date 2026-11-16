package com.moloco.sdk.internal.services.bidtoken;

import com.explorestack.protobuf.z;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.n0;
import com.moloco.sdk.internal.o0;
import com.moloco.sdk.internal.p0;
import defpackage.ba0;
import defpackage.dn;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.h62;
import defpackage.li2;
import defpackage.pp1;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.y80;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class x {
    public final com.facebook.ads.a a;
    public final dn b;
    public final com.facebook.login.p c;
    public boolean d = true;
    public final pp1 e = new pp1();
    public li2 f;

    public static final void c(x xVar, String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "[Thread: " + Thread.currentThread().getName() + "] " + str, false, 4, null);
    }

    public static void d(String str) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, null, false, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(com.moloco.sdk.acm.recorder.c cVar, l lVar, boolean z, boolean z2, fy fyVar) {
        w wVar;
        com.moloco.sdk.acm.i iVarC;
        l lVar2;
        Object objE;
        x xVar;
        boolean z3;
        com.moloco.sdk.acm.recorder.b bVar;
        boolean z4;
        p0 p0Var;
        x xVar2;
        if (fyVar instanceof w) {
            wVar = (w) fyVar;
            int i = wVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.z = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, fyVar);
            }
        } else {
            wVar = new w(this, fyVar);
        }
        Object obj = wVar.x;
        int i2 = wVar.z;
        dz dzVar = dz.a;
        if (i2 != 0) {
            if (i2 == 1) {
                z3 = wVar.w;
                z4 = wVar.v;
                iVarC = wVar.u;
                l lVar3 = wVar.t;
                bVar = (com.moloco.sdk.acm.recorder.b) wVar.s;
                xVar = wVar.r;
                wz2.a0(obj);
                objE = obj;
                lVar2 = lVar3;
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p0Var = (p0) wVar.s;
                xVar2 = wVar.r;
                wz2.a0(obj);
            }
            l lVar4 = (l) ((o0) p0Var).a;
            xVar2.d = false;
            return lVar4;
        }
        wz2.a0(obj);
        iVarC = cVar.c("sbt_fetch_time_ms");
        d("[Thread: " + Thread.currentThread().getName() + "] fetchServerBidToken");
        wVar.r = this;
        wVar.s = cVar;
        lVar2 = lVar;
        wVar.t = lVar2;
        wVar.u = iVarC;
        wVar.v = z;
        wVar.w = z2;
        wVar.z = 1;
        ba0 ba0Var = xc0.a;
        objE = tb5.E(y80.c, new c(this.a, cVar, null), wVar);
        if (objE != dzVar) {
            xVar = this;
            z3 = z2;
            bVar = cVar;
            z4 = z;
        }
        return dzVar;
        p0 p0Var2 = (p0) objE;
        if (p0Var2 instanceof n0) {
            com.moloco.sdk.acm.e eVarN = z.n("sbt_fetch", "result", "failure");
            com.moloco.sdk.internal.x xVar3 = (com.moloco.sdk.internal.x) ((n0) p0Var2).a;
            eVarN.a("reason", String.valueOf(xVar3.b));
            eVarN.a("initial_fetch", String.valueOf(xVar.d));
            eVarN.a("was_expiring", String.valueOf(z3));
            eVarN.a("async", String.valueOf(z4));
            com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) bVar;
            cVar2.a(eVarN);
            iVarC.a("result", "failure");
            iVarC.a("reason", String.valueOf(xVar3.b));
            iVarC.a("initial_fetch", String.valueOf(xVar.d));
            iVarC.a("was_expiring", String.valueOf(z3));
            iVarC.a("async", String.valueOf(z4));
            cVar2.b(iVarC);
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ServerBidTokenServiceImpl", "bidtoken request failed: " + xVar3.b + ", details: " + xVar3.a, null, false, 12, null);
            return lVar2;
        }
        if (!(p0Var2 instanceof o0)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }
        com.moloco.sdk.acm.e eVarN2 = z.n("sbt_fetch", "result", "success");
        eVarN2.a("initial_fetch", String.valueOf(xVar.d));
        eVarN2.a("was_expiring", String.valueOf(z3));
        eVarN2.a("async", String.valueOf(z4));
        com.moloco.sdk.acm.recorder.c cVar3 = (com.moloco.sdk.acm.recorder.c) bVar;
        cVar3.a(eVarN2);
        iVarC.a("result", "success");
        iVarC.a("initial_fetch", String.valueOf(xVar.d));
        iVarC.a("was_expiring", String.valueOf(z3));
        iVarC.a("async", String.valueOf(z4));
        cVar3.b(iVarC);
        com.moloco.sdk.acm.e eVarN3 = z.n("sbt_cached", "result", "false");
        eVarN3.a("initial_fetch", String.valueOf(xVar.d));
        eVarN3.a("async", String.valueOf(z4));
        cVar3.a(eVarN3);
        d("[Thread: " + Thread.currentThread().getName() + "] bidtoken request success");
        pp1 pp1Var = xVar.e;
        h62 h62Var = new h62(xVar, (o0) p0Var2, null, 4);
        wVar.r = xVar;
        wVar.s = p0Var2;
        wVar.t = null;
        wVar.u = null;
        wVar.z = 2;
        if (io.p071bidmachine.media3.common.audio.c.h(pp1Var, h62Var, wVar) != dzVar) {
            p0Var = p0Var2;
            xVar2 = xVar;
            l lVar5 = (l) ((o0) p0Var).a;
            xVar2.d = false;
            return lVar5;
        }
        return dzVar;
    }

    public final Object b(com.moloco.sdk.acm.recorder.c cVar, m mVar) {
        d("[Thread: " + Thread.currentThread().getName() + "] Fetching bidToken(), acquiring lock");
        return io.p071bidmachine.media3.common.audio.c.h(this.e, new h62(this, cVar, null, 3), mVar);
    }

    public x(com.facebook.ads.a aVar, dn dnVar, com.facebook.login.p pVar) {
        this.a = aVar;
        this.b = dnVar;
        this.c = pVar;
    }
}
