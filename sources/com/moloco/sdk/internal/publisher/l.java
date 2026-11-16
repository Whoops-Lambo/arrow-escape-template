package com.moloco.sdk.internal.publisher;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l extends fy {
    public b1 r;
    public com.moloco.sdk.acm.recorder.c s;
    public com.moloco.sdk.acm.i t;
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar, fy fyVar) {
        super(fyVar);
        this.v = uVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return u.b(this.v, null, null, null, this);
    }
}
