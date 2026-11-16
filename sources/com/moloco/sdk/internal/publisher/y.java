package com.moloco.sdk.internal.publisher;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y extends fy {
    public String r;
    public /* synthetic */ Object s;
    public final /* synthetic */ c0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, fy fyVar) {
        super(fyVar);
        this.t = c0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return c0.b(this.t, null, this);
    }
}
