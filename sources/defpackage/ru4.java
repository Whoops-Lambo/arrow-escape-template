package defpackage;

import com.google.android.gms.internal.ads.zzhes;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ru4 extends o24 implements zzhes {
    public final ScheduledExecutorService c;

    @Override // com.google.android.gms.internal.ads.zzhes, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final pu4 scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        qu4 qu4Var = new qu4(runnable);
        return new pu4(qu4Var, this.c.scheduleWithFixedDelay(qu4Var, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhes, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final pu4 scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        qu4 qu4Var = new qu4(runnable);
        return new pu4(qu4Var, this.c.scheduleAtFixedRate(qu4Var, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhes, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final pu4 schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        xu4 xu4Var = new xu4(Executors.callable(runnable, null));
        return new pu4(xu4Var, this.c.schedule(xu4Var, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhes, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final pu4 schedule(Callable callable, long j, TimeUnit timeUnit) {
        xu4 xu4Var = new xu4(callable);
        return new pu4(xu4Var, this.c.schedule(xu4Var, j, timeUnit));
    }

    public ru4(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.c = scheduledExecutorService;
    }
}
