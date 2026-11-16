package io.p071bidmachine.nativead.tasks;

import defpackage.dz;
import defpackage.fy;
import defpackage.k52;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ h s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, fy fyVar) {
        super(fyVar);
        this.s = hVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objA = this.s.a(this);
        return objA == dz.a ? objA : new k52(objA);
    }
}
