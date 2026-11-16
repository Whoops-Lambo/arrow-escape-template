package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ar1;
import defpackage.az2;
import defpackage.ba0;
import defpackage.cp0;
import defpackage.cw0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.g9;
import defpackage.h50;
import defpackage.hh;
import defpackage.jd2;
import defpackage.k32;
import defpackage.kz1;
import defpackage.lz1;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.xi2;
import defpackage.yx2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class r0 implements cp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar, dy dyVar) throws Throwable {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e eVar2;
        r0 r0Var = this;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar3 = eVar;
        if (dyVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e) {
            eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e) dyVar;
            int i = eVar2.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar2.v = i - Integer.MIN_VALUE;
            } else {
                eVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e(r0Var, dyVar);
            }
        } else {
            eVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e(r0Var, dyVar);
        }
        Object obj = eVar2.t;
        int i2 = eVar2.v;
        int i3 = 1;
        dy dyVar2 = null;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Playlist item displaying event received: " + eVar3, null, false, 12, null);
                ba0 ba0Var = xc0.a;
                cw0 cw0Var = wg1.a;
                hh hhVar = new hh((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) r0Var.b, eVar3, dyVar2, 18);
                eVar2.r = r0Var;
                eVar2.s = eVar3;
                eVar2.v = 1;
                Object objE = tb5.E(cw0Var, hhVar, eVar2);
                dz dzVar = dz.a;
                if (objE == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e eVar4 = eVar2.s;
                r0 r0Var2 = eVar2.r;
                wz2.a0(obj);
                eVar3 = eVar4;
                r0Var = r0Var2;
            }
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb = new StringBuilder("Set playback: ");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) r0Var.b;
            jd2 jd2Var = (jd2) r0Var.c;
            sb.append(fVar.getSettings().getMediaPlaybackRequiresUserGesture());
            MolocoLogger.info$default(molocoLogger, "TemplateWebView", sb.toString(), null, false, 12, null);
            if (eVar3 == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e.MRAID) {
                MolocoLogger.info$default(molocoLogger, "TemplateWebView", "Playlist item displaying event is MRAID, setting orientation to: " + ((xi2) jd2Var.i).getValue(), null, false, 12, null);
                xi2 xi2Var = fVar.e;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x xVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x) ((xi2) jd2Var.i).getValue();
                xVar.getClass();
                int i4 = xVar.c;
                if (i4 == 0) {
                    throw null;
                }
                int i5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.z.a[h50.C(i4)];
                if (i5 != 1) {
                    i3 = 2;
                    if (i5 != 2) {
                        if (i5 != 3) {
                            throw new ar1();
                        }
                        i3 = 3;
                    }
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a(i3, xVar.b);
                xi2Var.getClass();
                xi2Var.k(null, aVar);
                jd2Var.a();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a) r0Var.d;
                if (aVar2 != null) {
                    tb5.t(fVar.d, null, null, new g9(aVar2, fVar, dyVar2, 26), 3);
                }
            } else {
                MolocoLogger.info$default(molocoLogger, "TemplateWebView", "Playlist item displaying event is not MRAID, setting orientation to none", null, false, 12, null);
                xi2 xi2Var2 = fVar.e;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a();
                xi2Var2.getClass();
                xi2Var2.k(null, aVar3);
            }
        } catch (Exception e) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Failed to access WebView settings", e, false, 8, null);
        }
        return az2.a;
    }

    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        switch (this.a) {
            case 0:
                int i = ((yx2) obj).a;
                ((k32) this.b).a = i;
                k32 k32Var = (k32) this.c;
                if (i != k32Var.a) {
                    k32Var.a = i;
                    lz1 lz1Var = (lz1) this.d;
                    Object objH = ((kz1) lz1Var).d.h(dyVar, new yx2(i));
                    if (objH == dz.a) {
                        return objH;
                    }
                }
                return az2.a;
            default:
                return a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e) obj, dyVar);
        }
    }
}
