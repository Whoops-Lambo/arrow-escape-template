package com.moloco.sdk.acm.eventprocessing;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends fy {
    public DBRequestWorker r;
    public /* synthetic */ Object s;
    public final /* synthetic */ DBRequestWorker t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DBRequestWorker dBRequestWorker, fy fyVar) {
        super(fyVar);
        this.t = dBRequestWorker;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.doWork(this);
    }
}
