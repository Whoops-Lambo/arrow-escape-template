package com.inmobi.media;

import defpackage.fy;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class R0 extends fy {
    public wr0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ T0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(T0 t0, fy fyVar) {
        super(fyVar);
        this.c = t0;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((wr0) null, this);
    }
}
