package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzghl implements zzghg {
    public final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.zzghg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzghg
    public final void a(long j, Runnable runnable) {
        this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
