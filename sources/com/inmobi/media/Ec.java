package com.inmobi.media;

import defpackage.fy;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ec extends fy {
    public Iterator a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Jc d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(Jc jc, fy fyVar) {
        super(fyVar);
        this.d = jc;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((C4325qc) null, this);
    }
}
