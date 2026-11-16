package io.p071bidmachine;

import io.p071bidmachine.core.j;
import io.p071bidmachine.utils.task.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o0 implements ExpirationHandler.TaskScheduler {
    @Override // io.bidmachine.ExpirationHandler.TaskScheduler
    public final void cancelTask(b bVar) {
        bVar.a.set(true);
        j.b.removeCallbacks(bVar);
    }

    @Override // io.bidmachine.ExpirationHandler.TaskScheduler
    public final void scheduleTask(b bVar, long j) {
        bVar.a.set(false);
        j.b.postDelayed(bVar, j);
    }
}
