package com.moloco.sdk.internal.services.bidtoken;

import com.explorestack.protobuf.z;
import com.ironsource.Mb;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.j52;
import defpackage.k52;
import defpackage.pp1;
import defpackage.wz2;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n {
    public final x a;
    public final s b;
    public final pp1 c;

    public static void b(com.moloco.sdk.acm.i iVar, com.moloco.sdk.acm.recorder.b bVar, String str) {
        if (str == null) {
            com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar;
            cVar.a(z.n("bid_token_fetch", "result", "success"));
            iVar.a("result", "success");
            cVar.b(iVar);
            return;
        }
        com.moloco.sdk.acm.recorder.c cVar2 = (com.moloco.sdk.acm.recorder.c) bVar;
        cVar2.a(z.o("bid_token_fetch", "result", "failure", "reason", str));
        iVar.a("result", "failure");
        iVar.a("reason", str);
        cVar2.b(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1 A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #1 {all -> 0x0108, blocks: (B:33:0x00a7, B:35:0x00b1), top: B:63:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003a, B:39:0x00ce, B:42:0x00d3, B:44:0x00db, B:52:0x010d, B:45:0x00ef), top: B:61:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003a, B:39:0x00ce, B:42:0x00d3, B:44:0x00db, B:52:0x010d, B:45:0x00ef), top: B:61:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00ef, please report this as an issue */
    public final Object a(com.moloco.sdk.acm.recorder.b bVar, fy fyVar) throws Throwable {
        m mVar;
        com.moloco.sdk.acm.recorder.b bVar2;
        pp1 pp1Var;
        Mutex mutex;
        Mutex mutex2;
        com.moloco.sdk.acm.recorder.b bVar3;
        Mutex mutex3;
        com.moloco.sdk.acm.i iVar;
        Mutex mutex4;
        l lVar;
        String str;
        String str2;
        Object objA;
        n nVar;
        Mutex mutex5;
        com.moloco.sdk.acm.recorder.b bVar4;
        String str3;
        String str4;
        String str5;
        n nVar2 = this;
        if (fyVar instanceof m) {
            mVar = (m) fyVar;
            int i = mVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.y = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(nVar2, fyVar);
            }
        } else {
            mVar = new m(nVar2, fyVar);
        }
        Object obj = mVar.w;
        int i2 = mVar.y;
        String str6 = "";
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                mVar.r = nVar2;
                bVar2 = bVar;
                mVar.s = bVar2;
                pp1Var = nVar2.c;
                mVar.t = pp1Var;
                mVar.y = 1;
                if (pp1Var.e(mVar) != dzVar) {
                }
                mutex = pp1Var;
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = mVar.v;
                    iVar = mVar.u;
                    mutex2 = mVar.t;
                    bVar4 = mVar.s;
                    nVar = mVar.r;
                    try {
                        wz2.a0(obj);
                        objA = ((k52) obj).a;
                        mutex5 = mutex2;
                        if (objA instanceof j52) {
                            objA = "";
                        }
                        str4 = (String) objA;
                        if (str4.length() == 0) {
                            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                            nVar.getClass();
                            MolocoLogger.error$default(molocoLogger, "BidTokenServiceImpl", "CBT has error", null, false, 12, null);
                            str5 = "client";
                        } else {
                            str6 = str3 + ':' + str4;
                            str5 = null;
                        }
                        str2 = str5;
                        nVar2 = nVar;
                        bVar3 = bVar4;
                        mutex2 = mutex5;
                        nVar2.getClass();
                        b(iVar, bVar3, str2);
                        ((pp1) mutex2).g(null);
                        return str6;
                    } catch (Throwable th) {
                        th = th;
                        mutex4 = mutex2;
                        ((pp1) mutex4).g(null);
                        throw th;
                    }
                }
                com.moloco.sdk.acm.i iVar2 = mVar.u;
                mutex4 = mVar.t;
                com.moloco.sdk.acm.recorder.b bVar5 = mVar.s;
                n nVar3 = mVar.r;
                try {
                    wz2.a0(obj);
                    iVar = iVar2;
                    nVar2 = nVar3;
                    bVar3 = bVar5;
                    mutex3 = mutex4;
                    try {
                        lVar = (l) obj;
                        str = lVar.a;
                        if (str.length() > 0) {
                            String str7 = lVar.b;
                            f fVar = lVar.c;
                            s sVar = nVar2.b;
                            mVar.r = nVar2;
                            mVar.s = bVar3;
                            mVar.t = mutex3;
                            mVar.u = iVar;
                            mVar.v = str;
                            mVar.y = 3;
                            objA = sVar.a(bVar3, str7, fVar, mVar);
                            if (objA != dzVar) {
                                nVar = nVar2;
                                mutex5 = mutex3;
                                bVar4 = bVar3;
                                str3 = str;
                                if (objA instanceof j52) {
                                    objA = "";
                                }
                                str4 = (String) objA;
                                if (str4.length() == 0) {
                                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                                    nVar.getClass();
                                    MolocoLogger.error$default(molocoLogger2, "BidTokenServiceImpl", "CBT has error", null, false, 12, null);
                                    str5 = "client";
                                } else {
                                    str6 = str3 + ':' + str4;
                                    str5 = null;
                                }
                                str2 = str5;
                                nVar2 = nVar;
                                bVar3 = bVar4;
                                mutex2 = mutex5;
                            }
                            mutex = pp1Var;
                            return dzVar;
                        }
                        str2 = Mb.a;
                        mutex2 = mutex3;
                        nVar2.getClass();
                        b(iVar, bVar3, str2);
                        ((pp1) mutex2).g(null);
                        return str6;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex4 = mutex3;
                        ((pp1) mutex4).g(null);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ((pp1) mutex4).g(null);
                    throw th;
                }
            }
            Mutex mutex6 = mVar.t;
            com.moloco.sdk.acm.recorder.b bVar6 = mVar.s;
            n nVar4 = mVar.r;
            wz2.a0(obj);
            bVar2 = bVar6;
            mutex = mutex6;
            nVar2 = nVar4;
            mutex = pp1Var;
            com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) bVar2;
            com.moloco.sdk.acm.i iVarC = cVar.c("bid_token_fetch_time");
            x xVar = nVar2.a;
            mVar.r = nVar2;
            mVar.s = cVar;
            mVar.t = mutex;
            mVar.u = iVarC;
            mVar.y = 2;
            Object objB = xVar.b(cVar, mVar);
            if (objB != dzVar) {
                bVar3 = cVar;
                obj = objB;
                mutex3 = mutex;
                iVar = iVarC;
                lVar = (l) obj;
                str = lVar.a;
                if (str.length() > 0) {
                    String str8 = lVar.b;
                    f fVar2 = lVar.c;
                    s sVar2 = nVar2.b;
                    mVar.r = nVar2;
                    mVar.s = bVar3;
                    mVar.t = mutex3;
                    mVar.u = iVar;
                    mVar.v = str;
                    mVar.y = 3;
                    objA = sVar2.a(bVar3, str8, fVar2, mVar);
                    if (objA != dzVar) {
                        nVar = nVar2;
                        mutex5 = mutex3;
                        bVar4 = bVar3;
                        str3 = str;
                        if (objA instanceof j52) {
                            objA = "";
                        }
                        str4 = (String) objA;
                        if (str4.length() == 0) {
                            MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
                            nVar.getClass();
                            MolocoLogger.error$default(molocoLogger3, "BidTokenServiceImpl", "CBT has error", null, false, 12, null);
                            str5 = "client";
                        } else {
                            str6 = str3 + ':' + str4;
                            str5 = null;
                        }
                        str2 = str5;
                        nVar2 = nVar;
                        bVar3 = bVar4;
                        mutex2 = mutex5;
                    }
                } else {
                    str2 = Mb.a;
                    mutex2 = mutex3;
                }
                nVar2.getClass();
                b(iVar, bVar3, str2);
                ((pp1) mutex2).g(null);
                return str6;
            }
            mutex = pp1Var;
            return dzVar;
        } catch (Throwable th4) {
            th = th4;
            mutex2 = mutex;
            mutex4 = mutex2;
            ((pp1) mutex4).g(null);
            throw th;
        }
    }

    public n(x xVar, s sVar) {
        xVar.getClass();
        this.a = xVar;
        this.b = sVar;
        this.c = new pp1();
    }
}
