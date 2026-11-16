package com.moloco.sdk.internal.services.bidtoken;

import com.explorestack.protobuf.z;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.l1;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.pv1;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements h {
    public final n a;
    public final l1 b;
    public final com.moloco.sdk.internal.services.h c;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(com.moloco.sdk.acm.recorder.b bVar, MediationInfo mediationInfo, MolocoBidTokenListener molocoBidTokenListener, fy fyVar) {
        i iVar;
        com.moloco.sdk.acm.recorder.c cVar;
        long jCurrentTimeMillis;
        Object objA;
        j jVar = this;
        MolocoBidTokenListener molocoBidTokenListener2 = molocoBidTokenListener;
        if (fyVar instanceof i) {
            iVar = (i) fyVar;
            int i = iVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.x = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(jVar, fyVar);
            }
        } else {
            iVar = new i(jVar, fyVar);
        }
        Object obj = iVar.v;
        int i2 = iVar.x;
        MolocoAdError.ErrorType errorType = null;
        az2 az2Var = az2.a;
        if (i2 == 0) {
            wz2.a0(obj);
            cVar = (com.moloco.sdk.acm.recorder.c) bVar;
            cVar.a(new com.moloco.sdk.acm.e("bid_token_get_request"));
            l1 l1Var = jVar.b;
            l1Var.getClass();
            try {
                com.moloco.sdk.service_locator.j.b();
                if (l1Var.c.a.getValue() == Initialization.FAILURE || Moloco.INSTANCE.getFailedMediations$moloco_sdk_release().contains(mediationInfo.getName())) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenHandlerImpl", "Bid token cannot be fetched because SDK initialization has failed", null, false, 12, null);
                    cVar.a(z.o("bid_token_get_response", "result", "failure", "reason", "sdk_init_failed"));
                    molocoBidTokenListener2.onBidTokenResult("", MolocoAdError.ErrorType.SDK_INIT_ERROR);
                    return az2Var;
                }
                jVar.c.getClass();
                jCurrentTimeMillis = System.currentTimeMillis();
                iVar.r = jVar;
                iVar.s = cVar;
                iVar.t = molocoBidTokenListener2;
                iVar.u = jCurrentTimeMillis;
                iVar.x = 1;
                objA = jVar.a.a(cVar, iVar);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } catch (IllegalStateException unused) {
                MolocoAdError.ErrorType errorType2 = MolocoAdError.ErrorType.SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenHandlerImpl", "Bid token cannot be fetched because SDK initialization cannot happen due to WM issue", null, false, 12, null);
                cVar.a(z.o("bid_token_get_response", "result", "failure", "reason", "sdk_cannot_initialize"));
                molocoBidTokenListener2.onBidTokenResult("", errorType2);
                return az2Var;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j = iVar.u;
            MolocoBidTokenListener molocoBidTokenListener3 = iVar.t;
            cVar = iVar.s;
            j jVar2 = iVar.r;
            wz2.a0(obj);
            objA = obj;
            molocoBidTokenListener2 = molocoBidTokenListener3;
            jCurrentTimeMillis = j;
            jVar = jVar2;
        }
        String str = (String) objA;
        jVar.c.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "BidTokenHandlerImpl", pv1.m(jCurrentTimeMillis2, "Bid token fetched in ", " ms"), null, false, 12, null);
        if (str.length() == 0) {
            cVar.a(z.o("bid_token_get_response", "result", "failure", "reason", "bid_token_fetch_failed"));
            if (jCurrentTimeMillis2 >= 1000) {
                cVar.a(z.o("bid_token_duration_crossed_1s", "result", "failure", "reason", "bid_token_fetch_failed"));
            }
            if (jCurrentTimeMillis2 >= 3000) {
                cVar.a(z.o("bid_token_duration_crossed_3s", "result", "failure", "reason", "bid_token_fetch_failed"));
            }
            errorType = MolocoAdError.ErrorType.AD_SIGNAL_COLLECTION_FAILED;
        } else {
            com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("bid_token_get_response");
            eVar.a("result", "success");
            cVar.a(eVar);
            if (jCurrentTimeMillis2 >= 1000) {
                com.moloco.sdk.acm.e eVar2 = new com.moloco.sdk.acm.e("bid_token_duration_crossed_1s");
                eVar2.a("result", "success");
                cVar.a(eVar2);
            }
            if (jCurrentTimeMillis2 >= 3000) {
                com.moloco.sdk.acm.e eVar3 = new com.moloco.sdk.acm.e("bid_token_duration_crossed_3s");
                eVar3.a("result", "success");
                cVar.a(eVar3);
            }
        }
        StringBuilder sb = new StringBuilder("Returning bid token result, hasError: ");
        sb.append(errorType != null);
        sb.append(", SDK init complete: ");
        sb.append(Moloco.isInitialized());
        MolocoLogger.info$default(molocoLogger, "BidTokenHandlerImpl", sb.toString(), null, false, 12, null);
        molocoBidTokenListener2.onBidTokenResult(str, errorType);
        return az2Var;
    }

    public j(n nVar, l1 l1Var, com.moloco.sdk.internal.services.h hVar) {
        nVar.getClass();
        l1Var.getClass();
        hVar.getClass();
        this.a = nVar;
        this.b = l1Var;
        this.c = hVar;
    }
}
