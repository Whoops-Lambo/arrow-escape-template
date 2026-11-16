package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.publisher.MolocoBidTokenListener;
import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i extends fy {
    public j r;
    public com.moloco.sdk.acm.recorder.c s;
    public MolocoBidTokenListener t;
    public long u;
    public /* synthetic */ Object v;
    public final /* synthetic */ j w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, fy fyVar) {
        super(fyVar);
        this.w = jVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, null, null, this);
    }
}
