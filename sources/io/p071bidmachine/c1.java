package io.p071bidmachine;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends ThreadPoolExecutor implements AutoCloseable {
    public static volatile c1 b;
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, int i3) {
        super(i, i2, j, timeUnit, blockingQueue);
        this.a = i3;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        switch (this.a) {
            case 0:
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
                break;
            default:
                if (this != ForkJoinPool.commonPool() && !(zIsTerminated2 = isTerminated())) {
                    shutdown();
                    boolean z2 = false;
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z2) {
                                shutdownNow();
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
        }
    }
}
