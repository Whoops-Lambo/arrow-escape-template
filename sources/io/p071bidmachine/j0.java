package io.p071bidmachine;

import io.p071bidmachine.utils.task.b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements ExpirationHandler.TaskScheduler {
    @Override // io.bidmachine.ExpirationHandler.TaskScheduler
    public final void scheduleTask(b bVar, long j) {
        BidTokenTaskManager.schedule(bVar, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.bidmachine.ExpirationHandler.TaskScheduler
    public final void cancelTask(b bVar) {
        BidTokenTaskManager.cancel(bVar);
    }
}
