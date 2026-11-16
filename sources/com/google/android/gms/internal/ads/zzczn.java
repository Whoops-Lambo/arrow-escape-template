package com.google.android.gms.internal.ads;

import defpackage.o24;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzczn {
    public final Executor a;
    public final ScheduledExecutorService b;
    public volatile boolean c = true;

    public zzczn(o24 o24Var, ScheduledExecutorService scheduledExecutorService, zzfqc zzfqcVar) {
        this.a = o24Var;
        this.b = scheduledExecutorService;
    }
}
