package com.moloco.sdk.internal.publisher;

import defpackage.az2;
import defpackage.wr0;
import defpackage.xe0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ l0(v0 v0Var, int i) {
        this.a = i;
        this.b = v0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        v0 v0Var = this.b;
        switch (i) {
            case 0:
                ((Long) obj).getClass();
                return new xe0(v0Var.i.a());
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar.getClass();
                v0Var.u.a(dVar);
                return az2.a;
        }
    }
}
