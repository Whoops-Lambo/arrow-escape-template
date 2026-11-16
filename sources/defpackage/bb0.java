package defpackage;

import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WorkTimer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DelayMetCommandHandler b;

    public /* synthetic */ bb0(DelayMetCommandHandler delayMetCommandHandler, int i) {
        this.a = i;
        this.b = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DelayMetCommandHandler delayMetCommandHandler = this.b;
        switch (i) {
            case 0:
                DelayMetCommandHandler.c(delayMetCommandHandler);
                return;
            default:
                if (delayMetCommandHandler.g != 0) {
                    Logger.e().a(DelayMetCommandHandler.m, "Already started work for " + delayMetCommandHandler.c);
                    return;
                }
                delayMetCommandHandler.g = 1;
                Logger.e().a(DelayMetCommandHandler.m, "onAllConstraintsMet for " + delayMetCommandHandler.c);
                if (!delayMetCommandHandler.d.d.g(delayMetCommandHandler.l, null)) {
                    delayMetCommandHandler.d();
                    return;
                }
                WorkTimer workTimer = delayMetCommandHandler.d.c;
                WorkGenerationalId workGenerationalId = delayMetCommandHandler.c;
                synchronized (workTimer.d) {
                    Logger.e().a(WorkTimer.e, "Starting timer for " + workGenerationalId);
                    workTimer.a(workGenerationalId);
                    WorkTimer.WorkTimerRunnable workTimerRunnable = new WorkTimer.WorkTimerRunnable(workTimer, workGenerationalId);
                    workTimer.b.put(workGenerationalId, workTimerRunnable);
                    workTimer.c.put(workGenerationalId, delayMetCommandHandler);
                    workTimer.a.b(600000L, workTimerRunnable);
                    break;
                }
                return;
        }
    }
}
