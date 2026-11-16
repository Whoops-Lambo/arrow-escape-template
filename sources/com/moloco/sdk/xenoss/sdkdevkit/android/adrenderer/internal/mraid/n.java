package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.wz2;
import defpackage.yx2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements cp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;

    public /* synthetic */ n(cp0 cp0Var, int i) {
        this.a = i;
        this.b = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        m mVar;
        Object obj2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar;
        boolean z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.w wVar;
        int i = this.a;
        az2 az2Var = az2.a;
        cp0 cp0Var = this.b;
        dz dzVar = dz.a;
        switch (i) {
            case 0:
                if (dyVar instanceof m) {
                    mVar = (m) dyVar;
                    int i2 = mVar.s;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        mVar.s = i2 - Integer.MIN_VALUE;
                    } else {
                        mVar = new m(this, dyVar);
                    }
                } else {
                    mVar = new m(this, dyVar);
                }
                Object obj3 = mVar.r;
                int i3 = mVar.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        wz2.a0(obj3);
                        return az2Var;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj3);
                y yVar = (y) obj;
                obj2 = yVar instanceof x ? (x) yVar : null;
                if (obj2 == null) {
                    return az2Var;
                }
                mVar.s = 1;
                return cp0Var.emit(obj2, mVar) == dzVar ? dzVar : az2Var;
            case 1:
                if (dyVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l) {
                    lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l) dyVar;
                    int i4 = lVar.s;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        lVar.s = i4 - Integer.MIN_VALUE;
                    } else {
                        lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l(this, dyVar);
                    }
                } else {
                    lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l(this, dyVar);
                }
                Object obj4 = lVar.r;
                int i5 = lVar.s;
                if (i5 == 0) {
                    wz2.a0(obj4);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y yVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.y) obj;
                    if (yVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) {
                        z = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) yVar2).a.m;
                    } else if (yVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) {
                        z = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) yVar2).a.w;
                    } else if ((yVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) || (yVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x) || yVar2 == null) {
                        z = false;
                    } else {
                        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    lVar.s = 1;
                    return cp0Var.emit(boolValueOf, lVar) == dzVar ? dzVar : az2Var;
                }
                if (i5 == 1) {
                    wz2.a0(obj4);
                    return az2Var;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (dyVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h) {
                    hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h) dyVar;
                    int i6 = hVar.s;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        hVar.s = i6 - Integer.MIN_VALUE;
                    } else {
                        hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h(this, dyVar);
                    }
                } else {
                    hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h(this, dyVar);
                }
                Object obj5 = hVar.r;
                int i7 = hVar.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        wz2.a0(obj5);
                        return az2Var;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj5);
                int i8 = ((yx2) obj).a;
                Object dVar = i8 == 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c.a : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d(i8);
                hVar.s = 1;
                return cp0Var.emit(dVar, hVar) == dzVar ? dzVar : az2Var;
            default:
                if (dyVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.w) {
                    wVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.w) dyVar;
                    int i9 = wVar.s;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        wVar.s = i9 - Integer.MIN_VALUE;
                    } else {
                        wVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.w(this, dyVar);
                    }
                } else {
                    wVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.w(this, dyVar);
                }
                Object obj6 = wVar.r;
                int i10 = wVar.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        wz2.a0(obj6);
                        return az2Var;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj6);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t tVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t) obj;
                obj2 = tVar != null ? tVar.a : null;
                wVar.s = 1;
                return cp0Var.emit(obj2, wVar) == dzVar ? dzVar : az2Var;
        }
    }
}
