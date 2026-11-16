package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Worker extends ListenableWorker {
    SettableFuture<ListenableWorker.Result> mFuture;

    public abstract ListenableWorker.Result doWork();

    @NonNull
    @WorkerThread
    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public ListenableFuture getForegroundInfoAsync() {
        final SettableFuture settableFuture = new SettableFuture();
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.Worker.2
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture2 = settableFuture;
                try {
                    settableFuture2.i(Worker.this.getForegroundInfo());
                } catch (Throwable th) {
                    settableFuture2.j(th);
                }
            }
        });
        return settableFuture;
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final ListenableFuture startWork() {
        this.mFuture = new SettableFuture<>();
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.Worker.1
            @Override // java.lang.Runnable
            public final void run() {
                Worker worker = Worker.this;
                try {
                    worker.mFuture.i(worker.doWork());
                } catch (Throwable th) {
                    worker.mFuture.j(th);
                }
            }
        });
        return this.mFuture;
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
