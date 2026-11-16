package com.moloco.sdk.internal.services.bidtoken;

import defpackage.fy;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class m extends fy {
    public n r;
    public com.moloco.sdk.acm.recorder.b s;
    public Mutex t;
    public com.moloco.sdk.acm.i u;
    public String v;
    public /* synthetic */ Object w;
    public final /* synthetic */ n x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, fy fyVar) {
        super(fyVar);
        this.x = nVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(null, this);
    }
}
