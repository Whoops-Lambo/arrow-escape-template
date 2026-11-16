package com.moloco.sdk.internal.error.crash.delivery;

import defpackage.fy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends fy {
    public CrashReportUploadWorker r;
    public String s;
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ CrashReportUploadWorker v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CrashReportUploadWorker crashReportUploadWorker, fy fyVar) {
        super(fyVar);
        this.v = crashReportUploadWorker;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}
