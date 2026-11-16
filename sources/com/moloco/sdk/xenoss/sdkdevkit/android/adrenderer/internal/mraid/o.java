package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import defpackage.az2;
import defpackage.bp0;
import defpackage.cp0;
import defpackage.dy;
import defpackage.dz;
import defpackage.ue2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class o implements bp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp0 b;

    public /* synthetic */ o(ue2 ue2Var, int i) {
        this.a = i;
        this.b = ue2Var;
    }

    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) {
        int i = this.a;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        bp0 bp0Var = this.b;
        switch (i) {
            case 0:
                Object objCollect = bp0Var.collect(new n(cp0Var, 0), dyVar);
                return objCollect == dzVar ? objCollect : az2Var;
            default:
                Object objCollect2 = bp0Var.collect(new n(cp0Var, 2), dyVar);
                return objCollect2 == dzVar ? objCollect2 : az2Var;
        }
    }
}
