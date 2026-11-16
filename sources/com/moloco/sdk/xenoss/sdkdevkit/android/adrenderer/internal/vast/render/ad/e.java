package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e0;
import defpackage.az2;
import defpackage.cp0;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.m32;
import defpackage.s71;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements cp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        j jVar;
        int i = this.a;
        az2 az2Var = az2.a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) obj;
                m32 m32Var = (m32) obj2;
                if ((m32Var.a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d) && (fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c)) {
                    ((n) pVar).f(b.h);
                }
                m32Var.a = fVar;
                return az2Var;
            case 1:
                if (dyVar instanceof j) {
                    jVar = (j) dyVar;
                    int i2 = jVar.s;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        jVar.s = i2 - Integer.MIN_VALUE;
                    } else {
                        jVar = new j(this, dyVar);
                    }
                } else {
                    jVar = new j(this, dyVar);
                }
                Object obj3 = jVar.r;
                int i3 = jVar.s;
                Object rVar = null;
                if (i3 == 0) {
                    wz2.a0(obj3);
                    cp0 cp0Var = (cp0) obj2;
                    y yVar = (y) obj;
                    boolean zB = s71.b(du.i0(((n) pVar).a), yVar);
                    if (yVar instanceof u) {
                        rVar = new o(((u) yVar).a, zB);
                    } else if (yVar instanceof w) {
                        rVar = new q(((w) yVar).a, zB);
                    } else if (yVar instanceof v) {
                        rVar = new p(((v) yVar).a, zB);
                    } else if (yVar instanceof x) {
                        rVar = new r(((x) yVar).a, zB);
                    } else if (yVar != null) {
                        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    }
                    jVar.s = 1;
                    Object objEmit = cp0Var.emit(rVar, jVar);
                    dz dzVar = dz.a;
                    return objEmit == dzVar ? dzVar : az2Var;
                }
                if (i3 == 1) {
                    wz2.a0(obj3);
                    return az2Var;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b) obj2;
                bVar.q = bool;
                if (zBooleanValue) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g) pVar;
                    e0 e0Var = bVar.f;
                    if (e0Var != null) {
                        gVar.seekTo(((Number) e0Var.invoke()).longValue());
                    }
                }
                bVar.a();
                return az2Var;
        }
    }
}
