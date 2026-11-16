package com.moloco.sdk.internal.services;

import defpackage.dy;
import defpackage.fy;
import defpackage.lp1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class w extends fy {
    public x r;
    public lp1 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ x u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, dy dyVar) {
        super(dyVar);
        this.u = xVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, null, null, null, this);
    }
}
