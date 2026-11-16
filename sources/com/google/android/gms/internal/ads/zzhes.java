package com.google.android.gms.internal.ads;

import defpackage.pu4;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface zzhes extends ScheduledExecutorService, zzher, AutoCloseable {
    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c */
    pu4 schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: h */
    pu4 scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: i */
    pu4 scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: o0 */
    pu4 schedule(Callable callable, long j, TimeUnit timeUnit);

    @Override // com.google.android.gms.internal.ads.zzher, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        boolean zIsTerminated;
        if (this != ForkJoinPool.commonPool() && !(zIsTerminated = isTerminated())) {
            shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
