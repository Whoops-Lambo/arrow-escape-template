package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import defpackage.bp0;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.xi2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m implements bp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi2 b;

    public /* synthetic */ m(xi2 xi2Var, int i) {
        this.a = i;
        this.b = xi2Var;
    }

    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) throws Throwable {
        int i = this.a;
        dz dzVar = dz.a;
        xi2 xi2Var = this.b;
        switch (i) {
            case 0:
                xi2Var.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n(cp0Var, 1), dyVar);
                break;
            default:
                xi2Var.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n(cp0Var, 3), dyVar);
                break;
        }
        return dzVar;
    }
}
