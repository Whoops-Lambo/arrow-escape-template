package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RestrictTo
public class WorkManagerTaskExecutor implements TaskExecutor {
    public final SerialExecutorImpl a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.b.post(runnable);
        }
    };

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final Executor b() {
        return this.c;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final SerialExecutorImpl c() {
        return this.a;
    }

    public WorkManagerTaskExecutor(ExecutorService executorService) {
        this.a = new SerialExecutorImpl(executorService);
    }
}
