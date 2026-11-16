package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ei4;
import defpackage.nu4;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzfqn {
    public static final nu4 d = nu4.b;
    public final zzher a;
    public final ScheduledExecutorService b;
    public final ei4 c;

    public abstract String b(Object obj);

    public zzfqn(zzher zzherVar, ScheduledExecutorService scheduledExecutorService, ei4 ei4Var) {
        this.a = zzherVar;
        this.b = scheduledExecutorService;
        this.c = ei4Var;
    }

    public final zzfqm a(ListenableFuture listenableFuture, Object obj) {
        return new zzfqm(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture);
    }
}
