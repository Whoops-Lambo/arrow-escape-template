package com.moloco.sdk.internal;

import defpackage.az2;
import defpackage.cp0;
import defpackage.dy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b0 implements cp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ b0(d0 d0Var, int i) {
        this.a = i;
        this.b = d0Var;
    }

    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        int i = this.a;
        az2 az2Var = az2.a;
        d0 d0Var = this.b;
        switch (i) {
            case 0:
                d0Var.g = ((Boolean) obj).booleanValue();
                d0.b(d0Var);
                break;
            default:
                d0Var.h = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s) obj;
                d0.b(d0Var);
                break;
        }
        return az2Var;
    }
}
