package com.moloco.sdk.internal.publisher;

import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m0 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ m0(v0 v0Var, int i) {
        this.a = i;
        this.b = v0Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        v0 v0Var = this.b;
        switch (i) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar = v0Var.t.a;
                if (fVar != null) {
                    return fVar.getCreativeType();
                }
                return null;
            case 1:
                return v0Var.t.b;
            case 2:
                return v0Var.t.c;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar2 = v0Var.t.a;
                if (fVar2 != null) {
                    return fVar2.getCreativeType();
                }
                return null;
        }
    }
}
