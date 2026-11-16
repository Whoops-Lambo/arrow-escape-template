package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.צּ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1193 extends ThreadPoolExecutor implements InterfaceC0672, AutoCloseable {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1168 f3596;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0752 f3597;

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0672
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo359() {
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1193(C1168 c1168, ThreadPoolExecutor threadPoolExecutor, C0752 c0752) {
        this.f3596 = c1168;
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
        this.f3597 = c0752;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3596.m519(this, this.f3597, StringFog.decrypt("OMrfB2ef/T8D+skacIrhKAmm/wdnn/0/CQ==\n", "bIiafwL8iEs=\n"), runnable);
        super.execute(runnable);
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
}
