package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.b64;
import defpackage.o24;
import defpackage.uy3;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewb implements zzfdv {
    public final ListenableFuture a;
    public final Executor b;
    public final ScheduledExecutorService c;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        b64 b64Var = b64.i;
        ListenableFuture listenableFuture = this.a;
        Executor executor = this.b;
        ListenableFuture listenableFutureH = zzheh.h(listenableFuture, b64Var, executor);
        uy3 uy3Var = zzbjr.re;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).intValue() > 0) {
            listenableFutureH = zzheh.g(listenableFutureH, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).intValue(), TimeUnit.MILLISECONDS, this.c);
        }
        return zzheh.f(listenableFutureH, Throwable.class, b64.h, executor);
    }

    public zzewb(ListenableFuture listenableFuture, o24 o24Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = listenableFuture;
        this.b = o24Var;
        this.c = scheduledExecutorService;
    }
}
