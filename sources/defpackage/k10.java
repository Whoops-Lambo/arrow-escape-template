package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.k10;
import defpackage.pv1;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k10 implements Executor {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;

    public k10() {
        this.a = 1;
        this.b = new AtomicInteger(1);
        this.d = new WeakReference(null);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.zzcx
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                k10 k10Var = this.a;
                Thread thread = new Thread(runnable, pv1.k(((AtomicInteger) k10Var.b).getAndIncrement(), "Google consent worker #"));
                k10Var.d = new WeakReference(thread);
                return thread;
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.c) {
            taskContinueWithTask = ((Task) this.d).continueWithTask((ExecutorService) this.b, new j10(runnable));
            this.d = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public Task b(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.c) {
            taskContinueWithTask = ((Task) this.d).continueWithTask((ExecutorService) this.b, new t5(callable, 10));
            this.d = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            default:
                if (Thread.currentThread() != ((WeakReference) this.d).get()) {
                    ((ThreadPoolExecutor) this.c).execute(runnable);
                } else {
                    runnable.run();
                }
                break;
        }
    }

    public k10(ExecutorService executorService) {
        this.a = 0;
        this.c = new Object();
        this.d = Tasks.forResult(null);
        this.b = executorService;
    }
}
