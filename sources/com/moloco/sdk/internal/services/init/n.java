package com.moloco.sdk.internal.services.init;

import com.explorestack.protobuf.z;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.n0;
import com.moloco.sdk.internal.o0;
import com.moloco.sdk.internal.p0;
import com.moloco.sdk.j2;
import com.moloco.sdk.publisher.MediationInfo;
import defpackage.bm;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.tb5;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public final e a;
    public final g b;
    public final dn c;
    public j2 d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, MediationInfo mediationInfo, fy fyVar) throws Throwable {
        m mVar;
        com.moloco.sdk.acm.recorder.c cVar;
        com.moloco.sdk.acm.i iVar;
        if (fyVar instanceof m) {
            mVar = (m) fyVar;
            int i = mVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.v = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, fyVar);
            }
        } else {
            mVar = new m(this, fyVar);
        }
        Object obj = mVar.t;
        int i2 = mVar.v;
        if (i2 == 0) {
            wz2.a0(obj);
            com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
            String name = mediationInfo.getName();
            aVar.getClass();
            com.moloco.sdk.acm.recorder.c cVarA = com.moloco.sdk.acm.recorder.a.a(name);
            com.moloco.sdk.acm.i iVarC = cVarA.c("sdk_perform_init_time_ms");
            mVar.r = cVarA;
            mVar.s = iVarC;
            mVar.v = 1;
            Object objC = c(str, mediationInfo, cVarA, mVar);
            Object obj2 = dz.a;
            if (objC == obj2) {
                return obj2;
            }
            cVar = cVarA;
            obj = objC;
            iVar = iVarC;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iVar = mVar.s;
            cVar = mVar.r;
            wz2.a0(obj);
        }
        c cVar2 = (c) obj;
        p0 p0Var = cVar2.a;
        String str2 = cVar2.b;
        if (p0Var instanceof n0) {
            cVar.a(z.o("sdk_perform_init_attempt", "result", "failure", "state", str2));
            iVar.a("result", "failure");
            iVar.a("state", str2);
            cVar.b(iVar);
        } else {
            if (!(p0Var instanceof o0)) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            cVar.a(z.o("sdk_perform_init_attempt", "result", "success", "state", str2));
            iVar.a("result", "success");
            iVar.a("state", str2);
            cVar.b(iVar);
        }
        return cVar2.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0101  */
    /* JADX WARN: Code duplicated, block: B:28:0x0124  */
    /* JADX WARN: Code duplicated, block: B:31:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0213  */
    /* JADX WARN: Code duplicated, block: B:51:0x0219  */
    /* JADX WARN: Code duplicated, block: B:53:0x0226  */
    /* JADX WARN: Code duplicated, block: B:54:0x022b  */
    /* JADX WARN: Code duplicated, block: B:56:0x022f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0288  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x0323  */
    /* JADX WARN: Code duplicated, block: B:86:0x0335  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0323 -> B:16:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r32, com.moloco.sdk.publisher.MediationInfo r33, com.moloco.sdk.acm.recorder.b r34, boolean r35, defpackage.fy r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.n.b(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.b, boolean, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0118  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0132  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(String str, MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.c cVar, fy fyVar) throws Throwable {
        k kVar;
        com.moloco.sdk.acm.recorder.c cVar2;
        String str2;
        MediationInfo mediationInfo2;
        n nVar;
        p0 p0Var;
        n nVar2 = this;
        if (fyVar instanceof k) {
            kVar = (k) fyVar;
            int i = kVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.x = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(nVar2, fyVar);
            }
        } else {
            kVar = new k(nVar2, fyVar);
        }
        k kVar2 = kVar;
        Object objB = kVar2.v;
        int i2 = kVar2.x;
        dy dyVar = null;
        dz dzVar = dz.a;
        if (i2 != 0) {
            if (i2 == 1) {
                com.moloco.sdk.acm.recorder.c cVar3 = kVar2.u;
                MediationInfo mediationInfo3 = kVar2.t;
                String str3 = kVar2.s;
                n nVar3 = kVar2.r;
                wz2.a0(objB);
                cVar2 = cVar3;
                mediationInfo2 = mediationInfo3;
                str2 = str3;
                nVar2 = nVar3;
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nVar = kVar2.r;
                wz2.a0(objB);
            }
            p0Var = (p0) objB;
            if (p0Var instanceof o0) {
                nVar.d = (j2) ((o0) p0Var).a;
            } else {
                if (p0Var instanceof n0) {
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return null;
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Fetching init response failed", null, false, 12, null);
            }
            return new c(p0Var, "network");
        }
        wz2.a0(objB);
        j2 j2Var = nVar2.d;
        if (j2Var != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Returning current session init response", null, false, 12, null);
            return new c(new o0(j2Var), "in_memory");
        }
        a aVar = new a(str);
        kVar2.r = nVar2;
        kVar2.s = str;
        kVar2.t = mediationInfo;
        kVar2.u = cVar;
        kVar2.x = 1;
        g gVar = nVar2.b;
        Object objE = tb5.E(gVar.b, new f(cVar, aVar, gVar, dyVar, 1), kVar2);
        if (objE == dzVar) {
            return dzVar;
        }
        cVar2 = cVar;
        str2 = str;
        mediationInfo2 = mediationInfo;
        objB = objE;
        j2 j2Var2 = (j2) objB;
        if (j2Var2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Returning cached init response", null, false, 12, null);
            nVar2.d = j2Var2;
            tb5.t(nVar2.c, null, null, new bm(nVar2, str2, mediationInfo2, cVar2, (dy) null, 8), 3);
            return new c(new o0(j2Var2), "cache");
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "No cached response, fetching from server", null, false, 12, null);
        kVar2.r = nVar2;
        kVar2.s = null;
        kVar2.t = null;
        kVar2.u = null;
        kVar2.x = 2;
        n nVar4 = nVar2;
        objB = nVar4.b(str2, mediationInfo2, cVar2, false, kVar2);
        if (objB == dzVar) {
            return dzVar;
        }
        nVar = nVar4;
        p0Var = (p0) objB;
        if (p0Var instanceof o0) {
            nVar.d = (j2) ((o0) p0Var).a;
        } else {
            if (p0Var instanceof n0) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Fetching init response failed", null, false, 12, null);
        }
        return new c(p0Var, "network");
    }

    public n(e eVar, g gVar, dn dnVar) {
        eVar.getClass();
        this.a = eVar;
        this.b = gVar;
        this.c = dnVar;
    }
}
