package com.moloco.sdk.internal.error.crash;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends fy {
    public j r;
    public com.moloco.sdk.internal.configs.a s;
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, fy fyVar) {
        super(fyVar);
        this.v = jVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
