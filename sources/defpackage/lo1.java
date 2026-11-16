package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lo1 extends io1 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ko1 ko1Var = new ko1(runnable);
        return new jo1(ko1Var, this.b.scheduleAtFixedRate(ko1Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ko1 ko1Var = new ko1(runnable);
        return new jo1(ko1Var, this.b.scheduleWithFixedDelay(ko1Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        rr2 rr2Var = new rr2(Executors.callable(runnable, null));
        return new jo1(rr2Var, this.b.schedule(rr2Var, j, timeUnit));
    }

    public lo1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        rr2 rr2Var = new rr2(callable);
        return new jo1(rr2Var, this.b.schedule(rr2Var, j, timeUnit));
    }
}
