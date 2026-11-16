package com.moloco.sdk.internal.services.init;

import defpackage.fy;
import defpackage.m32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class l extends fy {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ n C;
    public int D;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public m32 v;
    public m32 w;
    public boolean x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, fy fyVar) {
        super(fyVar);
        this.C = nVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, null, null, false, this);
    }
}
