package io.p071bidmachine.util.download;

import defpackage.dz;
import defpackage.fy;
import defpackage.k52;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ j s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, fy fyVar) {
        super(fyVar);
        this.s = jVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objB = this.s.b(null, null, this);
        return objB == dz.a ? objB : new k52(objB);
    }
}
