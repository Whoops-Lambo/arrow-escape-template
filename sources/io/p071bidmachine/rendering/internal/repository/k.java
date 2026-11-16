package io.p071bidmachine.rendering.internal.repository;

import defpackage.dz;
import defpackage.fy;
import defpackage.k52;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ m s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, fy fyVar) {
        super(fyVar);
        this.s = mVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objG = this.s.g(null, null, this);
        return objG == dz.a ? objG : new k52(objG);
    }
}
