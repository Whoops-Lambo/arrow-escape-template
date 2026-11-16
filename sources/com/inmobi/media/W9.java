package com.inmobi.media;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class W9 extends fy {
    public X9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ X9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W9(X9 x9, fy fyVar) {
        super(fyVar);
        this.c = x9;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
