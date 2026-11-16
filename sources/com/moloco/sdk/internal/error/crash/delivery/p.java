package com.moloco.sdk.internal.error.crash.delivery;

import defpackage.fy;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class p extends fy {
    public int A;
    public r r;
    public String s;
    public List t;
    public List u;
    public Iterator v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, fy fyVar) {
        super(fyVar);
        this.z = rVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, this);
    }
}
