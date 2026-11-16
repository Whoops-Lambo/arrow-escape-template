package com.ironsource;

import defpackage.e80;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.oe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4907oe extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public /* synthetic */ C4907oe(int i, ThreadFactory threadFactory, int i2, e80 e80Var) {
        this((i2 & 1) != 0 ? C4925pe.a : i, (i2 & 2) != 0 ? new ThreadFactoryC4867ma() : threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(@Nullable Runnable runnable, @Nullable Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e) {
                C4950r4.d().a(e);
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                C4950r4.d().a(e2);
            } catch (ExecutionException e3) {
                C4950r4.d().a(e3);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
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

    public C4907oe() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4907oe(int i, @NotNull ThreadFactory threadFactory) {
        super(i, threadFactory);
        threadFactory.getClass();
    }
}
