package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.az2;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.moloco.sdk.internal.publisher.e1 b;

    public /* synthetic */ a(com.moloco.sdk.internal.publisher.e1 e1Var, int i) {
        this.a = i;
        this.b = e1Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        az2 az2Var = az2.a;
        com.moloco.sdk.internal.publisher.e1 e1Var = this.b;
        switch (i) {
            case 0:
                e1Var.c();
                break;
            case 1:
                e1Var.b();
                break;
            default:
                e1Var.b();
                break;
        }
        return az2Var;
    }
}
