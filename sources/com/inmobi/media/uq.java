package com.inmobi.media;

import defpackage.fy;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class uq extends fy {
    public String a;
    public Y9 b;
    public Map c;
    public String d;
    public Of e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ xq h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(xq xqVar, fy fyVar) {
        super(fyVar);
        this.h = xqVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
