package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import defpackage.fy;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends fy {
    public UrlPostRequestWorker r;
    public Map s;
    public /* synthetic */ Object t;
    public final /* synthetic */ UrlPostRequestWorker u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UrlPostRequestWorker urlPostRequestWorker, fy fyVar) {
        super(fyVar);
        this.u = urlPostRequestWorker;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.doWork(this);
    }
}
