package com.google.android.gms.internal.ads;

import defpackage.jj3;
import defpackage.o24;
import defpackage.ru4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfpf implements zzipf {
    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new jj3(3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        if (executorServiceUnconfigurableExecutorService instanceof zzher) {
            return (zzher) executorServiceUnconfigurableExecutorService;
        }
        return executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new ru4((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new o24(executorServiceUnconfigurableExecutorService);
    }
}
