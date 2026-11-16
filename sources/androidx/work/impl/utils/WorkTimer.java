package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.DefaultRunnableScheduler;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public class WorkTimer {
    public static final String e = Logger.g("WorkTimer");
    public final RunnableScheduler a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public interface TimeLimitExceededListener {
        void b(WorkGenerationalId workGenerationalId);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class WorkTimerRunnable implements Runnable {
        public final WorkTimer a;
        public final WorkGenerationalId b;

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.a.d) {
                try {
                    if (((WorkTimerRunnable) this.a.b.remove(this.b)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.a.c.remove(this.b);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.b(this.b);
                        }
                    } else {
                        Logger.e().a("WrkTimerRunnable", "Timer with " + this.b + " is already marked as complete.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public WorkTimerRunnable(WorkTimer workTimer, WorkGenerationalId workGenerationalId) {
            this.a = workTimer;
            this.b = workGenerationalId;
        }
    }

    public final void a(WorkGenerationalId workGenerationalId) {
        synchronized (this.d) {
            try {
                if (((WorkTimerRunnable) this.b.remove(workGenerationalId)) != null) {
                    Logger.e().a(e, "Stopping timer for " + workGenerationalId);
                    this.c.remove(workGenerationalId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WorkTimer(DefaultRunnableScheduler defaultRunnableScheduler) {
        this.a = defaultRunnableScheduler;
    }
}
