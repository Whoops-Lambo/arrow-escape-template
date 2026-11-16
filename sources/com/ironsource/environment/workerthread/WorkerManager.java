package com.ironsource.environment.workerthread;

import com.ironsource.C4950r4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class WorkerManager<T> {
    List<Callable<T>> a = new ArrayList();
    private final ExecutorService b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j);

        void onWorkFailed(String str);
    }

    public void addCallable(@NotNull Callable<T> callable) {
        this.a.add(callable);
    }

    public void startWork(@NotNull WorkEndedListener<T> workEndedListener, long j, @NotNull TimeUnit timeUnit) {
        if (this.b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.b.invokeAll(this.a, j, timeUnit);
            for (int i = 0; i < listInvokeAll.size(); i++) {
                Future<T> future = listInvokeAll.get(i);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new WorkerResult.Canceled(this.a.get(i)));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e) {
                        e = e;
                        C4950r4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.a.get(i), e));
                    } catch (CancellationException e2) {
                        C4950r4.d().a(e2);
                        arrayList.add(new WorkerResult.Canceled(this.a.get(i)));
                    } catch (ExecutionException e3) {
                        e = e3;
                        C4950r4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.a.get(i), e));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.b.shutdownNow();
        } catch (Exception e4) {
            C4950r4.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
            this.b.shutdownNow();
        }
    }

    public WorkerManager(@NotNull ExecutorService executorService) {
        this.b = executorService;
    }
}
