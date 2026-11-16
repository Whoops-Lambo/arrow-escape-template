package com.ironsource.environment.thread;

import com.ironsource.C4907oe;
import com.ironsource.environment.thread.b;
import defpackage.az2;
import defpackage.e80;
import defpackage.ks0;
import defpackage.sr0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ScheduledExecutorService, AutoCloseable {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    private final AtomicReference<Thread> a;

    @NotNull
    private final ScheduledExecutorService b;

    /* JADX INFO: renamed from: com.ironsource.environment.thread.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class C1365b extends ks0 implements sr0 {
        public C1365b(Object obj) {
            super(0, obj, Runnable.class, "run", "run()V", 0);
        }

        public final void a() {
            ((Runnable) this.receiver).run();
        }

        @Override // defpackage.sr0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return az2.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @NotNull
        public final b a(@NotNull final String str) {
            str.getClass();
            final AtomicReference atomicReference = new AtomicReference();
            return new b(atomicReference, new C4907oe(1, new ThreadFactory() { // from class: ub3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return b.a.a(str, atomicReference, runnable);
                }
            }), null);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread a(String str, AtomicReference atomicReference, Runnable runnable) {
            Thread thread = new Thread(runnable, str);
            atomicReference.set(thread);
            return thread;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.b.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.b.submit(runnable);
    }

    private b(AtomicReference<Thread> atomicReference, ScheduledExecutorService scheduledExecutorService) {
        this.a = atomicReference;
        this.b = scheduledExecutorService;
    }

    public final void a(@NotNull Runnable runnable) {
        com.ironsource.environment.thread.a aVarA;
        runnable.getClass();
        if (runnable instanceof com.ironsource.environment.thread.a) {
            aVarA = (com.ironsource.environment.thread.a) runnable;
        } else {
            aVarA = null;
        }
        if (aVarA == null) {
            aVarA = com.ironsource.environment.thread.a.a.a(new C1365b(runnable));
        }
        if (a()) {
            aVarA.run();
        } else {
            execute(aVarA);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        boolean zIsTerminated;
        if (this != ForkJoinPool.commonPool() && !(zIsTerminated = isTerminated())) {
            shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.b.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.b.submit(runnable, t);
    }

    public /* synthetic */ b(AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, e80 e80Var) {
        this(atomicReference, scheduledExecutorService);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.b.submit(callable);
    }

    public final boolean a() {
        return this.a.get() == Thread.currentThread();
    }
}
