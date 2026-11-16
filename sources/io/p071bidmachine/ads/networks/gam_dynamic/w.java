package io.p071bidmachine.ads.networks.gam_dynamic;

import io.p071bidmachine.core.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w {
    public static final int b = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
    public final ScheduledExecutorService a = Executors.newScheduledThreadPool(b);

    public final boolean a(long j, Runnable runnable) {
        try {
            this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            a.i(th);
            return false;
        }
    }
}
