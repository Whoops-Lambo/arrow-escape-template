package io.p071bidmachine;

import androidx.annotation.NonNull;
import io.p071bidmachine.utils.task.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ExpirationHandler {
    private final long expirationTimeMs;

    @NonNull
    private final p0 expiredTask;

    @NonNull
    private final AtomicBoolean isExpireTrackerSubscribed;

    @NonNull
    private final TaskScheduler taskScheduler;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Listener {
        void onExpired();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface TaskScheduler {
        void cancelTask(@NonNull b bVar);

        void scheduleTask(@NonNull b bVar, long j);
    }

    @NonNull
    public TaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    public void start() {
        if (this.expirationTimeMs <= 0 || !this.isExpireTrackerSubscribed.compareAndSet(false, true)) {
            return;
        }
        this.taskScheduler.scheduleTask(this.expiredTask, this.expirationTimeMs);
    }

    public void stop() {
        this.isExpireTrackerSubscribed.set(false);
        this.taskScheduler.cancelTask(this.expiredTask);
    }

    public ExpirationHandler(long j, @NonNull Listener listener, @NonNull TaskScheduler taskScheduler) {
        this.expiredTask = new p0(listener);
        this.expirationTimeMs = j;
        this.taskScheduler = taskScheduler;
        this.isExpireTrackerSubscribed = new AtomicBoolean(false);
    }

    public ExpirationHandler(long j, @NonNull Listener listener) {
        this(j, listener, new o0());
    }
}
