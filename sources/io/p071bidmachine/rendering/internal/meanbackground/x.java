package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class x extends fy {
    public y r;
    public String s;
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ y v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, fy fyVar) {
        super(fyVar);
        this.v = yVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, null, this);
    }
}
