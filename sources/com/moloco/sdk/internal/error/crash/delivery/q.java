package com.moloco.sdk.internal.error.crash.delivery;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q extends fy {
    public r r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ r u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, fy fyVar) {
        super(fyVar);
        this.u = rVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(0L, null, this);
    }
}
