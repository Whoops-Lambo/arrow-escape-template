package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RestrictTo
public interface TaskExecutor {
    Executor b();

    SerialExecutorImpl c();

    default void a(Runnable runnable) {
        c().execute(runnable);
    }
}
