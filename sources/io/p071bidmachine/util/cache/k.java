package io.p071bidmachine.util.cache;

import defpackage.dz;
import defpackage.fy;
import defpackage.k52;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ n s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, fy fyVar) {
        super(fyVar);
        this.s = nVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objE = this.s.e(null, this);
        return objE == dz.a ? objE : new k52(objE);
    }
}
