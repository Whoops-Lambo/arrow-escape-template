package com.inmobi.media;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class H7 extends fy {
    public /* synthetic */ Object a;
    public final /* synthetic */ P7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(P7 p7, fy fyVar) {
        super(fyVar);
        this.b = p7;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
