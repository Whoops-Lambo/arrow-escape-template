package com.moloco.sdk.internal.publisher;

import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c1 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ c1(h1 h1Var, int i) {
        this.a = i;
        this.b = h1Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        h1 h1Var = this.b;
        switch (i) {
            case 0:
                return h1Var.c();
            case 1:
                return (com.moloco.sdk.internal.ortb.model.h) h1Var.h.c;
            case 2:
                return (f0) h1Var.h.d;
            default:
                return h1Var.c();
        }
    }
}
