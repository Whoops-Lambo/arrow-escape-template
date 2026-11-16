package com.moloco.sdk.internal.services;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b1;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.lp1;
import defpackage.n30;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class x implements v {
    public final a1 a;
    public final com.moloco.sdk.internal.services.events.c b;

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, lp1 lp1Var, dy dyVar) throws Throwable {
        w wVar;
        lp1 lp1Var2;
        x xVar = this;
        if (dyVar instanceof w) {
            wVar = (w) dyVar;
            int i = wVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.v = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(xVar, dyVar);
            }
        } else {
            wVar = new w(xVar, dyVar);
        }
        w wVar2 = wVar;
        Object objB = wVar2.t;
        int i2 = wVar2.v;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(objB);
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a;
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(cVar.a(aVar.e), cVar.a(aVar.f)), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(cVar.a(aVar.a), cVar.a(aVar.b)), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(cVar.a(aVar.d), cVar.a(aVar.c)), hVar.q());
            wVar2.r = xVar;
            lp1Var2 = lp1Var;
            wVar2.s = lp1Var2;
            wVar2.v = 1;
            objB = xVar.b.b(jCurrentTimeMillis, eVar, str, wVar2);
            if (objB != dzVar) {
            }
            return dzVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(objB);
                return az2Var;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lp1 lp1Var3 = wVar2.s;
        x xVar2 = wVar2.r;
        wz2.a0(objB);
        lp1Var2 = lp1Var3;
        xVar = xVar2;
        String str2 = (String) objB;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ClickthroughService", n30.y("Launching url: ", str2), false, 4, null);
        a1 a1Var = xVar.a;
        if (str2 == null) {
            str2 = "";
        }
        if (((b1) a1Var).a(str2) && lp1Var2 != null) {
            wVar2.r = null;
            wVar2.s = null;
            wVar2.v = 2;
            if (lp1Var2.emit(az2Var, wVar2) == dzVar) {
                return dzVar;
            }
        }
        return az2Var;
    }

    public x(a1 a1Var, com.moloco.sdk.internal.services.events.c cVar) {
        a1Var.getClass();
        cVar.getClass();
        this.a = a1Var;
        this.b = cVar;
    }
}
