package com.moloco.sdk.internal.services.bidtoken;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w extends fy {
    public x r;
    public Object s;
    public l t;
    public com.moloco.sdk.acm.i u;
    public boolean v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ x y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, fy fyVar) {
        super(fyVar);
        this.y = xVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, null, false, false, this);
    }
}
