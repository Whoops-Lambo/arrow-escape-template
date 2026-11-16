package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a04;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfch implements zzfdv {
    public final zzfdv a;
    public final long b;
    public final ScheduledExecutorService c;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = this.a.zza();
        TimeUnit timeUnit = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.m3)).booleanValue() ? TimeUnit.MICROSECONDS : TimeUnit.MILLISECONDS;
        long j = this.b;
        if (j > 0) {
            listenableFutureZza = zzheh.g(listenableFutureZza, j, timeUnit, this.c);
        }
        return zzheh.f(listenableFutureZza, Throwable.class, new a04(this, 8), zzcgv.h);
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return this.a.zzb();
    }

    public zzfch(zzfdv zzfdvVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = zzfdvVar;
        this.b = j;
        this.c = scheduledExecutorService;
    }
}
