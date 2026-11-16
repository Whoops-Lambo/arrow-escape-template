package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.ba0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fy;
import defpackage.i9;
import defpackage.n30;
import defpackage.vi2;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.xe0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u {
    public final vi2 a;
    public final com.moloco.sdk.internal.services.h b;
    public final w c;
    public final wr0 d;
    public final ba0 e;

    public static final MolocoAdError.AdCreateError a(u uVar, String str, String str2, com.moloco.sdk.acm.i iVar, b1 b1Var, com.moloco.sdk.acm.recorder.c cVar) {
        com.moloco.sdk.acm.e eVarO = com.explorestack.protobuf.z.o("create_ad", "result", "failure", "initial_sdk_init_state", str2);
        eVarO.a("ad_type", b1Var.name());
        Initialization initialization = (Initialization) uVar.a.getValue();
        int i = initialization == null ? -1 : k.a[initialization.ordinal()];
        if (i == -1) {
            com.moloco.sdk.internal.error.b bVarB = com.moloco.sdk.service_locator.b.b();
            StringBuilder sb = new StringBuilder("CREATE_");
            String upperCase = b1Var.name().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append(upperCase);
            sb.append("_AD_FAILED_SDK_INIT_NOT_COMPLETED");
            bVarB.a(sb.toString(), new com.moloco.sdk.internal.error.a(null));
            iVar.a("result", "failure");
            iVar.a("reason", "sdk_init_not_completed");
            cVar.b(iVar);
            eVarO.a("reason", "sdk_init_not_completed");
            cVar.a(eVarO);
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i == 1) {
            com.moloco.sdk.service_locator.b.b().a("UNABLE_TO_CREATE_AD", new com.moloco.sdk.internal.error.a(null));
            iVar.a("result", "failure");
            iVar.a("reason", "unable_to_create_ad");
            cVar.b(iVar);
            eVarO.a("reason", "unable_to_create_ad");
            cVar.a(eVarO);
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", n30.y("Could not find the adUnitId that was requested for load: ", str), null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i != 2) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }
        com.moloco.sdk.internal.error.b bVarB2 = com.moloco.sdk.service_locator.b.b();
        StringBuilder sb2 = new StringBuilder("CREATE_");
        String upperCase2 = b1Var.name().toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        sb2.append(upperCase2);
        sb2.append("_AD_FAILED_SDK_INIT_FAILED");
        bVarB2.a(sb2.toString(), new com.moloco.sdk.internal.error.a(null));
        iVar.a("result", "failure");
        iVar.a("reason", "sdk_init_failed");
        cVar.b(iVar);
        eVarO.a("reason", "sdk_init_failed");
        cVar.a(eVarO);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "AdCreator", "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
        return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object b(u uVar, wr0 wr0Var, b1 b1Var, com.moloco.sdk.acm.recorder.c cVar, fy fyVar) {
        l lVar;
        com.moloco.sdk.acm.i iVar;
        b1 b1Var2 = b1Var;
        com.moloco.sdk.acm.recorder.c cVar2 = cVar;
        w wVar = uVar.c;
        if (fyVar instanceof l) {
            lVar = (l) fyVar;
            int i = lVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.w = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(uVar, fyVar);
            }
        } else {
            lVar = new l(uVar, fyVar);
        }
        Object obj = lVar.u;
        int i2 = lVar.w;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(obj);
            com.moloco.sdk.acm.i iVarC = cVar2.c("create_ad_await_ad_factory_time_ms");
            xe0 xe0Var = (xe0) wVar.a.get(b1Var2);
            long j = xe0Var != null ? xe0Var.a : wVar.b;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Waiting for AdFactory with timeout: " + ((Object) xe0.k(j)), null, false, 12, null);
            i9 i9Var = new i9(wr0Var, dyVar, 8);
            lVar.r = b1Var2;
            lVar.s = cVar2;
            lVar.t = iVarC;
            lVar.w = 1;
            Object objO = ep0.O(j, i9Var, lVar);
            dz dzVar = dz.a;
            if (objO == dzVar) {
                return dzVar;
            }
            iVar = iVarC;
            obj = objO;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            com.moloco.sdk.acm.i iVar2 = lVar.t;
            cVar2 = lVar.s;
            b1 b1Var3 = lVar.r;
            wz2.a0(obj);
            iVar = iVar2;
            b1Var2 = b1Var3;
        }
        com.moloco.sdk.internal.h hVar = (com.moloco.sdk.internal.h) obj;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("AdFactory received: ");
        sb.append(hVar != null);
        MolocoLogger.info$default(molocoLogger, "AdCreator", sb.toString(), null, false, 12, null);
        iVar.a("ad_type", b1Var2.name());
        iVar.a("result", hVar != null ? "success" : "failure");
        cVar2.b(iVar);
        return obj;
    }

    public static final String c(u uVar) {
        String strName;
        Initialization initialization = (Initialization) uVar.a.getValue();
        if (initialization == null || (strName = initialization.name()) == null) {
            return "not_invoked_or_in_progress";
        }
        String lowerCase = strName.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public u(vi2 vi2Var, com.moloco.sdk.internal.services.h hVar, w wVar, wr0 wr0Var) {
        vi2Var.getClass();
        hVar.getClass();
        this.a = vi2Var;
        this.b = hVar;
        this.c = wVar;
        this.d = wr0Var;
        this.e = xc0.a;
    }
}
