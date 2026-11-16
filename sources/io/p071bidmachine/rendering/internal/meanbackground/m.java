package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.fy;
import defpackage.sy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m extends fy {
    public o r;
    public sy s;
    public /* synthetic */ Object t;
    public final /* synthetic */ o u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, fy fyVar) {
        super(fyVar);
        this.u = oVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(null, this);
    }
}
